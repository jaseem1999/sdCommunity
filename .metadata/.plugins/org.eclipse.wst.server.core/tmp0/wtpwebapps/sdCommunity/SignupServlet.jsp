

<%@page import="sdCommunity.user.signup.UserDAO"%>
<%@page import="sdCommunity.user.signup.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="sdCommunity.user.signup.UserDTO"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="usr" class="sdCommunity.user.signup.UserDTO"></jsp:useBean>


<%
    UserDTO user = new UserDTO();
    user.setEmail(request.getParameter("email"));
    user.setPassword(request.getParameter("password"));
    try {
        String userInput = request.getParameter("number");
        if (userInput != null && !userInput.isEmpty()) {
            long number = Long.parseLong(userInput);
            user.setNumber(number);
        } else {
            // Handle case where userInput is empty
            // You can set a default value, display an error message, etc.
        }
    } catch (NumberFormatException e) {
        // Handle the NumberFormatException
        // This will be triggered if userInput is not a valid number
        // You can set a default value, display an error message, etc.
        e.printStackTrace(); // Print the stack trace for debugging
    } catch (Exception e) {
        // Handle other types of exceptions (if any)
        e.printStackTrace(); // Print the stack trace for debugging
    }
    user.setFname(request.getParameter("fname"));
    user.setLname(request.getParameter("lname"));

    UserDAO userDAO = new UserDAO(); // You may need to pass a connection here

    int i = userDAO.addUser(user);  

    if (i > 0) {
        response.sendRedirect("signup.jsp?message=Success");
    } else {
        response.sendRedirect("signup.jsp?message=Failed");
    }
%>
</body>

</html>