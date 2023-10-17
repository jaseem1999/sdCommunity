<%@page import="sdCommunity.advUser.login.AdvUserLoginDTO"%>
<%@page import="sdCommunity.advUser.login.AdvUserLoginDAO"%>
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
	String email = request.getParameter("email");
	String pass = request.getParameter("pass");
	AdvUserLoginDAO.login(email, pass);
	int i = AdvUserLoginDAO.validate();
	if(i>0){
		AdvUserLoginDTO users = new AdvUserLoginDTO();
		int id = AdvUserLoginDAO.id;
		String name = AdvUserLoginDAO.name;
		String agName = AdvUserLoginDAO.agName;
		String email_dto = AdvUserLoginDAO.dtoemail;
		long number = AdvUserLoginDAO.number;
		String status = AdvUserLoginDAO.status;
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		session.setAttribute("agName", agName);
		session.setAttribute("emil", email_dto);
		session.setAttribute("num", number);
		if(status == null){
			response.sendRedirect("AdvHome.jsp");
		}else{
			response.sendRedirect("AdvLogin.jsp?message=Blocked");
		}
		
	}else{
		response.sendRedirect("AdvLogin.jsp?message=Failed");
	}
%>
</body>
</html>