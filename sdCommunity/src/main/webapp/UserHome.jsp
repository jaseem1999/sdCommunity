<%@page import="java.util.Base64"%>
<%@page import="java.io.IOException"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./homecss/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<%
	Integer id =(Integer)session.getAttribute("uid");
	String fname=(String)session.getAttribute("fname"); 
	String lname=(String)session.getAttribute("lname"); 
	String email=(String)session.getAttribute("email");
	long num=(Long)session.getAttribute("num");
	String company=(String)session.getAttribute("company");
	String base64ImageJpg = (String) session.getAttribute("base64Image");
	
%>

<meta charset="ISO-8859-1">
<title>Home (<%=fname%>)</title>
</head>
<body style="background-color: black">

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
		  		out.print("<a class='nav-link' data-bs-toggle='modal' data-bs-target='#exampleModal'>Settings</a>");
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
	
			<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
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
	
	<div class="container text-center hbdy" style="margin-top: 10px;">
	<%
			String message = request.getParameter("message");
			if (message != null && message.equals("Failed")){
					out.print("<div class='alert alert-danger' id='alert' role='alert'>Settings access is Failed...<br>Try again...</div>");
			}if(message != null && message.equals("Success")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Post added</div>");	
			}
	%>
		  <div class="row">
			    <div class="col" style="background-color: #d8d8cd3d ;">
			    	
			      	<div class="card" style="width: 18rem; margin-top: 30px;">
						  <div class="card-body">
						    <h5 class="card-title"><%=company %></h5>
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
						    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
						    <a href="#" class="card-link">Card link</a>
						    <a href="#" class="card-link">Another link</a>
						  </div>
					</div>
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
	</script>
</body>
</html>