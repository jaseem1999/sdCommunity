<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style type="text/css">
body{
	background-color: black;
	color: white;
}
a {
	 text-decoration: none;
	 color: white;
	 font-size: 15px;
	 font-weight: bold;
	 text-transform: uppercase;
}

</style>
</head>
<body>
<div class="container">
<%
						String message = request.getParameter("message");
						if (message != null && message.equals("Failed")){
							out.print("<div class='alert alert-danger' style='margin-top : 20px;' role='alert'>Login Failed...<br>Try again...</div>");
						}else{
							out.print("");
						}
%>
	<div class="col" style="margin: 100px;">
			    <form action="AdminLoginServlet.jsp" method="post" style="color: white;" >
					  <div class="mb-3">
					    <label for="exampleInputEmail1" class="form-label">Email address</label>
					    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" required="required">
					 
					  </div>
			
					  <div class="mb-3">
					    <label for="exampleInputPassword1" class="form-label">Password</label>
					    <input type="password" class="form-control" id="exampleInputPassword1" name="pass" required="required">
					  </div>
					  
					  <button type="submit" class="btn btn-primary">Login</button>
				</form>
		</div>
</div>
</body>
</html>