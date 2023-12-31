<%@page import="sdCommunity.user.post.DAOPost"%>
<%@page import="sdCommunity.user.details.DAODetails"%>
<%@page import="sdCommunity.user.details.DTOFollower"%>
<%@page import="sdCommunity.user.details.DTOusers"%>
<%@page import="java.util.List"%>
<%@page import="sdCommunity.user.details.DAOuser"%>
<%@page import="sdCommunity.user.post.DTOothers"%>
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
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<meta charset="ISO-8859-1">
<title>Followers</title>
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
.likProfile img:hover {
	border: 3px solid white;
	width: 55px;
	height: 55px;
}
td,th{
	min-width: 130px;
}
header h4 {
  font-size: 30px;
  font-weight: 600;
  background-image: linear-gradient(to left, #553c9a, #b393d3);
  color: transparent;
  background-clip: text;
  -webkit-background-clip: text;
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
		  		out.print("<a class='nav-link' href=''>Followers</a>");
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
	
	<div class="container-xl" id="ref" style="color: white; margin-top: 20px;">
		<div class="row">
			<div class="col"  style="text-align: center;">
				<header>
        			<h4>Followers</h4>
    			</header>
				<%
				List<DTOFollower> liFollowed = DAOuser.folowed(id);
				for(DTOFollower flr : liFollowed)
				{
				%>
					<table class="table">
					<tbody>
					<tr style="color: white">

        				<td><a class="likProfile" href="viewOtherProfile.jsp?id=<%=flr.getUid()%>" ><img alt="" src="image?id=<%=flr.getUid()%>" style="width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;"/></a></td>
        				<td><%=DAODetails.name(flr.getUid())%></td>
        				<td><a href="viewOtherProfile.jsp?id=<%=flr.getUid()%>" class="btn btn-outline-info" >Profile</a> </td>
        			</tr>
        			</tbody>

				</table>
				
				<%} %>
				
			</div>
			<div class="col"  style="text-align: center;">
		
				<header>
        			<h4>Following</h4>
    			</header>
				<%
				List<DTOFollower> liFollowers = DAOuser.folower(id);
				for(DTOFollower flr : liFollowers)
				{
				%>
					<table class="table">
					<tbody>
					<tr style="color: white">
        				<td><a class="likProfile" href="viewOtherProfile.jsp?id=<%=flr.getFollowId()%>" ><img alt="" src="image?id=<%=flr.getFollowId()%>" style="width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;"/></a></td>
        				<td><%=DAODetails.name(flr.getFollowId())%></td>
        				<td><a href="viewOtherProfile.jsp?id=<%=flr.getFollowId()%>" class="btn btn-outline-info" >Profile</a> </td>
        			</tr>
        			</tbody>

				</table>
				<%} %>
			</div>
		
		</div>
		<div class="row">
			<div class="col" style="text-align: center;">
				<header>
        			<h4>People</h4>
    			</header>
				<span style="color: green" id ="userFollowSuccess"></span>
				<span style="color: red" id ="userFollowFailed"></span>
				<%
				List<DTOusers> list=DAOuser.users(id);
				%>
				
				<% 
				for(DTOusers l : list)
				{
				%>
					<table class="table">
					
					 <tbody>
					<tr style="color: white">
        				<td ><a class="likProfile" href="viewOtherProfile.jsp?id=<%=l.getUid()%>" ><img alt="" src="image?id=<%=l.getUid()%>" style="width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;"/></a></td>
        				<td><%=l.getFname() %> <%=l.getLname()%></td>
        				<td><%=l.getEmail() %></td>
        				<td><%=l.getNumber() %> </td>
        				<td><button type="button" class="btn btn-outline-info" onclick="sendData(<%=l.getUid()%>,<%=id%>)">Follow</button> </td>
    				</tr>
    				</tbody>

				</table>
				
				<%
				}
				%>
				
			</div>
		</div>
	</div>

<script type="text/javascript">
$(document).ready(function() {
    function refreshTable() {
        $('#ref').load(location.href + ' #ref'); // Reload the table
    }

    setInterval(refreshTable, 5000); // Refresh every 5 seconds (5000 milliseconds)
});


function sendData(uid, id) {
    $.ajax({
        type: 'POST',
        url: 'Followers',
        data: { uid: uid, id: id },
        success: function(response) {
            $('#userFollowSuccess').text(response); // Update the element text
        },
        
        error: function(error) {
            console.error('Error:', error);
            $('#userFollowSuccess').text(" Already followed.");
        }
    });
}
</script>
</body>
</html>