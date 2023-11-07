<%@page import="sdCommunity.admin.user.SolutionDAO"%>
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
String stringuid = request.getParameter("uid");
int id = Integer.parseInt(stringid);
int uid = Integer.parseInt(stringuid);
int i = SolutionDAO.solutionBlock(id);
if(i > 0){
	response.sendRedirect("AdminSolutionView.jsp?id="+uid+"&message=solutionBlockSuccess");
}else{
	response.sendRedirect("AdminSolutionView.jsp?id="+uid+"&message=solutionBlockFailed");
}
%>
</body>
</html>