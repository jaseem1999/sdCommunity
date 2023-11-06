<%@page import="sdCommunity.user.post.DAOPost"%>
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
String stringPUId = request.getParameter("postUid");

int Id = Integer.parseInt(stringId);
int uid = Integer.parseInt(stringUId);
int puid = Integer.parseInt(stringPUId);
int i = DAOPost.blockPost(Id,uid,puid);
if(i>0){
	response.sendRedirect("userViewPost.jsp?id="+Id+"&message=successReqBlock");
}else{
	response.sendRedirect("userViewPost.jsp?id="+Id+"&message=failedReqBlock");
}

%>
</body>
</html>