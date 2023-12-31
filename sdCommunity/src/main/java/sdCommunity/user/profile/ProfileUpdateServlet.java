package sdCommunity.user.profile;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class ProfileUpdateServlet
 */
@MultipartConfig
@WebServlet("/ProfileUpdateServlet")
public class ProfileUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
HttpSession session = request.getSession();
		
		Integer id =(Integer)session.getAttribute("uid");
		
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
        Conn conn = new Conn();
        Connection connection = conn.connection;
       
		 
	        try {
				
	        	String sql = "UPDATE user_info SET image=?, about=?, company=?, college=?, position=?, github=?, linkedin=?, nationality=?, gender=?, website=? WHERE uid=?;";
		           
	        	PreparedStatement statement = connection.prepareStatement(sql);
				
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
			    System.out.println("A new row was updated successfully!");
			    response.sendRedirect("Login.jsp");
			}else {
				System.out.println("A new row was updated Failed!");
			}

		

			} catch (Exception e) {
				System.out.println(e);
			}

	}

}
