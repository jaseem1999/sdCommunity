/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-11-26 11:26:40 UTC
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
import sdCommunity.user.post.DAOPost;
import sdCommunity.user.post.DTOpost;
import java.util.List;
import java.util.Base64;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;

public final class UserHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.Base64");
    _jspx_imports_classes.add("java.io.ByteArrayOutputStream");
    _jspx_imports_classes.add("java.awt.image.BufferedImage");
    _jspx_imports_classes.add("sdCommunity.admin.adv.ProductDAO");
    _jspx_imports_classes.add("javax.imageio.ImageIO");
    _jspx_imports_classes.add("sdCommunity.user.post.DTOpost");
    _jspx_imports_classes.add("java.io.IOException");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./homecss/style.css\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");

	Integer id =(Integer)session.getAttribute("uid");
	String fname=(String)session.getAttribute("fname"); 
	String lname=(String)session.getAttribute("lname"); 
	String email=(String)session.getAttribute("email");
	long num=(Long)session.getAttribute("num");
	String college=(String)session.getAttribute("college");
	String base64ImageJpg = (String) session.getAttribute("base64Image");
	int postId = 0;
	Integer like= 0;
	
	if(email == null){
		response.sendRedirect("index.jsp?message=UnauthorizedAccess");
	}
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Home (");
      out.print(fname);
      out.write(")</title>\r\n");
      out.write("<style>\r\n");
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
      out.write("	overflow-x: auto;\r\n");
      out.write("}\r\n");
      out.write(".code xmp{\r\n");
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
      out.write(".search{\r\n");
      out.write("	width: 300px;\r\n");
      out.write("    height: 35px;\r\n");
      out.write("    margin-top: 0px;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    border: 3px solid blue;\r\n");
      out.write("}\r\n");
      out.write(".pName{\r\n");
      out.write("		text-align: center;\r\n");
      out.write("    	font-size: 18px;\r\n");
      out.write("    	font-weight: 900;\r\n");
      out.write("    	color: cyan;\r\n");
      out.write("    	margin: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	.cName{\r\n");
      out.write("		position: relative;\r\n");
      out.write("    	font-size: 15px;\r\n");
      out.write("    	margin-right: 30px;\r\n");
      out.write("    	left: 70%;\r\n");
      out.write("    	top: -14px;\r\n");
      out.write("    	color: #6c757d;\r\n");
      out.write("    	font-style: italic;\r\n");
      out.write("	}\r\n");
      out.write("	.priceName{\r\n");
      out.write("		position: relative;\r\n");
      out.write("    	font-size: 30px;\r\n");
      out.write("    	margin-right: 30px;\r\n");
      out.write("    	left: 0%;\r\n");
      out.write("    	color: #4cc600;\r\n");
      out.write("    	margin-top: -30px;\r\n");
      out.write("	}\r\n");
      out.write("	.oName{\r\n");
      out.write("		position: relative;\r\n");
      out.write("	    font-size: 25px;\r\n");
      out.write("	    margin-right: 30px;\r\n");
      out.write("	    left: 0%;\r\n");
      out.write("	    color: #ff1616;\r\n");
      out.write("	    margin-top: -15px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: black\">\r\n");
      out.write("\r\n");
      out.write("	<ul class=\"nav justify-content-end \" style=\"\">\r\n");
      out.write("			<li class=\"nav-item\" >\r\n");
      out.write("		    	<a class='nav-link' style=\"padding: 0px;\" href='UserHome.jsp'><img src=\"./img/logo.png\" alt=\"\" width=\"50px\"></a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li class=\"nav-item\"  style=\"padding: 10px;\">\r\n");
      out.write("		    	sdCommunity\r\n");
      out.write("			</li>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
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
		  		out.print("<a class='nav-link' href='userFollowers.jsp'>Followers</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
      out.write("		  </li>\r\n");
      out.write("		  \r\n");
      out.write("		   <li class=\"nav-item\">\r\n");
      out.write("		    ");

		  	if (email != null){
		  		out.print("<a class='nav-link' href='UserNotification.jsp'>Notification</a>");
		  	}else{
		  		out.print("");
		  	}
		  
      out.write("\r\n");
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
		  		if (college != null){
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
		  		if (college != null){
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
      out.write("			<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\" >\r\n");
      out.write("		  <div class=\"modal-dialog\">\r\n");
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
      out.write("	\r\n");
      out.write("	<div class=\"container hbdy\" style=\"margin-top: 10px;\">\r\n");
      out.write("	");

			String message = request.getParameter("message");
			if (message != null && message.equals("Failed")){
					out.print("<div class='alert alert-danger' id='alert' role='alert'>Settings access is Failed...<br>Try again...</div>");
			}if(message != null && message.equals("Success")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Post added</div>");	
			}
			if(message != null && message.equals("successFeedBack")){
				out.print("<div class='alert alert-success' id='alert' role='alert'>Feedback submitted succssfuly</div>");	
			}
			if(message != null && message.equals("failedFeedBack")){
				out.print("<div class='alert alert-danger' id='alert' role='alert'>Feedback submitted failed</div>");	
			}
	
      out.write("\r\n");
      out.write("		  <div class=\"row\">\r\n");
      out.write("			    \r\n");
      out.write("			    ");

					response.setContentType("text/html");
					List<DTOpost> p= DAOPost.getPost();
				
      out.write("\r\n");
      out.write("			    \r\n");
      out.write("			    <div class=\"col-9\" style=\"background-color: #6699c130;\">\r\n");
      out.write("			    ");
 for(DTOpost po : p){ 
      out.write("\r\n");
      out.write("			    	\r\n");
      out.write("			      	<div class=\"\" style=\"color: white; max-width: 100%; margin-left: 20px; margin-top: 10px;\" id=\"showPost\">\r\n");
      out.write("			      		\r\n");
      out.write("						  <img src=\"poimg?id=");
      out.print(po.getPostId());
      out.write("\" style=\"width : 100%; height: 200px;\" alt=\"...\">\r\n");
      out.write("						  <a href=\"viewOtherProfile.jsp?id=");
      out.print(po.getUid());
      out.write("\">\r\n");
      out.write("						  <img style=\"width: 50px; height: 50px; border-radius: 50%; margin-top: 5px; margin-left: 10px; border: 2px solid; \" alt=\"\" src=\"image?id=");
      out.print(po.getUid());
      out.write("\">\r\n");
      out.write("						  </a>\r\n");
      out.write("						  <div class=\"card-body\">\r\n");
      out.write("							    <h5 class=\"\" style=\"text-align: center; margin: 10px;\" id=\"postHeading\" >");
      out.print(po.getHeading());
      out.write("</h5>   	\r\n");
      out.write("							    	<p class=\"card-text\" style=\"margin: 30px;\">");
      out.print(po.getPost());
      out.write("</p>\r\n");
      out.write("							    	<a href=\"");
      out.print(po.getLink() );
      out.write("\" class=\"btn-primary\" style=\"margin-left: 30px;\">");
      out.print(po.getLink() );
      out.write("</a>\r\n");
      out.write("									<div class=\"code\">	\r\n");
      out.write("										<div class=\"codeHeading\">\r\n");
      out.write("											<p>Code</p>\r\n");
      out.write("											\r\n");
      out.write("										</div>				    \r\n");
      out.write("							    	 	<pre ><xmp id=\"copy\">");
      out.print(po.getCode() );
      out.write("</xmp></pre>\r\n");
      out.write("							    	 </div>\r\n");
      out.write("							    	 <div class=\"center\">\r\n");
      out.write("							    	 	<a class=\"btn btn-primary btnn\" aria-current=\"page\" href=\"userViewPost.jsp?id=");
      out.print(po.getPostId());
      out.write("\">Go To Check</a>\r\n");
      out.write("\r\n");
      out.write("							    	 </div>\r\n");
      out.write("						  </div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<hr style=\"color: white; border: 3px solid;\">\r\n");
      out.write("					 ");
} 
      out.write("\r\n");
      out.write("			    </div>\r\n");
      out.write("			    <div class=\"col-3\" style=\"background-color: #d8d8cd3d color: white;\">\r\n");
      out.write("			    	\r\n");
      out.write("			    	<div style=\"position: fixed;\" id=\"carouselExampleSlidesOnly\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("					  <h6 style=\"color: white;\">Ads</h6>\r\n");
      out.write("					  <div class=\"carousel-inner\" id=\"adsBox\">\r\n");
      out.write("					    \r\n");
      out.write("					    ");

					    List<ReqProductDTO> pr = ProductDAO.getAllAcceptProduct();
					    for(int i = 0; i < pr.size(); i++){
					    	ReqProductDTO product = pr.get(i);
					    
      out.write("\r\n");
      out.write("					    \r\n");
      out.write("					    <div class=\"carousel-item ");
      out.print( i == 0 ? "active" : "" );
      out.write("\" id=\"adsBox\">\r\n");
      out.write("						    <img class=\"d-block w-100\" src=\"adim?id=");
      out.print(product.getTid());
      out.write("\" alt=\"Third slide\">\r\n");
      out.write("						    <p style=\"\" class=\"pName\">");
      out.print(product.getpName() );
      out.write("</p>\r\n");
      out.write("						    <p class=\"cName\">");
      out.print(product.getCompany() );
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
      out.print(product.getPrice() );
      out.write("</p>\r\n");
      out.write("						    <p class=\"oName\">");
      out.print(product.getPrice()- product.getOffer() );
      out.write(" offer price</p>\r\n");
      out.write("						    <div style=\"text-align: center;\">\r\n");
      out.write("						        <a href=\"ViewAds.jsp?id=");
      out.print(product.getTid());
      out.write("&link=");
      out.print(product.getLink());
      out.write("\" class=\"btn btn-success\">goto</a>\r\n");
      out.write("						    </div>\r\n");
      out.write("						    \r\n");
      out.write("						</div>\r\n");
      out.write("					    ");
} 
      out.write("\r\n");
      out.write("					    \r\n");
      out.write("							\r\n");
      out.write("					  </div>\r\n");
      out.write("					       <div style=\"margin-top: 10px;\">\r\n");
      out.write("								<form action=\"userFeedbacksend.jsp\" method=\"get\">\r\n");
      out.write("									<input type=\"hidden\" value=\"");
      out.print(id );
      out.write("\" name=\"uid\"/>\r\n");
      out.write("								  <div class=\"form-group\">\r\n");
      out.write("								    <label style=\"margin-left: 10px; color: white;\" for=\"exampleInputFeedback\">Feedback</label>\r\n");
      out.write("								    <input style=\"margin: 10px; width: 300px;\" type=\"text\" class=\"form-control\" id=\"exampleInputFeedback\" aria-describedby=\"exampleInputFeedback\" placeholder=\"Enter Feedback\" name=\"feedback\">\r\n");
      out.write("								   </div>\r\n");
      out.write("								\r\n");
      out.write("								  <button style=\"margin-left: 10px;\" type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("					\r\n");
      out.write("			    	\r\n");
      out.write("			      	</div>\r\n");
      out.write("			    </div>\r\n");
      out.write("			    \r\n");
      out.write("			   \r\n");
      out.write("			    \r\n");
      out.write("			    \r\n");
      out.write("		  </div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
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
      out.write("	function search() {\r\n");
      out.write("	    var searchTerm = document.getElementById('searchInput').value.toLowerCase();\r\n");
      out.write("	    var postHeading = document.getElementById('postHeading').textContent.toLowerCase();\r\n");
      out.write("	    \r\n");
      out.write("	    if (postHeading.includes(searchTerm)) {\r\n");
      out.write("	    	document.getElementById('showPost').style.display = 'block';\r\n");
      out.write("	        \r\n");
      out.write("	    } else {\r\n");
      out.write("	        alert('Heading not matched.');\r\n");
      out.write("	    }\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("	    var alertElement = document.getElementById('alert');\r\n");
      out.write("	    if (alertElement) {\r\n");
      out.write("	        setTimeout(function() {\r\n");
      out.write("	            alertElement.style.display = 'none';\r\n");
      out.write("	        }, 2000); // 2000 milliseconds = 2 seconds\r\n");
      out.write("	    }\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
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
