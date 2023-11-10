<%@page import="sdCommunity.admin.adv.AdvDAO"%>
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
String stringid = request.getParameter("id");
int id = Integer.parseInt(stringid);
int i = AdvDAO.blockAdvUser(id);
if(i>0){
	response.sendRedirect("AdminAdvertidement.jsp?message=userBlockSuccess");
}else{
	response.sendRedirect("AdminAdvertidement.jsp?message=userBlockFailed");
}
%>
</body>
</html>