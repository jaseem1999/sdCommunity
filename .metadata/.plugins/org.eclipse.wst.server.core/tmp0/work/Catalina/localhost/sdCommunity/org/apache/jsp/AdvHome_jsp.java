/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-11-04 04:04:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import sdCommunity.advUser.product.ProductDTO;
import sdCommunity.advUser.product.ReqProduct;

public final class AdvHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("sdCommunity.advUser.product.ProductDTO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("sdCommunity.advUser.product.ReqProduct");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");

Integer id =(Integer)session.getAttribute("id");
String name=(String)session.getAttribute("name"); 
String agName=(String)session.getAttribute("agName"); 
String email=(String)session.getAttribute("emil");
long num=(Long)session.getAttribute("num");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>sdCommunity Developed For agency ");
      out.print(agName );
      out.write("</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"//cdn.amcharts.com/lib/4/core.js\"></script>\r\n");
      out.write("<script src=\"//cdn.amcharts.com/lib/4/charts.js\"></script>\r\n");
      out.write("<script src=\"//cdn.amcharts.com/lib/4/themes/animated.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a {\r\n");
      out.write("	 text-decoration: none;\r\n");
      out.write("	 color: white;\r\n");
      out.write("	 font-size: 15px;\r\n");
      out.write("	 font-weight: bold;\r\n");
      out.write("	 text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write(".nav {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  padding-top: 0px;\r\n");
      out.write("    background: black;\r\n");
      out.write("    color: ghostwhite;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".hamburger {\r\n");
      out.write("  padding-right: 20px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hamburger .line {\r\n");
      out.write("  display: block;\r\n");
      out.write("  width: 40px;\r\n");
      out.write("  height: 5px;\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("  background-color: #ffeeee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav__link {\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  width: 94%;\r\n");
      out.write("  top: 5rem;\r\n");
      out.write("  left: 18px;\r\n");
      out.write("  background-color: #303232;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav__link a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 10px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav__link a:hover {\r\n");
      out.write("  background-color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hide {\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media screen and (min-width: 890px) {\r\n");
      out.write("  .nav__link {\r\n");
      out.write("    display: block;\r\n");
      out.write("    position: static;\r\n");
      out.write("    width: auto;\r\n");
      out.write("    margin-right: 20px;\r\n");
      out.write("    background: none;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .nav__link a {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    padding: 15px 20px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .hamburger {\r\n");
      out.write("    display: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal{\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write(".profileImg{\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	border-radius: 8%;\r\n");
      out.write("}\r\n");
      out.write("#center{\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("      <nav class=\"nav\">\r\n");
      out.write("        <a href=\"/\" class=\"logo\"><img alt=\"logo\" src=\"./img/logo.png\" width=\"60px\"/></a>\r\n");
      out.write("		<span style=\"font-family:fantasy; font-size: large;position: absolute;left: 80px;\">sdCommunity Developed For Advertisement Agency</span>\r\n");
      out.write("        <div class=\"hamburger\">\r\n");
      out.write("          <span class=\"line\"></span>\r\n");
      out.write("          <span class=\"line\"></span>\r\n");
      out.write("          <span class=\"line\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"nav__link hide\">\r\n");
      out.write("          <a href=\"#\">home</a>\r\n");
      out.write("          <a href=\"#\">Ads</a>\r\n");
      out.write("          <a href=\"#\">Report</a>\r\n");
      out.write("          <a href=\"#\">contact</a>\r\n");
      out.write("          <a href=\"#\">Logout</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write(" </header>\r\n");
      out.write("\r\n");
      out.write("<a style=\"margin: 10px;\" class=\"btn btn-outline-dark\" data-bs-toggle=\"offcanvas\" href=\"#offcanvasExample\" role=\"button\" aria-controls=\"offcanvasExample\">\r\n");
      out.write("	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-list\" viewBox=\"0 0 16 16\">\r\n");
      out.write("	  <path fill-rule=\"evenodd\" d=\"M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z\"/>\r\n");
      out.write("	</svg>  \r\n");
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("<div class=\"offcanvas offcanvas-start\" tabindex=\"-1\" id=\"offcanvasExample\" aria-labelledby=\"offcanvasExampleLabel\">\r\n");
      out.write("  <div class=\"offcanvas-header\">\r\n");
      out.write("    <h5 class=\"offcanvas-title\" id=\"offcanvasExampleLabel\">sdCommunity</h5>\r\n");
      out.write("    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"offcanvas\" aria-label=\"Close\"></button>\r\n");
      out.write("  </div>\r\n");
      out.write("  <p style=\"position: absolute; right:10px; top: 45px; color: green\">user id: ");
      out.print(id );
      out.write("</p>\r\n");
      out.write("  <div class=\"offcanvas-body\">\r\n");
      out.write("  	<div class=\"dropdown mt-3\">\r\n");
      out.write("      <button style=\"margin-top: -55px;\" class=\"btn btn-secondary dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\">\r\n");
      out.write("        Menu\r\n");
      out.write("        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-list\" viewBox=\"0 0 16 16\">\r\n");
      out.write("		  <path fill-rule=\"evenodd\" d=\"M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z\"/>\r\n");
      out.write("		</svg>  \r\n");
      out.write("      </button>\r\n");
      out.write("      <ul class=\"dropdown-menu\" style=\"min-width: 340px;\">\r\n");
      out.write("        <li><a class=\"dropdown-item\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">Ads Upload</a></li>\r\n");
      out.write("        <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("        <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"margin: 10px;\">\r\n");
      out.write("      <p style=\"width: 20px;\">Profile</p>\r\n");
      out.write("    	<hr>\r\n");
      out.write("    	<ul class=\"list-group\">\r\n");
      out.write("    		<li class=\"list-group-item\">Agency :: ");
      out.print(agName );
      out.write("</li>\r\n");
      out.write("			  <li class=\"list-group-item\">User :: ");
      out.print(name );
      out.write("</li>\r\n");
      out.write("			  <li class=\"list-group-item\">Email :: ");
      out.print(email );
      out.write("</li>\r\n");
      out.write("			  <li class=\"list-group-item\">Phone No :: ");
      out.print(num );
      out.write("</li>\r\n");
      out.write("			   	\r\n");
      out.write("    	</ul>\r\n");
      out.write("     </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" <div class=\"container-xl\">\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Upload your Ada</h1>\r\n");
      out.write("        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("      		<div id=\"center\">\r\n");
      out.write("			 <img class=\"profileImg\" alt=\"\" src=\"\" id=\"updatedImg\" style=\"width: 200px;\"/><br>\r\n");
      out.write("		    </div>\r\n");
      out.write("			<form onsubmit=\"return validateForm()\" action=\"adsAdd\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("			  <div class=\"mb-3\">\r\n");
      out.write("				<label for=\"image\" class=\"form-label \">Upload Image:</label>\r\n");
      out.write("        		<input class=\"form-control custom-file-input\" type=\"file\" id=\"image\" name=\"image\" accept=\"image/*\" onchange=\"displayImage()\">\r\n");
      out.write("				<span class=\"error\" id=\"imgError\" style=\"color: red;\"></span><br>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"mb-3\">\r\n");
      out.write("			    <label for=\"exampleInputProduct\" class=\"form-label\">Product Name</label>\r\n");
      out.write("			    <input type=\"text\" class=\"form-control\" id=\"exampleInputProduct\" name=\"pname\" aria-describedby=\"productHelp\">\r\n");
      out.write("			    <span class=\"error\" id=\"nameError\" style=\"color: red;\"></span><br>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"mb-3\">\r\n");
      out.write("			    <label for=\"exampleInputDescription\" class=\"form-label\">Product Description</label>\r\n");
      out.write("			    <textarea class=\"form-control\" id=\"exampleInputDescription\" name=\"pdesc\" aria-describedby=\"descriptionHelp\"></textarea>\r\n");
      out.write("			  	<span class=\"error\" id=\"descError\" style=\"color: red;\"></span><br>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"mb-3\">\r\n");
      out.write("			    <label for=\"exampleInputCompany\" class=\"form-label\">Company</label>\r\n");
      out.write("			    <input type=\"text\" class=\"form-control\" id=\"exampleInputCompany\" name=\"company\">\r\n");
      out.write("			    <span class=\"error\" id=\"companyError\" style=\"color: red;\"></span><br>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"mb-3\">\r\n");
      out.write("			    <label for=\"exampleInputPrice\" class=\"form-label\">Price</label>\r\n");
      out.write("			    <input type=\"text\" class=\"form-control\" id=\"exampleInputPrice\" name=\"price\">\r\n");
      out.write("			    <span class=\"error\" id=\"priceError\" style=\"color: red;\"></span><br>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"mb-3\">\r\n");
      out.write("			    <label for=\"exampleInputOffer\" class=\"form-label\">Offer <span style=\"color: green\">(optional)</span></label>\r\n");
      out.write("			    <input type=\"text\" class=\"form-control\" id=\"exampleInputOffer\" name=\"poffer\">\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("			</form>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h4 style=\"margin-top: 50px;\">Ads Requested</h4>\r\n");
      out.write("<table class=\"table table-striped\">\r\n");
      out.write(" <tr>\r\n");
      out.write(" 	<th>Product</th>\r\n");
      out.write(" 	<th>Image</th>\r\n");
      out.write(" 	<th>Company</th>\r\n");
      out.write(" 	<th>Description</th>\r\n");
      out.write(" 	<th>price</th>\r\n");
      out.write(" 	<th>Offer</th>\r\n");
      out.write(" 	<th>Status</th>\r\n");
      out.write(" </tr>\r\n");
      out.write(" ");

 	response.setContentType("text/html");
 	List<ProductDTO> rp= ReqProduct.allReqProduct();
 	for(ProductDTO pr1 : rp ){
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  	<td>");
      out.print(pr1.getName() );
      out.write("</td>\r\n");
      out.write("  	<td><img src=\"adsImgPr?id=");
      out.print(pr1.getPid());
      out.write("\" alt=\"\" width=\"200px\" /></td>\r\n");
      out.write("  	<td>");
      out.print(pr1.getCompany() );
      out.write("</td>\r\n");
      out.write("  	<td>");
      out.print(pr1.getDesc() );
      out.write("</td>\r\n");
      out.write("  	<td>");
      out.print(pr1.getPrice() );
      out.write("</td>\r\n");
      out.write("  	<td>");
      out.print(pr1.getOffer() );
      out.write("</td>\r\n");
      out.write("  	<td class=\"table-success\">Processing</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write(" ");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function displayImage() {\r\n");
      out.write("	var input = document.getElementById('image');\r\n");
      out.write("	var img = document.getElementById('updatedImg');\r\n");
      out.write("\r\n");
      out.write("	var file = input.files[0];\r\n");
      out.write("	var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("	if (!file) {\r\n");
      out.write("	img.src = \"./img/logo.png\"; // Set default image source\r\n");
      out.write("	return;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	if (file.size > 1024 * 1024) { // Check if image size is greater than 200KB\r\n");
      out.write("	document.getElementById(\"imgError\").innerHTML = \"Please update image size lesthan 1024kb\";\r\n");
      out.write("	input.value = \"\"; // Clear the input field\r\n");
      out.write("	img.src = \"./css/img/User-profile.png\"; // Set default image source\r\n");
      out.write("	return;\r\n");
      out.write("	}\r\n");
      out.write("	reader.onload = function(e) {\r\n");
      out.write("		img.src = e.target.result;\r\n");
      out.write("	}\r\n");
      out.write("	reader.readAsDataURL(file);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateForm() {\r\n");
      out.write("    var image = document.getElementById('image');\r\n");
      out.write("    var pname = document.getElementById('exampleInputProduct');\r\n");
      out.write("    var pdesc = document.getElementById('exampleInputDescription');\r\n");
      out.write("    var pcompany = document.getElementById('exampleInputCompany');\r\n");
      out.write("    var pprice = document.getElementById('exampleInputPrice');\r\n");
      out.write("    var status = true;\r\n");
      out.write("\r\n");
      out.write("    // Basic validation: Check if fields are not empty\r\n");
      out.write("    if(image.value.trim() == ''){\r\n");
      out.write("    	document.getElementById(\"imgError\").innerHTML = \"Please update image 55kb\";\r\n");
      out.write("    	return false;\r\n");
      out.write("    }else{\r\n");
      out.write("    	document.getElementById(\"imgError\").innerHTML = \"\";\r\n");
      out.write("    }\r\n");
      out.write("    if (pname.value.trim() === '') {\r\n");
      out.write("        document.getElementById(\"nameError\").innerHTML = \"fields must be filled out\";\r\n");
      out.write("        return false;\r\n");
      out.write("    }else{\r\n");
      out.write("    	document.getElementById(\"nameError\").innerHTML = \"\";\r\n");
      out.write("    }\r\n");
      out.write("    if ( pdesc.value.trim() === '') {\r\n");
      out.write("        document.getElementById(\"descError\").innerHTML = \"fields must be filled out\";\r\n");
      out.write("        return false;\r\n");
      out.write("    }else{\r\n");
      out.write("    	document.getElementById(\"descError\").innerHTML = \"\";\r\n");
      out.write("    }\r\n");
      out.write("    if (pcompany.value.trim() === '') {\r\n");
      out.write("        document.getElementById(\"companyError\").innerHTML = \"fields must be filled out\";\r\n");
      out.write("        return false;\r\n");
      out.write("    }else{\r\n");
      out.write("    	document.getElementById(\"companyError\").innerHTML = \"\";\r\n");
      out.write("    }\r\n");
      out.write("    if (pprice.value.trim() === '') {\r\n");
      out.write("        document.getElementById(\"priceError\").innerHTML = \"fields must be filled out\";\r\n");
      out.write("        return false;\r\n");
      out.write("    }else{\r\n");
      out.write("    	document.getElementById(\"priceError\").innerHTML = \"\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Validate if price is a decimal\r\n");
      out.write("    if (!/^\\d+(\\.\\d{1,2})?$/.test(pprice.value)) {\r\n");
      out.write("        document.getElementById(\"priceError\").innerHTML = \"Price must be a decimal number\";\r\n");
      out.write("        return false;\r\n");
      out.write("    }else{\r\n");
      out.write("    	document.getElementById(\"priceError\").innerHTML = \"\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // Validate description length\r\n");
      out.write("    if (pdesc.value.length > 999) {\r\n");
      out.write("        document.getElementById(\"descError\").innerHTML = \"Description cannot exceed 999 characters\";\r\n");
      out.write("        return false;\r\n");
      out.write("    }else{\r\n");
      out.write("    	document.getElementById(\"descError\").innerHTML = \"\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
