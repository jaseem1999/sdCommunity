<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
Integer id =(Integer)session.getAttribute("uid");
String fname=(String)session.getAttribute("fname"); 
String lname=(String)session.getAttribute("lname"); 
String email=(String)session.getAttribute("email");
Long num=(Long)session.getAttribute("num");
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
<link rel="stylesheet" href="./homecss/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Settings for <%=fname%></title>
<style type="text/css">
.sattingsOptions{
	border: 1px solid white;
	border-radius: 5px;
	width: 85%;
	line-height: 30.4px;
	margin-top: 10px;
	margin-left: 10px;
}
.sattingsSectiion{
	margin-top: 10px;	
	height: auto;
	width: 100%;
	background-color: #5f5fd13b;
	padding-top: 10px;
	padding-bottom: 10px;
}
a{
	text-decoration: none;
}
.sattingsOptions:hover {
	background-color: white;
}
#center{
	text-align: center;
}

</style>

<body style="background-color: black" class="hbdy">

	<ul class="nav justify-content-end " >
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
		  		out.print("<a class='nav-link' href=''>Chat</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  
		  <li class="nav-item">
		   <%
		  	if (email != null){
		  		out.print("<a class='nav-link' href='UserSettings.jsp'>Settings</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  <li class="nav-item">
		  <%
		  	if (email != null){
		  		if (company != null){
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
		  		if (company != null){
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
	
	<div class="container-xl" style="color: white; margin-top: 20px;">
  <div class="row">
    <div class="col-sm-4">
    	<div class="sattingsSectiion">
    	
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    				change phone number
  				</a>
    		</div>
    		
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample2" role="button" aria-expanded="false" aria-controls="collapseExample">
    				change password 
  				</a>
    		</div>
    		
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample3" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Change Email 
  				</a>
    		
    		</div>
    		
    		
    	</div>
    
    </div>
    <div class="col-sm-8">
    
    	<div class="collapse" id="collapseExample" style="margin: 5px;">
  			<div class="card"  style="background-color:#5f5fd13b ">
    		
    			<form action="" style="margin: 20px;">
    			  <div class="mb-3 row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="<%=email%>" style="color: white;">
					    </div>
					  </div>
					    <div class="mb-3 row">
			    		<label for="exampleInputNumber" class="col-sm-2 col-form-label">Number</label>
			    		<div class="col-sm-10">
					      <input type="tel" class="form-control" id="inputNumber">
					    </div>
			    		<br><span class="error" id="nom"></span>
			  			</div>
			  			 <div id="center"><button type="submit" class="btn btn-primary" >Change Number</button></div>
  					</form>
    			
    		</div>
		</div>
		<div class="collapse" id="collapseExample2"  style="margin: 5px;">
  			<div class="card"  style="background-color:#5f5fd13b ">
    			<form action="" style="margin: 20px;">
    			
    				<div class="mb-3 row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="<%=email%>" style="color: white;">
					    </div>
					  </div>
					  <div class="mb-3 row">
					    <label for="inputPassword" class="col-sm-2 col-form-label">Enter new Password</label>
					    <div class="col-sm-10">
					      <input type="password" class="form-control" id="inputPassword">
					    </div>
					    </div>
					    
					    <div class="mb-3 row">
					    <label for="inputPassword" class="col-sm-2 col-form-label">Re-enter new password</label>
					    <div class="col-sm-10">
					      <input type="password" class="form-control" id="inputRepassword">
					    </div>
					    </div>
					   
			  			 <div id="center"><button type="submit" class="btn btn-primary" >Change Password</button></div>
  					</form>
  				
    		</div>
		</div>
		<div class="collapse" id="collapseExample3"  style="margin: 5px;">
  			<div class="card"  style="background-color:#5f5fd13b ">
    			<form action="" style="margin: 20px;">
    				<div class="mb-3 row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="<%=email%>" style="color: white;">
					    </div>
					  </div>
					  <div class="mb-3 row">
					    <label for="inputEmail" class="col-sm-2 col-form-label">Enter new Email</label>
					    <div class="col-sm-10">
					      <input type="email" class="form-control" id="inputEmail">
					    </div>
					    </div> 
			  			 <div id="center"><button type="submit" class="btn btn-primary" >Change Email</button></div>
  					</form>
  				
    		</div>
		</div>
		
    </div>
  </div>
  </div>
	
</body>
</html>