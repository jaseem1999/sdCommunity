package sdCommunity.user.post;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.mysql.cj.Session;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class UserPostServlet
 */
@MultipartConfig
@WebServlet("/UserPostServlet")
public class UserPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Start posting to database");
		HttpSession session = request.getSession();
	
		int id=(Integer) session.getAttribute("uid");
		String heading= request.getParameter("heading");
		String text = request.getParameter("text");
		String link= request.getParameter("link");
		String code= request.getParameter("code");
		
		
        Part part = request.getPart("image");
		
		Conn con= new Conn();
		Connection conn =con.connection;
		
		
		try {
			String sql = "INSERT INTO userPost (uid, heading, image, link, post, codes) VALUES (? ,? ,? ,? ,? , ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			InputStream is = part.getInputStream();
			statement.setInt(1, id);
			statement.setString(2, heading);
			statement.setBlob(3, is);
			statement.setString(4, link);
			statement.setString(5, text);
			statement.setString(6, code);
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new row was inserted successfully!");
			    
			    response.sendRedirect("UserHome.jsp?message=Success");
			}else {
				System.out.println("A new row was inserted Failed!");
				response.sendRedirect("UserPost.jsp?message=Failed");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
