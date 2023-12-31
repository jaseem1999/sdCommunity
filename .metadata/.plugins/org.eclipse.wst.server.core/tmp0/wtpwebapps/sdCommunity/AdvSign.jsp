<%@page import="sdCommunity.admin.adv.ProductDAO"%>
<%@page import="sdCommunity.admin.adv.ReqProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Advertisement Agency</title>
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
.nav {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding-top: 0px;
}



.hamburger {
  padding-right: 20px;
  cursor: pointer;
}

.hamburger .line {
  display: block;
  width: 40px;
  height: 5px;
  margin-bottom: 10px;
  background-color: #ffeeee;
}

.nav__link {
  position: fixed;
  width: 94%;
  top: 5rem;
  left: 18px;
  background-color: #303232;
}

.nav__link a {
  display: block;
  text-align: center;
  padding: 10px 0;
}

.nav__link a:hover {
  background-color: black;
}

.hide {
  display: none;
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
	    margin-top: -36px;
	}



@media screen and (min-width: 890px) {
  .nav__link {
    display: block;
    position: static;
    width: auto;
    margin-right: 20px;
    background: none;
  }

  .nav__link a {
    display: inline-block;
    padding: 15px 20px;
  }

  .hamburger {
    display: none;
  }
}

</style>
</head>
<body>
	<header>
      <nav class="nav">
        <a href="/" class="logo"><img alt="logo" src="./img/logo.png" width="60px"/></a>
		<span style="font-family:fantasy; font-size: large;position: absolute;left: 50px;">sdCommunity Developed For Advertisement Agency</span>
        <div class="hamburger">
          <span class="line"></span>
          <span class="line"></span>
          <span class="line"></span>
        </div>

        <div class="nav__link hide">
          <a href="index.jsp">home</a>
          <a href="AdvLogin.jsp">Login</a>
        </div>
      </nav>
    </header>
    <div class="container">
    <%
						String message = request.getParameter("message");
						if (message != null && message.equals("Failed")){
							out.print("<div class='alert alert-danger' role='alert'>Sign Up Failed...<br>Try again...</div>");
						}else if(message != null && message.equals("Success")){
							out.print("<div class='alert alert-success' role='alert'>Sign Up Successfully...<br>");
							out.print("<a class='btn btn-primary' aria-current='page'  href='AdvLogin.jsp'>");
						    out.print("Login</a> </div>");
						}else{
							out.print("");
						}
	%>
    <div class="row">
	    	<div class="col">
			    <form action="AdvAddSign.jsp" method="post" onsubmit="return validation()" style="color: white;" >
					  <div class="mb-3">
					    <label for="exampleInputEmail1" class="form-label">Email address</label>
					    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" required="required">
					    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
					    <span id="eml" style="color: red"></span>
					  </div>
					  <div class="mb-3">
					    <label for="exampleInputAgName" class="form-label">Agency name</label>
					    <input type="text" class="form-control" id="exampleInputAgName" name="AgName" aria-describedby="agNameHelp" required="required">
					    <span id="agNa" style="color: red"></span>
					  </div>
					  <div class="mb-3">
					    <label for="exampleInputName" class="form-label">Account owner name</label>
					    <input type="text" class="form-control" id="exampleInputName" name="name" aria-describedby="nameHelp" required="required">
					    <span id="usn" style="color: red"></span>
					  </div>
					  <div class="mb-3">
					    <label for="exampleInputNumber" class="form-label">Phone number</label>
					    <input type="tel" class="form-control" id="exampleInputNumber" name="number" aria-describedby="numberHelp" required="required">
					    <span id="noe" style="color: red"></span>
					    <span id="nos" style="color: green"></span>
					  </div>
					  <div class="mb-3">
					    <label for="exampleInputPassword1" class="form-label">Password</label>
					    <input type="password" class="form-control" id="exampleInputPassword1" name="pass" required="required">
					    <span id="psw" style="color:red"></span>
					  </div>
					  <div class="mb-3">
					    <label for="exampleInputrepassword1" class="form-label">Re-Password</label>
					    <input type="password" class="form-control" id="exampleInputrepassword1" required="required">
					  </div>
					  <button type="submit" class="btn btn-primary">Sign up</button>
				</form>
			</div>
			<div class="col">
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
						    <p class="oName"><%=p.getPrice() - p.getOffer() %> offer price</p>
						    <div style="text-align: center;">
						        <a href="" class="btn btn-success">goto</a>
						    </div>
						</div>
					    <%} %>
					  </div>
					</div>
			</div>
		</div>
	</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
<script type="text/javascript">
const hamburger = document.querySelector('.hamburger');
const navLink = document.querySelector('.nav__link');

hamburger.addEventListener('click', () => {
  navLink.classList.toggle('hide');
});

function validation() {
    let email = document.getElementById("exampleInputEmail1").value;
    let user = document.getElementById("exampleInputName").value;
    let agName = document.getElementById("exampleInputAgName").value;
    let num = document.getElementById("exampleInputNumber").value;
    let pass = document.getElementById("exampleInputPassword1").value;
    let rpass = document.getElementById("exampleInputrepassword1").value;
    var phoneNumberRegex = /^\d{3}-\d{3}-\d{4}$/;
    let status = true;
    if (!(email.includes("@") && email.includes("."))) {
        document.getElementById("eml").innerHTML = "Please enter a valid email";
        status = false;
    } else {
        document.getElementById("eml").innerHTML = ""; // Clear error message
    }
    if (/\d/.test(user)) {
        document.getElementById("usn").innerHTML = "Please enter valid name, don't use numbers";
        status = false;
    } else {
        document.getElementById("usn").innerHTML = ""; // Clear error message
    }
    if (/\d/.test(agName)) {
        document.getElementById("agNa").innerHTML = "Please enter agency name";
        status = false;
    } else {
        document.getElementById("agNa").innerHTML = ""; // Clear error message
    }
    function isValidPhoneNumber(num) {
        return /^\d{10}$/.test(num);
    }
    if (isValidPhoneNumber(num)) {
    	document.getElementById("nos").innerHTML = "valid number";
    } else {
    	document.getElementById("noe").innerHTML = "Please enter valid number";
    	status = false;
    }
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

</script>
</body>
</html>