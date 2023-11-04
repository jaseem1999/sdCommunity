<%@page import="sdCommunity.admin.user.OneUserDTO"%>
<%@page import="sdCommunity.admin.user.UserDAO"%>
<%@page import="sdCommunity.admin.user.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
String email = (String) session.getAttribute("AdminEmail");

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
	
	.chart {
    max-width: 400px;
    margin: 0 auto;
    border: 1px solid #ccc;
    position: relative;
    top: 379px;
  }

  .bar {
    display: inline-block;
    width: 30px;
    margin-right: 10px;
    background-color: #3498db;
    position: absolute;
    bottom: 0;
  }

  .active {
    background-color: #27ae60;
  }

  .blocked {
    background-color: #e74c3c;
  }

  .label {
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
          <a href="#">Logout</a>
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
	<div class="row" style="margin-top: 50px;">
		<div class="col" >
			<div style="font-weight: 600!important;">Users of sdCommunity<br><span style="color: #3498db; font-size: 15px;"><%=UserDAO.totalUser()%> registered user</span>
				<span style="color: #27ae60;; font-size: 15px; margin: 20px;"><%=UserDAO.totalUser() - UserDAO.totalBlockedUser()%> Active user</span>
				<span style="color: #e74c3c; font-size: 15px; margin: 20px;"><%=UserDAO.totalBlockedUser()%> Blocked user</span> 
			<hr></div>
			<input type="email" class="search" id="searchInputEmail" placeholder="Enter Email">
			<button class="btn btn-primary" onclick="searchByEmail()" style="margin-top: -5px;">Search</button><span style="color: #3498db "> Search specific user</span>
			<table style="margin-top: 10px;" class="table table-striped">
			<% 
			OneUserDTO uFind = UserDAO.ud;
			%>
			<tr>
					 	<td><%
					 		if(uFind.getUid() != 0){
					 			out.print(uFind.getUid());
					 		}else{
					 			out.print("");
					 		}
					 	%></td>
					 	<td><%
						 	if(uFind.getEmail() != null){
					 			out.print(uFind.getEmail());
					 		}else{
					 			out.print("");
					 		}
					 	%></td>
					 	<td><% 
					 		if(uFind.getFname() != null){
					 			out.print(uFind.getFname());
					 		}else{
					 			out.print("");
					 		}
					 		%></td>
					 	<td><%
					 		if(uFind.getLname() != null){
					 			out.print(uFind.getLname());
					 		}else{
					 			out.print("");
					 		}
					 	%></td>
					 	<td><%
					 		if(uFind.getNumber() != 0){
					 			out.print(uFind.getNumber());
					 		}else{
					 			out.print("");
					 		}
					 	%></td>
					 	<td><img src="image?id=<%=uFind.getUid() %>" alt="profile" width="40px" style="border: 2px solid #0355f6; border-radius: 50%;"></td>
					 	<td><%
					 		if(uFind.getNationality() != null){
					 			out.print(uFind.getNationality());
					 		}else{
					 			out.print("");
					 		}
					 	%></td>
					 	<td><%
					 		if(uFind.getGender() != null){
					 			out.print(uFind.getGender());
					 		}else{
					 			out.print("");
					 		}
					 	%></td>
					 	<td><%
					 		String statusUserS1 = uFind.getStatus();
					 		if(statusUserS1 == null){
					 			out.print("<span style='color: green'>Active</span>");
					 		}else{
					 			out.print("<span style='color: red'>Blocked</span>");
					 		}
					 	%></td>
					 	<td>
					 		<button style="background: transparent; color: black;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
							</button>
							<ul class="dropdown-menu" style="min-width: 340px;">
						        <li><a class="dropdown-item" href="viewOtherProfile.jsp?id=<%=uFind.getUid()%>">View</a></li>
						        <li><a class="dropdown-item" href="#">Edit</a></li>
						        <li>
						        <%
						        if(statusUserS1 == null){
						 			out.print("<a class='dropdown-item' href='AdminUserBlock.jsp?id=" + uFind.getUid() + "'>Block</a>");
						 		}else{
						 			out.print("<a class='dropdown-item' href='AdminUserUnblock.jsp?id=" + uFind.getUid() + "'>Unblock</a>");
						 		}
						        %>
						        </li>
						      </ul>
					 	</td>
					 </tr>
			</table>
			<hr>
			<div class="scroll" style="border: 1px solid gray; border-radius: 10px;" >
				<table class="table table-striped" style="margin: 10px;height: 297px;width: 100%;border: 1px;">
					 <tr>
					 	<th>User ID</th>
					 	<th>Email</th>
					 	<th>First Name</th>
					 	<th>Last Name</th>
					 	<th>Number</th>
					 	<th>Profile image</th>
					 	<th>Nationality</th>
					 	<th>Gender</th>
					 	<th>Status</th>
					 	<th></th>
					 </tr>
					 <%
					 List<UserDTO> ud = UserDAO.getUsers();
					 for(UserDTO user : ud){
					 %>
					 <tr>
					 	<td><%=user.getUid() %></td>
					 	<td><%=user.getEmail() %></td>
					 	<td><%=user.getFname() %></td>
					 	<td><%=user.getLname() %></td>
					 	<td><%=user.getNumber() %></td>
					 	<td><img src="image?id=<%=user.getUid() %>" alt="profile" width="40px" style="border: 2px solid #0355f6; border-radius: 50%;"></td>
					 	<td><%=user.getNationality() %></td>
					 	<td><%=user.getGender() %></td>
					 	<td><%
					 		String statusUser = user.getStatus();
					 		if(statusUser == null){
					 			out.print("<span style='color: green'>Active</span>");
					 		}else{
					 			out.print("<span style='color: red'>Blocked</span>");
					 		}
					 	%></td>
					 	<td>
					 		<button style="background: transparent; color: black;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
							</button>
							<ul class="dropdown-menu" style="min-width: 340px;">
						        <li><a class="dropdown-item" href="viewOtherProfile.jsp?id=<%=user.getUid()%>">View</a></li>
						        <li><a class="dropdown-item" href="#">Edit</a></li>
						        <li>
						        <%
						        if(statusUser == null){
						 			out.print("<a class='dropdown-item' href='AdminUserBlock.jsp?id=" + user.getUid() + "'>Block</a>");
						 		}else{
						 			out.print("<a class='dropdown-item' href='AdminUserUnblock.jsp?id=" + user.getUid() + "'>Unblock</a>");
						 		}
						        %>
						        </li>
						      </ul>
					 	</td>
					 </tr>
					 <%} %>
				</table>
			</div>
		</div>
		<div class="col">
			<div class="chart">
    <div class="bar" style="height: <%=UserDAO.totalUser() * 10%>px;"><%=UserDAO.totalUser() %></div>
    <div class="bar active" style="height: <%=(UserDAO.totalUser() - UserDAO.totalBlockedUser()) * 10%>px; left: 40px;"><%=UserDAO.totalUser() - UserDAO.totalBlockedUser()%></div>
    <div class="bar blocked" style="height: <%=UserDAO.totalBlockedUser() * 10%>px; left: 80px;"><%=UserDAO.totalBlockedUser() %></div>
  </div>
  <div class="label" style="width: 100px; height: 30px;color: white; background: #3498db; margin-top: 5px;">Registered</div>
  <div class="label" style="width: 100px; height: 30px;color: white; background: #27ae60; margin-top: 5px;">Active</div>
  <div class="label" style="width: 100px; height: 30px;color: white; background: #e74c3c; margin-top: 5px;">Blocked</div>
			 
	   </div>
	</div>
	</div>
<script type="text/javascript">
function searchByEmail() {
    var email = document.getElementById('searchInputEmail').value;
    window.location.href = 'BasedUserEmail.jsp?email=' + email;
}
</script>
</body>
</html>