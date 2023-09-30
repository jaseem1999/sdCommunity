/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-09-30 16:37:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserSettings_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");

Integer id =(Integer)session.getAttribute("uid");
String fname=(String)session.getAttribute("fname"); 
String lname=(String)session.getAttribute("lname"); 
String email=(String)session.getAttribute("email");
Long num=(Long)session.getAttribute("num");
String company = (String) session.getAttribute("company");
String github = (String) session.getAttribute("github");
String linkedin = (String) session.getAttribute("linkedin");
String website = (String) session.getAttribute("website");
String nation = (String) session.getAttribute("nation");
String gender = (String) session.getAttribute("gender");
String about = (String) session.getAttribute("about");
String college = (String) session.getAttribute("college");
String position = (String) session.getAttribute("position");

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./homecss/style.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Settings for ");
      out.print(fname);
      out.write("</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".sattingsOptions{\r\n");
      out.write("	border: 1px solid white;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	width: 85%;\r\n");
      out.write("	line-height: 30.4px;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("}\r\n");
      out.write(".sattingsSectiion{\r\n");
      out.write("	margin-top: 10px;	\r\n");
      out.write("	height: auto;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background-color: #5f5fd13b;\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("	padding-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".sattingsOptions:hover {\r\n");
      out.write("	background-color: white;\r\n");
      out.write("}\r\n");
      out.write("#center{\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: black\" class=\"hbdy\">\r\n");
      out.write("\r\n");
      out.write("	<ul class=\"nav justify-content-end \" >\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
      out.write("		    	<a class='nav-link' href='UserHome.jsp'>Home</a>\r\n");
      out.write("			</li>\r\n");
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
		  		out.print("<a class='nav-link' href=''>Followers</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		    ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href=''>Chat</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  \r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		   ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href='UserSettings.jsp'>Settings</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  <li class=\"nav-item\">\r\n");
      out.write("		  ");

		  	if (email != null){
		  		if (company != null){
		  			out.print("<a class='nav-link' href='viewProfile.jsp'>Profile</a>");
		  		}
		  		else{
		  			out.print("<a class='nav-link' href='profile.jsp'>Profile</a>");
		  		}
		  		
		  	}else{
		  		out.print("<a class='nav-link' href='Login.jsp'>Login</a>");
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
		  		if (company != null){
		  			out.print("<a class='nav-link' href='viewProfile.jsp'><img alt='' src='image?id="+id+"' style=' width: 35px; border-radius: 50%; height: 35px;border: 1px solid white;'/></a>");
		  		}
		  		else{
		  			out.print("<a class='nav-link' href='viewProfile.jsp'><img alt='' src='./homecss/img/User-Profile.png'style=' width: 35px; border-radius: 50%; height: 35px;border: 1px solid white;'/></a>");
		  		}
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"container-xl\" style=\"color: white; margin-top: 20px;\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("    	<div class=\"sattingsSectiion\">\r\n");
      out.write("    	\r\n");
      out.write("    		<div class=\"text-center sattingsOptions\">\r\n");
      out.write("    			<a data-bs-toggle=\"collapse\" href=\"#collapseExample\" role=\"button\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\r\n");
      out.write("    				change phone number\r\n");
      out.write("  				</a>\r\n");
      out.write("    		</div>\r\n");
      out.write("    		\r\n");
      out.write("    		<div class=\"text-center sattingsOptions\">\r\n");
      out.write("    			<a data-bs-toggle=\"collapse\" href=\"#collapseExample2\" role=\"button\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\r\n");
      out.write("    				change password \r\n");
      out.write("  				</a>\r\n");
      out.write("    		</div>\r\n");
      out.write("    		\r\n");
      out.write("    		<div class=\"text-center sattingsOptions\">\r\n");
      out.write("    			<a data-bs-toggle=\"collapse\" href=\"#collapseExample3\" role=\"button\" aria-expanded=\"false\" aria-controls=\"collapseExample\">\r\n");
      out.write("    				Change Email \r\n");
      out.write("  				</a>\r\n");
      out.write("    		\r\n");
      out.write("    		</div>\r\n");
      out.write("    		\r\n");
      out.write("    		\r\n");
      out.write("    	</div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("    \r\n");
      out.write("    	<div class=\"collapse\" id=\"collapseExample\" style=\"margin: 5px;\">\r\n");
      out.write("  			<div class=\"card\"  style=\"background-color:#5f5fd13b \">\r\n");
      out.write("    		\r\n");
      out.write("    			<form action=\"\" style=\"margin: 20px;\">\r\n");
      out.write("    			  <div class=\"mb-3 row\">\r\n");
      out.write("					    <label for=\"staticEmail\" class=\"col-sm-2 col-form-label\">Email</label>\r\n");
      out.write("					    <div class=\"col-sm-10\">\r\n");
      out.write("					      <input type=\"text\" readonly class=\"form-control-plaintext\" id=\"staticEmail\" value=\"");
      out.print(email);
      out.write("\" style=\"color: white;\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					  </div>\r\n");
      out.write("					    <div class=\"mb-3 row\">\r\n");
      out.write("			    		<label for=\"exampleInputNumber\" class=\"col-sm-2 col-form-label\">Number</label>\r\n");
      out.write("			    		<div class=\"col-sm-10\">\r\n");
      out.write("					      <input type=\"tel\" class=\"form-control\" id=\"inputNumber\">\r\n");
      out.write("					    </div>\r\n");
      out.write("			    		<br><span class=\"error\" id=\"nom\"></span>\r\n");
      out.write("			  			</div>\r\n");
      out.write("			  			 <div id=\"center\"><button type=\"submit\" class=\"btn btn-primary\" >Change Number</button></div>\r\n");
      out.write("  					</form>\r\n");
      out.write("    			\r\n");
      out.write("    		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"collapse\" id=\"collapseExample2\"  style=\"margin: 5px;\">\r\n");
      out.write("  			<div class=\"card\"  style=\"background-color:#5f5fd13b \">\r\n");
      out.write("    			<form action=\"\" style=\"margin: 20px;\">\r\n");
      out.write("    			\r\n");
      out.write("    				<div class=\"mb-3 row\">\r\n");
      out.write("					    <label for=\"staticEmail\" class=\"col-sm-2 col-form-label\">Email</label>\r\n");
      out.write("					    <div class=\"col-sm-10\">\r\n");
      out.write("					      <input type=\"text\" readonly class=\"form-control-plaintext\" id=\"staticEmail\" value=\"");
      out.print(email);
      out.write("\" style=\"color: white;\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3 row\">\r\n");
      out.write("					    <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Enter new Password</label>\r\n");
      out.write("					    <div class=\"col-sm-10\">\r\n");
      out.write("					      <input type=\"password\" class=\"form-control\" id=\"inputPassword\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					    </div>\r\n");
      out.write("					    \r\n");
      out.write("					    <div class=\"mb-3 row\">\r\n");
      out.write("					    <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Re-enter new password</label>\r\n");
      out.write("					    <div class=\"col-sm-10\">\r\n");
      out.write("					      <input type=\"password\" class=\"form-control\" id=\"inputRepassword\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					    </div>\r\n");
      out.write("					   \r\n");
      out.write("			  			 <div id=\"center\"><button type=\"submit\" class=\"btn btn-primary\" >Change Password</button></div>\r\n");
      out.write("  					</form>\r\n");
      out.write("  				\r\n");
      out.write("    		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"collapse\" id=\"collapseExample3\"  style=\"margin: 5px;\">\r\n");
      out.write("  			<div class=\"card\"  style=\"background-color:#5f5fd13b \">\r\n");
      out.write("    			<form action=\"\" style=\"margin: 20px;\">\r\n");
      out.write("    				<div class=\"mb-3 row\">\r\n");
      out.write("					    <label for=\"staticEmail\" class=\"col-sm-2 col-form-label\">Email</label>\r\n");
      out.write("					    <div class=\"col-sm-10\">\r\n");
      out.write("					      <input type=\"text\" readonly class=\"form-control-plaintext\" id=\"staticEmail\" value=\"");
      out.print(email);
      out.write("\" style=\"color: white;\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3 row\">\r\n");
      out.write("					    <label for=\"inputEmail\" class=\"col-sm-2 col-form-label\">Enter new Email</label>\r\n");
      out.write("					    <div class=\"col-sm-10\">\r\n");
      out.write("					      <input type=\"email\" class=\"form-control\" id=\"inputEmail\">\r\n");
      out.write("					    </div>\r\n");
      out.write("					    </div> \r\n");
      out.write("			  			 <div id=\"center\"><button type=\"submit\" class=\"btn btn-primary\" >Change Email</button></div>\r\n");
      out.write("  					</form>\r\n");
      out.write("  				\r\n");
      out.write("    		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("	\r\n");
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