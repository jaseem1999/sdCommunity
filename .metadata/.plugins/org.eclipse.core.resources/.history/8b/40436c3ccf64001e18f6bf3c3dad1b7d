<%@page import="sdCommunity.user.post.DTOothers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="sdCommunity.user.post.DTOpost"%>
<%@page import="sdCommunity.user.post.DAOPost"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%
String spid= request.getParameter("id");

%>
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
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello! <%=fname%> give your good solution</title>
<link rel="stylesheet" href="./homecss/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

<style type="text/css">

.fistPartOfProfileMain{
	background: white;
	border: 3px solid white;
}
.fistPartOfProfile{
	background-image: url("./signupcss/img/social-network.png");
    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    height: 250px;
}
.smallAbout{
	margin-left: 15px;
    line-height: 30.4px;
}
a{
	text-decoration: none;
}
#center{
	left: calc(50% - 185px);
}
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
}
.code pre{
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


</style>

</head>
<body style="background-color: black; color: white;">
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
	
	
	<div class="container-xl">
		<%
					response.setContentType("text/html");
					List<DTOpost> p= DAOPost.getAllPostDetails(spid);
					
				%>
				
			<div class="row">
			    <div class="col">
			    <div style="background-color: #6699c130; color: white;">
			    <% for(DTOpost po : p){ %>
			    	
			      	<div class="" style="color: white; max-width: 100%; margin-left: 0px; margin-top: 10px;" >
						  <img src="poimg?id=<%=po.getPostId()%>" style="width : 100%; height: 200px;" alt="...">
						  <%
						  int pid = po.getPostId();
						  session.setAttribute("spid", pid);
						  %>
						  <img style="width: 50px; height: 50px; border-radius: 50%; margin-top: 5px; margin-left: 10px;border: 2px solid; " alt="" src="image?id=<%=po.getUid()%>">
						  <div class="card-body">
							    <h5 class="" style="text-align: center; margin: 10px;"><%=po.getHeading()%></h5>   	
							    	<p class="card-text" style="margin: 30px;"><%=po.getPost()%></p>
							    	<a href="<%=po.getLink() %>" class="btn-primary" style="margin-left: 30px;"><%=po.getLink() %></a>
									<div class="code">	
										<div class="codeHeading">
											<p>Code</p>
											<button class="copyBtn" onclick="copyToClipboard()" style="position: relative; left:70px; top: -44px">
											<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-clipboard" viewBox="0 0 16 16">
  													<path d="M4 1.5H3a2 2 0 0 0-2 2V14a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V3.5a2 2 0 0 0-2-2h-1v1h1a1 1 0 0 1 1 1V14a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V3.5a1 1 0 0 1 1-1h1v-1z"/>
													 <path d="M9.5 1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-1a.5.5 0 0 1 .5-.5h3zm-3-1A1.5 1.5 0 0 0 5 1.5v1A1.5 1.5 0 0 0 6.5 4h3A1.5 1.5 0 0 0 11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3z"/>
											</svg></button>
										</div>				    
							    	 	<pre id="copy"><%=po.getCode()%></pre>
							    	 </div>
							    	 
						  </div>
						  
					</div>
					<%} %>
					</div>
	
					</div>
					<div class="col">
					<div style="margin-top: 10px;">
					<h3>Give solution</h3>
					<h5>Link :</h5>
		    			<a href="" id="showLink"></a>
		    		<h5>Code :</h5>
		    		<pre id="showCode"></pre>
					</div>
					<form action="sol" method="post" >
						<label for="link">Paste your link:</label>
            				<input type="url" id="link" name="link" oninput="updateLink()"><br>
						<label for="code">Programming Code:</label>
            					<textarea id="code" name="code" rows="3	" oninput="updateCode()"></textarea><br>
            					<button type="submit">Post</button>
					</form>
					
					</div>
				</div>
	</div>
	<script type="text/javascript">
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
	
	</script>

</body>
</html>