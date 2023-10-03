package sdCommunity.user.post;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sdCommunity.conn.Conn;

@WebServlet("/PostLike")
public class PostLike extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
    	 int postId = Integer.parseInt(request.getParameter("postId"));
    	 Integer id =(Integer)session.getAttribute("uid");
    	 System.out.println("user id :: "+id);
    	 System.out.println("start post like");
    	 System.out.println("post id :"+postId);
    	 Connection connection = null;
         PreparedStatement stmt = null;

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity", "root", "Love1999@MySQL");

             // Check if the user has already liked the post
             String checkQuery = "SELECT COUNT(*) FROM postLike where postId = ? AND uid = ?;";
             stmt = connection.prepareStatement(checkQuery);
             stmt.setInt(1, postId);
             stmt.setInt(2, id);
             ResultSet rs = stmt.executeQuery();
             rs.next();
             int likeCount = rs.getInt(1);
             
             String check = "SELECT COUNT(postId) FROM postLike WHERE postId = ?;";
             PreparedStatement stmt1 = connection.prepareStatement(check);
             stmt1.setInt(1, postId);
             ResultSet rs1 = stmt1.executeQuery(); // Corrected variable name
             rs1.next();
             int likes = rs1.getInt(1);
             System.out.println(likes);
             if (likeCount == 0) {
                 // User hasn't liked the post, so insert the like
                 String insertQuery = "INSERT INTO postLike (postId, uid) VALUES (?, ?)";
                 stmt = connection.prepareStatement(insertQuery);
                 stmt.setInt(1, postId);
                 stmt.setInt(2, id);
                 stmt.executeUpdate();
                 int like = likes +1;
                 response.getWriter().write("Liked post this " + like);
             } else {
                 response.getWriter().write("User already liked this post "+likes);
             }
         } catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace(); // Handle the exception appropriately
         } finally {
             try {
                 if (stmt != null) stmt.close();
                 if (connection != null) connection.close();
             } catch (SQLException e) {
                 e.printStackTrace(); // Handle the exception appropriately
             }
         }

    }
}
