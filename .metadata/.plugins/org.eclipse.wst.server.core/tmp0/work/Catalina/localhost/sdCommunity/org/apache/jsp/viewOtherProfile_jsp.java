/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-10-01 12:17:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import sdCommunity.conn.Conn;
import sdCommunity.user.post.userDTO;
import sdCommunity.user.post.DTOothers;
import sdCommunity.user.post.DTOpost;
import java.util.List;
import sdCommunity.user.post.DAOPost;

public final class viewOtherProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("sdCommunity.user.post.userDTO");
    _jspx_imports_classes.add("sdCommunity.user.post.DTOpost");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("sdCommunity.conn.Conn");
    _jspx_imports_classes.add("sdCommunity.user.post.DTOothers");
    _jspx_imports_classes.add("sdCommunity.user.post.DAOPost");
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


Integer id =(Integer)session.getAttribute("uid");
String fname=(String)session.getAttribute("fname"); 
String lname=(String)session.getAttribute("lname"); 
String email=(String)session.getAttribute("email");
long num=(Long)session.getAttribute("num");
String company = (String) session.getAttribute("company");
String github = (String) session.getAttribute("github");
String linkedin = (String) session.getAttribute("linkedin");
String website = (String) session.getAttribute("website");
String nation = (String) session.getAttribute("nation");
String gender = (String) session.getAttribute("gender");
String about = (String) session.getAttribute("about");
String college = (String) session.getAttribute("college");
String position = (String) session.getAttribute("position");
String suid = request.getParameter("id");
int pid =0;


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>profile</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./homecss/style.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".fistPartOfProfileMain{\r\n");
      out.write("	background: white;\r\n");
      out.write("	border: 3px solid white;\r\n");
      out.write("}\r\n");
      out.write(".fistPartOfProfile{\r\n");
      out.write("	background-image: url(\"./signupcss/img/social-network.png\");\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    height: 250px;\r\n");
      out.write("}\r\n");
      out.write(".smallAbout{\r\n");
      out.write("	margin-left: 15px;\r\n");
      out.write("    line-height: 30.4px;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("#center{\r\n");
      out.write("	left: calc(50% - 185px);\r\n");
      out.write("}\r\n");
      out.write(".code{\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("	margin-left: 30px;\r\n");
      out.write("	width:90%;\r\n");
      out.write("	height: auto;\r\n");
      out.write("	background: #f8f9fa;\r\n");
      out.write("	color: #7d8694;\r\n");
      out.write("	border: 2px solid gray;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("	font-family: 'Courier New', monospace;\r\n");
      out.write("}\r\n");
      out.write(".code pre{\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("	margin-left: 20px;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write(".codeHeading{\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 45px;\r\n");
      out.write("	border: 1px solid #0000001c;\r\n");
      out.write("}\r\n");
      out.write(".codeHeading p{\r\n");
      out.write("	width: 70px;\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".center{\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-bottom: 20px; \r\n");
      out.write("}\r\n");
      out.write(".btnn{\r\n");
      out.write("	background: transparent;\r\n");
      out.write("	color: white;\r\n");
      out.write("	margin: 5px;\r\n");
      out.write("}\r\n");
      out.write(".copyBtn{\r\n");
      out.write("	background: #d5d5df;\r\n");
      out.write("}\r\n");
      out.write(".copyBtn:hover{\r\n");
      out.write("	background: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: black; color: white;\">\r\n");
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
      out.write("\r\n");
      out.write("	<ul class=\"nav justify-content-end \">\r\n");
      out.write("		<li class=\"nav-item\">\r\n");
      out.write("		    	<a class='nav-link' href='UserHome.jsp'>Home</a>\r\n");
      out.write("		  </li>\r\n");
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
		  		out.print("<a class='nav-link' data-bs-toggle='modal' data-bs-target='#exampleModal'>Settings</a>");
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
      out.write("	<div class=\"fistPartOfProfileMain\">\r\n");
      out.write("	<div class=\"fistPartOfProfile\">\r\n");
      out.write("		<div class=\"container-xl\">\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"container hbdy\" style=\"margin-top: 10px; background: #5f5fd13b;\">\r\n");
      out.write("		<img alt=\"\" src=\"image?id=");
      out.print(suid);
      out.write("\" style=\"width:150px;height:150px ; border-radius: 50%; margin-top: -100px; border: 5px solid white; \">	\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("		<div class=\"col\">\r\n");
      out.write("		");

		Conn con= new Conn();
		Connection conn =con.connection;
		int ouid =0;
		String ofname= null;
		String olname= null;
		String ocompany= null;
		String ocollege= null;
		String oposition= null;
		String ogithub= null;
		String olinkedin= null;
		String owebsite= null;
		String oemail= null;
		long onum=0;
		String oabout= null;
		String onationality= null;
		String ogender= null;
		try {
			String sql = "select u.userId,u.fname,u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender from user u join user_info ui on u.userId = ui.uid where ui.uid="+suid+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				
				ouid=rs.getInt(1);
				ofname=rs.getString(2);
				olname=rs.getString(3);
				oemail=rs.getString(4);
				onum=rs.getLong(5);
				oabout=rs.getString(6);
				ocompany=rs.getString(7);
				ocollege=rs.getString(8);
				oposition=rs.getString(9);
				ogithub=rs.getString(10);
				olinkedin=rs.getString(11);
				owebsite=rs.getString(12);
				onationality=rs.getString(13);
				ogender=rs.getString(14);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
      out.write("\r\n");
      out.write("				\r\n");
      out.write("			<div style=\"margin: 10px; text-transform: uppercase; font-size: 1.4rem; font-weight: bold; line-height: 1.25rem;\">");
      out.print(ofname);
      out.write(' ');
      out.print(olname );
      out.write("\r\n");
      out.write("			");

		 		
		 			out.print("<span class='smallAbout' style='font-size: small;'>("+onationality+"),("+ogender+")</span><br> ");
		 		
			
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			");

				
					out.print("<span class='smallAbout' style='width :600px;'>"+oabout+"</span><br>");
				
			
      out.write("\r\n");
      out.write("			<hr>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col\">\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-briefcase-fill\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path d=\"M6.5 1A1.5 1.5 0 0 0 5 2.5V3H1.5A1.5 1.5 0 0 0 0 4.5v1.384l7.614 2.03a1.5 1.5 0 0 0 .772 0L16 5.884V4.5A1.5 1.5 0 0 0 14.5 3H11v-.5A1.5 1.5 0 0 0 9.5 1h-3zm0 1h3a.5.5 0 0 1 .5.5V3H6v-.5a.5.5 0 0 1 .5-.5z\"/>\r\n");
      out.write("  					<path d=\"M0 12.5A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5V6.85L8.129 8.947a.5.5 0 0 1-.258 0L0 6.85v5.65z\"/>\r\n");
      out.write("				</svg>\r\n");
      out.write("				</svg>	\r\n");
      out.write("				");

					
						out.print("<span class='smallAbout'>"+oposition+"</span>");
						out.print("<br><hr>");
					
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-building\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path d=\"M4 2.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3 0a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3.5-.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1ZM4 5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1ZM7.5 5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Zm2.5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1ZM4.5 8a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Zm2.5.5a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-1a.5.5 0 0 1-.5-.5v-1Zm3.5-.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h1a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-1Z\"/>\r\n");
      out.write("  					<path d=\"M2 1a1 1 0 0 1 1-1h10a1 1 0 0 1 1 1v14a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V1Zm11 0H3v14h3v-2.5a.5.5 0 0 1 .5-.5h3a.5.5 0 0 1 .5.5V15h3V1Z\"/>\r\n");
      out.write("				</svg>	\r\n");
      out.write("				");
 
					
						out.print("<span class='smallAbout'>"+ocompany+"</span>");
						out.print("<br><hr>");
					
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-backpack2\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path d=\"M4.04 7.43a4 4 0 0 1 7.92 0 .5.5 0 1 1-.99.14 3 3 0 0 0-5.94 0 .5.5 0 1 1-.99-.14Z\"/>\r\n");
      out.write("  					<path fill-rule=\"evenodd\" d=\"M4 9.5a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 .5.5v4a.5.5 0 0 1-.5.5h-7a.5.5 0 0 1-.5-.5v-4Zm1 .5v3h6v-3h-1v.5a.5.5 0 0 1-1 0V10H5Z\"/>\r\n");
      out.write("  					<path d=\"M6 2.341V2a2 2 0 1 1 4 0v.341c2.33.824 4 3.047 4 5.659v1.191l1.17.585a1.5 1.5 0 0 1 .83 1.342V13.5a1.5 1.5 0 0 1-1.5 1.5h-1c-.456.607-1.182 1-2 1h-7a2.497 2.497 0 0 1-2-1h-1A1.5 1.5 0 0 1 0 13.5v-2.382a1.5 1.5 0 0 1 .83-1.342L2 9.191V8a6.002 6.002 0 0 1 4-5.659ZM7 2v.083a6.04 6.04 0 0 1 2 0V2a1 1 0 0 0-2 0ZM3 13.5A1.5 1.5 0 0 0 4.5 15h7a1.5 1.5 0 0 0 1.5-1.5V8A5 5 0 0 0 3 8v5.5Zm-1-3.19-.724.362a.5.5 0 0 0-.276.447V13.5a.5.5 0 0 0 .5.5H2v-3.691Zm12 0V14h.5a.5.5 0 0 0 .5-.5v-2.382a.5.5 0 0 0-.276-.447L14 10.309Z\"/>\r\n");
      out.write("				</svg>\r\n");
      out.write("				");
 
					
						out.print("<span class='smallAbout'>"+ocollege+"</span>");
						out.print("<br><hr>");
					
				
      out.write("\r\n");
      out.write("							\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("    	</div>\r\n");
      out.write("    	<div class=\"row\">	\r\n");
      out.write("    		<div class=\"col-6 col-md-4\">\r\n");
      out.write("    			\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-envelope\" viewBox=\"0 0 16 16\">\r\n");
      out.write("		  			<path d=\"M0 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V4Zm2-1a1 1 0 0 0-1 1v.217l7 4.2 7-4.2V4a1 1 0 0 0-1-1H2Zm13 2.383-4.708 2.825L15 11.105V5.383Zm-.034 6.876-5.64-3.471L8 9.583l-1.326-.795-5.64 3.47A1 1 0 0 0 2 13h12a1 1 0 0 0 .966-.741ZM1 11.105l4.708-2.897L1 5.383v5.722Z\"/>\r\n");
      out.write("				</svg><span class=\"smallAbout\">");
      out.print(oemail);
      out.write("</span>\r\n");
      out.write("				\r\n");
      out.write("				<br>\r\n");
      out.write("				<hr>\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-phone-fill\" viewBox=\"0 0 16 16\">\r\n");
      out.write("		  			<path d=\"M3 2a2 2 0 0 1 2-2h6a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V2zm6 11a1 1 0 1 0-2 0 1 1 0 0 0 2 0z\"/>\r\n");
      out.write("				</svg>\r\n");
      out.write("				\r\n");
      out.write("				");
 
				
						out.print("<span class='smallAbout'>"+onum+"</span>");
						out.print("<br><hr>");
					
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-github\" viewBox=\"0 0 16 16\">\r\n");
      out.write("		  			<path d=\"M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.012 8.012 0 0 0 16 8c0-4.42-3.58-8-8-8z\"/>\r\n");
      out.write("				</svg>\r\n");
      out.write("	\r\n");
      out.write("				");
 
						out.print("<span class='smallAbout'><a href='"+ogithub+"'>GitHub</a></span>");
						out.print("<br><hr>");
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-linkedin\" viewBox=\"0 0 16 16\">\r\n");
      out.write("		  			<path d=\"M0 1.146C0 .513.526 0 1.175 0h13.65C15.474 0 16 .513 16 1.146v13.708c0 .633-.526 1.146-1.175 1.146H1.175C.526 16 0 15.487 0 14.854V1.146zm4.943 12.248V6.169H2.542v7.225h2.401zm-1.2-8.212c.837 0 1.358-.554 1.358-1.248-.015-.709-.52-1.248-1.342-1.248-.822 0-1.359.54-1.359 1.248 0 .694.521 1.248 1.327 1.248h.016zm4.908 8.212V9.359c0-.216.016-.432.08-.586.173-.431.568-.878 1.232-.878.869 0 1.216.662 1.216 1.634v3.865h2.401V9.25c0-2.22-1.184-3.252-2.764-3.252-1.274 0-1.845.7-2.165 1.193v.025h-.016a5.54 5.54 0 0 1 .016-.025V6.169h-2.4c.03.678 0 7.225 0 7.225h2.4z\"/>\r\n");
      out.write("				</svg>\r\n");
      out.write("				\r\n");
      out.write("				");
 
					
						out.print("<span class='smallAbout'><a href='"+olinkedin+"'>LinkedIn</a></span>");
						out.print("<br><hr>");
					
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-browser-chrome\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  					<path fill-rule=\"evenodd\" d=\"M16 8a8.001 8.001 0 0 1-7.022 7.94l1.902-7.098a2.995 2.995 0 0 0 .05-1.492A2.977 2.977 0 0 0 10.237 6h5.511A8 8 0 0 1 16 8ZM0 8a8 8 0 0 0 7.927 8l1.426-5.321a2.978 2.978 0 0 1-.723.255 2.979 2.979 0 0 1-1.743-.147 2.986 2.986 0 0 1-1.043-.7L.633 4.876A7.975 7.975 0 0 0 0 8Zm5.004-.167L1.108 3.936A8.003 8.003 0 0 1 15.418 5H8.066a2.979 2.979 0 0 0-1.252.243 2.987 2.987 0 0 0-1.81 2.59ZM8 10a2 2 0 1 0 0-4 2 2 0 0 0 0 4Z\"/>\r\n");
      out.write("				</svg>\r\n");
      out.write("				");
 
					
						out.print("<span class='smallAbout'><a href='"+owebsite+"'>website</a></span>");
						out.print("<br><hr>");
					
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("			\r\n");
      out.write("    		</div>\r\n");
      out.write("    		<div class=\"col-md-8\">\r\n");
      out.write("    			");

					response.setContentType("text/html");
					List<DTOothers> p2= DAOPost.getOtherProfile(suid);
					
				
      out.write("\r\n");
      out.write("			");
 for(DTOothers p : p2){ 
					
			
      out.write("\r\n");
      out.write("			    \r\n");
      out.write("			    <div style=\"background-color: #6699c130;\">\r\n");
      out.write("			    \r\n");
      out.write("			    	\r\n");
      out.write("			      	<div class=\"\" style=\"color: white; max-width: 100%; margin-left: 20px; margin-top: 10px;\" id=\"center\">\r\n");
      out.write("						  <img src=\"poimg?id=");
      out.print(p.getPostId());
      out.write("\" style=\"width : 100%; height: 200px;\" alt=\"...\">\r\n");
      out.write("						  <img style=\"width: 50px; height: 50px; border-radius: 50%; margin-top: 5px; margin-left: 10px;border: 2px solid; \" alt=\"\" src=\"image?id=");
      out.print(ouid);
      out.write("\">\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("							    <h5 class=\"\" style=\"text-align: center; margin: 10px;\">");
      out.print(p.getHeading());
      out.write("</h5>   	\r\n");
      out.write("							    	<p class=\"card-text\" style=\"margin: 30px;\">");
      out.print(p.getPost());
      out.write("</p>\r\n");
      out.write("							    	<a href=\"");
      out.print(p.getLink() );
      out.write("\" class=\"btn-primary\" style=\"margin-left: 30px;\">");
      out.print(p.getLink() );
      out.write("</a>\r\n");
      out.write("									<div class=\"code\">	\r\n");
      out.write("										<div class=\"codeHeading\">\r\n");
      out.write("											<p>Code</p>\r\n");
      out.write("											<button class=\"copyBtn\" onclick=\"copyToClipboard()\" style=\"position: relative; left:70px; top: -38px\">\r\n");
      out.write("											<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-clipboard\" viewBox=\"0 0 16 16\">\r\n");
      out.write("  													<path d=\"M4 1.5H3a2 2 0 0 0-2 2V14a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V3.5a2 2 0 0 0-2-2h-1v1h1a1 1 0 0 1 1 1V14a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V3.5a1 1 0 0 1 1-1h1v-1z\"/>\r\n");
      out.write("													 <path d=\"M9.5 1a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5h-3a.5.5 0 0 1-.5-.5v-1a.5.5 0 0 1 .5-.5h3zm-3-1A1.5 1.5 0 0 0 5 1.5v1A1.5 1.5 0 0 0 6.5 4h3A1.5 1.5 0 0 0 11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3z\"/>\r\n");
      out.write("											</svg></button>\r\n");
      out.write("										</div>				    \r\n");
      out.write("							    	 	<pre id=\"copy\">");
      out.print(p.getCode());
      out.write("</pre>\r\n");
      out.write("							    	 </div>\r\n");
      out.write("							    	 <div class=\"center\">\r\n");
      out.write("							    	 	<a  class=\"btn btn-primary btnn\" aria-current=\"page\"  href=\"\">Go To Check</a>\r\n");
      out.write("							    	 	<a  class=\"btn btn-primary btnn\"  aria-current=\"page\"  href=\"\">\r\n");
      out.write("								    	 	<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-hand-thumbs-up\" viewBox=\"0 0 16 16\">\r\n");
      out.write("											  <path d=\"M8.864.046C7.908-.193 7.02.53 6.956 1.466c-.072 1.051-.23 2.016-.428 2.59-.125.36-.479 1.013-1.04 1.639-.557.623-1.282 1.178-2.131 1.41C2.685 7.288 2 7.87 2 8.72v4.001c0 .845.682 1.464 1.448 1.545 1.07.114 1.564.415 2.068.723l.048.03c.272.165.578.348.97.484.397.136.861.217 1.466.217h3.5c.937 0 1.599-.477 1.934-1.064a1.86 1.86 0 0 0 .254-.912c0-.152-.023-.312-.077-.464.201-.263.38-.578.488-.901.11-.33.172-.762.004-1.149.069-.13.12-.269.159-.403.077-.27.113-.568.113-.857 0-.288-.036-.585-.113-.856a2.144 2.144 0 0 0-.138-.362 1.9 1.9 0 0 0 .234-1.734c-.206-.592-.682-1.1-1.2-1.272-.847-.282-1.803-.276-2.516-.211a9.84 9.84 0 0 0-.443.05 9.365 9.365 0 0 0-.062-4.509A1.38 1.38 0 0 0 9.125.111L8.864.046zM11.5 14.721H8c-.51 0-.863-.069-1.14-.164-.281-.097-.506-.228-.776-.393l-.04-.024c-.555-.339-1.198-.731-2.49-.868-.333-.036-.554-.29-.554-.55V8.72c0-.254.226-.543.62-.65 1.095-.3 1.977-.996 2.614-1.708.635-.71 1.064-1.475 1.238-1.978.243-.7.407-1.768.482-2.85.025-.362.36-.594.667-.518l.262.066c.16.04.258.143.288.255a8.34 8.34 0 0 1-.145 4.725.5.5 0 0 0 .595.644l.003-.001.014-.003.058-.014a8.908 8.908 0 0 1 1.036-.157c.663-.06 1.457-.054 2.11.164.175.058.45.3.57.65.107.308.087.67-.266 1.022l-.353.353.353.354c.043.043.105.141.154.315.048.167.075.37.075.581 0 .212-.027.414-.075.582-.05.174-.111.272-.154.315l-.353.353.353.354c.047.047.109.177.005.488a2.224 2.224 0 0 1-.505.805l-.353.353.353.354c.006.005.041.05.041.17a.866.866 0 0 1-.121.416c-.165.288-.503.56-1.066.56z\"/>\r\n");
      out.write("											</svg>\r\n");
      out.write("										</a>\r\n");
      out.write("							    	 </div>\r\n");
      out.write("						  </div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<hr style=\"color: white; border: 3px solid;\">\r\n");
      out.write("					 ");
} 
      out.write("\r\n");
      out.write("			    </div>\r\n");
      out.write("    		</div>\r\n");
      out.write("  		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	function copyToClipboard() {\r\n");
      out.write("	    var copyText = document.getElementById(\"copy\");\r\n");
      out.write("	    var range = document.createRange();\r\n");
      out.write("	    range.selectNode(copyText);\r\n");
      out.write("	    window.getSelection().removeAllRanges();\r\n");
      out.write("	    window.getSelection().addRange(range);\r\n");
      out.write("	    document.execCommand(\"copy\");\r\n");
      out.write("	    window.getSelection().removeAllRanges();\r\n");
      out.write("	    alert(\"Code copied to clipboard\");\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
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
