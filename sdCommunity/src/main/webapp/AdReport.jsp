
<%@page import="sdCommunity.advUser.product.ProductDAO"%>
<%@page import="sdCommunity.advUser.product.AdsProductDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
Integer id =(Integer)session.getAttribute("id");
String name=(String)session.getAttribute("name"); 
String agName=(String)session.getAttribute("agName"); 
String email=(String)session.getAttribute("emil");
long num=(Long)session.getAttribute("num");

%>

<meta charset="ISO-8859-1">
<title>Ads on sdcommunity</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<script src="//cdn.amcharts.com/lib/4/core.js"></script>
<script src="//cdn.amcharts.com/lib/4/charts.js"></script>
<script src="//cdn.amcharts.com/lib/4/themes/animated.js"></script>


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

.modal{
	
}
.profileImg{
	width: 200px;
	height: 100px;
	border-radius: 8%;
}
#center{
	text-align: center;
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
        <a href="/" class="logo"><img alt="logo" src="./img/logo.png" width="60px"/></a>
		<span style="font-family:fantasy; font-size: large;position: absolute;left: 80px;">sdCommunity Developed For Advertisement Agency</span>
        <div class="hamburger">
          <span class="line"></span>
          <span class="line"></span>
          <span class="line"></span>
        </div>

        <div class="nav__link hide">
          <a href="AdvHome.jsp">home</a>
          <a href="#">Ads</a>
          <a href="AdReport.jsp">Report</a>
          <a href="AdvContact.jsp">contact</a>
          <a href="AdvLogout.jsp">Logout</a>
        </div>
      </nav>
 </header>

<a style="margin: 10px;" class="btn btn-outline-dark" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
	<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
	  <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
	</svg>  
</a>

<div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
  <div class="offcanvas-header">
    <h5 class="offcanvas-title" id="offcanvasExampleLabel">sdCommunity</h5>
    <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
  </div>
  <p style="position: absolute; right:10px; top: 45px; color: green">user id: <%=id %></p>
  <div class="offcanvas-body">
  	<div class="dropdown mt-3">
      <button style="margin-top: -55px;" class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown">
        Menu
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
		  <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
		</svg>  
      </button>
      <ul class="dropdown-menu" style="min-width: 340px;">
        <li><a class="dropdown-item" href="AdvHome.jsp"> Home</a></li>
        <li><a class="dropdown-item" href="AdvCurruntAds.jsp">Ads current</a></li>
        <li><a class="dropdown-item" href="AdvContact.jsp">Contact</a></li>
      </ul>
    </div>
    <div style="margin: 10px;">
      <p style="width: 20px;">Profile</p>
    	<hr>
    	<ul class="list-group">
    		<li class="list-group-item">Agency :: <%=agName %></li>
			  <li class="list-group-item">User :: <%=name %></li>
			  <li class="list-group-item">Email :: <%=email %></li>
			  <li class="list-group-item">Phone No :: <%=num %></li>
			   	
    	</ul>
     </div>
    
  </div>
</div>
<div class="container">
	<div class="row" style="margin-top: 50px;">
		<div style="font-weight: 600!important;">Ads Report of sdCommunity
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
					 	<th>Total visitors</th>
					 </tr>
					 <%
					 List<AdsProductDTO> ps = ProductDAO.allProduct();
					 for(AdsProductDTO p : ps){
					 %>
					 <tr>
					 	<td><%=p.getTid() %></td>
					 	<td><%=p.getUid() %></td>
					 	<td><%=p.getPname() %></td>
					 	<td><img alt="productImage" src="adim?id=<%=p.getTid()%>" width="150px"></td>
					 	<td><%=p.getPdescription() %></td>
					 	<td><%=p.getPcompany() %></td>
					 	<td><%=p.getPprice() %></td>
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
					 	<td><%=p.getCount() %></td>
					 </tr>
					 <%} %>
				</table>
			</div>
	</div>
		

</div>


</body>
</html>