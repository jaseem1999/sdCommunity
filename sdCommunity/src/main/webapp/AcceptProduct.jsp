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
String stringid = request.getParameter("productId");

	int id = Integer.parseInt(stringid);
	int i = ProductDAO.acceptProduct(id);
	if (i > 0) {
	    response.sendRedirect("AdminAdvertidement.jsp?message=productAcceptSuccess");
	} else {
	    response.sendRedirect("AdminAdvertidement.jsp?message=productAcceptFailed");
	}


 
%>
</body>
</html>