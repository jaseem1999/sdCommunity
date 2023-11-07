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
String stringsuid = request.getParameter("suid");
int id = Integer.parseInt(stringid);
int uid = Integer.parseInt(stringuid);
int suid = Integer.parseInt(stringsuid);
int i = SolutionDAO.userSolutionReport(id, uid, suid);
if(i>0){
	response.sendRedirect("userViewPost.jsp?id="+uid+"&message=solutionreportsuccss");
}else{
	response.sendRedirect("userViewPost.jsp?id="+uid+"&message=solutionreportfailed");
}
%>
</body>
</html>