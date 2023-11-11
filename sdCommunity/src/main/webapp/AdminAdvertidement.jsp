<%@page import="sdCommunity.admin.adv.ProductDAO"%>
<%@page import="sdCommunity.admin.adv.ReqProductDTO"%>
<%@page import="sdCommunity.admin.adv.AdvDAO"%>
<%@page import="sdCommunity.admin.adv.AdvDTO"%>
<%@page import="java.util.List"%>
<%@page import="sdCommunity.admin.user.UserDAO"%>
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
		<%
		String message = request.getParameter("message");
		if (message != null && message.equals("userBlockSuccess")){
			out.print("<div class='alert alert-success'id='alert' role='alert'>User blocked succesfully</div>");
		}else if(message != null && message.equals("userUnblockSuccess")){
			out.print("<div class='alert alert-success' id='alert' role='alert'>User unblocked Successfuly</div>");
		}else{
			out.print("");
		}
		%>
			<div style="font-weight: 600!important;">Advertisement Agency of sdCommunity<br><span style="color: #3498db; font-size: 15px;"><%=AdvDAO.totalAgencys()%> Registered agency</span>
				<span style="color: #27ae60;; font-size: 15px; margin: 20px;"><%=AdvDAO.totalActiveAgency()%> Active agency</span>
				<span style="color: #e74c3c; font-size: 15px; margin: 20px;"><%=AdvDAO.totalBlockedAgency()%> Blocked agency</span> 
			<hr></div>
			<div class="scroll" style="border: 1px solid gray; border-radius: 10px;" >
				<table class="table table-striped" style="margin: 10px;height: 297px;width: 100%;border: 1px;">
					 <tr style="height: 20px;">
					 	<th>Agency ID</th>
					 	<th>Email</th>
					 	<th>User Name</th>
					 	<th>Agency Name</th>
					 	<th>Number</th>
					 	<th>Status</th>
					 	<th>Menu</th>
					 	<th></th>
					 </tr>
					 <%
					 List<AdvDTO> ags = AdvDAO.getAllAgency();
					 for(AdvDTO ag : ags){
					 %>
					 	<tr style="height: 20px;">
					 		<td><%=ag.getTid() %></td>
					 		<td><%=ag.getEmail() %></td>
					 		<td><%=ag.getName() %></td>
					 		<td><%=ag.getAgName() %></td>
					 		<td><%=ag.getNumber() %></td>
					 		<td><%
					 		String statusUser = ag.getStatus();
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
						        <li><a class="dropdown-item" href="AdminAjview.jsp?id=<%=ag.getTid()%>">Edit</a></li>
						        <li>
						        <%
						        if(statusUser == null){
						 			out.print("<a class='dropdown-item' href='BlockAdvertisementAgency.jsp?id="+ ag.getTid()+"'>Block</a>");
						 		}else{
						 			out.print("<a class='dropdown-item' href='UnblockAdvertisementAgency.jsp?id=" + ag.getTid() + "'>Unblock</a>");
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
	</div>
	<hr>
	
	<div class="row" style="margin-top: 50px;">
		<%
		if (message != null && message.equals("productAcceptSuccess")){
			out.print("<div class='alert alert-success'id='alert' role='alert'>Ads Accepted succesfully</div>");
		}else if(message != null && message.equals("productAcceptFailed")){
			out.print("<div class='alert alert-danger' id='alert' role='alert'>Ads Rejected Successfuly</div>");
		}else{
			out.print("");
		}
		%>
		<div class="col" >
			<div style="font-weight: 600!important;">Requested Ads of sdCommunity<br><span style="color: #3498db; font-size: 15px;"><%=0%> Pending ads requested </span>
				<span style="color: #27ae60;; font-size: 15px; margin: 20px;"><%=0%> Accepted ads</span>
				<span style="color: #e74c3c; font-size: 15px; margin: 20px;"><%=0%> Rejected Ads</span> 
			<hr></div>
			<div class="scroll" style="border: 1px solid gray; border-radius: 10px;" >
				<table class="table table-striped" style="margin: 10px;height: 297px;width: 100%;border: 1px;">
					 <tr style="height: 20px;">
					 	<th>Req id</th>
					 	<th>Agency id</th>
					 	<th>Agency Name</th>
					 	<th>Product Image</th>
					 	<th>Product Name</th>
					 	<th>Description</th>
					 	<th>Company</th>
					 	<th>Price</th>
					 	<th>Offer</th>
					 	<th>Link</th>
					 	<th>Status</th>
					 	<th>Menu</th>
					 </tr>
					 <%
					 List<ReqProductDTO> rps = ProductDAO.getAllreqProduct();
					 for(ReqProductDTO rp: rps){
					 %>
					 <tr style="height: 50px;">
					 	<td><%=rp.getTid() %></td>
					 	<td><%=rp.getUid() %></td>
					 	<td><%=ProductDAO.agencyName(rp.getUid())%></td>
					 	<td> <img alt="productImage" src="adsImgPr?id=<%=rp.getTid()%>" width="150px"> </td>
					 	<td><%=rp.getpName()%></td>
					 	<td><%=rp.getDesc() %></td>
					 	<td><%=rp.getCompany() %></td>
					 	<td><%=rp.getPrice() %></td>
					 	<td><%=rp.getOffer() %></td>
					 	<td>
					 	<a style="color: blue;" href="<%
						  	if(rp.getLink() != null){
						  		out.print(rp.getLink());
						  	}else{
						  		out.print("#");
						  	}
						  	%>">Link</a>
					 	</td>
					 	<td>
					 	<%
					 		if(rp.getStatus() == null){
					 			out.print("<span style='color:#3498db;' >Pending</span>");
					 		}else if(rp.getStatus().equals("accept")){
					 			out.print("<span style='color:#27ae60;' >Accept</span>");
					 		}else if(rp.getStatus().equals("reject")){
					 			out.print("<span style='color:#e74c3c;' >Reject</span>");
					 		}else{
					 			out.print("");	
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
						        <li><a class="dropdown-item" href="AcceptProduct.jsp?productId=<%=rp.getTid()%>">Accept <%=rp.getTid() %></a></li>
						        <li><a class="dropdown-item" href="RejectProduct.jsp?productId=<%=rp.getTid()%>">Reject</a></li>
						      </ul>
					 	</td>
					 </tr>
					 <%} %>
				</table>
			</div>
	</div>
	
	</div>
	<div class="row" style="margin-top: 50px;">
		<div style="font-weight: 600!important;">Ads of sdCommunity
		<hr></div>
			<div class="scroll" style="border: 1px solid gray; border-radius: 10px;" >
				<table class="table table-striped" style="margin: 10px;height: 297px;width: 100%;border: 1px;">
					 <tr style="height: 20px;">
					 	<th>Product id</th>
					 	<th>Agency id</th>
					 	<th>Product Name</th>
					 	<th>Product Image</th>
					 	<th>Description</th>
					 	<th>Company</th>
					 	<th>Price</th>
					 	<th>Offer</th>
					 	<th>Link</th>
					 </tr>
					 <%
					 List<ReqProductDTO> ps = ProductDAO.getAllAcceptProduct();
					 for(ReqProductDTO p: ps){
					 %>
					 	<tr>
					 		<td><%=p.getTid() %></td>
					 		<td><%=p.getUid() %></td>
					 		<td><%=p.getpName() %></td>
					 		<td><img alt="productImage" src="adim?id=<%=p.getTid()%>" width="150px"></td>
					 		<td><%=p.getDesc() %></td>
					 		<td><%=p.getCompany() %></td>
					 		<td><%=p.getPrice() %></td>
					 		<td><%=p.getOffer() %></td>
					 		<td>
					 		<a style="color: blue;" href="<%
						  	if(p.getLink() != null){
						  		out.print(p.getLink());
						  	}else{
						  		out.print("#");
						  	}
						  	%>">Link</a>
					 		</td>
					 	</tr>
					 <%} %>
					</table>
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