<%@page import="sdCommunity.user.details.DAODetails"%>
<%@page import="sdCommunity.admin.user.PostDAO"%>
<%@page import="sdCommunity.admin.user.UserDAO"%>
<%@page import="sdCommunity.admin.user.OneUserDTO"%>
<%@page import="sdCommunity.user.post.DAOPost"%>
<%@page import="sdCommunity.user.post.DTOothers"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="ISO-8859-1">
<title>Posts of user id : <%=id %></title>
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
.scroll {
		  width: 100%;
		  height: 300px;
		  overflow-x: hidden;
		  overflow-y: auto;
		  padding: 20px;
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
 	<div class="container" style="margin-top: 50px;">
 	<%
 	String message = request.getParameter("message");
	if (message != null && message.equals("success")){
		out.print("<div class='alert alert-success'id='alert' role='alert'>User blocked Successfuly</div>");
	}else if(message != null && message.equals("successBlocked")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User unblocked successfuly</div>");
	}else{
		out.print("");
	}
 	%>
 	<div class="row">
 	<div class="col-8">
 	<div style="font-weight: 600!important;"><%=DAODetails.name(id)%> 's post in sdCommunity<br><span style="color: #3498db; font-size: 15px;"><%=PostDAO.selectedUserPost(id)%> Total post</span>
				<span style="color: #27ae60;; font-size: 15px; margin: 20px;"><%=PostDAO.selectedUserActivePost(id)%> Active post</span>
				<span style="color: #e74c3c; font-size: 15px; margin: 20px;"><%=PostDAO.selectedUserBlockPost(id)%> Blocked post</span> 
	<hr></div>
 	<div class="scroll" style="border: 1px solid gray; border-radius: 10px;" >
 	<table style="margin-top: 10px;" class="table table-striped">
				<tr>
					<th>Post ID</th>
				 	<th>Post Image</th>
				 	<th>Post Heading</th>
				 	<th>Post</th>
				 	<th>Code</th>
				 	<th>Link</th>
				 	<th>Status</th>
				 	<th>Menu</th>
				</tr>
 	<%
 	List<DTOothers> p2= DAOPost.getOtherProfilePost(id);
 	for(DTOothers p : p2){
 	%>
 		<tr>
 	<td><%=p.getPostId() %></td>
 	<td><img alt="" src="poimg?id=<%=p.getPostId()%>" width="150px"></td>
 	<td><%=p.getHeading() %></td>
 	<td><%=p.getPost() %></td>
 	<td><xmp><%=p.getCode() %></xmp></td>
 	<td><a style="color: blue;" href="<%=p.getLink() %>">Link</a> </td>
 	<td>
 		<%
			String statusUserS1 = p.getStatus();
 		    if(statusUserS1 == null){
 		    	out.print("<span style='color: green'>Active</span>");
			}else{
				out.print("<span style='color: red'>Blocked</span>");
			}
		%>
 	</td>
 	<td>
 		<button style="background: transparent; color: black;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
							</button>
							<ul class="dropdown-menu" style="min-width: 340px;">
						
						        <li>
						        <%
						        if(statusUserS1 == null){
						 			out.print("<a class='dropdown-item' href='AdminUserBlockServlet.jsp?id="+p.getPostId()+"&uid="+id+"'>Block</a>");
						 		}else{
						 			out.print("<a class='dropdown-item' href='AdminUserUnBlockServlet.jsp?id="+p.getPostId()+"&uid="+id+"'>Unblock</a>");
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
 	<div class="col-4">
 		<div class="card" style="width: 21rem; ">
 		<%
 		List<OneUserDTO> u2 = UserDAO.getUsers(id);
 		for(OneUserDTO p : u2){
 		%>
		  <img src="image?id=<%=p.getUid() %>" class="card-img-top" alt="..." style="width: 100px; border: 1px solid black; border-radius: 50%; position: relative; left: 31%; top: 10px;">
		  <div class="card-body">
		    <h5 class="card-title"><%=p.getFname() %> <%=p.getLname() %></h5>
		    <p class="card-text"><%=p.getAbout() %></p>
		    <a href="AdminViewUser.jsp?id=<%=p.getUid()%>" class="btn btn-primary">Go to profile</a>
		  </div>
		 <%} %>
		</div>
 		
 		
 		
 		
 	
 	</div>
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