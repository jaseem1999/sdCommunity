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
String id = request.getParameter("id");
int status= UserDAO.userBlock(id);
if(status > 0){
	response.sendRedirect("AdminHome.jsp?message=BlockSuccess");
}else{
	response.sendRedirect("AdminHome.jsp?message=BlockFailed");
}
%>
</body>
</html>