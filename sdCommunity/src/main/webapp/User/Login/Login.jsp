<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="./css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style type="text/css">
.bdy{
 	background-color: black;
    color: white;
 }
 .cover{
 		background-image: url("./css/img/bg-stars-1.webp");
		background-repeat: no-repeat;
    	background-position: center;
    	background-size: cover;
 }
.container{
		margin-top: 50px;
 		width: 100%;
    	height: auto;	
}

label, input{
		margin-left: 20px;
		margin-right: 10px;
		width: 200px;
		
}
button {
		margin-left: 20px;
		margin-right: 10px;
		width: 200px;
		
}
</style>

</head>
<body class="bdy">
<div class="cover">
	<div class="container">
	
<%
			String message = request.getParameter("message");
			if (message != null && message.equals("Failed")){
				out.print("<div class='alert alert-danger' role='alert'>Login Failed...<br>Try again...</div>");
			}else{
				out.print("");
			}
%>
		
			  <div class="row">
			    <div class="col">
			      <form  action="LoginServlet.jsp">
					  <div class="mb-3">
					    <label for="exampleInputEmail1"  class="form-label">Email address</label>
					    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
					    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
					  </div>
					  <div class="mb-3">
					    <label for="exampleInputPassword1" class="form-label">Password</label>
					    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
					  </div>
					  <button type="submit" class="btn btn-primary">Login</button>
				 </form>
			      
			    </div>
			    <div class="col">
			 	 	<img alt="" src="./css/img/socialNetwork.png">
			    </div>
			   </div>
    </div>
    
</div>    
 	
</body>
</html>