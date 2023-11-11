<%@page import="sdCommunity.user.feedback.UserFeedbackDAO"%>
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
	String id = request.getParameter("uid");
	int uid = Integer.parseInt(id);
	String feedback = request.getParameter("feedback");
	int i = UserFeedbackDAO.feedBackUpload(uid, feedback);
	if(i>0){
		response.sendRedirect("UserHome.jsp?message=successFeedBack");
	}else{
		response.sendRedirect("UserHome.jsp?message=failedFeedBack");
	}
%>
<p>id = <%=id %></p>
<p>Feedback = <%=feedback %></p>

</body>
</html>