<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<%
	Integer id =(Integer)session.getAttribute("uid");
	String fname=(String)session.getAttribute("fname"); 
	String lname=(String)session.getAttribute("lname"); 
	String email=(String)session.getAttribute("email");
	Integer num=(Integer)session.getAttribute("num"); 	
%>
<meta charset="ISO-8859-1">
<title>Home (<%=fname%>)</title>
</head>
<body style="background-color: black">
	<ul class="nav justify-content-end ">
		  <li class="nav-item">
		    <%
		  	if (email != null){
		  		out.print("<a class='nav-link' href=''>Post</a>");
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
		  		out.print("<a class='nav-link' href=''>Chat</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  
		  <li class="nav-item">
		   <%
		  	if (email != null){
		  		out.print("<a class='nav-link' href=''>Settings</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
		  <li class="nav-item">
		  <%
		  	if (email != null){
		  		out.print("<a class='nav-link' href='../backProfile.jsp'>Profile</a>");
		  	}else{
		  		out.print("<a class='nav-link' href='../Login/Login.jsp'>Login</a>");
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
		  		out.print("<a class='nav-link' href=''><img alt='' src='./css/img/User-Profile.png' style='width : 25px;'/></a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  </li>
	</ul>
	
	
	
	<div class="container text-center hbdy" style="margin-top: 10px;">
		  <div class="row">
			    <div class="col" style="background-color: #d8d8cd3d ;">
			    	
			      	<div class="card" style="width: 18rem; margin-top: 30px;">
						  <div class="card-body">
						    <h5 class="card-title">Card title</h5>
						    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="card-link">Card link</a>
						    <a href="#" class="card-link">Another link</a>
						  </div>
					</div>
					
					<div class="card" style="width: 18rem; margin-top: 30px;">
						  <div class="card-body">
						    <h5 class="card-title">Card title</h5>
						    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="card-link">Card link</a>
						    <a href="#" class="card-link">Another link</a>
						  </div>
					</div>
					<div class="card" style="width: 18rem; margin-top: 30px; margin-top: 30px;">
						  <div class="card-body">
						    <h5 class="card-title">Card title</h5>
						    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="card-link">Card link</a>
						    <a href="#" class="card-link">Another link</a>
						  </div>
					</div>
					
			    </div>
			    
			    <div class="col-6" style="background-color: #6699c130;">
			      	<div class="card" style="max-width: 34rem; margin-left: 20px; margin-top: 30px; ">
						  <img src="./css/img/thirdOneMainPage.jpg" class="card-img-top" alt="...">
						  <div class="card-body">
							    <h5 class="card-title">Card title</h5>
							    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
							    <a href="#" class="btn btn-primary">Go somewhere</a>
						  </div>
					</div>
					
					<div class="card" style="max-width: 34rem; margin-left: 20px; margin-top: 30px; ">
						  <img src="./css/img/thirdOneMainPage.jpg" class="card-img-top" alt="...">
						  <div class="card-body">
							    <h5 class="card-title">Card title</h5>
							    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
							    <a href="#" class="btn btn-primary">Go somewhere</a>
						  </div>
					</div>
					
					<div class="card" style="max-width: 34rem; margin-left: 20px; margin-top: 30px; ">
						  <img src="./css/img/thirdOneMainPage.jpg" class="card-img-top" alt="...">
						  <div class="card-body">
							    <h5 class="card-title">Card title</h5>
							    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
							    <a href="#" class="btn btn-primary">Go somewhere</a>
						  </div>
					</div>
					
					
			    </div>
			    
			    <div class="col" style="background-color: #d8d8cd3d;">
			      <div class="card" style="width: 18rem;">
					<div class="card-body">
						    <h5 class="card-title">Welcome <%=fname%></h5>
						    <h6 class="card-subtitle mb-2 text-body-secondary">to sdCommunity</h6>
						    <a href="#" class="card-link">Card link</a>
						    <a href="#" class="card-link">Another link</a>
						  </div>
					</div>
			    </div>
		  </div>
	</div>
	
	
</body>
</html>