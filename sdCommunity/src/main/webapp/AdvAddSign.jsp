<%@page import="sdCommunity.advUser.signup.AdvSignupDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String email = request.getParameter("email");
	String name = request.getParameter("name");
	String agName = request.getParameter("AgName");
	String phoneString = request.getParameter("number");
	long phone = 0;
	if (phoneString != null && phoneString.matches("\\d{10}")) {
	    phone = Long.parseLong(phoneString);
	} else {
	    // Handle the case where 'phoneString' is null or doesn't match the expected format
	}
	String pass = request.getParameter("pass");
	
	AdvSignupDAO.signUp(email, name, agName, phone, pass);
	
	int insertRow = AdvSignupDAO.userDbAdd();
	if(insertRow > 0){
		response.sendRedirect("AdvSign.jsp?message=Success");
	}else{
		response.sendRedirect("AdvSign.jsp?message=Failed");
	}

%>

</body>
</html>