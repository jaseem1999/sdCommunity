<%@page import="sdCommunity.admin.user.BroadcastNotf"%>
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
String notif = request.getParameter("notif");
int i = BroadcastNotf.notifAdded(notif);
if(i>0){
	response.sendRedirect("AdminHome.jsp?message=notifSuccess");
}else{
	response.sendRedirect("AdminHome.jsp?message=notifFailed");
}
%>

</body>
</html>