<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
Integer id =(Integer)session.getAttribute("id");
String name=(String)session.getAttribute("name"); 
String agName=(String)session.getAttribute("agName"); 
String email=(String)session.getAttribute("emil");
long num=(Long)session.getAttribute("num");

%>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><%=id %></p>
<p> Agency name :: <%=agName %></p>
<p> User :: <%=name %></p>
<p> Email :: <%=email %></p>
<p> Phone No :: <%=num %></p>
</body>
</html>