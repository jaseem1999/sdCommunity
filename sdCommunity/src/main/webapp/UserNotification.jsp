<%@page import="sdCommunity.user.notification.DTOlikePost"%>
<%@page import="sdCommunity.user.details.DAODetails"%>
<%@page import="sdCommunity.user.details.DTOusers"%>
<%@page import="sdCommunity.user.notification.DAOnotif"%>
<%@page import="sdCommunity.user.notification.DTOnotification"%>
<%@page import="java.util.List"%>
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

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notification</title>
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
}
.code pre{
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
	
	<div class="container-xl" style="color:white; margin-top: 20px;">
		<div style="background: #6699c130">
		<h4>Post Notification</h4>
		<%
		List<DTOnotification> noti = DAOnotif.getPostNotif(id);
		for(DTOnotification pn : noti){
		%>
			
			
			<table class="table table-striped-columns" style="">
 				<tr>
      				<td style="color: white;"><a class="likProfile" href="viewOtherProfile.jsp?id=<%=pn.getUserId()%>" ><img alt="" src="image?id=<%=pn.getUserId()%>" style="width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;"/></a></td>
      				<td style="color: white;"><p style="padding: inherit;"><%=DAODetails.name(pn.getUserId())%></p></td>
      				<td style="color: white;"><p style="padding: inherit;"><%=pn.getNotification() %></p></td>
      				<td style="color: white;"><p style="padding: inherit;"><%=DAODetails.getPostHeading(pn.getPostId())%></p></td>
      				<td style="color: white;"><a class="btn btn-primary btnn" href="userViewPost.jsp?id=<%=pn.getPostId()%>">Go to check</a></td>
    			</tr>
			</table>
	
			
			
		<%}%>
		</div>
		<hr>
		<div style="background: #6699c130">
		<h4>Post Like Notification</h4>
		<%
		List<DTOlikePost> like = DAOnotif.getPostLikeNoti(id);
		for(DTOlikePost pl : like){
		%>
			<table class="table table-striped-columns" style="">
 				<tr>
      				<td style="color: white;"><a class="likProfile" href="viewOtherProfile.jsp?id=<%=pl.getUserId()%>" ><img alt="" src="image?id=<%=pl.getUserId()%>" style="width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;"/></a></td>
      				<td style="color: white;"><p style="padding: inherit;"><%=DAODetails.name(pl.getUserId())%></p></td>
      				<td style="color: white;"><p style="padding: inherit;"><%=pl.getNotification() %></p></td>
      				<td style="color: white;"><p style="padding: inherit;"><%=DAODetails.getPostHeading(pl.getPostId())%></p></td>
      				<td style="color: white;"><a class="btn btn-primary btnn" href="userViewPost.jsp?id=<%=pl.getPostId()%>">Go to check</a></td>
    			</tr>
			</table>
			
		<%}%>
		</div>
		
	</div>


</body>
</html>