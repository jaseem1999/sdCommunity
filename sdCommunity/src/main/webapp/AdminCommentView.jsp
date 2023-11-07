<%@page import="sdCommunity.admin.user.UserDAO"%>
<%@page import="sdCommunity.admin.user.OneUserDTO"%>
<%@page import="sdCommunity.admin.user.CommentDAO"%>
<%@page import="sdCommunity.admin.user.CommentDTO"%>
<%@page import="java.util.List"%>
<%@page import="sdCommunity.user.details.DAODetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
String stringid = request.getParameter("id");
int id = Integer.parseInt(stringid);
%>
<meta charset="ISO-8859-1">
<title>Comments of <%=DAODetails.name(id)%></title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
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
		  overflow-x: auto;
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
 		<div class="row">
 	<div class="col-8">
 	<div style="font-weight: 600!important;"><%=DAODetails.name(id)%> 's comments in sdCommunity<br><span style="color: #3498db; font-size: 15px;"><%=CommentDAO.selectedTotalComment(id)%> Total comment</span>
				<span style="color: #27ae60;; font-size: 15px; margin: 20px;"><%=CommentDAO.selectedActiveComment(id)%> Active comment</span>
				<span style="color: #e74c3c; font-size: 15px; margin: 20px;"><%=CommentDAO.selectedBlockedComment(id)%> Blocked comment</span> 
	<hr></div>
 	<div class="scroll" style="border: 1px solid gray; border-radius: 10px;" >
 	<table style="margin-top: 10px;" class="table table-striped">
				<tr>
					<th>Comment ID</th>
				 	<th>Post Id</th>
				 	<th>Comment UID</th>
				 	<th>Comment</th>
				 	<th>Status</th>
				 	<th>Menu</th>
				</tr>
				<%
					List<CommentDTO> pss = CommentDAO.getCommentBasedId(id);
					for(CommentDTO ps : pss){
				%>
				<tr>
					<td><%=ps.getCmtId() %></td>
					<td><%=ps.getPostId() %></td>
					<td><%=ps.getCmtUid()%></td>
					<td><%=ps.getComment() %></td>
					<td>
					<%
					String statusUserS1 = ps.getStatus();
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
						 			out.print("<a class='dropdown-item' href='AdminCommentBlockServlet.jsp?id="+ps.getCmtId()+"&uid="+id+"'>Block</a>");
						 		}else{
						 			out.print("<a class='dropdown-item' href='AdminCommentUnBlockServlet.jsp?id="+ps.getCmtId()+"&uid="+id+"'>Unblock</a>");
						 		}
						        %>
						        </li>
						      </ul>
					</td>
				</tr>
				<%	} %>
				
 	
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
		    <a style="" href="AdminViewUser.jsp?id=<%=p.getUid()%>" class="btn btn-primary">Go to profile</a>
		  </div>
		 <%} %>
		</div>
 		
 		
 		
 		
 	
 	</div>
 	</div>
 </div>


</body>
</html>