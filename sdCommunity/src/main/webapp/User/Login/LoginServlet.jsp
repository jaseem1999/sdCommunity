<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="sdCommunity.user.login.userDTO"%>
<%@page import="sdCommunity.user.login.userDAO"%>
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
String email =request.getParameter("email");
String pass =request.getParameter("password");
userDAO user= new userDAO();
int i =user.login(email, pass);
userDTO dto = new userDTO();
int sid =0;
String sfname=null;
String slname=null;
String smail=null;
String spass= null;
int snum=0;
try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity","root", "Love1999@MySQL");
	PreparedStatement stm =con.prepareStatement("select * from user where  email='"+email+"' and password='"+pass+"';");
	ResultSet rs=stm.executeQuery();
	while(rs.next()) {
		sid = rs.getInt(1);
		sfname=rs.getString(2);
		slname=rs.getString(3);
		smail=rs.getString(4);
		spass=rs.getString(5);
		snum=rs.getInt(6);
		
	}
	
	
	
} catch (Exception e) {
	
}

if (i > 0) {
	session.setAttribute("uid", sid);
	session.setAttribute("email", smail);
	session.setAttribute("fname", sfname);
	session.setAttribute("lname", slname);
	session.setAttribute("num",snum);
    response.sendRedirect("../Home/UserHome.jsp");
} else {
    response.sendRedirect("Login.jsp?message=Failed");
}

%>


</body>
</html>