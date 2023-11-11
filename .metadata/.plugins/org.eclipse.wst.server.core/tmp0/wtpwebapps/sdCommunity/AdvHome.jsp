<%@page import="java.util.List"%>
<%@page import="sdCommunity.advUser.product.ProductDTO"%>
<%@page import="sdCommunity.advUser.product.ReqProduct"%>
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
<title>sdCommunity Developed For agency <%=agName %></title>
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
          <a href="#">home</a>
          <a href="AdvCurruntAds.jsp">Ads</a>
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
        <li><a class="dropdown-item" data-bs-toggle="modal" data-bs-target="#exampleModal">Ads Upload</a></li>
        <li><a class="dropdown-item" href="AdvCurruntAds.jsp"> Current Ads</a></li>
        <li><a class="dropdown-item" href="AdReport.jsp">Ads Report</a></li>
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
 
 
 <div class="container-xl">
	
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Upload your Ad</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      		<div id="center">
      		<h4 style="color:red; margin-bottom: 10px;">For 20 minutes 300rs</h4>
			 <img class="profileImg" alt="" src="" id="updatedImg" style="width: 200px;"/><br>
		    </div>
			<form onsubmit="return validateForm()" action="adsAdd" method="post" enctype="multipart/form-data" >
			  <div class="mb-3">
				<label for="image" class="form-label ">Upload Image:</label>
        		<input class="form-control custom-file-input" type="file" id="image" name="image" accept="image/*" onchange="displayImage()">
				<span class="error" id="imgError" style="color: red;"></span><br>
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputProduct" class="form-label">Product Name</label>
			    <input type="text" class="form-control" id="exampleInputProduct" name="pname" aria-describedby="productHelp">
			    <span class="error" id="nameError" style="color: red;"></span><br>
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputDescription" class="form-label">Product Description</label>
			    <textarea class="form-control" id="exampleInputDescription" name="pdesc" aria-describedby="descriptionHelp"></textarea>
			  	<span class="error" id="descError" style="color: red;"></span><br>
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputCompany" class="form-label">Company</label>
			    <input type="text" class="form-control" id="exampleInputCompany" name="company">
			    <span class="error" id="companyError" style="color: red;"></span><br>
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputPrice" class="form-label">Price</label>
			    <input type="text" class="form-control" id="exampleInputPrice" name="price">
			    <span class="error" id="priceError" style="color: red;"></span><br>
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputOffer" class="form-label">Offer <span style="color: green">(optional)</span></label>
			    <input type="text" class="form-control" value="0" id="exampleInputOffer" name="poffer">
	
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputlink" class="form-label">Product link</label>
			    <input type="text" class="form-control" id="exampleInputlink" name="plink">
			    <span class="error" id="linkError" style="color: red;"></span><br>
			  </div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
       
       
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>



<h4 style="margin-top: 50px;">Ads Requested</h4>
<hr>
<table class="table table-striped">
 <tr>
 	<th>Product</th>
 	<th>Image</th>
 	<th>Company</th>
 	<th>Description</th>
 	<th>price</th>
 	<th>Offer</th>
 	<th>Link</th>
 	<th>Status</th>
 </tr>
 <%
 	response.setContentType("text/html");
 	List<ProductDTO> rp= ReqProduct.allReqProduct(id);
 	for(ProductDTO pr1 : rp ){
 %>

  <tr>
  	<td><%=pr1.getName() %></td>
  	<td><img src="adsImgPr?id=<%=pr1.getPid()%>" alt="" width="200px" /></td>
  	<td><%=pr1.getCompany() %></td>
  	<td><%=pr1.getDesc() %></td>
  	<td><%=pr1.getPrice() %></td>
  	<td><%=pr1.getOffer() %></td>
  	<td><a style="color: blue;" href="<%
  	
  	if(pr1.getLink() != null){
  		out.print(pr1.getLink());
  	}else{
  		out.print("#");
  	}
  	%>">Link</a></td>
  	<td>
  		<%
  		if(pr1.getStatus() == null){
  			out.print("<span style='color: blue'>Proccesing</span>");
  		}else if(pr1.getStatus().equals("accept")){
  			out.print("<span style='color: green'>Accepted</span>");
  		}else{
  			out.print("<span style='color: red'>Rejected</span>");	
  		}
  		%>
  	</td>
  </tr>

 <% } %>
</table>

</div>

<script type="text/javascript">
function displayImage() {
	var input = document.getElementById('image');
	var img = document.getElementById('updatedImg');

	var file = input.files[0];
	var reader = new FileReader();

	if (!file) {
	img.src = "./img/logo.png"; // Set default image source
	return;
	}

	if (file.size > 1024 * 1024) { // Check if image size is greater than 200KB
	document.getElementById("imgError").innerHTML = "Please update image size lesthan 1024kb";
	input.value = ""; // Clear the input field
	img.src = "./css/img/User-profile.png"; // Set default image source
	return;
	}
	reader.onload = function(e) {
		img.src = e.target.result;
	}
	reader.readAsDataURL(file);
}

function validateForm() {
    var image = document.getElementById('image');
    var pname = document.getElementById('exampleInputProduct');
    var pdesc = document.getElementById('exampleInputDescription');
    var pcompany = document.getElementById('exampleInputCompany');
    var pprice = document.getElementById('exampleInputPrice');
    var plink = document.getElementById('exampleInputlink');
    var status = true;

    // Basic validation: Check if fields are not empty
    if(plink.value.trim() == ''){
    	document.getElementById("linkError").innerHTML = "Please past URL of product";
    	return false;
    }else{
    	document.getElementById("linkError").innerHTML = "";
    }
    if(image.value.trim() == ''){
    	document.getElementById("imgError").innerHTML = "Please update image 55kb";
    	return false;
    }else{
    	document.getElementById("imgError").innerHTML = "";
    }
    if (pname.value.trim() === '') {
        document.getElementById("nameError").innerHTML = "fields must be filled out";
        return false;
    }else{
    	document.getElementById("nameError").innerHTML = "";
    }
    if ( pdesc.value.trim() === '') {
        document.getElementById("descError").innerHTML = "fields must be filled out";
        return false;
    }else{
    	document.getElementById("descError").innerHTML = "";
    }
    if (pcompany.value.trim() === '') {
        document.getElementById("companyError").innerHTML = "fields must be filled out";
        return false;
    }else{
    	document.getElementById("companyError").innerHTML = "";
    }
    if (pprice.value.trim() === '') {
        document.getElementById("priceError").innerHTML = "fields must be filled out";
        return false;
    }else{
    	document.getElementById("priceError").innerHTML = "";
    }

    // Validate if price is a decimal
    if (!/^\d+(\.\d{1,2})?$/.test(pprice.value)) {
        document.getElementById("priceError").innerHTML = "Price must be a decimal number";
        return false;
    }else{
    	document.getElementById("priceError").innerHTML = "";
    }

    // Validate description length
    if (pdesc.value.length > 999) {
        document.getElementById("descError").innerHTML = "Description cannot exceed 999 characters";
        return false;
    }else{
    	document.getElementById("descError").innerHTML = "";
    }

    return true;
}



</script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>