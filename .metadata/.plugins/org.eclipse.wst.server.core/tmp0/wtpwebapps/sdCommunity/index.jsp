<%@page import="sdCommunity.admin.adv.ProductDAO"%>
<%@page import="sdCommunity.admin.adv.ReqProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="./css/index.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

   <title>sdCommunity</title>
   
   <style type="text/css">
   	.back-fist-part{
		background-image: url("./css/img/bg-stars-1.webp");
		background-repeat: no-repeat;
    	background-position: center;
    	background-size: cover;
 		width: 100%;
    	height: auto;	
	}
	.world{
		background-image: url("./img/worldrotate.png");
		background-repeat: no-repeat;
    	background-position: center;
    	background-size: cover;
 		width: 100%;
    	height: 500px;	
	}
	.AdsSignUp {
	    font-size: 16px;
	    color: #f6d8d8;
	    text-align: center;
	    padding: 10px;
	    background-colors: #f8f8f8;
	    border: 1px solid #ccc;
	    border-radius: 5px;
	    margin: 10px auto;
	    max-width: 600px;
	    position: relative;
	    top: 0px;
	}
	#adsBox{
		height: 700px;
	}
	.w-100{
		height: 400px;
		width: 300px;
	}
	.pName{
		text-align: center;
    	font-size: 25px;
    	font-weight: 900;
    	color: cyan;
    	margin: 10px;
	}
	.cName{
		position: relative;
    	font-size: 15px;
    	margin-right: 30px;
    	left: 70%;
    	top: -36px;
    	color: #6c757d;
    	font-style: italic;
	}
	.priceName{
		position: relative;
    	font-size: 60px;
    	margin-right: 30px;
    	left: 10%;
    	color: #4cc600;
    	margin-top: -64px;
	}
	.oName{
		position: relative;
	    font-size: 30px;
	    margin-right: 30px;
	    left: 43%;
	    color: #ff1616;
	    margin-top: -40px;
	}
	
   </style>
</head>
<body class="bdy">
<img alt="" src="./img/logo.png" style="width: 150px;"> 
<ul class="nav  justify-content-end" style="margin-top: -140px;" >
	
  <li class="nav-item">
    <a class="nav-link active" aria-current="page"  href="Login.jsp"><span style=" padding: inherit;
    background: #33495d00;
    font-size: 16px;
    font-weight: bold;
    text-transform: uppercase;">Login</span></a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="signup.jsp"><span style=" padding: inherit;
    background: #33495d00;
    font-size: 16px;
    font-weight: bold;
    text-transform: uppercase;">Sign up</span></a>
  </li>
</ul>
		
	<div class="back-fist-part">	
	<div class="container-xl">
  <!-- Content here -->
  <%
			String message = request.getParameter("message");
			if (message != null && message.equals("UnauthorizedAccess")){
				out.print("<div class='alert alert-danger' role='alert'>Unauthorized access</div>");
			}else{
				out.print("");
			}
%>
	
		<div class="row">
	    	
	    	<div class="col-8">
	    	
	    		<figure class="heading-possision">
	    			<h1 class="animate-charcter">sdCommunity</h1>
	  				<blockquote class="blockquote">
	    				<p>The sdComunity project proposes the creation of a specialized social network tailored exclusively for developers. This platform aims to facilitate seamless knowledge sharing, problem-solving, and community building within the global developer community. The decision to embark on this endeavor is grounded in several compelling reasons.
						</p>
	 				 </blockquote>
					  <figcaption class="blockquote-footer">
					    Social network platform for 
					     <cite title="Source Title"> Developers</cite>
					  </figcaption>
				</figure>
	    		
	    	</div>
	    	<div class="col">
	    		
	    			<img class="homeFirstImg" alt="" src="./img/Idea.png">
	    		
	    	</div>
	  	</div>
  	</div>
  	</div>
  	<div class="container-xl">
  <!-- Content here -->

	<div class="back-fist-part">
		<div class="row world" >
	    	<div class="col" >
	    		
	    		
	    		
	    	</div>
	    	
	    	<div class="col-3">
	    		
	    		
	    	</div>
	    	
	    	<div class="col">
	    		
	    	</div>
	  	</div>
  	</div>
  	</div>
  	<div class="container-xl">
  <!-- Content here -->

	<div class="back-fist-part">
		<div class="row" >
	    	<div class="col-8" >
	    		
	    	
	    			<div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
					  <div class="carousel-inner" id="adsBox">
					    
					    <%
					    List<ReqProductDTO> pr = ProductDAO.getAllAcceptProduct();
					    for(int i = 0; i < pr.size(); i++){
					    	ReqProductDTO p = pr.get(i);
					    %>
					    
					    <div class="carousel-item <%= i == 0 ? "active" : "" %>" id="adsBox">
						    <img class="d-block w-100" src="adim?id=<%=p.getTid()%>" alt="Third slide">
						    <p class="pName"><%=p.getpName() %></p>
						    <p class="cName"><%=p.getCompany() %></p>
						    <p class="priceName">
						        <svg xmlns="http://www.w3.org/2000/svg" width="50" height="50" fill="currentColor"
						            class="bi bi-tags-fill" viewBox="0 0 16 16">
						            <path
						                d="M2 2a1 1 0 0 1 1-1h4.586a1 1 0 0 1 .707.293l7 7a1 1 0 0 1 0 1.414l-4.586 4.586a1 1 0 0 1-1.414 0l-7-7A1 1 0 0 1 2 6.586V2zm3.5 4a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3z" />
						            <path
						                d="M1.293 7.793A1 1 0 0 1 1 7.086V2a1 1 0 0 0-1 1v4.586a1 1 0 0 0 .293.707l7 7a1 1 0 0 0 1.414 0l.043-.043-7.457-7.457z" />
						        </svg>
						        <%=p.getPrice() %></p>
						    <p class="oName"><%=p.getPrice()- p.getOffer() %> offer price</p>
						    <div style="text-align: center;">
						        <a href="ViewAds.jsp?id=<%=p.getTid()%>&link=<%=p.getLink()%>" class="btn btn-success">goto</a>
						    </div>
						</div>
					    <%} %>
					    

					  </div>
					</div>
	    		
	    		
	    	</div>
	    	
	    	<div class="col-3">
	    		<div class="AdsSignUp">
	    			<p>"If you're interested in placing advertisements within the sdCommunity platform, simply sign up!"</p>
	    		</div>
	    		<a class="btn btn-primary" aria-current="page"  href="AdvSign.jsp"><span style=" padding: inherit;
	    			background: #33495d00;
	    			font-size: 16px;
	    			font-weight: bold;
	    			text-transform: uppercase;">Sign up</span></a>
	    			<a class="btn btn-success" aria-current="page"  href="AdvLogin.jsp"><span style=" padding: inherit;
	    			background: #33495d00;
	    			font-size: 16px;
	    			font-weight: bold;
	    			text-transform: uppercase;">Login</span></a>
	    	
	    		 
	    		
	    	</div>
	    	
	    	<div class="col">
	    		
	    	</div>
	  	</div>
  	</div>
  	</div>
	
	
	
	<div class="container-xl " id="homeThird">
		<div class="back-fist-part">
  		<!-- Stack the columns on mobile by making one full-width and the other half-width -->
  			<div class="row">
			    <div class="col-md-8">
			    	<div class="homeThredContent">
					     <div class="waviy">
							   <span style="--i:1">C</span>
							   <span style="--i:2">o</span>
							   <span style="--i:3">n</span>
							   <span style="--i:4">n</span>
							   <span style="--i:5">e</span>
							   <span style="--i:6">c</span>
							   <span style="--i:7">t</span>
							   <span style="--i:8">i</span>
							   <span style="--i:9">n</span>
							   <span style="--i:10">g</span>
							   <span style="--i:11"><br></span>
							   <span style="--i:12">w</span>
							   <span style="--i:13">o</span>
							   <span style="--i:14">r</span>
							   <span style="--i:15">l</span>
							   <span style="--i:16">d</span>
		  				</div>
 					 </div>
 					 <p  style="font-size: 15px" >The sdCommunity project brings forth a specialized social network uniquely designed for developers, presenting a dedicated space for knowledge exchange, collaborative problem-solving, and fostering a tightly-knit global developer community. This endeavor stands out for its ability to unite developers worldwide in a seamless platform, transcending geographical boundaries and time zones. By streamlining the process of sharing insights, seeking advice, and engaging in meaningful discussions, the network offers a pivotal resource for professional growth and innovation. Moreover, the platform's niche focus ensures that content remains highly relevant, enhancing the overall quality and effectiveness of interactions. With an emphasis on expertise and collaboration, sdCommunity is poised to revolutionize how developers connect and learn from one another, ultimately advancing the field of software development.</p>
			    
			     </div>
			    <div class="col" id="homeThirdPart">
			    
			    </div>
  			</div>
  			</div>
  		</div>
		
	
	
	

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>