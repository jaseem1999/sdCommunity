<%@page import="sdCommunity.advUser.feedback.AdvFeedbackDAO"%>
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
String strid = request.getParameter("id");
String strnum = request.getParameter("num");
String name = request.getParameter("name");
String email = request.getParameter("email");
String agname = request.getParameter("agname");
String text = request.getParameter("text");

int id = 0;
long num = 0;

try {
    if (strid != null && !strid.isEmpty()) {
        id = Integer.parseInt(strid);
    }

    if (strnum != null && !strnum.isEmpty()) {
        num = Long.parseLong(strnum);
    }

    // Continue with the rest of your code...

} catch (NumberFormatException e) {
    // Handle the case where the parameter cannot be parsed as an integer
    e.printStackTrace(); // or handle it in another way
}

int i = AdvFeedbackDAO.advFeedback(id, name, agname, email, num, text);
if(i>0){
	response.sendRedirect("AdvContact.jsp?message=success");
}else{
	response.sendRedirect("AdvContact.jsp?message=failed");	
}

%>
</body>
</html>