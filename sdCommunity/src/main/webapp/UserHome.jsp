<%@page import="sdCommunity.admin.adv.ProductDAO"%>
<%@page import="sdCommunity.admin.adv.ReqProductDTO"%>
<%@page import="sdCommunity.user.post.DAOPost"%>
<%@page import="sdCommunity.user.post.DTOpost"%>
<%@page import="java.util.List"%>
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
	String college=(String)session.getAttribute("college");
	String base64ImageJpg = (String) session.getAttribute("base64Image");
	int postId = 0;
	Integer like= 0;
	
	if(email == null){
		response.sendRedirect("index.jsp?message=UnauthorizedAccess");
	}
	
%>

<meta charset="ISO-8859-1">
<title>Home (<%=fname%>)</title>
<style>
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
.search{
	width: 300px;
    height: 35px;
    margin-top: 0px;
    border-radius: 10px;
    border: 3px solid blue;
}
.pName{
		text-align: center;
    	font-size: 18px;
    	font-weight: 900;
    	color: cyan;
    	margin: 10px;
	}
	.cName{
		position: relative;
    	font-size: 15px;
    	margin-right: 30px;
    	left: 70%;
    	top: -14px;
    	color: #6c757d;
    	font-style: italic;
	}
	.priceName{
		position: relative;
    	font-size: 30px;
    	margin-right: 30px;
    	left: 0%;
    	color: #4cc600;
    	margin-top: -30px;
	}
	.oName{
		position: relative;
	    font-size: 25px;
	    margin-right: 30px;
	    left: 0%;
	    color: #ff1616;
	    margin-top: -15px;
	}
</style>
</head>
<body style="background-color: black">

	<ul class="nav justify-content-end " style="">
			<li class="nav-item" >
		    	<a class='nav-link' style="padding: 0px;" href='UserHome.jsp'><img src="./img/logo.png" alt="" width="50px"></a>
			</li>
			<li class="nav-item"  style="padding: 10px;">
		    	sdCommunity
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
		  		out.print("<a class='nav-link' href='UserNotification.jsp'>Notification</a>");
		  	}else{
		  		out.print("");
		  	}
		  %>
		  
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
	
	<div class="container hbdy" style="margin-top: 10px;">
	<%
			String message = request.getParameter("message");
			if (message != null && message.equals("Failed")){
					out.print("<div class='alert alert-danger' id='alert' role='alert'>Settings access is Failed...<br>Try again...</div>");
			}if(message != null && message.equals("Success")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Post added</div>");	
			}
			if(message != null && message.equals("successFeedBack")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Feedback submitted succssfuly</div>");	
			}
			if(message != null && message.equals("failedFeedBack")){
				out.print("<div class='alert alert-danger' id='alert' role='alert'>Feedback submitted failed</div>");	
			}
	%>
		  <div class="row">
			    
			    <%
					response.setContentType("text/html");
					List<DTOpost> p= DAOPost.getPost();
				%>
			    
			    <div class="col-9" style="background-color: #6699c130;">
			    <% for(DTOpost po : p){ %>
			    	
			      	<div class="" style="color: white; max-width: 100%; margin-left: 20px; margin-top: 10px;" id="showPost">
			      		
						  <img src="poimg?id=<%=po.getPostId()%>" style="width : 100%; height: 200px;" alt="...">
						  <a href="viewOtherProfile.jsp?id=<%=po.getUid()%>">
						  <img style="width: 50px; height: 50px; border-radius: 50%; margin-top: 5px; margin-left: 10px; border: 2px solid; " alt="" src="image?id=<%=po.getUid()%>">
						  </a>
						  <div class="card-body">
							    <h5 class="" style="text-align: center; margin: 10px;" id="postHeading" ><%=po.getHeading()%></h5>   	
							    	<p class="card-text" style="margin: 30px;"><%=po.getPost()%></p>
							    	<a href="<%=po.getLink() %>" class="btn-primary" style="margin-left: 30px;"><%=po.getLink() %></a>
									<div class="code">	
										<div class="codeHeading">
											<p>Code</p>
											
										</div>				    
							    	 	<pre ><xmp id="copy"><%=po.getCode() %></xmp></pre>
							    	 </div>
							    	 <div class="center">
							    	 	<a class="btn btn-primary btnn" aria-current="page" href="userViewPost.jsp?id=<%=po.getPostId()%>">Go To Check</a>

							    	 </div>
						  </div>
					</div>
					<hr style="color: white; border: 3px solid;">
					 <%} %>
			    </div>
			    <div class="col-3" style="background-color: #d8d8cd3d color: white;">
			    	
			    	<div style="position: fixed;" id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
					  <h6 style="color: white;">Ads</h6>
					  <div class="carousel-inner" id="adsBox">
					    
					    <%
					    List<ReqProductDTO> pr = ProductDAO.getAllAcceptProduct();
					    for(int i = 0; i < pr.size(); i++){
					    	ReqProductDTO product = pr.get(i);
					    %>
					    
					    <div class="carousel-item <%= i == 0 ? "active" : "" %>" id="adsBox">
						    <img class="d-block w-100" src="adim?id=<%=product.getTid()%>" alt="Third slide">
						    <p style="" class="pName"><%=product.getpName() %></p>
						    <p class="cName"><%=product.getCompany() %></p>
						    <p class="priceName">
						        <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
						            class="bi bi-tags-fill" viewBox="0 0 16 16">
						            <path
						                d="M2 2a1 1 0 0 1 1-1h4.586a1 1 0 0 1 .707.293l7 7a1 1 0 0 1 0 1.414l-4.586 4.586a1 1 0 0 1-1.414 0l-7-7A1 1 0 0 1 2 6.586V2zm3.5 4a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3z" />
						            <path
						                d="M1.293 7.793A1 1 0 0 1 1 7.086V2a1 1 0 0 0-1 1v4.586a1 1 0 0 0 .293.707l7 7a1 1 0 0 0 1.414 0l.043-.043-7.457-7.457z" />
						        </svg>
						        <%=product.getPrice() %></p>
						    <p class="oName"><%=product.getPrice()- product.getOffer() %> offer price</p>
						    <div style="text-align: center;">
						        <a href="ViewAds.jsp?id=<%=product.getTid()%>&link=<%=product.getLink()%>" class="btn btn-success">goto</a>
						    </div>
						    
						</div>
					    <%} %>
					    
							
					  </div>
					       <div style="margin-top: 10px;">
								<form action="userFeedbacksend.jsp" method="get">
									<input type="hidden" value="<%=id %>" name="uid"/>
								  <div class="form-group">
								    <label style="margin-left: 10px; color: white;" for="exampleInputFeedback">Feedback</label>
								    <input style="margin: 10px; width: 300px;" type="text" class="form-control" id="exampleInputFeedback" aria-describedby="exampleInputFeedback" placeholder="Enter Feedback" name="feedback">
								   </div>
								
								  <button style="margin-left: 10px;" type="submit" class="btn btn-primary">Submit</button>
								</form>
							</div>
					
			    	
			      	</div>
			    </div>
			    
			   
			    
			    
		  </div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	
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
	
	function search() {
	    var searchTerm = document.getElementById('searchInput').value.toLowerCase();
	    var postHeading = document.getElementById('postHeading').textContent.toLowerCase();
	    
	    if (postHeading.includes(searchTerm)) {
	    	document.getElementById('showPost').style.display = 'block';
	        
	    } else {
	        alert('Heading not matched.');
	    }
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