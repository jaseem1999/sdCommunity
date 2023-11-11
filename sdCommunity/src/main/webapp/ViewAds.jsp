<%@page import="sdCommunity.admin.adv.ProductDAO"%>
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
	String stringlink = request.getParameter("link");
	int id = Integer.parseInt(stringid);
	int i = ProductDAO.adsAnalysis(id);
	if(i > 0){
		response.sendRedirect(stringlink);
	}else{
		response.sendRedirect("UserHome.jsp");
	}
	%>
</body>
</html>