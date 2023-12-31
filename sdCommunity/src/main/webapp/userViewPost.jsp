<%@page import="sdCommunity.user.details.DAODetails"%>
<%@page import="sdCommunity.user.post.DTOothers"%>
<%@page import="sdCommunity.user.post.DTOSolution"%>
<%@page import="sdCommunity.conn.Conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="sdCommunity.user.post.DTOpost"%>
<%@page import="java.util.List"%>
<%@page import="sdCommunity.user.post.DAOPost"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./homecss/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<%
Integer id =(Integer)session.getAttribute("uid");
String fname=(String)session.getAttribute("fname"); 
String lname=(String)session.getAttribute("lname"); 
String email=(String)session.getAttribute("email");
long num=(Long)session.getAttribute("num");
String base64ImageJpg = (String) session.getAttribute("base64Image");
String company = (String) session.getAttribute("company");
String github = (String) session.getAttribute("github");
String linkedin = (String) session.getAttribute("linkedin");
String website = (String) session.getAttribute("website");
String nation = (String) session.getAttribute("nation");
String gender = (String) session.getAttribute("gender");
String about = (String) session.getAttribute("about");
String college = (String) session.getAttribute("college");
String position = (String) session.getAttribute("position");


String spid= request.getParameter("id");
int postId = 0;
Integer like= 0;


%>
 <%
					response.setContentType("text/html");
					List<DTOpost> p= DAOPost.getAllPostDetails(spid);
%>


<% for(DTOpost po : p){ %>
<title><%=po.getHeading()%></title>
<style type="text/css">
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
.smallAbout{
	margin-left: 15px;
    line-height: 30.4px;
}
.copyBtn{
	background: #d5d5df;
}
.copyBtn:hover{
	background: green;
}
.cmtShow{
	 margin-bottom: 30px;
	margin-left: 80px;
	width: 85%;
	min-height: 100px;
	background: #00000078;
	border: 1px solid #fffefe8a;
	color: white;
}
.Cmntheading{
	color: white;
	width: 100%;
	height: 35px;
	border :1px solid #fffefe8a;
}

</style>


</head>
<body style="background-color: black">

	<ul class="nav justify-content-end " >
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
	
			<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true" >
		  <div class="modal-dialog">
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
	<%
			String message = request.getParameter("message");
			if (message != null && message.equals("Failed")){
					out.print("<div class='alert alert-danger' id='alert' role='alert'>Solution already verified.</div>");
			}if(message != null && message.equals("Success")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Silution Post added</div>");	
			}
			if(message != null && message.equals("successReqBlock")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Post Blocking request send success fully</div>");	
			}
			if(message != null && message.equals("failedReqBlock")){
				out.print("<div class='alert alert-danger' id='alert' role='alert'>Post Blocking request send success fully</div>");	
			}
			if(message != null && message.equals("solutionreportsuccss")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Solution request send successfully</div>");	
			}
			
			
	%>
	
	<div class="container-xl hbdy" style="margin-top: 10px;">
	 <div class="row">
		
			    
			    
			    <div class="col-6 col-md-4" style="color: white;">
			    <div style="position: fixed; width: 400px;">
			    <div class="center">
			    	<img style="width: 150px; height: 150px; border-radius: 50%; margin-top: 0px; margin-left: 10px; " alt="" src="image?id=<%=po.getUid()%>"> <p style="color: white;"><%=po.getFname()%> <%=po.getLname() %></p>
				</div>
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-briefcase-fill" viewBox="0 0 16 16">
  					<path d="M6.5 1A1.5 1.5 0 0 0 5 2.5V3H1.5A1.5 1.5 0 0 0 0 4.5v1.384l7.614 2.03a1.5 1.5 0 0 0 .772 0L16 5.884V4.5A1.5 1.5 0 0 0 14.5 3H11v-.5A1.5 1.5 0 0 0 9.5 1h-3zm0 1h3a.5.5 0 0 1 .5.5V3H6v-.5a.5.5 0 0 1 .5-.5z"/>
  					<path d="M0 12.5A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5V6.85L8.129 8.947a.5.5 0 0 1-.258 0L0 6.85v5.65z"/>
				</svg>
				</svg>	
				<%
					
						out.print("<span class='smallAbout'>"+po.getPosition()+"</span>");
						out.print("<br><hr>");
					
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-building" viewBox="0 0 16 16">
  					<path d="M4 2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3 0a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3.5-.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1ZM4 5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1ZM7.5 5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Zm2.5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1ZM4.5 8a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Zm2.5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3.5-.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Z"/>
  					<path d="M2 1a1 1 0 0 1 1-1h10a1 1 0 0 1 1 1v14a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V1Zm11 0H3v14h3v-2.5a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5V15h3V1Z"/>
				</svg>	
				<% 
					
						out.print("<span class='smallAbout'>"+po.getCompany()+"</span>");
						out.print("<br><hr>");
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-backpack2" viewBox="0 0 16 16">
  					<path d="M4.04 7.43a4 4 0 0 1 7.92 0 .5.5 0 1 1-.99.14 3 3 0 0 0-5.94 0 .5.5 0 1 1-.99-.14Z"/>
  					<path fill-rule="evenodd" d="M4 9.5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-7a.5.5 0 0 1-.5-.5v-4Zm1 .5v3h6v-3h-1v.5a.5.5 0 0 1-1 0V10H5Z"/>
  					<path d="M6 2.341V2a2 2 0 1 1 4 0v.341c2.33.824 4 3.047 4 5.659v1.191l1.17.585a1.5 1.5 0 0 1 .83 1.342V13.5a1.5 1.5 0 0 1-1.5 1.5h-1c-.456.607-1.182 1-2 1h-7a2.497 2.497 0 0 1-2-1h-1A1.5 1.5 0 0 1 0 13.5v-2.382a1.5 1.5 0 0 1 .83-1.342L2 9.191V8a6.002 6.002 0 0 1 4-5.659ZM7 2v.083a6.04 6.04 0 0 1 2 0V2a1 1 0 0 0-2 0ZM3 13.5A1.5 1.5 0 0 0 4.5 15h7a1.5 1.5 0 0 0 1.5-1.5V8A5 5 0 0 0 3 8v5.5Zm-1-3.19-.724.362a.5.5 0 0 0-.276.447V13.5a.5.5 0 0 0 .5.5H2v-3.691Zm12 0V14h.5a.5.5 0 0 0 .5-.5v-2.382a.5.5 0 0 0-.276-.447L14 10.309Z"/>
				</svg>
				<% 
					
						out.print("<span class='smallAbout'>"+po.getCollege()+"</span>");
						out.print("<br><hr>");
					
				%>
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-github" viewBox="0 0 16 16">
		  			<path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.012 8.012 0 0 0 16 8c0-4.42-3.58-8-8-8z"/>
				</svg>
	
				<% 
					
						out.print("<span class='smallAbout'><a href='"+po.getGithub()+"'>GitHub</a></span>");
						out.print("<br><hr>");
					
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-linkedin" viewBox="0 0 16 16">
		  			<path d="M0 1.146C0 .513.526 0 1.175 0h13.65C15.474 0 16 .513 16 1.146v13.708c0 .633-.526 1.146-1.175 1.146H1.175C.526 16 0 15.487 0 14.854V1.146zm4.943 12.248V6.169H2.542v7.225h2.401zm-1.2-8.212c.837 0 1.358-.554 1.358-1.248-.015-.709-.52-1.248-1.342-1.248-.822 0-1.359.54-1.359 1.248 0 .694.521 1.248 1.327 1.248h.016zm4.908 8.212V9.359c0-.216.016-.432.08-.586.173-.431.568-.878 1.232-.878.869 0 1.216.662 1.216 1.634v3.865h2.401V9.25c0-2.22-1.184-3.252-2.764-3.252-1.274 0-1.845.7-2.165 1.193v.025h-.016a5.54 5.54 0 0 1 .016-.025V6.169h-2.4c.03.678 0 7.225 0 7.225h2.4z"/>
				</svg>
				
				<% 
					
						out.print("<span class='smallAbout'><a href='"+po.getLinkedin()+"'>LinkedIn</a></span>");
						out.print("<br><hr>");
					
				%>
				
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-browser-chrome" viewBox="0 0 16 16">
  					<path fill-rule="evenodd" d="M16 8a8.001 8.001 0 0 1-7.022 7.94l1.902-7.098a2.995 2.995 0 0 0 .05-1.492A2.977 2.977 0 0 0 10.237 6h5.511A8 8 0 0 1 16 8ZM0 8a8 8 0 0 0 7.927 8l1.426-5.321a2.978 2.978 0 0 1-.723.255 2.979 2.979 0 0 1-1.743-.147 2.986 2.986 0 0 1-1.043-.7L.633 4.876A7.975 7.975 0 0 0 0 8Zm5.004-.167L1.108 3.936A8.003 8.003 0 0 1 15.418 5H8.066a2.979 2.979 0 0 0-1.252.243 2.987 2.987 0 0 0-1.81 2.59ZM8 10a2 2 0 1 0 0-4 2 2 0 0 0 0 4Z"/>
				</svg>
				<% 
					
						out.print("<span class='smallAbout'><a href='"+po.getWebsite()+"'>website</a></span>");
						out.print("<br><hr>");
					
				%>
							
		</div>
		</div>
			    <div class="col-md-8" style="background-color: #6699c130;">
			    	
			    	
			      	<div class="" style="color: white; max-width: 100%; margin-left: 20px; margin-top: 10px;" id="showPost">
						  <img src="poimg?id=<%=po.getPostId()%>" style="width : 100%; height: 200px; " alt="...">
						  
						  <div class="card-body">
						  		<div style="margin-top: 20px;">
						  			<a style="color: red;" href="PostBlockRequest.jsp?id=<%=po.getPostId()%>&uid=<%=id%>&postUid=<%=po.getUid()%>">
						  				Report <svg xmlns="http://www.w3.org/2000/svg" width="36" height="36" fill="currentColor" class="bi bi-sign-stop-fill" viewBox="0 0 16 16">
										  <path d="M10.371 8.277v-.553c0-.827-.422-1.234-.987-1.234-.572 0-.99.407-.99 1.234v.553c0 .83.418 1.237.99 1.237.565 0 .987-.408.987-1.237Zm2.586-.24c.463 0 .735-.272.735-.744s-.272-.741-.735-.741h-.774v1.485h.774Z"/>
										  <path d="M4.893 0a.5.5 0 0 0-.353.146L.146 4.54A.5.5 0 0 0 0 4.893v6.214a.5.5 0 0 0 .146.353l4.394 4.394a.5.5 0 0 0 .353.146h6.214a.5.5 0 0 0 .353-.146l4.394-4.394a.5.5 0 0 0 .146-.353V4.893a.5.5 0 0 0-.146-.353L11.46.146A.5.5 0 0 0 11.107 0H4.893ZM3.16 10.08c-.931 0-1.447-.493-1.494-1.132h.653c.065.346.396.583.891.583.524 0 .83-.246.83-.62 0-.303-.203-.467-.637-.572l-.656-.164c-.61-.147-.978-.51-.978-1.078 0-.706.597-1.184 1.444-1.184.853 0 1.386.475 1.436 1.087h-.645c-.064-.32-.352-.542-.797-.542-.472 0-.77.246-.77.6 0 .261.196.437.553.522l.654.161c.673.164 1.06.487 1.06 1.11 0 .736-.574 1.228-1.544 1.228Zm3.427-3.51V10h-.665V6.57H4.753V6h3.006v.568H6.587Zm4.458 1.16v.544c0 1.131-.636 1.805-1.661 1.805-1.026 0-1.664-.674-1.664-1.805V7.73c0-1.136.638-1.807 1.664-1.807 1.025 0 1.66.674 1.66 1.807ZM11.52 6h1.535c.82 0 1.316.55 1.316 1.292 0 .747-.501 1.289-1.321 1.289h-.865V10h-.665V6.001Z"/>
										</svg>
						  			</a>
						  		</div>
							    <h5 class="" style="text-align: center; margin: 10px;" id="postHeading" ><%=po.getHeading()%></h5>   	
							    	<p class="card-text" style="margin: 30px;"><%=po.getPost()%></p>
							    	<a href="<%=po.getLink() %>" class="btn-primary" style="margin-left: 30px;"><%=po.getLink() %></a>
									<div class="code">	
										<div class="codeHeading">
											<p>Code</p>
											<button class="copyBtn" onclick="copyToClipboard()" style="position: relative; left:70px; top: -38px">
											<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-clipboard" viewBox="0 0 16 16">
  													<path d="M4 1.5H3a2 2 0 0 0-2 2V14a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V3.5a2 2 0 0 0-2-2h-1v1h1a1 1 0 0 1 1 1V14a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V3.5a1 1 0 0 1 1-1h1v-1z"/>
													 <path d="M9.5 1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-1a.5.5 0 0 1 .5-.5h3zm-3-1A1.5 1.5 0 0 0 5 1.5v1A1.5 1.5 0 0 0 6.5 4h3A1.5 1.5 0 0 0 11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3z"/>
											</svg></button>
										</div>				    
							    	 	<xmp id="copy"><%=po.getCode()%></xmp>
							    	 </div>
							    	 <div class="center">
							    	 	<a class="btn btn-primary btnn" style="background: transparent;" aria-current="page" href="solutionPost.jsp?id=<%=po.getPostId()%>">Go To Solution</a>

												<%
												    postId = po.getPostId();
												    session.setAttribute("postId", postId);
												    Class.forName("com.mysql.cj.jdbc.Driver");
				    					            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity", "root", "Love1999@MySQL");

				    								String check = "SELECT COUNT(postId) FROM postLike WHERE postId = ?;";
				    					             PreparedStatement stmt1 = connection.prepareStatement(check);
				    					             stmt1.setInt(1, postId);
				    					             ResultSet rs1 = stmt1.executeQuery(); // Corrected variable name
				    					             rs1.next();
				    					             int likes = rs1.getInt(1);
				    					             int likUid = po.getUid();
				    					             session.setAttribute("likUid", likUid);
												   
												%>
							    	 	
							    	 	<a class="btn btn-primary btnn" aria-current="page" href="#" onclick="likePost(<%=postId%>)">
								    	 	<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-hand-thumbs-up" viewBox="0 0 16 16">
											  <path d="M8.864.046C7.908-.193 7.02.53 6.956 1.466c-.072 1.051-.23 2.016-.428 2.59-.125.36-.479 1.013-1.04 1.639-.557.623-1.282 1.178-2.131 1.41C2.685 7.288 2 7.87 2 8.72v4.001c0 .845.682 1.464 1.448 1.545 1.07.114 1.564.415 2.068.723l.048.03c.272.165.578.348.97.484.397.136.861.217 1.466.217h3.5c.937 0 1.599-.477 1.934-1.064a1.86 1.86 0 0 0 .254-.912c0-.152-.023-.312-.077-.464.201-.263.38-.578.488-.901.11-.33.172-.762.004-1.149.069-.13.12-.269.159-.403.077-.27.113-.568.113-.857 0-.288-.036-.585-.113-.856a2.144 2.144 0 0 0-.138-.362 1.9 1.9 0 0 0 .234-1.734c-.206-.592-.682-1.1-1.2-1.272-.847-.282-1.803-.276-2.516-.211a9.84 9.84 0 0 0-.443.05 9.365 9.365 0 0 0-.062-4.509A1.38 1.38 0 0 0 9.125.111L8.864.046zM11.5 14.721H8c-.51 0-.863-.069-1.14-.164-.281-.097-.506-.228-.776-.393l-.04-.024c-.555-.339-1.198-.731-2.49-.868-.333-.036-.554-.29-.554-.55V8.72c0-.254.226-.543.62-.65 1.095-.3 1.977-.996 2.614-1.708.635-.71 1.064-1.475 1.238-1.978.243-.7.407-1.768.482-2.85.025-.362.36-.594.667-.518l.262.066c.16.04.258.143.288.255a8.34 8.34 0 0 1-.145 4.725.5.5 0 0 0 .595.644l.003-.001.014-.003.058-.014a8.908 8.908 0 0 1 1.036-.157c.663-.06 1.457-.054 2.11.164.175.058.45.3.57.65.107.308.087.67-.266 1.022l-.353.353.353.354c.043.043.105.141.154.315.048.167.075.37.075.581 0 .212-.027.414-.075.582-.05.174-.111.272-.154.315l-.353.353.353.354c.047.047.109.177.005.488a2.224 2.224 0 0 1-.505.805l-.353.353.353.354c.006.005.041.05.041.17a.866.866 0 0 1-.121.416c-.165.288-.503.56-1.066.56z"/>
											</svg>
										</a>
											<span style="color: white;background: transparent;" id="likeCount"><%=likes %></span>
							    	 </div>
							    	 
						  </div>
					</div>
					
					<hr style="color: white; border: 3px solid;">
					<div style="color: white;">
						<h5 class="" style="text-align: center; margin: 10px;" id="postHeading" >Solutions</h5>   
					 <%
					response.setContentType("text/html");
					List<DTOSolution> p1= DAOPost.getSolution(spid);
 					for(DTOSolution ps : p1){ 
 					int suid= id;
 					int sspid= ps.getPostId();
 					int ssid = ps.getSid();
 					
 					%>
 					
 					<a href="viewOtherProfile.jsp?id=<%=ps.getUid()%>">
 					<img style="width: 50px; height: 50px; border-radius: 50%; margin-top: 0px; margin-left: 10px; border: 3px solid; " alt="" src="image?id=<%=ps.getUid()%>">
 					</a>
 					<% 
 					String name = null;
 					name = DAODetails.name(ps.getUid());
 					
 					%>
 					
 					<span><%=name %> </span> 
 					<button style="background: white-space; color: black;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
							</button>
							<ul class="dropdown-menu" style="min-width: 340px;">
						
						        <li>
						  			<a class="btn btn-warning" href="reportUserSolution.jsp?id=<%=ps.getSid()%>&uid=<%=id%>&suid=<%=ps.getUid()%>">Report the solution</a>
						        </li>
						      </ul>
 					<form action="Verify" method="post">
 						<input type="hidden" name="suid" value="<%=suid%>">
    					<input type="hidden" name="sspid" value="<%=sspid%>">
   					 	<input type="hidden" name="ssid" value="<%=ssid%>">
 					<input class="btn btn-success" type="submit" value="verify"/>
 						<svg xmlns="http://www.w3.org/2000/svg" width="60" height="60" fill="currentColor" class="bi bi-calendar-check" viewBox="0 0 16 16">
						  <path d="M10.854 7.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 1 1 .708-.708L7.5 9.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
						  <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM1 4v10a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V4H1z"/>
					</svg>
					
 					<span style="margin-left: 20px;font-size: 35px; color: green;" ><%=DAOPost.getVerify(ssid) %></span><span style="color: green;">Verified</span>
 					</form>
 					
 					<br>
 					<a href="<%=ps.getLink() %>" class="btn-primary" style="margin-left: 30px;"><%=ps.getLink() %></a>
 					<div class="code">
 					<div class="codeHeading">
											<p>Code</p>
											
										</div>	
 					<xmp id="copy"><%=ps.getCode()%></xmp>
 					</div>
 					<hr>
 					<%} %>

		
					<hr style="color: white; border: 3px solid;">
					</div>
				
					 <div class="cmtShow" id="cmt">
						<p class="Cmntheading">Comment</p>
						<div class="row">
    							<%
    								postId=po.getPostId();
    								session.setAttribute("postId", postId);
    								
    								
    							%>
    							<div class="col-sm-11">
									
									<p style="margin-left: 10px; margin-right: 5px" id="commentsDiv">
									
									</p>
									
									
									
    							</div>
    				
  						</div>
						
					 	<form  id="commentForm">
							    <input type="text" class="form-control" id="postcmt" name="postcmt" placeholder="Enter comment" style="width: 90%; margin-left: 10px;">
							    <input type="button" class="btn btn-secondary" value="Comment" id="comment" onclick="submitComment()" style="margin: 10px;">
						</form>
					 	
					 </div>
					 <%} %>
			    </div>
			    </div>
			    </div>
			    
<script type="text/javascript">

document.addEventListener('DOMContentLoaded', function() {
    var alertElement = document.getElementById('alert');
    if (alertElement) {
        setTimeout(function() {
            alertElement.style.display = 'none';
        }, 2000); // 2000 milliseconds = 2 seconds
    }
});


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

function submitComment() {
    var comment = document.getElementById("postcmt").value;
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "cmt", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

    xhr.onreadystatechange = function() {
        if (xhr.readyState === XMLHttpRequest.DONE) {
            if (xhr.status === 200) {
                // Comment was successfully submitted
                // Update the page as needed (e.g., display a success message)
                document.getElementById("postcmt").value = ""; // Clear the input field
            } else {
                // There was an error in the request
                console.error(xhr.responseText);
            }
        }
    };

    xhr.send("postcmt=" + encodeURIComponent(comment));
}

// Start fetching comment data
function fetchCommentData() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'CommentDataServlet', true);

    xhr.onreadystatechange = function () {
        if (xhr.readyState === XMLHttpRequest.DONE) {
            if (xhr.status === 200) {
                var data = JSON.parse(xhr.responseText);
                var commentsDiv = document.getElementById('commentsDiv');
                var imageElement = document.getElementById('showImageOf_comt_uid');

                // Clear previous content
                commentsDiv.innerHTML = "";

                // Loop through the comments data and display them
                data.comments.forEach(function(commentEntry) {
                    var parts = commentEntry.split('(UID:');
                    if (parts.length > 1) {
                        var uid = parts[1].slice(0, -1);
                        var id = uid.replace(/\s/g, '');

                        // Create and append the image element first
                        var imgElement = document.createElement('img');
                        imgElement.style = "width: 50px; height: 50px; border-radius: 50%; margin-top: 0px; margin-left: 10px;";
                        imgElement.alt = "";
                        imgElement.src = "image?id=" + id;
                        commentsDiv.appendChild(imgElement);

                        // Create and append the <a> element
                        var aElement = document.createElement('a');
                        aElement.classList.add("btn", "btn-success", "btnn");
                        aElement.setAttribute("aria-current", "page");
                        aElement.href = "";

                        // Create and append the SVG element
                       
                        // Create and append the <p> element
                        var commentElement = document.createElement('p');
                        commentElement.textContent = parts[0];
                        commentsDiv.appendChild(commentElement);

                        // Create and append the <hr> element
                        var hrElement = document.createElement('hr');
                        commentsDiv.appendChild(hrElement);
                    }
                });

                setTimeout(fetchCommentData, 3000); // Poll every 3 seconds
            } else {
                console.error(xhr.responseText);
                setTimeout(fetchCommentData, 3000); // Retry after 3 seconds in case of error
            }
        }
    };

    xhr.send();
}

fetchCommentData(); // Start fetching comment data

function likePost(postId) {
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "Like?postId=" + postId, true);

    xhr.onload = function() {
        if (xhr.status === 200) {
            document.getElementById("likeCount").innerText = xhr.responseText;
        }
    };

    xhr.send();
}
//This function will be called every 3 seconds to update the count


// This sets up the interval to call the updateVerifyCount function every 3 seconds
setInterval(updateVerifyCount, 3000);






</script>
			    


</body>
</html>