/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-12-04 09:55:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sdCommunity.admin.adv.ProductDAO;
import sdCommunity.admin.adv.ReqProductDTO;
import java.util.List;

public final class AdvSign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("sdCommunity.admin.adv.ReqProductDTO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("sdCommunity.admin.adv.ProductDAO");
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
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Advertisement Agency</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("	background-color: black;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
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
      out.write("#adsBox{\r\n");
      out.write("		height: 700px;\r\n");
      out.write("	}\r\n");
      out.write("	.w-100{\r\n");
      out.write("		height: 400px;\r\n");
      out.write("		width: 300px;\r\n");
      out.write("	}\r\n");
      out.write("	.pName{\r\n");
      out.write("		text-align: center;\r\n");
      out.write("    	font-size: 25px;\r\n");
      out.write("    	font-weight: 900;\r\n");
      out.write("    	color: cyan;\r\n");
      out.write("    	margin: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	.cName{\r\n");
      out.write("		position: relative;\r\n");
      out.write("    	font-size: 15px;\r\n");
      out.write("    	margin-right: 30px;\r\n");
      out.write("    	left: 70%;\r\n");
      out.write("    	color: #6c757d;\r\n");
      out.write("    	font-style: italic;\r\n");
      out.write("	}\r\n");
      out.write("	.priceName{\r\n");
      out.write("		position: relative;\r\n");
      out.write("    	font-size: 60px;\r\n");
      out.write("    	margin-right: 30px;\r\n");
      out.write("    	left: 10%;\r\n");
      out.write("    	color: #4cc600;\r\n");
      out.write("    	margin-top: -64px;\r\n");
      out.write("	}\r\n");
      out.write("	.oName{\r\n");
      out.write("		position: relative;\r\n");
      out.write("	    font-size: 30px;\r\n");
      out.write("	    margin-right: 30px;\r\n");
      out.write("	    left: 43%;\r\n");
      out.write("	    color: #ff1616;\r\n");
      out.write("	    margin-top: -36px;\r\n");
      out.write("	}\r\n");
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
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("      <nav class=\"nav\">\r\n");
      out.write("        <a href=\"/\" class=\"logo\"><img alt=\"logo\" src=\"./img/logo.png\" width=\"60px\"/></a>\r\n");
      out.write("		<span style=\"font-family:fantasy; font-size: large;position: absolute;left: 50px;\">sdCommunity Developed For Advertisement Agency</span>\r\n");
      out.write("        <div class=\"hamburger\">\r\n");
      out.write("          <span class=\"line\"></span>\r\n");
      out.write("          <span class=\"line\"></span>\r\n");
      out.write("          <span class=\"line\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"nav__link hide\">\r\n");
      out.write("          <a href=\"index.jsp\">home</a>\r\n");
      out.write("          <a href=\"AdvLogin.jsp\">Login</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    ");

						String message = request.getParameter("message");
						if (message != null && message.equals("Failed")){
							out.print("<div class='alert alert-danger' role='alert'>Sign Up Failed...<br>Try again...</div>");
						}else if(message != null && message.equals("Success")){
							out.print("<div class='alert alert-success' role='alert'>Sign Up Successfully...<br>");
							out.print("<a class='btn btn-primary' aria-current='page'  href='AdvLogin.jsp'>");
						    out.print("Login</a> </div>");
						}else{
							out.print("");
						}
	
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("	    	<div class=\"col\">\r\n");
      out.write("			    <form action=\"AdvAddSign.jsp\" method=\"post\" onsubmit=\"return validation()\" style=\"color: white;\" >\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\r\n");
      out.write("					    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" name=\"email\" aria-describedby=\"emailHelp\" required=\"required\">\r\n");
      out.write("					    <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\r\n");
      out.write("					    <span id=\"eml\" style=\"color: red\"></span>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputAgName\" class=\"form-label\">Agency name</label>\r\n");
      out.write("					    <input type=\"text\" class=\"form-control\" id=\"exampleInputAgName\" name=\"AgName\" aria-describedby=\"agNameHelp\" required=\"required\">\r\n");
      out.write("					    <span id=\"agNa\" style=\"color: red\"></span>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputName\" class=\"form-label\">Account owner name</label>\r\n");
      out.write("					    <input type=\"text\" class=\"form-control\" id=\"exampleInputName\" name=\"name\" aria-describedby=\"nameHelp\" required=\"required\">\r\n");
      out.write("					    <span id=\"usn\" style=\"color: red\"></span>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputNumber\" class=\"form-label\">Phone number</label>\r\n");
      out.write("					    <input type=\"tel\" class=\"form-control\" id=\"exampleInputNumber\" name=\"number\" aria-describedby=\"numberHelp\" required=\"required\">\r\n");
      out.write("					    <span id=\"noe\" style=\"color: red\"></span>\r\n");
      out.write("					    <span id=\"nos\" style=\"color: green\"></span>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("					    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"pass\" required=\"required\">\r\n");
      out.write("					    <span id=\"psw\" style=\"color:red\"></span>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputrepassword1\" class=\"form-label\">Re-Password</label>\r\n");
      out.write("					    <input type=\"password\" class=\"form-control\" id=\"exampleInputrepassword1\" required=\"required\">\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <button type=\"submit\" class=\"btn btn-primary\">Sign up</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col\">\r\n");
      out.write("				<div id=\"carouselExampleSlidesOnly\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("					  <div class=\"carousel-inner\" id=\"adsBox\">\r\n");
      out.write("					    ");

					    List<ReqProductDTO> pr = ProductDAO.getAllAcceptProduct();
					    for(int i = 0; i < pr.size(); i++){
					    	ReqProductDTO p = pr.get(i);
					    
      out.write("\r\n");
      out.write("					    \r\n");
      out.write("					    <div class=\"carousel-item ");
      out.print( i == 0 ? "active" : "" );
      out.write("\" id=\"adsBox\">\r\n");
      out.write("						    <img class=\"d-block w-100\" src=\"adim?id=");
      out.print(p.getTid());
      out.write("\" alt=\"Third slide\">\r\n");
      out.write("						    <p class=\"pName\">");
      out.print(p.getpName() );
      out.write("</p>\r\n");
      out.write("						    <p class=\"cName\">");
      out.print(p.getCompany() );
      out.write("</p>\r\n");
      out.write("						    <p class=\"priceName\">\r\n");
      out.write("						        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"50\" height=\"50\" fill=\"currentColor\"\r\n");
      out.write("						            class=\"bi bi-tags-fill\" viewBox=\"0 0 16 16\">\r\n");
      out.write("						            <path\r\n");
      out.write("						                d=\"M2 2a1 1 0 0 1 1-1h4.586a1 1 0 0 1 .707.293l7 7a1 1 0 0 1 0 1.414l-4.586 4.586a1 1 0 0 1-1.414 0l-7-7A1 1 0 0 1 2 6.586V2zm3.5 4a1.5 1.5 0 1 0 0-3 1.5 1.5 0 0 0 0 3z\" />\r\n");
      out.write("						            <path\r\n");
      out.write("						                d=\"M1.293 7.793A1 1 0 0 1 1 7.086V2a1 1 0 0 0-1 1v4.586a1 1 0 0 0 .293.707l7 7a1 1 0 0 0 1.414 0l.043-.043-7.457-7.457z\" />\r\n");
      out.write("						        </svg>\r\n");
      out.write("						        ");
      out.print(p.getPrice() );
      out.write("</p>\r\n");
      out.write("						    <p class=\"oName\">");
      out.print(p.getPrice() - p.getOffer() );
      out.write(" offer price</p>\r\n");
      out.write("						    <div style=\"text-align: center;\">\r\n");
      out.write("						        <a href=\"\" class=\"btn btn-success\">goto</a>\r\n");
      out.write("						    </div>\r\n");
      out.write("						</div>\r\n");
      out.write("					    ");
} 
      out.write("\r\n");
      out.write("					  </div>\r\n");
      out.write("					</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("const hamburger = document.querySelector('.hamburger');\r\n");
      out.write("const navLink = document.querySelector('.nav__link');\r\n");
      out.write("\r\n");
      out.write("hamburger.addEventListener('click', () => {\r\n");
      out.write("  navLink.classList.toggle('hide');\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function validation() {\r\n");
      out.write("    let email = document.getElementById(\"exampleInputEmail1\").value;\r\n");
      out.write("    let user = document.getElementById(\"exampleInputName\").value;\r\n");
      out.write("    let agName = document.getElementById(\"exampleInputAgName\").value;\r\n");
      out.write("    let num = document.getElementById(\"exampleInputNumber\").value;\r\n");
      out.write("    let pass = document.getElementById(\"exampleInputPassword1\").value;\r\n");
      out.write("    let rpass = document.getElementById(\"exampleInputrepassword1\").value;\r\n");
      out.write("    var phoneNumberRegex = /^\\d{3}-\\d{3}-\\d{4}$/;\r\n");
      out.write("    let status = true;\r\n");
      out.write("    if (!(email.includes(\"@\") && email.includes(\".\"))) {\r\n");
      out.write("        document.getElementById(\"eml\").innerHTML = \"Please enter a valid email\";\r\n");
      out.write("        status = false;\r\n");
      out.write("    } else {\r\n");
      out.write("        document.getElementById(\"eml\").innerHTML = \"\"; // Clear error message\r\n");
      out.write("    }\r\n");
      out.write("    if (/\\d/.test(user)) {\r\n");
      out.write("        document.getElementById(\"usn\").innerHTML = \"Please enter valid name, don't use numbers\";\r\n");
      out.write("        status = false;\r\n");
      out.write("    } else {\r\n");
      out.write("        document.getElementById(\"usn\").innerHTML = \"\"; // Clear error message\r\n");
      out.write("    }\r\n");
      out.write("    if (/\\d/.test(agName)) {\r\n");
      out.write("        document.getElementById(\"agNa\").innerHTML = \"Please enter agency name\";\r\n");
      out.write("        status = false;\r\n");
      out.write("    } else {\r\n");
      out.write("        document.getElementById(\"agNa\").innerHTML = \"\"; // Clear error message\r\n");
      out.write("    }\r\n");
      out.write("    function isValidPhoneNumber(num) {\r\n");
      out.write("        return /^\\d{10}$/.test(num);\r\n");
      out.write("    }\r\n");
      out.write("    if (isValidPhoneNumber(num)) {\r\n");
      out.write("    	document.getElementById(\"nos\").innerHTML = \"valid number\";\r\n");
      out.write("    } else {\r\n");
      out.write("    	document.getElementById(\"noe\").innerHTML = \"Please enter valid number\";\r\n");
      out.write("    	status = false;\r\n");
      out.write("    }\r\n");
      out.write("    if (pass !== rpass) {\r\n");
      out.write("        document.getElementById(\"psw\").innerHTML = \"Passwords do not match\";\r\n");
      out.write("        status = false;\r\n");
      out.write("    } else if (!(pass.length >= 6 && /[a-z]/.test(pass) && /[A-Z]/.test(pass) && /\\d/.test(pass) && /[^a-zA-Z\\d]/.test(pass))) {\r\n");
      out.write("        document.getElementById(\"psw\").innerHTML = \"Password must be strong (use A-Z, a-z, 0-9, special character, and be at least 6 characters long)\";\r\n");
      out.write("      	status = false;\r\n");
      out.write("    } else {\r\n");
      out.write("        document.getElementById(\"psw\").innerHTML = \"\"; // Clear error message\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    return status;\r\n");
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
