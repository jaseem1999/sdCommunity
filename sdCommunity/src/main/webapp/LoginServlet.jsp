<%@page import="java.sql.SQLException"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Base64"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.ByteArrayInputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="sdCommunity.user.login.userDTO"%>
<%@page import="sdCommunity.user.login.userDAO"%>
<%@page import="java.sql.Blob"%>
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
long snum=0;
String bstatus = null;

int spid=0;
byte[] simg = null;
String sabout=null;
String scollege=null;
String sposition=null;
String scompany=null;
String sgithub = null;
String slinkedin = null;
String snational = null;
String sgender = null;
String swebsite = null;
int sfpuid = 0;


try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity","root", "Love1999@MySQL");
	PreparedStatement stm =con.prepareStatement("select userId,fname,lname,email,password,number,status from user where  email='"+email+"' and password='"+pass+"';");
	ResultSet rs=stm.executeQuery();
	while(rs.next()) {
		sid = rs.getInt(1);
		sfname=rs.getString(2);
		slname=rs.getString(3);
		smail=rs.getString(4);
		spass=rs.getString(5);
		snum=rs.getLong(6);
		bstatus=rs.getString(7);
		
	}
	
	
	
	
	
} catch (Exception e) {
	
}



if (i > 0) {
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity","root", "Love1999@MySQL");
	
	PreparedStatement stm =con.prepareStatement("select * from user_info where uid="+sid+";");
	ResultSet rs=stm.executeQuery();
	while(rs.next()) {
		spid = rs.getInt(1);
		
		try {
	        Blob blob = rs.getBlob("image");
	        byte byteArray[] = blob.getBytes(2, (int) blob.length());
	        
	      
	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Handle the exception
	    }
		sabout=rs.getString(3);
		scompany=rs.getString(4);
		scollege=rs.getString(5);
		sposition=rs.getString(6);
		sgithub=rs.getString(7);
		slinkedin=rs.getString(8);
		snational=rs.getString(9);
		sgender=rs.getString(10);
		swebsite=rs.getString(11);
		sfpuid=rs.getInt(12);
		
	}
	}catch(Exception e){
		
	}
	

	session.setAttribute("uid", sid);
	session.setAttribute("email", smail);
	session.setAttribute("fname", sfname);
	session.setAttribute("lname", slname);
	session.setAttribute("num",snum);
	session.setAttribute("pid", spid);
	session.setAttribute("company", scompany);
	session.setAttribute("about", sabout);
	session.setAttribute("college", scollege);
	session.setAttribute("position", sposition);
	session.setAttribute("github", sgithub);
	session.setAttribute("linkedin", slinkedin);
	session.setAttribute("nation", snational);
	session.setAttribute("gender", sgender);
	session.setAttribute("website", swebsite);
	if(bstatus != null){
		 response.sendRedirect("Login.jsp?message=Blocked");
	}else{
		 response.sendRedirect("UserHome.jsp");	
	}
   
} else {
    response.sendRedirect("Login.jsp?message=Failed");
}

%>


</body>
</html>