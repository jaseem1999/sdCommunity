<%@page import="sdCommunity.user.feedback.UserFeedbackDAO"%>
<%@page import="sdCommunity.user.feedback.UserfeedbackDTO"%>
<%@page import="sdCommunity.admin.user.SolutionDAO"%>
<%@page import="sdCommunity.admin.user.SolutionReportDTO"%>
<%@page import="sdCommunity.user.details.DAODetails"%>
<%@page import="sdCommunity.user.details.DAOuser"%>
<%@page import="sdCommunity.admin.user.PostDAO"%>
<%@page import="sdCommunity.admin.user.ReqPostBlock"%>
<%@page import="sdCommunity.admin.user.ReportDTO"%>
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

  
  .pie-chart-container {
    position: relative;
    width: 200px;
    height: 200px;
    border-radius: 50%;
    background-image: conic-gradient(green <%=UserDAO.totalBlockedUser()*10%>deg, red <%=UserDAO.totalBlockedUser()*10%>deg <%=UserDAO.totalUser()*10%>deg, green <%=UserDAO.totalUser()*10%>deg);
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
	<%
	String message = request.getParameter("message");
	if(message != null && message.equals("BlockSuccess")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User blocking sucessfuly</div>");
	}else if(message != null && message.equals("unBlockSuccess")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User unblocking sucessfuly</div>");
	}else if(message != null && message.equals("userReportAccept")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User report accepted sucessfuly</div>");
	}else if(message != null && message.equals("userReportRejected")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User report rejected sucessfuly</div>");
	}else if(message != null && message.equals("userPostReportAccept")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User post report accepted sucessfuly</div>");
	}else if(message != null && message.equals("userPostReportReject")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User post report rejected sucessfuly</div>");
	}else if(message != null && message.equals("succssSolutionAccept")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User solution report accepted sucessfuly</div>");
	}else if(message != null && message.equals("succssSolutionReject")){
		out.print("<div class='alert alert-success' id='alert' role='alert'>User solution report rejected sucessfuly</div>");
	}
	%>
	<div class="row" style="margin-top: 50px;">
		<div class="admin">sdCommunity administrator do not share your login information</div>
		<hr>
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
						 	String OnestatusUser = uFind.getStatus();
					 		if(OnestatusUser == null){
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
						        <li><a class="dropdown-item" href="AdminViewUser.jsp?id=<%=uFind.getUid()%>">View</a></li>
						        <li><a class="dropdown-item" href="AdminEditUserProfile.jsp?id=<%=uFind.getUid()%>">Edit</a></li>
						        <li>
						        <%
						        if(OnestatusUser == null){
						 			out.print("<a class='dropdown-item' href='AdminUserBlock.jsp?id=" + uFind.getUid() + "'>Block</a>");
						 		}else{
						 			out.print("<a class='dropdown-item' href='AdminUserUnblock.jsp?id=" + uFind.getUid() + "'>Unblock</a>");
						 		}
						        %>
						        </li>
						        <li>
						        
						        	<label style="margin-left: 18px;" for="activities">Activities</label>
									<select style="margin-left: 5px;background: gainsboro; border-radius: 8px; padding: 4px;" id="activities" name="activities" onchange="window.location.href=this.value">
									  <option value="AdminViewUser.jsp?id=<%=uFind.getUid()%>">View</option>
									  <option value="AdminPostView.jsp?id=<%=uFind.getUid()%>">Posts</option>
									  <option value="AdminCommentView.jsp?id=<%=uFind.getUid()%>">Comments</option>
									  <option value="AdminSolutionView.jsp?id=<%=uFind.getUid()%>">Solutions</option>
									</select>
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
						        <li><a class="dropdown-item" href="AdminViewUser.jsp?id=<%=user.getUid()%>">View</a></li>
						        <li><a class="dropdown-item" href="AdminEditUserProfile.jsp?id=<%=user.getUid()%>">Edit</a></li>
						        <li>
						        <%
						        if(statusUser == null){
						 			out.print("<a class='dropdown-item' href='AdminUserBlock.jsp?id=" + user.getUid() + "'>Block</a>");
						 		}else{
						 			out.print("<a class='dropdown-item' href='AdminUserUnblock.jsp?id=" + user.getUid() + "'>Unblock</a>");
						 		}
						        %>
						        </li>
						        <li>
						        	<label style="margin-left: 18px;" for="activities">Activities</label>
									<select style="margin-left: 5px;background: gainsboro; border-radius: 8px; padding: 4px;" id="activities" name="activities" onchange="window.location.href=this.value">
									  <option value="AdminViewUser.jsp?id=<%=user.getUid()%>">View</option>
									  <option value="AdminPostView.jsp?id=<%=user.getUid()%>">Posts</option>
									  <option value="AdminCommentView.jsp?id=<%=user.getUid()%>">Comments</option>
									  <option value="AdminSolutionView.jsp?id=<%=user.getUid()%>">Solutions</option>
									</select>
						        </li>
						      </ul>
					 	</td>
					 </tr>
					 <%} %>
				</table>
			</div>
			
		
		</div>
	   <div class="col-3">
	   		<div style="font-weight: 600!important;">Users Report other users <br><span style="color: #3498db; font-size: 15px;"><%=UserDAO.totalReportOtherUser()%> Pending reports </span><br>
				<span style="color: #27ae60;; font-size: 15px;"><%=UserDAO.totalReportAcceptOtherUser()%> Accepted</span><br>
				<span style="color: #e74c3c; font-size: 15px;"><%=UserDAO.totalReportRejectOtherUser()%> Rejected</span><br>
			<hr></div>
			<div class="scroll2" style="border: 1px solid gray; border-radius: 10px;">
	   		<table class="table table-striped" style="margin: 2px;" >
	   		<%
	   			List<ReportDTO> rpu = UserDAO.userReportOtherUser();
	   			for(ReportDTO ird : rpu){
	   				
	   		%>
	   		  <tr>
	   			<td>
	   				<img src="image?id=<%=ird.getId()%>" alt="profile" width="40px" style="border: 2px solid #0355f6; border-radius: 50%;">
	   			</td>
	   			<td>
	   				This user <%=ird.getName() %> email is <%=ird.getEmail() %> and id <%=ird.getRid() %> is doing <%=ird.getReport() %>
	   			</td>
	   			<td>
	   				<button style="background: transparent; color: black;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
					</button>
					<ul class="dropdown-menu" style="min-width: 340px;">
						        <li><form class="dropdown-item" action="acptRept" method="post">
						        	<input type="text" name="tid" value="<%=ird.getTid()%>" />
						        	<input type="submit" value="accept">
						        </form></li>
						        <li><form class="dropdown-item" action="reject" method="post">
						        	<input type="text" name="tid" value="<%=ird.getTid()%>" />
						        	<input type="submit" value="reject">
						        </form></li>
				    </ul>
	   			</td>
	   		   </tr>
	   		  <%} %>
	   		</table>
	   		</div>
	   </div>
	</div>
	<div class="row" style="margin: 30px;">
		<div class="col">
			<div style="font-weight: 600!important;">Users Report others post <br><span style="color: #3498db; font-size: 15px;"><%=UserDAO.totalReportOtherPost()%> Pending reports </span><br>
				<span style="color: #27ae60;; font-size: 15px;"><%=UserDAO.totalReportAcceptOtherPost()%> Accepted</span><br>
				<span style="color: #e74c3c; font-size: 15px;"><%=UserDAO.totalReportRejectOtherPost()%> Rejected</span><br>
			<hr></div>
			<div class="scroll3" style="border: 1px solid gray; border-radius: 10px;">
				<table class="table table-striped" style="margin: 2px;">
					<%
					List<ReqPostBlock> rpbs = PostDAO.allBlockPostReq();
					for(ReqPostBlock rpb : rpbs){
					%>
					<tr>
						<td><img src="image?id=<%=rpb.getId()%>" alt="profile" width="40px" style="border: 2px solid #0355f6; border-radius: 50%;"></td>
						<td>this member( <%=DAODetails.name(rpb.getUid())%> ) is posting(post id =<%=rpb.getPostId() %> ) Un-ethical <br> User email :: <%=DAODetails.emai(rpb.getUid()) %></td>
						<td>
							<button style="background: transparent; color: black;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
							</button>
							<ul class="dropdown-menu" style="min-width: 340px;">
								        <li><form class="dropdown-item" action="acptPostReport" method="post">
								        	<input type="text" name="tid" value="<%=rpb.getTid()%>" />
								        	<input type="submit" value="accept">
								        </form></li>
								        <li><form class="dropdown-item" action="rejectPostReport" method="post">
								        	<input type="text" name="tid" value="<%=rpb.getTid()%>" />
								        	<input type="submit" value="reject">
								        </form></li>
						    </ul>
						</td>
					</tr>
					
					<%} %>
				</table>
			</div>
		</div>
		<div class="col">
		
		
		<div style="font-weight: 600!important;">Users Report others solution <br><span style="color: #3498db; font-size: 15px;"><%=SolutionDAO.selectedReportActiveSolution()%> Pending reports </span><br>
				<span style="color: #27ae60;; font-size: 15px;"><%=SolutionDAO.selectedReportAcceptSolution()%> Accepted</span><br>
				<span style="color: #e74c3c; font-size: 15px;"><%=SolutionDAO.selectedReportRejectSolution()%> Rejected</span><br>
			<hr></div>
			<div class="scroll3" style="border: 1px solid gray; border-radius: 10px;">
				<table class="table table-striped" style="margin: 2px;">
					<%
					List<SolutionReportDTO> rpbss = SolutionDAO.getSolutionReports();
					for(SolutionReportDTO rpb : rpbss){
					%>
					<tr>
						<td><img src="image?id=<%=rpb.getUid()%>" alt="profile" width="40px" style="border: 2px solid #0355f6; border-radius: 50%;"></td>
						<td>this member( <%=DAODetails.name(rpb.getSuid())%> ) is solution(solution id =<%=rpb.getSid() %> )<br> Un-ethical <br> User email :: <%=DAODetails.emai(rpb.getSuid()) %></td>
						<td>
							<button style="background: transparent; color: black;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
						 		<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-three-dots-vertical" viewBox="0 0 16 16">
								  <path d="M9.5 13a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0zm0-5a1.5 1.5 0 1 1-3 0 1.5 1.5 0 0 1 3 0z"/>
								</svg>
							</button>
							<ul class="dropdown-menu" style="min-width: 340px;">
								        <li>
								        	<a style="margin: 5px;" class="btn btn-success" href="AcceptSolutionReport.jsp?id=<%=rpb.getSrId()%>">Accept</a>
								        </li>
								        <li>
								        	<a style="margin: 5px;" class="btn btn-danger" href="RejectSolutionReport.jsp?id=<%=rpb.getSrId()%>">Reject</a>
								        </li>
						    </ul>
						</td>
					</tr>
					
					<%} %>
				</table>
			</div>
		
		
		
		</div>
		<div class="col">
			<div style="font-weight: 600!important;">Users ReedBack<hr></div>
			<div class="scroll4" style="border: 1px solid gray; border-radius: 10px;">
				<table class="table table-striped" style="margin: 2px;">
					<%
					List<UserfeedbackDTO> fds = UserFeedbackDAO.getUserFeddback();
					for(UserfeedbackDTO fd: fds){
					%>
					<tr>
						<td><img src="image?id=<%=fd.getUid()%>" alt="profile" width="40px" style="border: 2px solid #0355f6; border-radius: 50%;"></td>
						<td>( <%=DAODetails.name(fd.getUid())%> ) feedback id = <%=fd.getTid() %><br>feedback :: <%=fd.getFeedback() %></td>
						
					</tr>
					
					<%} %>
				</table>
			</div>
		
		
		</div>
	</div>
	<hr>
	</div>
<script type="text/javascript">
function searchByEmail() {
    var email = document.getElementById('searchInputEmail').value;
    window.location.href = 'BasedUserEmail.jsp?email=' + email;
}

function openEditModal(userId) {
    // Update the modal with the user ID
    document.querySelector('.modal-title').textContent = 'Editing User ID: ' + userId;
    document.querySelector('.id').value = userId;
}
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