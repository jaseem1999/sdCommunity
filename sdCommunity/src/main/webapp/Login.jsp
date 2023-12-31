<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="./logincss/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style type="text/css">
.bdy{
 	background-color: black;
    color: white;
 }
 .cover{
 		background-image: url("./logincss/img/bg-stars-1.webp");
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
			if(message != null && message.equals("Blocked")){
				out.print("<div class='alert alert-danger' role='alert'>Login Blocked...<br>Contact admin...</div>");
			}
			if(message != null && message.equals("numberSuccess")){
				out.print("<div class='alert alert-success' role='alert'>Number Updated Successfully...<br>Login again...</div>");
			}
			if(message != null && message.equals("numberFailed")){
				out.print("<div class='alert alert-danger' role='alert'>Number Updated Failed... Try again<br>or contact admin...</div>");
			}
			if(message != null && message.equals("passwordSuccess")){
				out.print("<div class='alert alert-success' role='alert'>Password Updated Successfully...<br>Login again...</div>");
			}
			if(message != null && message.equals("passwordFailed")){
				out.print("<div class='alert alert-danger' role='alert'>password Updated Failed... Try again<br>or contact admin...</div>");
			}
			if(message != null && message.equals("emailSuccess")){
				out.print("<div class='alert alert-success' role='alert'>Email Updated Successfully...<br>Login again...</div>");
			}
			if(message != null && message.equals("emailFailed")){
				out.print("<div class='alert alert-danger' role='alert'>password Updated Failed... Try again<br>or contact admin...</div>");
			}
			if(message != null && message.equals("nameSuccess")){
				out.print("<div class='alert alert-success' role='alert'>Name Updated Successfully...<br>Login again...</div>");
			}
			if(message != null && message.equals("nameFailed")){
				out.print("<div class='alert alert-danger' role='alert'>Name Updated Failed... Try again<br>or contact admin...</div>");
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
					  <div class="mb-3">
					    	<p style="margin-left: 20px;"><a href="#" class="link-danger link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover">Forget Password</a></p>
					  </div>
					  <button type="submit" class="btn btn-success">Login</button><a class="btn btn-primary" href="signup.jsp">Sign up</a>
				 </form>
				 
			      
			    </div>
			    <div class="col">
			 	 	<img alt="" src="./logincss/img/socialNetwork.png">
			    </div>
			   </div>
    </div>
    
</div>    
 	
</body>
</html>