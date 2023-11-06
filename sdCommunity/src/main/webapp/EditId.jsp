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
String idd = request.getParameter("idd");
int id = Integer.parseInt(idd);
session.setAttribute("getId", id);
response.sendRedirect("AdminHome.jsp");
%>
</body>
</html>