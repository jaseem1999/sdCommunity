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
String stringUId = request.getParameter("uid");
int Id = Integer.parseInt(stringId);
int uId = Integer.parseInt(stringUId);
int i = PostDAO.blockPost(Id);
if(i > 0){
	response.sendRedirect("AdminPostView.jsp?id="+uId+"&message=success");
}else{
	response.sendRedirect("AdminPostView.jsp?id="+uId+"&message=failed");
}

%>
</body>
</html>