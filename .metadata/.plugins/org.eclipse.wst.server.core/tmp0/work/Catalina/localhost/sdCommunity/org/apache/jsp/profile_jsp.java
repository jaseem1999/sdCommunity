/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-10-08 13:51:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\"><link rel=\"stylesheet\" href=\"./homecss/style.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");

	Integer id =(Integer)session.getAttribute("uid");
	String fname=(String)session.getAttribute("fname"); 
	String lname=(String)session.getAttribute("lname"); 
	String email=(String)session.getAttribute("email");
	long num=(Long)session.getAttribute("num");	

      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	input,label,textarea{\r\n");
      out.write("		margin-top: 0px;\r\n");
      out.write("		margin-left: 20px;\r\n");
      out.write("		margin-bottom: 0px;\r\n");
      out.write("		margin-right: 30px;\r\n");
      out.write("	}\r\n");
      out.write("	.btn{\r\n");
      out.write("		margin-bottom: 10px;\r\n");
      out.write("		margin-top: -100px;\r\n");
      out.write("	}\r\n");
      out.write("	.form-control{\r\n");
      out.write("		width: 85%;\r\n");
      out.write("	}\r\n");
      out.write("	.error{\r\n");
      out.write("		color: red;\r\n");
      out.write("		margin-left: 30px;\r\n");
      out.write("		margin-top: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	.custom-file-input {\r\n");
      out.write("    color: transparent;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    height: 3em;\r\n");
      out.write("    width: 85%;\r\n");
      out.write("    padding: 0.5em;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-file-input::-webkit-file-upload-button {\r\n");
      out.write("    visibility: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-file-input::before {\r\n");
      out.write("    content: 'Browse';\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    background-color: #007bff;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("    padding: 0.2em 0.5em;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    white-space: nowrap;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-file-input:hover::before {\r\n");
      out.write("    background-color: #0056b3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-file-input:active::before {\r\n");
      out.write("    background-color: #004285;\r\n");
      out.write("}\r\n");
      out.write(".profileImg{\r\n");
      out.write("	width: 70px;\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("#center{\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title>Home (");
      out.print(fname);
      out.write(")</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hbdy\" style=\"background-color: black\">\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("		  <div class=\"modal-dialog\" style=\"color: black;\">\r\n");
      out.write("		    <div class=\"modal-content\">\r\n");
      out.write("		      <div class=\"modal-header\">\r\n");
      out.write("		        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Modal title</h1>\r\n");
      out.write("		        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("		      </div>\r\n");
      out.write("		      <form action=\"settingsAccess\" method=\"post\">\r\n");
      out.write("		      <div class=\"modal-body\">\r\n");
      out.write("		        <div class=\"mb-3\">\r\n");
      out.write("    				<label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("    				<input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"exampleInputPassword1\">\r\n");
      out.write("  				</div>\r\n");
      out.write("		      </div>\r\n");
      out.write("		      <div class=\"modal-footer\">\r\n");
      out.write("		        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("		         <input type=\"submit\" class=\"btn btn-primary\" value=\"OK\">\r\n");
      out.write("		      </div>\r\n");
      out.write("		      </form>\r\n");
      out.write("		    </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	<ul class=\"nav justify-content-end \">\r\n");
      out.write("			<li class=\"nav-item\" >\r\n");
      out.write("		    	<a class='nav-link' style=\"padding: 0px;\" href='UserHome.jsp'><img src=\"./img/logo.png\" alt=\"\" width=\"50px\"></a>\r\n");
      out.write("			</li>\r\n");
      out.write("			\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("		    	<a class='nav-link' href='UserHome.jsp'>Home</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		\r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		    ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href='UserPost.jsp'>Post</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		    ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href='userFollowers.jsp'>Followers</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		 \r\n");
      out.write("		  \r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		   ");

		  	if (email != null){
		  		out.print("<a class='nav-link' data-bs-toggle='modal' data-bs-target='#exampleModal'>Settings</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		  ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href=''>Profile</a>");
		  	}else{
		  		out.print("<a class='nav-link' href='../Login/Login.jsp'>Login</a>");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  \r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		    ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href='logout.jsp'>Logout</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		  ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href=''><img alt='' src='./css/img/User-Profile.png' style='width : 25px;'/></a>");
		  	}else{
		  		out.print("<a class='nav-link' href='../Login/Login.jsp'>Login</a>");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	<div  class=\"card\" style=\"margin: 10px; width: 98%; color: white;background: #33303000; border: 1px solid\">\r\n");
      out.write("	<div id=\"center\">\r\n");
      out.write("	 <img class=\"profileImg\" alt=\"\" src=\"\" id=\"updatedImg\" style=\"width: 100px;\"/><br>\r\n");
      out.write("    </div>\r\n");
      out.write("	 <form   onsubmit=\"return validateForm()\" action=\"Add\" method=\"post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("	  <div class=\"row\">\r\n");
      out.write("	  <div class=\"col\">\r\n");
      out.write("        <label for=\"image\" class=\"form-label \">Upload Image:</label>\r\n");
      out.write("        <input class=\"form-control custom-file-input\" type=\"file\" id=\"image\" name=\"image\" accept=\"image/*\" onchange=\"displayImage()\">\r\n");
      out.write("		<span class=\"error\" id=\"imgError\"></span><br>\r\n");
      out.write("		\r\n");
      out.write("        <label for=\"company\" class=\"form-label\">Company:</label>\r\n");
      out.write("        <input class=\"form-control\" type=\"text\" id=\"company\" name=\"company\">\r\n");
      out.write("		<span class=\"error\" id=\"companyError\"></span><br>\r\n");
      out.write("		\r\n");
      out.write("		<label for=\"college\" class=\"form-label\">College:</label>\r\n");
      out.write("        <input class=\"form-control\" type=\"text\" id=\"college\" name=\"college\">\r\n");
      out.write("		<span class=\"error\" id=\"collegeError\"></span><br>\r\n");
      out.write("		\r\n");
      out.write("		<label for=\"about\" class=\"form-label\">About:</label>\r\n");
      out.write("        <textarea class=\"form-control\" type=\"text\" id=\"about\" name=\"about\"></textarea>\r\n");
      out.write("		<span class=\"error\" id=\"aboutError\"></span><br>\r\n");
      out.write("		\r\n");
      out.write("		<label for=\"position\" class=\"form-label\">Position:</label>\r\n");
      out.write("        <input class=\"form-control\" type=\"text\" id=\"position\" name=\"position\">\r\n");
      out.write("		<span class=\"error\" id=\"positionError\"></span><br>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"col\">\r\n");
      out.write("		\r\n");
      out.write("        <label for=\"github\" class=\"form-label\">GitHub URL:</label>\r\n");
      out.write("        <input class=\"form-control\" type=\"url\" id=\"github\" name=\"github\">\r\n");
      out.write("        <span class=\"error\" id=\"githubError\"></span><br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"linkedin\" class=\"form-label\">LinkedIn URL:</label>\r\n");
      out.write("        <input class=\"form-control\" type=\"url\" id=\"linkedin\" name=\"linkedin\">\r\n");
      out.write("        <span class=\"error\" id=\"linkedinError\"></span><br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"nationality\" class=\"form-label\">Nationality:</label>\r\n");
      out.write("        <input type=\"text\" id=\"nationality\" name=\"nationality\"><br><br>\r\n");
      out.write("        <span class=\"error\" id=\"nationalityError\"></span><br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"gender\" class=\"form-label\">Gender:</label>\r\n");
      out.write("        <input  type=\"radio\" id=\"male\" name=\"gender\" value=\"male\">\r\n");
      out.write("        <label  for=\"male\" class=\"form-label\">Male</label>\r\n");
      out.write("        <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\">\r\n");
      out.write("        <label class=\"form-label\" for=\"female\">Female</label><br>\r\n");
      out.write("        <span class=\"error\" id=\"genderError\"></span><br>        \r\n");
      out.write("\r\n");
      out.write("        <label for=\"website\" class=\"form-label\">Website URL:</label>\r\n");
      out.write("        <input class=\"form-control\" type=\"url\" id=\"website\" name=\"website\"><br><br>\r\n");
      out.write("        <span class=\"error\" id=\"websiteError\"></span><br>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" class=\"btn btn-primary\" value=\"Submit\">\r\n");
      out.write("        </div>\r\n");
      out.write("       </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("	\r\n");
      out.write("<script type=\"text/javascript\" >\r\n");
      out.write("\r\n");
      out.write("function validateForm() {\r\n");
      out.write("    var image = document.getElementById(\"image\");\r\n");
      out.write("    var company = document.getElementById(\"company\");\r\n");
      out.write("  \r\n");
      out.write("    var nationality = document.getElementById(\"nationality\");\r\n");
      out.write("  \r\n");
      out.write("	let status = true;\r\n");
      out.write("    if (image.value === \"\") {\r\n");
      out.write("        document.getElementById(\"imgError\").innerHTML = \"Please update img\";\r\n");
      out.write("        status = false;\r\n");
      out.write("    }else{\r\n");
      out.write("		document.getElementById(\"updatedImg\").innerHTML = image;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("    if (college.value === \"\") {\r\n");
      out.write("        document.getElementById(\"companyError\").innerHTML = \"Please enter your company/college name\";;\r\n");
      out.write("        status = false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    if (nationality.value === \"\") {\r\n");
      out.write("        document.getElementById(\"nationalityError\").innerHTML = \"Please update nationality\";\r\n");
      out.write("        status = false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (document.querySelector('input[name=\"gender\"]:checked') === null) {\r\n");
      out.write("       	document.getElementById(\"genderError\").innerHTML = \"Please update gender\";\r\n");
      out.write("        status = false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    return status;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function displayImage() {\r\n");
      out.write("var input = document.getElementById('image');\r\n");
      out.write("var img = document.getElementById('updatedImg');\r\n");
      out.write("\r\n");
      out.write("var file = input.files[0];\r\n");
      out.write("var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("if (!file) {\r\n");
      out.write("img.src = \"./css/img/User-profile.png\"; // Set default image source\r\n");
      out.write("return;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("if (file.size > 55 * 1024) { // Check if image size is greater than 200KB\r\n");
      out.write("document.getElementById(\"imgError\").innerHTML = \"Please update image size lesthan 55kb\";\r\n");
      out.write("input.value = \"\"; // Clear the input field\r\n");
      out.write("img.src = \"./css/img/User-profile.png\"; // Set default image source\r\n");
      out.write("return;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("reader.onload = function(e) {\r\n");
      out.write("img.src = e.target.result;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("reader.readAsDataURL(file);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
