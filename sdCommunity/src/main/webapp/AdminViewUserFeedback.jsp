<%@page import="sdCommunity.user.details.DAODetails"%>
<%@page import="sdCommunity.user.feedback.UserFeedbackDAO"%>
<%@page import="sdCommunity.user.feedback.UserfeedbackDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%
String email = (String) session.getAttribute("AdminEmail");
if(email == null){
	response.sendRedirect("index.jsp?message=UnauthorizedAccess");
}
%>
<meta charset="ISO-8859-1">
<title>Admin sdCommunity</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<style type="text/css">
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
    background: black;
    color: ghostwhite;
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
.admin{
	    margin-bottom: 30px;
    text-align: center;
    font-size: larger;
    font-weight: 700;
    color: red;
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
	.userDetails{
		height: 400px;
		width: 100%;
		background: #e6ece7;
		border: 2px solid black;
	}
	.scroll {
		  width: 100%;
		  height: 300px;
		  overflow-x: hidden;
		  overflow-y: auto;
		  padding: 20px;
	}
	.scroll2 {
	     width: 108%;
   		 height: 300px;
    	overflow-x: hidden;
    	overflow-y: auto;
	}
	.scroll3 {
	     width: 100%;
   		 height: 300px;
    	overflow-x: hidden;
    	overflow-y: auto;
	}
	.scroll4 {
	     width: 100%;
   		 height: 400px;
    	overflow-x: hidden;
    	overflow-y: auto;
	}


  .active {
    background-color: #27ae60;
  }

  .blocked {
    background-color: #e74c3c;
  }

  
  
  .label {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 24px;
    font-weight: bold;
  }
  #center{
  	text-align: center;
  }
</style>
</head>
<body>
	<header>
      <nav class="nav">
        <a href="index.jsp" class="logo"><img alt="logo" src="./img/logo.png" width="60px"/></a>
		<span style="font-family:fantasy; font-size: large;position: absolute;left: 80px;">sdCommunity Developed For Administration</span>
        <div class="hamburger">
          <span class="line"></span>
          <span class="line"></span>
          <span class="line"></span>
        </div>

        <div class="nav__link hide">
          <a href="#">home</a>
          <a href="AdminLoginOut.jsp">Logout</a>
          <a class="btn btn-dark" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">
          	<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
  				<path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
			</svg>
          </a>
        </div>
      </nav>
 	</header>
	<div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
	  <div class="offcanvas-header">
	    <h5 class="offcanvas-title" id="offcanvasRightLabel">Menu</h5>
	    <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
	  </div>
	  <div class="offcanvas-body">
	    <ul class="list-group list-group-flush">
		  <li class="list-group-item"><a style="color: #7a7a7a;" class="link-offset-2 link-underline link-underline-opacity-0" href="AdminHome.jsp">User Management</a></li>
		  <li class="list-group-item"><a style="color: #7a7a7a;" class="link-offset-2 link-underline link-underline-opacity-0" href="AdminAdvertidement.jsp">Advertisement Agency Management </a></li>
		  <li class="list-group-item"><a style="color: #7a7a7a;" class="link-offset-2 link-underline link-underline-opacity-0" href="AdminViewUserFeedback.jsp">View user feedback </a></li>
		  <li class="list-group-item"><a style="color: #7a7a7a;" class="link-offset-2 link-underline link-underline-opacity-0" href="AdminViewAdvFeedback.jsp">View Advertisement agency feedback</a></li>
		</ul>
	  </div>
	</div>
	<div class="container">
		<div class="row" style="margin-top: 50px;">
		<div class="admin">sdCommunity administrator do not share your login information</div>
		<hr>
		<div class="col" >
			<div style="font-weight: 600!important;">Users feedback of sdCommunity<br></div>
		</div>
		</div>
		<div class="scroll" style="border: 1px solid gray; border-radius: 10px;" >
				<table class="table table-striped" style="height: 100px;width: 100%;border: 1px;">
					 <tr>
					 	<th>id</th>
					 	<th>User Id</th>
					 	<th>Profile</th>
					 	<th>Name</th>
					 	<th>Feedback</th>
					 </tr>
					 <%
					 List<UserfeedbackDTO> ufb = UserFeedbackDAO.getUserFeddback();
					 for(UserfeedbackDTO uf : ufb){
					 %>
					 <tr>
					 	<td><%=uf.getTid() %></td>
					 	<td><%=uf.getUid() %></td>
					 	<td><img src="image?id=<%=uf.getUid()%>" alt="profile" width="40px" style="border: 2px solid #0355f6; border-radius: 50%;"></td>
					 	<td><%=DAODetails.name(uf.getUid()) %></td>
					 	<td><%=uf.getFeedback() %></td>
					 </tr>
					 <%} %>
				</table>
		</div>
	</div>
</body>
</html>