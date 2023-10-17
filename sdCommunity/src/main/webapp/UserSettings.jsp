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
.profileImg{
	width: 70px;
	height: 100px;
	border-radius: 50%;
}
.error{
		color: red;
		margin-left: 30px;
		margin-top: 10px;
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
	<%
	String message = request.getParameter("message");
	if (message != null && message.equals("Failed")){
		out.print("<div class='alert alert-danger' role='alert'>Enter Valid name or fill first name and last name...<br>Try again...</div>");
	}else{
		out.print("");
	}
	%>
	
	<div class="container-xl" style="color: white; margin-top: 20px;">
  <div class="row">
    <div class="col-sm-4">
    	<div class="sattingsSectiion">
    	
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
    				change your phone number
  				</a>
    		</div>
    		
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample2" role="button" aria-expanded="false" aria-controls="collapseExample">
    				change your password 
  				</a>
    		</div>
    		
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample3" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Change your Email 
  				</a>
    		
    		</div>
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample4" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Change Your Name
  				</a>
    		
    		</div>
    		<div class="text-center sattingsOptions">
    			<a data-bs-toggle="collapse" href="#collapseExample5" role="button" aria-expanded="false" aria-controls="collapseExample">
    				Change Your Profile
  				</a>
    		
    		</div>
    		
    		
    	</div>
    
    </div>
    <div class="col-sm-8">
    
    	<div class="collapse" id="collapseExample" style="margin: 5px;">
  			<div class="card"  style="background-color:#5f5fd13b ">
    		
    			<form action="cNumber" method="post" style="margin: 20px;">
    			  <div class="mb-3 row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" readonly class="form-control-plaintext" id="staticEmail" name="staticEmail" value="<%=email%>" style="color: white;">
					    </div>
					  </div>
					    <div class="mb-3 row">
			    		<label for="exampleInputNumber" class="col-sm-2 col-form-label">Number</label>
			    		<div class="col-sm-10">
					      <input type="tel" class="form-control" name="inputNumber" id="inputNumber">
					    </div>
			    		<br><span class="error" id="nom"></span>
			  			</div>
			  			 <div id="center"><button type="submit" class="btn btn-primary" >Change Number</button></div>
  					</form>
    			
    		</div>
		</div>
		<div class="collapse" id="collapseExample2"  style="margin: 5px;">
  			<div class="card"  style="background-color:#5f5fd13b ">
    			<form onsubmit="return validate()" action="cPass" method="post" style="margin: 20px;">
    			
    				<div class="mb-3 row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" readonly class="form-control-plaintext" id="staticEmail" name="staticEmail" value="<%=email%>" style="color: white;">
					    </div>
					  </div>
					  <div class="mb-3 row">
					    <label for="inputPassword" class="col-sm-2 col-form-label">Enter new Password</label>
					    <div class="col-sm-10">
					      <input type="password" class="form-control" id="inputPassword" name="inputPassword">
					    </div>
					    <span style="color: red;" id="psw"></span>
					    </div>
					    
					    <div class="mb-3 row">
					    <label for="inputPassword" class="col-sm-2 col-form-label">Re-enter new password</label>
					    <div class="col-sm-10">
					      <input type="password" class="form-control" id="inputRepassword" name="inputRepassword">
					    </div>
					    </div>
					   
			  			 <div id="center"><button type="submit" class="btn btn-primary" >Change Password</button></div>
  					</form>
  				
    		</div>
		</div>
		<div class="collapse" id="collapseExample3"  style="margin: 5px;">
    			<form onsubmit="return emailValidate()" action="cEmail" method="post" style="margin: 20px;">
    				<div class="mb-3 row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" readonly class="form-control-plaintext" id="staticEmail" name="staticEmail" value="<%=email%>" style="color: white;">
					    </div>
					  </div>
					  <div class="mb-3 row">
					    <label for="inputEmail" class="col-sm-2 col-form-label">Enter new Email</label>
					    <div class="col-sm-10">
					      <input type="email" class="form-control" id="inputEmail" name="inputEmail">
					    </div>
					    <span style="color: red;" id="eml"></span>
					    </div> 
			  			 <div id="center"><button type="submit" class="btn btn-primary" >Change Email</button></div>
  					</form>
  				
    		</div>
    		<div class="collapse" id="collapseExample4"  style="margin: 5px;">
    			<form action="cName" method="post" style="margin: 20px;">
    				<div class="mb-3 row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" readonly class="form-control-plaintext" id="staticEmail" name="staticEmail" value="<%=email%>" style="color: white;">
					    </div>
					  </div>
					  <div class="mb-3 row">
					    <label for="inputFName" class="col-sm-2 col-form-label">Enter new First Name</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="inputFname" name="inputFname">
					    </div>
					    </div>
					    <div class="mb-3 row">
					    <label for="inputLname" class="col-sm-2 col-form-label">Enter new Last name</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" id="inputLname" name="inputLname">
					    </div>
					    </div>  
			  			 <div id="center"><button type="submit" class="btn btn-primary" >Change Name</button></div>
  					</form>
  				
    		</div>
    		<div class="collapse" id="collapseExample5"  style="margin: 5px;">
    		<div id="center">
				<img class="profileImg" alt="" src="" id="updatedImg" style="width: 100px;"/><br>
		    </div>
    			<form onsubmit="return validateForm()" action="UAdd" method="post" enctype="multipart/form-data" style="margin: 20px;">
    				 <label for="image" class="form-label ">Upload Image:</label>
				        <input class="form-control custom-file-input" type="file" id="image" name="image" accept="image/*" onchange="displayImage()">
						<span class="error" id="imgError"></span><br>
						
				        <label for="company" class="form-label">Company:</label>
				        <input class="form-control" type="text" id="company" name="company">
						<span class="error" id="companyError"></span><br>
						
						<label for="college" class="form-label">College:</label>
				        <input class="form-control" type="text" id="college" name="college">
						<span class="error" id="collegeError"></span><br>
						
						<label for="about" class="form-label">About:</label>
				        <textarea class="form-control" type="text" id="about" name="about"></textarea>
						<span class="error" id="aboutError"></span><br>
						
						<label for="position" class="form-label">Position:</label>
				        <input class="form-control" type="text" id="position" name="position">
						<span class="error" id="positionError"></span><br>
						<label for="github" class="form-label">GitHub URL:</label>
        				<input class="form-control" type="url" id="github" name="github">
        				<span class="error" id="githubError"></span><br>

        				<label for="linkedin" class="form-label">LinkedIn URL:</label>
        				<input class="form-control" type="url" id="linkedin" name="linkedin">
        				<span class="error" id="linkedinError"></span><br>

        				<label for="nationality" class="form-label">Nationality:</label>
        				<input type="text" id="nationality" name="nationality"><br><br>
        				<span class="error" id="nationalityError"></span><br>

        				<label for="gender" class="form-label">Gender:</label>
        				<input  type="radio" id="male" name="gender" value="male">
        				<label  for="male" class="form-label">Male</label>
				        <input type="radio" id="female" name="gender" value="female">
				        <label class="form-label" for="female">Female</label><br>
				        <span class="error" id="genderError"></span><br>        

				        <label for="website" class="form-label">Website URL:</label>
				        <input class="form-control" type="url" id="website" name="website"><br><br>
				        <span class="error" id="websiteError"></span><br>
				
				        <input type="submit" class="btn btn-primary" value="update">
  				</form>
  				
    		</div>
		</div>
		
    </div>
  </div>


<script type="text/javascript">

	function validate() {
		let pass = document.getElementById("inputPassword").value;
	    let rpass = document.getElementById("inputRepassword").value;
	    let status = true
	    if (pass !== rpass) {
	        document.getElementById("psw").innerHTML = "Passwords do not match";
	        status = false;
	    } else if (!(pass.length >= 6 && /[a-z]/.test(pass) && /[A-Z]/.test(pass) && /\d/.test(pass) && /[^a-zA-Z\d]/.test(pass))) {
	        document.getElementById("psw").innerHTML = "Password must be strong (use A-Z, a-z, 0-9, special character, and be at least 6 characters long)";
	      	status = false;
	    } else {
	        document.getElementById("psw").innerHTML = ""; // Clear error message
	    }
	    return status;
	}
	function emailValidate() {
		let email = document.getElementById("inputEmail").value;
		let status = true;
		if (!(email.includes("@") && email.includes("."))) {
	        document.getElementById("eml").innerHTML = "Please enter a valid email";
	        status = false;
	    } else {
	        document.getElementById("eml").innerHTML = ""; // Clear error message
	    }
		return status;
	}
	function validateForm() {
	    var image = document.getElementById("image");
	    var company = document.getElementById("company");
	  
	    var nationality = document.getElementById("nationality");
	  
		let status = true;
	    if (image.value === "") {
	        document.getElementById("imgError").innerHTML = "Please update img";
	        status = false;
	    }else{
			document.getElementById("updatedImg").innerHTML = image;
		}

	    if (college.value === "") {
	        document.getElementById("companyError").innerHTML = "Please enter your company/college name";;
	        status = false;
	    }


	    if (nationality.value === "") {
	        document.getElementById("nationalityError").innerHTML = "Please update nationality";
	        status = false;
	    }

	    if (document.querySelector('input[name="gender"]:checked') === null) {
	       	document.getElementById("genderError").innerHTML = "Please update gender";
	        status = false;
	    }

	    return status;
	}

	function displayImage() {
	var input = document.getElementById('image');
	var img = document.getElementById('updatedImg');

	var file = input.files[0];
	var reader = new FileReader();

	if (!file) {
	img.src = "./css/img/User-profile.png"; // Set default image source
	return;
	}

	if (file.size > 55 * 1024) { // Check if image size is greater than 200KB
	document.getElementById("imgError").innerHTML = "Please update image size lesthan 55kb";
	input.value = ""; // Clear the input field
	img.src = "./css/img/User-profile.png"; // Set default image source
	return;
	}

	reader.onload = function(e) {
	img.src = e.target.result;
	}

	reader.readAsDataURL(file);
	}
	
</script>
	
</body>
</html>