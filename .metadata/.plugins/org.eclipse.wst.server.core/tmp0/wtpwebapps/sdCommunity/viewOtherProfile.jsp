<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="sdCommunity.conn.Conn"%>
<%@page import="sdCommunity.user.post.userDTO"%>
<%@page import="sdCommunity.user.post.DTOothers"%>
<%@page import="sdCommunity.user.post.DTOpost"%>
<%@page import="java.util.List"%>
<%@page import="sdCommunity.user.post.DAOPost"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%

Integer id =(Integer)session.getAttribute("uid");
String fname=(String)session.getAttribute("fname"); 
String lname=(String)session.getAttribute("lname"); 
String email=(String)session.getAttribute("email");
long num=(Long)session.getAttribute("num");
String company = (String) session.getAttribute("company");
String github = (String) session.getAttribute("github");
String linkedin = (String) session.getAttribute("linkedin");
String website = (String) session.getAttribute("website");
String nation = (String) session.getAttribute("nation");
String gender = (String) session.getAttribute("gender");
String about = (String) session.getAttribute("about");
String college = (String) session.getAttribute("college");
String position = (String) session.getAttribute("position");
String suid = request.getParameter("id");
int pid =0;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile</title>
<link rel="stylesheet" href="./homecss/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<style type="text/css">

.fistPartOfProfileMain{
	background: white;
	border: 3px solid white;
}
.fistPartOfProfile{
	background-image: url("./signupcss/img/social-network.png");
    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    height: 250px;
}
.smallAbout{
	margin-left: 15px;
    line-height: 30.4px;
}
a{
	text-decoration: none;
}
#center{
	left: calc(50% - 185px);
}
.code{
	margin-top: 30px;
	margin-left: 30px;
	width:90%;
	height: auto;
	background: #f8f9fa;
	color: #7d8694;
	border: 2px solid gray;
	margin-bottom: 10px;
	font-family: 'Courier New', monospace;
	overflow-x: auto;
}
.code xmp{
	margin-top: 10px;
	margin-bottom: 10px;
	margin-left: 20px;
	margin-right: 10px;
}
.codeHeading{
	width: 100%;
	height: 45px;
	border: 1px solid #0000001c;
}
.codeHeading p{
	width: 70px;
	margin: 10px;
	font-weight: bold;
}
.center{
	text-align: center;
	margin-bottom: 20px; 
}
.btnn{
	background: transparent;
	color: white;
	margin: 5px;
}
.copyBtn{
	background: #d5d5df;
}
.copyBtn:hover{
	background: green;
}


</style>

</head>
<body style="background-color: black; color: white;">
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog" style="color: black;">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		      </div>
		      <form action="settingsAccess" method="post">
		      <div class="modal-body">
		        <div class="mb-3">
    				<label for="exampleInputPassword1" class="form-label">Password</label>
    				<input type="password" class="form-control" id="exampleInputPassword1" name="exampleInputPassword1">
  				</div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
		         <input type="submit" class="btn btn-primary" value="OK">
		      </div>
		      </form>
		    </div>
		  </div>
		</div>

	<ul class="nav justify-content-end ">
		<li class="nav-item" >
		    	<a class='nav-link' style="padding: 0px;" href='UserHome.jsp'><img src="./img/logo.png" alt="" width="50px"></a>
			</li>
		<li class="nav-item">
		    	<a class='nav-link' href='UserHome.jsp'>Home</a>
		  </li>
		  <li class="nav-item">
		    <%
		  	if (email != null){
		  		out.print("<a class='nav-link' href='UserPost.jsp'>Post</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  <li class="nav-item">
		    <%
		  	if (email != null){
		  		out.print("<a class='nav-link' href='userFollowers.jsp'>Followers</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  
		  
		  <li class="nav-item">
		   <%
		  	if (email != null){
		  		out.print("<a class='nav-link' data-bs-toggle='modal' data-bs-target='#exampleModal'>Settings</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  <li class="nav-item">
		  <%
		  	if (email != null){
		  		if (college != null){
		  			out.print("<a class='nav-link' href='viewProfile.jsp'>Profile</a>");
		  		}
		  		else{
		  			out.print("<a class='nav-link' href='profile.jsp'>Profile</a>");
		  		}
		  		
		  	}else{
		  		out.print("<a class='nav-link' href='Login.jsp'>Login</a>");
		  	}
		  %>
		  </li>
		  
		  <li class="nav-item">
		    <%
		  	if (email != null){
		  		out.print("<a class='nav-link' href='logout.jsp'>Logout</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  <li class="nav-item">
		  <%
		  	if (email != null){
		  		if (college != null){
		  			out.print("<a class='nav-link' href='viewProfile.jsp'><img alt='' src='image?id="+id+"' style=' width: 35px; border-radius: 50%; height: 35px;border: 1px solid white;'/></a>");
		  		}
		  		else{
		  			out.print("<a class='nav-link' href='viewProfile.jsp'><img alt='' src='./homecss/img/User-Profile.png'style=' width: 35px; border-radius: 50%; height: 35px;border: 1px solid white;'/></a>");
		  		}
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
	</ul>
	
	<div class="fistPartOfProfileMain">
	<div class="fistPartOfProfile">
		<div class="container-xl">
			
		</div>
	</div>
	</div>
	
	<div class="container hbdy" style="margin-top: 10px; background: #5f5fd13b;">
		
		<img alt="" src="image?id=<%=suid%>" style="width:150px;height:150px ; border-radius: 50%; margin-top: -100px; border: 5px solid white; ">	
		<div class="row">
		<%
		String message = request.getParameter("message");
		if (message != null && message.equals("reportSuccess")){
			out.print("<div class='alert alert-success'id='alert' role='alert'>User report succesfully</div>");
		}else{
			out.print("");
		}
		%>
		<div class="col">
		<%
		Conn con= new Conn();
		Connection conn =con.connection;
		int ouid =0;
		String ofname= null;
		String olname= null;
		String ocompany= null;
		String ocollege= null;
		String oposition= null;
		String ogithub= null;
		String olinkedin= null;
		String owebsite= null;
		String oemail= null;
		long onum=0;
		String oabout= null;
		String onationality= null;
		String ogender= null;
		try {
			String sql = "select u.userId,u.fname,u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender from user u join user_info ui on u.userId = ui.uid where ui.uid="+suid+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				
				ouid=rs.getInt(1);
				ofname=rs.getString(2);
				olname=rs.getString(3);
				oemail=rs.getString(4);
				onum=rs.getLong(5);
				oabout=rs.getString(6);
				ocompany=rs.getString(7);
				ocollege=rs.getString(8);
				oposition=rs.getString(9);
				ogithub=rs.getString(10);
				olinkedin=rs.getString(11);
				owebsite=rs.getString(12);
				onationality=rs.getString(13);
				ogender=rs.getString(14);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		%>
				
			<div style="margin: 10px; text-transform: uppercase; font-size: 1.4rem; font-weight: bold; line-height: 1.25rem;"><%=ofname%> <%=olname %>
			<%
		 		
		 			out.print("<span class='smallAbout' style='font-size: small;'>("+onationality+"),("+ogender+")</span><br> ");
		 		
			%>
	
			</div>
			
			<%
				
					out.print("<span class='smallAbout' style='width :600px;'>"+oabout+"</span><br>");
				
			%>
			<a href="userConnection.jsp?id=<%=ouid%>">Connections</a>
			<div>
				<button style="background: transparent; color: white;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
					</button>
					<ul class="dropdown-menu" style="min-width: 340px;">
						        <li><a class="dropdown-item"data-bs-toggle="modal" data-bs-target="#exampleModalReport">Report</a></li>
				    </ul>
				    <div class="modal fade" id="exampleModalReport" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true" style="color: black;">
					  <div class="modal-dialog">
					    <div class="modal-content">
					      <div class="modal-header">
					        <h1 class="modal-title fs-5" id="exampleModalLabel">Reporting user <%=ofname %></h1>
					        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					      </div>
					      <div class="modal-body">
					        <form action="usrRp" method="post">
					        <div class="mb-3">
							    <label for="exampleInputUid" class="form-label">your id</label>
							    <input type="text" class="form-control" id="exampleInputUid" name="uid" value="<%=id%>" aria-describedby="emailHelp">
							  </div>
					           <div class="mb-3">
							    <label for="exampleInputReUid" class="form-label">ID of the user</label>
							    <input type="text" class="form-control" id="exampleInputReUid" name="reUid" value="<%=ouid%>" aria-describedby="emailHelp">
							  </div>
							  <div class="mb-3">
							    <label for="exampleInputEmail1" class="form-label">Email address of the user</label>
							    <input type="email" class="form-control" id="exampleInputEmail1" name="reEmail" value="<%=oemail%>" aria-describedby="emailHelp">
							  </div>
							  <div class="mb-3">
							    <label for="exampleInputReName" class="form-label">Name of the user</label>
							    <input type="text" class="form-control" id="exampleInputReName" name="reName" value="<%=ofname%> <%=olname%>" aria-describedby="emailHelp">
							  </div>
							  <div class="mb-3">
							    <label for="exampleInputReport" class="form-label">Why you reporting this user</label>
							    <input type="text" class="form-control" id="exampleInputReport" name="report"  aria-describedby="emailHelp" required="required">
							  </div>
							  
							  <button type="submit" class="btn btn-primary">Submit</button>
							</form>
					      </div>
					      <div class="modal-footer">
					        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
					  
					      </div>
					    </div>
					  </div>
					</div>
			</div>
			<hr>
		</div>
		<div class="col">
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-briefcase-fill" viewBox="0 0 16 16">
  					<path d="M6.5 1A1.5 1.5 0 0 0 5 2.5V3H1.5A1.5 1.5 0 0 0 0 4.5v1.384l7.614 2.03a1.5 1.5 0 0 0 .772 0L16 5.884V4.5A1.5 1.5 0 0 0 14.5 3H11v-.5A1.5 1.5 0 0 0 9.5 1h-3zm0 1h3a.5.5 0 0 1 .5.5V3H6v-.5a.5.5 0 0 1 .5-.5z"/>
  					<path d="M0 12.5A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5V6.85L8.129 8.947a.5.5 0 0 1-.258 0L0 6.85v5.65z"/>
				</svg>
				</svg>	
				<%
					
						out.print("<span class='smallAbout'>"+oposition+"</span>");
						out.print("<br><hr>");
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-building" viewBox="0 0 16 16">
  					<path d="M4 2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3 0a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3.5-.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1ZM4 5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1ZM7.5 5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Zm2.5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1ZM4.5 8a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Zm2.5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3.5-.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Z"/>
  					<path d="M2 1a1 1 0 0 1 1-1h10a1 1 0 0 1 1 1v14a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V1Zm11 0H3v14h3v-2.5a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5V15h3V1Z"/>
				</svg>	
				<% 
					
						out.print("<span class='smallAbout'>"+ocompany+"</span>");
						out.print("<br><hr>");
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-backpack2" viewBox="0 0 16 16">
  					<path d="M4.04 7.43a4 4 0 0 1 7.92 0 .5.5 0 1 1-.99.14 3 3 0 0 0-5.94 0 .5.5 0 1 1-.99-.14Z"/>
  					<path fill-rule="evenodd" d="M4 9.5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-7a.5.5 0 0 1-.5-.5v-4Zm1 .5v3h6v-3h-1v.5a.5.5 0 0 1-1 0V10H5Z"/>
  					<path d="M6 2.341V2a2 2 0 1 1 4 0v.341c2.33.824 4 3.047 4 5.659v1.191l1.17.585a1.5 1.5 0 0 1 .83 1.342V13.5a1.5 1.5 0 0 1-1.5 1.5h-1c-.456.607-1.182 1-2 1h-7a2.497 2.497 0 0 1-2-1h-1A1.5 1.5 0 0 1 0 13.5v-2.382a1.5 1.5 0 0 1 .83-1.342L2 9.191V8a6.002 6.002 0 0 1 4-5.659ZM7 2v.083a6.04 6.04 0 0 1 2 0V2a1 1 0 0 0-2 0ZM3 13.5A1.5 1.5 0 0 0 4.5 15h7a1.5 1.5 0 0 0 1.5-1.5V8A5 5 0 0 0 3 8v5.5Zm-1-3.19-.724.362a.5.5 0 0 0-.276.447V13.5a.5.5 0 0 0 .5.5H2v-3.691Zm12 0V14h.5a.5.5 0 0 0 .5-.5v-2.382a.5.5 0 0 0-.276-.447L14 10.309Z"/>
				</svg>
				<% 
					
						out.print("<span class='smallAbout'>"+ocollege+"</span>");
						out.print("<br><hr>");
					
				%>
							
		</div>
		
    	</div>
    	<div class="row">	
    		<div class="col-6 col-md-4">
    			
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-envelope" viewBox="0 0 16 16">
		  			<path d="M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z"/>
				</svg><span class="smallAbout"><%=oemail%></span>
				
				<br>
				<hr>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-phone-fill" viewBox="0 0 16 16">
		  			<path d="M3 2a2 2 0 0 1 2-2h6a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V2zm6 11a1 1 0 1 0-2 0 1 1 0 0 0 2 0z"/>
				</svg>
				
				<% 
				
						out.print("<span class='smallAbout'>"+onum+"</span>");
						out.print("<br><hr>");
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-github" viewBox="0 0 16 16">
		  			<path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.012 8.012 0 0 0 16 8c0-4.42-3.58-8-8-8z"/>
				</svg>
	
				<% 
						out.print("<span class='smallAbout'><a href='"+ogithub+"'>GitHub</a></span>");
						out.print("<br><hr>");
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-linkedin" viewBox="0 0 16 16">
		  			<path d="M0 1.146C0 .513.526 0 1.175 0h13.65C15.474 0 16 .513 16 1.146v13.708c0 .633-.526 1.146-1.175 1.146H1.175C.526 16 0 15.487 0 14.854V1.146zm4.943 12.248V6.169H2.542v7.225h2.401zm-1.2-8.212c.837 0 1.358-.554 1.358-1.248-.015-.709-.52-1.248-1.342-1.248-.822 0-1.359.54-1.359 1.248 0 .694.521 1.248 1.327 1.248h.016zm4.908 8.212V9.359c0-.216.016-.432.08-.586.173-.431.568-.878 1.232-.878.869 0 1.216.662 1.216 1.634v3.865h2.401V9.25c0-2.22-1.184-3.252-2.764-3.252-1.274 0-1.845.7-2.165 1.193v.025h-.016a5.54 5.54 0 0 1 .016-.025V6.169h-2.4c.03.678 0 7.225 0 7.225h2.4z"/>
				</svg>
				
				<% 
					
						out.print("<span class='smallAbout'><a href='"+olinkedin+"'>LinkedIn</a></span>");
						out.print("<br><hr>");
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-browser-chrome" viewBox="0 0 16 16">
  					<path fill-rule="evenodd" d="M16 8a8.001 8.001 0 0 1-7.022 7.94l1.902-7.098a2.995 2.995 0 0 0 .05-1.492A2.977 2.977 0 0 0 10.237 6h5.511A8 8 0 0 1 16 8ZM0 8a8 8 0 0 0 7.927 8l1.426-5.321a2.978 2.978 0 0 1-.723.255 2.979 2.979 0 0 1-1.743-.147 2.986 2.986 0 0 1-1.043-.7L.633 4.876A7.975 7.975 0 0 0 0 8Zm5.004-.167L1.108 3.936A8.003 8.003 0 0 1 15.418 5H8.066a2.979 2.979 0 0 0-1.252.243 2.987 2.987 0 0 0-1.81 2.59ZM8 10a2 2 0 1 0 0-4 2 2 0 0 0 0 4Z"/>
				</svg>
				<% 
					
						out.print("<span class='smallAbout'><a href='"+owebsite+"'>website</a></span>");
						out.print("<br><hr>");
					
				%>
				
			
    		</div>
    		<div class="col-md-8">
    			<%
					response.setContentType("text/html");
					List<DTOothers> p2= DAOPost.getOtherProfile(suid);
					
				%>
			<% for(DTOothers p : p2){ 
					
			%>
			    
			    <div style="background-color: #6699c130;">
			    
			    	
			      	<div class="" style="color: white; max-width: 100%; margin-left: 0px; margin-top: 10px;" id="center">
						  <img src="poimg?id=<%=p.getPostId()%>" style="width : 100%; height: 200px;" alt="...">
						  <img style="width: 50px; height: 50px; border-radius: 50%; margin-top: 5px; margin-left: 10px;border: 2px solid; " alt="" src="image?id=<%=ouid%>">
						  <div class="card-body">
							    <h5 class="" style="text-align: center; margin: 10px;"><%=p.getHeading()%></h5>   	
							    	<p class="card-text" style="margin: 30px;"><%=p.getPost()%></p>
							    	<a href="<%=p.getLink() %>" class="btn-primary" style="margin-left: 30px;"><%=p.getLink() %></a>
									<div class="code">	
										<div class="codeHeading">
											<p>Code</p>
											
										</div>				    
							    	 	<xmp id="copy"><%=p.getCode()%></xmp>
							    	 </div>
							    	 <div class="center">
							    	 	<a  class="btn btn-primary btnn" aria-current="page"  href="userViewPost.jsp?id=<%=p.getPostId()%>">Go To Check</a>
							    	 	<a  class="btn btn-primary btnn"  aria-current="page"  href="">
								    	 	<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-hand-thumbs-up" viewBox="0 0 16 16">
											  <path d="M8.864.046C7.908-.193 7.02.53 6.956 1.466c-.072 1.051-.23 2.016-.428 2.59-.125.36-.479 1.013-1.04 1.639-.557.623-1.282 1.178-2.131 1.41C2.685 7.288 2 7.87 2 8.72v4.001c0 .845.682 1.464 1.448 1.545 1.07.114 1.564.415 2.068.723l.048.03c.272.165.578.348.97.484.397.136.861.217 1.466.217h3.5c.937 0 1.599-.477 1.934-1.064a1.86 1.86 0 0 0 .254-.912c0-.152-.023-.312-.077-.464.201-.263.38-.578.488-.901.11-.33.172-.762.004-1.149.069-.13.12-.269.159-.403.077-.27.113-.568.113-.857 0-.288-.036-.585-.113-.856a2.144 2.144 0 0 0-.138-.362 1.9 1.9 0 0 0 .234-1.734c-.206-.592-.682-1.1-1.2-1.272-.847-.282-1.803-.276-2.516-.211a9.84 9.84 0 0 0-.443.05 9.365 9.365 0 0 0-.062-4.509A1.38 1.38 0 0 0 9.125.111L8.864.046zM11.5 14.721H8c-.51 0-.863-.069-1.14-.164-.281-.097-.506-.228-.776-.393l-.04-.024c-.555-.339-1.198-.731-2.49-.868-.333-.036-.554-.29-.554-.55V8.72c0-.254.226-.543.62-.65 1.095-.3 1.977-.996 2.614-1.708.635-.71 1.064-1.475 1.238-1.978.243-.7.407-1.768.482-2.85.025-.362.36-.594.667-.518l.262.066c.16.04.258.143.288.255a8.34 8.34 0 0 1-.145 4.725.5.5 0 0 0 .595.644l.003-.001.014-.003.058-.014a8.908 8.908 0 0 1 1.036-.157c.663-.06 1.457-.054 2.11.164.175.058.45.3.57.65.107.308.087.67-.266 1.022l-.353.353.353.354c.043.043.105.141.154.315.048.167.075.37.075.581 0 .212-.027.414-.075.582-.05.174-.111.272-.154.315l-.353.353.353.354c.047.047.109.177.005.488a2.224 2.224 0 0 1-.505.805l-.353.353.353.354c.006.005.041.05.041.17a.866.866 0 0 1-.121.416c-.165.288-.503.56-1.066.56z"/>
											</svg>
										</a>
							    	 </div>
						  </div>
					</div>
					<hr style="color: white; border: 3px solid;">
					 <%} %>
			    </div>
    		</div>
  		</div>
	</div>
	<script type="text/javascript">
	function copyToClipboard() {
	    var copyText = document.getElementById("copy");
	    var range = document.createRange();
	    range.selectNode(copyText);
	    window.getSelection().removeAllRanges();
	    window.getSelection().addRange(range);
	    document.execCommand("copy");
	    window.getSelection().removeAllRanges();
	    alert("Code copied to clipboard");
	}
	
	document.addEventListener('DOMContentLoaded', function() {
	    var alertElement = document.getElementById('alert');
	    if (alertElement) {
	        setTimeout(function() {
	            alertElement.style.display = 'none';
	        }, 2000); // 2000 milliseconds = 2 seconds
	    }
	});

	
	</script>

</body>
</html>