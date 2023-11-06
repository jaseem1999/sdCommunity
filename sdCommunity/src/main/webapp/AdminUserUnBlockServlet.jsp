<%@page import="sdCommunity.admin.user.PostDAO"%>
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
String stringId = request.getParameter("id");
int Id = Integer.parseInt(stringId);
int i = PostDAO.unBlockPost(Id);
if(i > 0){
	response.sendRedirect("AdminPostView.jsp?id="+Id+"&message=successBlocked");
}else{
	response.sendRedirect("AdminPostView.jsp?id="+Id+"&message=failedBlocked");
}
%>
</body>
</html>