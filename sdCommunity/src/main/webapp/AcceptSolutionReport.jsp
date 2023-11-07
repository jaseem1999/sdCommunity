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
int id = Integer.parseInt(stringid);
int i = SolutionDAO.acceptSolutionReport(id);
if(i>0){
	response.sendRedirect("AdminHome.jsp?message=succssSolutionAccept");
}else{
	response.sendRedirect("AdminHome.jsp?message=succssSolutionFailed");
}
%>
</body>
</html>