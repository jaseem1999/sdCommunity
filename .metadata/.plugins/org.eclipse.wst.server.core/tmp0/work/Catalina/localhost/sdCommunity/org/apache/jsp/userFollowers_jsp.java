/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-10-05 17:28:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sdCommunity.user.post.DAOPost;
import sdCommunity.user.details.DAODetails;
import sdCommunity.user.details.DTOFollower;
import sdCommunity.user.details.DTOusers;
import java.util.List;
import sdCommunity.user.details.DAOuser;
import sdCommunity.user.post.DTOothers;

public final class userFollowers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("sdCommunity.user.details.DAOuser");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("sdCommunity.user.details.DTOusers");
    _jspx_imports_classes.add("sdCommunity.user.details.DAODetails");
    _jspx_imports_classes.add("sdCommunity.user.details.DTOFollower");
    _jspx_imports_classes.add("sdCommunity.user.post.DAOPost");
    _jspx_imports_classes.add("sdCommunity.user.post.DTOothers");
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
      out.write("    \r\n");

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
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Followers</title>\r\n");
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
      out.write(".likProfile img:hover {\r\n");
      out.write("	border: 3px solid white;\r\n");
      out.write("	width: 55px;\r\n");
      out.write("	height: 55px;\r\n");
      out.write("}\r\n");
      out.write("td,th{\r\n");
      out.write("	min-width: 130px;\r\n");
      out.write("}\r\n");
      out.write("header h4 {\r\n");
      out.write("  font-size: 70px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  background-image: linear-gradient(to left, #553c9a, #b393d3);\r\n");
      out.write("  color: transparent;\r\n");
      out.write("  background-clip: text;\r\n");
      out.write("  -webkit-background-clip: text;\r\n");
      out.write("}\r\n");
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
      out.write("			<li class=\"nav-item\" >\r\n");
      out.write("		    	<a class='nav-link' style=\"padding: 0px;\" href='UserHome.jsp'><img src=\"./img/logo.png\" alt=\"\" width=\"50px\"></a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\">\r\n");
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
      out.write("	<div class=\"container-xl\" id=\"ref\" style=\"color: white; margin-top: 20px;\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col\"  style=\"text-align: center;\">\r\n");
      out.write("				<header>\r\n");
      out.write("        			<h4>Followers</h4>\r\n");
      out.write("    			</header>\r\n");
      out.write("				");

				List<DTOFollower> liFollowed = DAOuser.folowed(id);
				for(DTOFollower flr : liFollowed)
				{
				
      out.write("\r\n");
      out.write("					<table class=\"table\">\r\n");
      out.write("					<tbody>\r\n");
      out.write("					<tr style=\"color: white\">\r\n");
      out.write("\r\n");
      out.write("        				<td><a class=\"likProfile\" href=\"viewOtherProfile.jsp?id=");
      out.print(flr.getUid());
      out.write("\" ><img alt=\"\" src=\"image?id=");
      out.print(flr.getUid());
      out.write("\" style=\"width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;\"/></a></td>\r\n");
      out.write("        				<td>");
      out.print(DAODetails.name(flr.getUid()));
      out.write("</td>\r\n");
      out.write("        				<td><a href=\"viewOtherProfile.jsp?id=");
      out.print(flr.getUid());
      out.write("\" class=\"btn btn-outline-info\" >Profile</a> </td>\r\n");
      out.write("        			</tr>\r\n");
      out.write("        			</tbody>\r\n");
      out.write("\r\n");
      out.write("				</table>\r\n");
      out.write("				\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col\"  style=\"text-align: center;\">\r\n");
      out.write("		\r\n");
      out.write("				<header>\r\n");
      out.write("        			<h4>Following</h4>\r\n");
      out.write("    			</header>\r\n");
      out.write("				");

				List<DTOFollower> liFollowers = DAOuser.folower(id);
				for(DTOFollower flr : liFollowers)
				{
				
      out.write("\r\n");
      out.write("					<table class=\"table\">\r\n");
      out.write("					<tbody>\r\n");
      out.write("					<tr style=\"color: white\">\r\n");
      out.write("        				<td><a class=\"likProfile\" href=\"viewOtherProfile.jsp?id=");
      out.print(flr.getFollowId());
      out.write("\" ><img alt=\"\" src=\"image?id=");
      out.print(flr.getFollowId());
      out.write("\" style=\"width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;\"/></a></td>\r\n");
      out.write("        				<td>");
      out.print(DAODetails.name(flr.getFollowId()));
      out.write("</td>\r\n");
      out.write("        				<td><a href=\"viewOtherProfile.jsp?id=");
      out.print(flr.getFollowId());
      out.write("\" class=\"btn btn-outline-info\" >Profile</a> </td>\r\n");
      out.write("        			</tr>\r\n");
      out.write("        			</tbody>\r\n");
      out.write("\r\n");
      out.write("				</table>\r\n");
      out.write("				");
} 
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col\" style=\"text-align: center;\">\r\n");
      out.write("				<header>\r\n");
      out.write("        			<h4>People</h4>\r\n");
      out.write("    			</header>\r\n");
      out.write("				<span style=\"color: green\" id =\"userFollowSuccess\"></span>\r\n");
      out.write("				<span style=\"color: red\" id =\"userFollowFailed\"></span>\r\n");
      out.write("				");

				List<DTOusers> list=DAOuser.users(id);
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				");
 
				for(DTOusers l : list)
				{
				
      out.write("\r\n");
      out.write("					<table class=\"table\">\r\n");
      out.write("					\r\n");
      out.write("					 <tbody>\r\n");
      out.write("					<tr style=\"color: white\">\r\n");
      out.write("        				<td ><a class=\"likProfile\" href=\"viewOtherProfile.jsp?id=");
      out.print(l.getUid());
      out.write("\" ><img alt=\"\" src=\"image?id=");
      out.print(l.getUid());
      out.write("\" style=\"width: 45px; border-radius: 50%; height: 45px;border: 3px solid blue;\"/></a></td>\r\n");
      out.write("        				<td>");
      out.print(l.getFname() );
      out.write(' ');
      out.print(l.getLname());
      out.write("</td>\r\n");
      out.write("        				<td>");
      out.print(l.getEmail() );
      out.write("</td>\r\n");
      out.write("        				<td>");
      out.print(l.getNumber() );
      out.write(" </td>\r\n");
      out.write("        				<td><button type=\"button\" class=\"btn btn-outline-info\" onclick=\"sendData(");
      out.print(l.getUid());
      out.write(',');
      out.print(id);
      out.write(")\">Follow</button> </td>\r\n");
      out.write("    				</tr>\r\n");
      out.write("    				</tbody>\r\n");
      out.write("\r\n");
      out.write("				</table>\r\n");
      out.write("				\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    function refreshTable() {\r\n");
      out.write("        $('#ref').load(location.href + ' #ref'); // Reload the table\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    setInterval(refreshTable, 5000); // Refresh every 5 seconds (5000 milliseconds)\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function sendData(uid, id) {\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        type: 'POST',\r\n");
      out.write("        url: 'Followers',\r\n");
      out.write("        data: { uid: uid, id: id },\r\n");
      out.write("        success: function(response) {\r\n");
      out.write("            $('#userFollowSuccess').text(response); // Update the element text\r\n");
      out.write("        },\r\n");
      out.write("        \r\n");
      out.write("        error: function(error) {\r\n");
      out.write("            console.error('Error:', error);\r\n");
      out.write("            $('#userFollowSuccess').text(\" Already followed.\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
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