/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-09-30 06:29:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Base64;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import sdCommunity.user.login.userDTO;
import sdCommunity.user.login.userDAO;
import java.sql.Blob;

public final class LoginServlet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.io.OutputStream");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.io.ByteArrayOutputStream");
    _jspx_imports_classes.add("java.awt.image.BufferedImage");
    _jspx_imports_classes.add("sdCommunity.user.login.userDTO");
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("sdCommunity.user.login.userDAO");
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.util.Base64");
    _jspx_imports_classes.add("java.io.ByteArrayInputStream");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("javax.imageio.ImageIO");
    _jspx_imports_classes.add("java.sql.Blob");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

String email =request.getParameter("email");
String pass =request.getParameter("password");
userDAO user= new userDAO();
int i =user.login(email, pass);
userDTO dto = new userDTO();
int sid =0;
String sfname=null;
String slname=null;
String smail=null;
String spass= null;
long snum=0;

int spid=0;
byte[] simg = null;
String sabout=null;
String scollege=null;
String sposition=null;
String scompany=null;
String sgithub = null;
String slinkedin = null;
String snational = null;
String sgender = null;
String swebsite = null;
int sfpuid = 0;


try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity","root", "Love1999@MySQL");
	PreparedStatement stm =con.prepareStatement("select * from user where  email='"+email+"' and password='"+pass+"';");
	ResultSet rs=stm.executeQuery();
	while(rs.next()) {
		sid = rs.getInt(1);
		sfname=rs.getString(2);
		slname=rs.getString(3);
		smail=rs.getString(4);
		spass=rs.getString(5);
		snum=rs.getLong(6);
		
	}
	
	
	
	
	
} catch (Exception e) {
	
}



if (i > 0) {
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity","root", "Love1999@MySQL");
	
	PreparedStatement stm =con.prepareStatement("select * from user_info where uid="+sid+";");
	ResultSet rs=stm.executeQuery();
	while(rs.next()) {
		spid = rs.getInt(1);
		
		try {
	        Blob blob = rs.getBlob("image");
	        byte byteArray[] = blob.getBytes(2, (int) blob.length());
	        
	      
	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Handle the exception
	    }
		sabout=rs.getString(3);
		scompany=rs.getString(4);
		scollege=rs.getString(5);
		sposition=rs.getString(6);
		sgithub=rs.getString(7);
		slinkedin=rs.getString(8);
		snational=rs.getString(9);
		sgender=rs.getString(10);
		swebsite=rs.getString(11);
		sfpuid=rs.getInt(12);
		
	}
	}catch(Exception e){
		
	}
	

	session.setAttribute("uid", sid);
	session.setAttribute("email", smail);
	session.setAttribute("fname", sfname);
	session.setAttribute("lname", slname);
	session.setAttribute("num",snum);
	session.setAttribute("pid", spid);
	session.setAttribute("company", scompany);
	session.setAttribute("about", sabout);
	session.setAttribute("college", scollege);
	session.setAttribute("position", sposition);
	session.setAttribute("github", sgithub);
	session.setAttribute("linkedin", slinkedin);
	session.setAttribute("nation", snational);
	session.setAttribute("gender", sgender);
	session.setAttribute("website", swebsite);
    response.sendRedirect("UserHome.jsp");
} else {
    response.sendRedirect("Login.jsp?message=Failed");
}


      out.write("\r\n");
      out.write("\r\n");
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
