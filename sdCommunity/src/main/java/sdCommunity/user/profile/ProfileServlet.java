package sdCommunity.user.profile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ProfileServlet
 */
@MultipartConfig(maxFileSize = 2 * 1024 * 1024)//2mb
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Done ...");
		HttpSession session = request.getSession();
		
		Integer id =(Integer)session.getAttribute("uid");
		String fname=(String)session.getAttribute("fname"); 
		String lname=(String)session.getAttribute("lname"); 
		String email=(String)session.getAttribute("email");
		Long num=(Long)session.getAttribute("num");;
		
		String company = request.getParameter("company");
		String about = request.getParameter("about");
		String college = request.getParameter("college");
		String position = request.getParameter("position");
        String github = request.getParameter("github");
        String linkedin = request.getParameter("linkedin");
        String nationality = request.getParameter("nationality");
        String gender = request.getParameter("gender");
        String website = request.getParameter("website");
		
		
        InputStream inputStream = null;
        Part part = request.getPart("image");

       
		 
	        try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity","root", "Love1999@MySQL");
				PreparedStatement stm;
				
				// Assuming you have a connection and a PreparedStatement set up
				String sql = "INSERT INTO user_info (image, about, company, college, position, github, linkedin, nationality, gender, website, uid) VALUES (? ,? ,? ,? ,? , ?, ?, ?, ?, ?, ?)";
				
				PreparedStatement statement = con.prepareStatement(sql);
				
		            // Obtain input stream of uploaded file
		        InputStream is = part.getInputStream();
		            
				
				
				statement.setBlob(1, is);
				statement.setString(2, about);
				statement.setString(3, company);
				statement.setString(4, college);
				statement.setString(5, position);
				statement.setString(6, github);
				statement.setString(7, linkedin);
				statement.setString(8, nationality);
				statement.setString(9, gender);
				statement.setString(10, website);
				statement.setInt(11, id);

				int rowsInserted = statement.executeUpdate();
				if (rowsInserted > 0) {
				    System.out.println("A new row was inserted successfully!");
				    response.sendRedirect("Login.jsp");
				}else {
					System.out.println("A new row was inserted Failed!");
				}

			} catch (Exception e) {
				System.out.println(e);
			}
	}

}
