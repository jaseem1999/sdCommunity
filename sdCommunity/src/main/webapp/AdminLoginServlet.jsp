<%@page import="sdCommunity.admin.login.AdminLoginDAO"%>
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
String pass = request.getParameter("pass");

int result = AdminLoginDAO.login(email, pass);
if(result > 0){
	session.setAttribute("AdminEmail", email);
	response.sendRedirect("AdminHome.jsp");
}else{
	response.sendRedirect("AdminLogin.jsp?message=Failed");
}

%>

</body>
</html>