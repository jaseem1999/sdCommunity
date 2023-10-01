/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-10-01 12:39:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./logincss/style.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".bdy{\r\n");
      out.write(" 	background-color: black;\r\n");
      out.write("    color: white;\r\n");
      out.write(" }\r\n");
      out.write(" .cover{\r\n");
      out.write(" 		background-image: url(\"./logincss/img/bg-stars-1.webp\");\r\n");
      out.write("		background-repeat: no-repeat;\r\n");
      out.write("    	background-position: center;\r\n");
      out.write("    	background-size: cover;\r\n");
      out.write(" }\r\n");
      out.write(".container{\r\n");
      out.write("		margin-top: 50px;\r\n");
      out.write(" 		width: 100%;\r\n");
      out.write("    	height: auto;	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label, input{\r\n");
      out.write("		margin-left: 20px;\r\n");
      out.write("		margin-right: 10px;\r\n");
      out.write("		width: 200px;\r\n");
      out.write("		\r\n");
      out.write("}\r\n");
      out.write("button {\r\n");
      out.write("		margin-left: 20px;\r\n");
      out.write("		margin-right: 10px;\r\n");
      out.write("		width: 200px;\r\n");
      out.write("		\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bdy\">\r\n");
      out.write("<div class=\"cover\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("	\r\n");

			String message = request.getParameter("message");
			if (message != null && message.equals("Failed")){
				out.print("<div class='alert alert-danger' role='alert'>Login Failed...<br>Try again...</div>");
			}else{
				out.print("");
			}

      out.write("\r\n");
      out.write("		\r\n");
      out.write("			  <div class=\"row\">\r\n");
      out.write("			    <div class=\"col\">\r\n");
      out.write("			      <form  action=\"LoginServlet.jsp\">\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputEmail1\"  class=\"form-label\">Email address</label>\r\n");
      out.write("					    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" name=\"email\">\r\n");
      out.write("					    <div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <div class=\"mb-3\">\r\n");
      out.write("					    <label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("					    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"password\">\r\n");
      out.write("					  </div>\r\n");
      out.write("					  <button type=\"submit\" class=\"btn btn-success\">Login</button><a class=\"btn btn-primary\" href=\"signup.jsp\">Sign up</a>\r\n");
      out.write("				 </form>\r\n");
      out.write("			      \r\n");
      out.write("			    </div>\r\n");
      out.write("			    <div class=\"col\">\r\n");
      out.write("			 	 	<img alt=\"\" src=\"./logincss/img/socialNetwork.png\">\r\n");
      out.write("			    </div>\r\n");
      out.write("			   </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</div>    \r\n");
      out.write(" 	\r\n");
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
