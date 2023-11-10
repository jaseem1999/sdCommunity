<%@page import="java.util.List"%>
<%@page import="sdCommunity.admin.user.UserDAO"%>
<%@page import="sdCommunity.admin.user.OneUserDTO"%>
<%@page import="sdCommunity.user.login.userDAO"%>
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
<%
 String idString = request.getParameter("id");
int id = Integer.parseInt(idString);

%>
<head>
<meta charset="ISO-8859-1">
<title>Admin edit user <%=id %></title>
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
        <a href="index.jsp" class="logo"><img alt="logo" src="./img/logo.png" width="60px"/></a>
		<span style="font-family:fantasy; font-size: large;position: absolute;left: 80px;">sdCommunity Developed For Administration</span>
        <div class="hamburger">
          <span class="line"></span>
          <span class="line"></span>
          <span class="line"></span>
        </div>

        <div class="nav__link hide">
          <a href="AdminHome.jsp">home</a>
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
	    <h5 class="offcanvas-title" id="offcanvasRightLabel">Offcanvas right</h5>
	    <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
	  </div>
	  <div class="offcanvas-body">
	    ...
	  </div>
	</div>
	<div class="container">
		<%
		String message = request.getParameter("message");
		if (message != null && message.equals("success")){
			out.print("<div class='alert alert-success'id='alert' role='alert'>Profile updated succesfully</div>");
		}else if(message != null && message.equals("failed")){
			out.print("<div class='alert alert-danger' id='alert' role='alert'>Profile updated Failed</div>");
		}else{
			out.print("");
		}
		%>
		<div style="font-size: 20px; margin-top: 50px;color: green;font-weight: 500;">Edit Only Primary Details</div>
		<form action="upe" method="post">
			<table style="margin-top: 10px;" class="table table-striped">
				<tr>
					<th>User ID</th>
				 	<th>Email</th>
				 	<th>Password</th>
				 	<th>First Name</th>
				 	<th>Last Name</th>
				 	<th>Number</th>
				</tr>
				<%
				List<OneUserDTO> dte = UserDAO.getUsers(id);
				for(OneUserDTO dt : dte){
				%>
				
				<tr>
					<td>
						<input type="number" value="<%=dt.getUid()%>" name="uid">
					</td>
					<td>
						<input type="email" value="<%=dt.getEmail()%>" name="email">
					</td>
					<td>
						<input type="text" value="<%=dt.getPass()%>" name="pass">
					</td>
					<td>
						<input type="text" value="<%=dt.getFname()%>" name="fname">
					</td>
					<td>
						<input type="text" value="<%=dt.getLname()%>" name="lname">
					</td>
					<td>
						<input type="number" value="<%=dt.getNumber()%>" name="number">
					</td>
					<td>
						<input type="submit" value="Submit" class="btn btn-outline-primary">
					</td>
					
				</tr>
				<%} %>
				
			</table>
		</form>
		<div style="font-size: 20px; margin-top: 20px;color: green;font-weight: 500;">View profile</div>
		<div class="row" style="margin-top: 30px;">
			<%
			for(OneUserDTO dt : dte){
			%>
			<div class="col-2">
				<img src="image?id=<%=dt.getUid() %>" alt="profile" width="150px" style="border: 2px solid #0355f6; border-radius: 50%;">
			</div>
			<div class="col-10">
				<p><%=dt.getAbout() %></p>
				<p>Nationality : <%=dt.getNationality() %></p>
				<p>Gender : <%=dt.getGender() %></p>
				<a class="btn btn-outline-primary" href="<%=dt.getGithub() %>">Github</a>
				<a class="btn btn-outline-primary" href="<%=dt.getLinkedin() %>">Linkedin</a>
				<a class="btn btn-outline-primary" href="<%=dt.getWebsite() %>">Website</a>
			</div>
			<%} %>
		</div>
		<div class="row" style="margin-top: 20px;">
			<%
			for(OneUserDTO dt : dte){
			%>
			<div class="col-2">
				<p>Name : <%=dt.getFname() %>  <%=dt.getLname() %></p>
				<p>Email : <%=dt.getEmail()%></p>
				<p>Phone : <%=dt.getNumber()%></p>
			</div>
			<div class="col-10">
				<p>College : <%=dt.getCollege() %></p>
				<p>Company : <%=dt.getCompany() %></p>
				<p>Position : <%=dt.getPosition() %> </p>
			</div>
			<div class="col">
				
			</div>
			<%} %>
		</div>
		
	</div>
<script type="text/javascript">
document.addEventListener('DOMContentLoaded', function() {
    var alertElement = document.getElementById('alert');
    if (alertElement) {
        setTimeout(function() {
            alertElement.style.display = 'none';
        }, 2000); // 2000 milliseconds = 2 seconds
    }
});

</script>
</body>
</html>