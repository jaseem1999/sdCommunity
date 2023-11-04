<%@page import="sdCommunity.admin.user.UserDAO"%>
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
int status = UserDAO.getUsers(email);
if(status > 0){
	response.sendRedirect("AdminHome.jsp?message=userEmailSuccess");
}else{
	response.sendRedirect("AdminHome.jsp?message=userEmailFailed");
}
%>
</body>
</html>