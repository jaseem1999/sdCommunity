<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%

Integer id =(Integer)session.getAttribute("uid");
String fname=(String)session.getAttribute("fname"); 
String lname=(String)session.getAttribute("lname"); 
String email=(String)session.getAttribute("email");
long num=(Long)session.getAttribute("num");
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
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./homecss/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<title>Post</title>
<style>
		
    .post-form {
        max-width: 600px;
        margin: auto;
        padding: 20px;
        background-color: #5f5fd13b;
        border: 1px solid #ccc;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }
    input, textarea, select {
        width: 100%;
        padding: 8px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    button {
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    button:hover {
        background-color: #0056b3;
    }
    .format-options {
        margin-bottom: 10px;
    }
    .post-display {
        margin-top: 20px;
        border: 1px solid #ccc;
        padding: 10px;
        background-color: #fff;
        border-radius: 8px;
    }
    .profileImg{
		height: 250px;
		border: 1 solid white; 
	}
	#center{
		text-align: center;
	}
	#showCode, #showText, #showCode {
			height: 119px;
		    background-color: transparent;
		    border: 1px solid #ccc;
		    border-radius: 4px;
		    padding: 10px;
		    font-family: 'Courier New', monospace;
	}
</style>
</head>
<body class="hbdy" style="background-color: black; color: white;">
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog" style="color: black;">
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

	<ul class="nav justify-content-end ">
		<li class="nav-item" >
		    	<a class='nav-link' style="padding: 0px;" href='UserHome.jsp'><img src="./img/logo.png" alt="" width="50px"></a>
			</li>
		<li class="nav-item">
		    	<a class='nav-link' href='UserHome.jsp'>Home</a>
		  </li>
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
		  		out.print("<a class='nav-link' href='userFollowers.jsp'>Followers</a>");
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
	<div class="container-xl" style="color: white; margin-top: 20px;">
	<div class="row">
	  
	<div class="col">
    <div class="post-form">
        <h2>Create Your Post</h2>
        <form action="postServlet" method="post" enctype="multipart/form-data">
        	<label for="heading">Heading:</label>
        	<input type="text" name="heading" id="heading" required="required" ><br>
            <label for="image">Upload Screen Shoot:</label>
            <input type="file" id="image" name="image" accept="image/*" onchange="displayImage()"><br>

            <label for="link">Paste your link:</label>
            <input type="url" id="link" name="link" oninput="updateLink()"><br>

            <label for="text">Post Text:</label>
            <textarea id="text" name="text" rows="3" oninput="updateText()" required="required"></textarea><br>

            <div class="format-options">
                <button type="button" onclick="makeBold()">Bold</button>
                <button type="button" onclick="makeItalic()">Italic</button>
            </div>

            <label for="code">Programming Code:</label>
            <textarea id="code" name="code" rows="3	" oninput="updateCode()"></textarea><br>

            <button type="submit">Post</button>
        </form>
    </div>
    </div>
	    <div class="col">
			<div id="center">
			 <img class="profileImg" alt="" src="./homecss/img/bg-stars-1.webp" id="updatedImg" style="width: 90%;"/><br>
		    </div>
		    <h5>Link :</h5>
		    <a href="" id="showLink"></a>
		    <h5>Post :</h5>
		    <p id="showText"></p>
		    <h5>Code :</h5>
		    <pre id="showCode"></pre>
    	</div>
    </div>
    </div>


    <script>
        function makeBold() {
            var textarea = document.getElementById('text');
            var selectedText = textarea.value.substring(textarea.selectionStart, textarea.selectionEnd);
            var beforeText = textarea.value.substring(0, textarea.selectionStart);
            var afterText = textarea.value.substring(textarea.selectionEnd);
            textarea.value = beforeText + '<b>' + selectedText + '</b>' + afterText;
        }

        function makeItalic() {
            var textarea = document.getElementById('text');
            var selectedText = textarea.value.substring(textarea.selectionStart, textarea.selectionEnd);
            var beforeText = textarea.value.substring(0, textarea.selectionStart);
            var afterText = textarea.value.substring(textarea.selectionEnd);
            textarea.value = beforeText + '<i>' + selectedText + '</i>' + afterText;
        }
        var image = document.getElementById('image').value;
        var link = document.getElementById('link').value;
        var text = document.getElementById('text').value;
        var code = document.getElementById('code').value;
        var codeLength = code.length;
        console.log("The length of the code is:", codeLength);
        
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
        function updateCode() {
            var inputCode = document.getElementById('code').value;
            var showCode = document.getElementById('showCode');
            showCode.textContent = inputCode;
        }
        function updateLink() {
            var inputLink = document.getElementById('link').value;
            var showLink = document.getElementById('showLink');
            showLink.href = inputLink;
            showLink.textContent = inputLink;
        }

        function updateText() {
            var inputText = document.getElementById('text').value;
            var showText = document.getElementById('showText');
            showText.textContent = inputText;
        }



     </script>
</body>
</html>