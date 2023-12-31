<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Signup</title>
    <link rel="stylesheet" href="./css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

    
</head>

<style>
	.alert{
		margin-top: 30%;
	}
</style>

<body class="bdy">

<div class="container" >
	<!-- Stack the columns on mobile by making one full-width and the other half-width -->
  			<div class="row" style="margin-top: 20px">
  			
  				
			    <div class="col-8" id="signBConnection">
			    		<%
						String message = request.getParameter("message");
						if (message != null && message.equals("Failed")){
							out.print("<div class='alert alert-danger' role='alert'>Sign Up Failed...<br>Try again...</div>");
						}else if(message != null && message.equals("Success")){
							out.print("<div class='alert alert-success' role='alert'>Sign Up Successfully...<br>");
							out.print("<a class='btn btn-primary' aria-current='page'  href='../Login/Login.jsp'>");
						    out.print("Login</a> </div>");
						}else{
							out.print("");
						}
						%>
			    </div>
			    <div class="col-4"  >
			    
			  		

						<form onsubmit="return uform()" action="SignupServlet.jsp" method="post" class="card" id="ctrForm">
  
			    	<div class="mb-3">
   						<label for="exampleInputEmail1" class="form-label">Email address</label>
    					<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  name="email" >
    					<br><span class="error" id="eml"></span>
    					<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  					</div>
					<div class="mb-3">
			    		<label for="exampleInputPassword1" class="form-label">Password</label>
			    		<input type="password" class="form-control" id="exampleInputPassword1" name="password"  >
			    		<br><span class="error" id="psw"></span>
			  		</div>
			  		<div class="mb-3">
			    		<label for="exampleInputPassword1" class="form-label">Repassword</label>
			    		<input type="password" class="form-control" id="exampleInputRepassword1" name="repassword"  >
			  		</div>
			  		<div class="mb-3">
			    		<label for="exampleInputNumber" class="form-label">Number</label>
			    		<input type="text" class="form-control" id="exampleInputNumber" name="number" >
			    		<br><span class="error" id="nom"></span>
			  		</div>
			  		<div class="mb-3">
			    		<label for="exampleInputFname" class="form-label">First Name</label>
			    		<input type="text" class="form-control" id="exampleInputFname" name="fname" >
			    		<br><span class="error" id="usn"></span>
			  		</div>
					 <div class="mb-3">
			    		<label for="exampleInputLname" class="form-label">Last Name</label>
			    		<input type="text" class="form-control" id="exampleInputlname" name="lname" ">
			  		</div>
					 <div id="center"><button type="submit" class="btn btn-primary" >Sign Up</button></div>
					</form>
			    
			    </div>
  		</div>
 </div>



<script type="text/javascript" src="./js/signup.js"></script>


</body>
</html>