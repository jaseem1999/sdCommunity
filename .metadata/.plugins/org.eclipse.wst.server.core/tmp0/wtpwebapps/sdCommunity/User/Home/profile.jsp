<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"><link rel="stylesheet" href="./css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<%
	Integer id =(Integer)session.getAttribute("uid");
	String fname=(String)session.getAttribute("fname"); 
	String lname=(String)session.getAttribute("lname"); 
	String email=(String)session.getAttribute("email");
	Integer num=(Integer)session.getAttribute("num"); 	
%>
<style type="text/css">
	input,label{
		margin-top: 0px;
		margin-left: 20px;
		margin-bottom: 0px;
		margin-right: 30px;
	}
	.btn{
		margin-bottom: 10px;
		margin-top: -100px;
	}
	.form-control{
		width: 85%;
	}
	.error{
		color: red;
		margin-left: 30px;
		margin-top: 10px;
	}
	.custom-file-input {
    color: transparent;
    cursor: pointer;
    height: 3em;
    width: 85%;
    padding: 0.5em;
    border: 1px solid #ccc;
    border-radius: 4px;
    background-color: #fff;
    overflow: hidden;
}

.custom-file-input::-webkit-file-upload-button {
    visibility: hidden;
}

.custom-file-input::before {
    content: 'Browse';
    color: #fff;
    background-color: #007bff;
    display: inline-block;
    border-radius: 3px;
    padding: 0.2em 0.5em;
    outline: none;
    white-space: nowrap;
    cursor: pointer;
}

.custom-file-input:hover::before {
    background-color: #0056b3;
}

.custom-file-input:active::before {
    background-color: #004285;
}
.profileImg{
	width: 70px;
	height: 100px;
	border-radius: 50%;
}
#center{
	text-align: center;
}

</style>
<title>Home (<%=fname%>)</title>
</head>
<body class="hbdy" style="background-color: black">
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
		  		out.print("<a class='nav-link' href=''>Profile</a>");
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
		  		out.print("<a class='nav-link' href='../Login/Login.jsp'>Login</a>");
		  	}
		  %>
		  </li>
	</ul>
	<div  class="card" style="margin: 50px; width: 455px; color: white;background: #33303000; border: 1px solid">
	<div id="center">
	 <img class="profileImg" alt="" src="" id="updatedImg" style="width: 60px;"/><br>
    </div>
	 <form   onsubmit="return validateForm()" action="../backProfile.jsp" method="post" enctype="multipart/form-data" >
        <label for="image" class="form-label ">Upload Image:</label>
        <input class="form-control custom-file-input" type="file" id="image" name="image" accept="image/*" onchange="displayImage()">
		<span class="error" id="imgError"></span><br>
		
        <label for="company" class="form-label">Company/College:</label>
        <input class="form-control" type="text" id="company" name="company">
		<span class="error" id="companyError"></span><br>
		
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

        <input type="submit" class="btn btn-primary" value="Submit">
    </form>
    </div>
	
<script type="text/javascript" src="./js/profile.js"></script>
</body>
</html>