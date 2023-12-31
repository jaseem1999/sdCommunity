package sdCommunity.user.comment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.xdevapi.Statement;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String comment = request.getParameter("postcmt");
		Integer cuid =(Integer)session.getAttribute("uid");
		Integer id =(Integer)session.getAttribute("postId");
        
        // Assuming you have a database connection and can execute SQL queries, you can save the comment like this:
        try {
            // Assuming you have a Connection object named "conn"
        	Conn con= new Conn();
    		Connection conn =con.connection;
    		
            String sql = "INSERT INTO user_cmt (post_id,comt_uid,comments) VALUES ("+id+","+cuid+",'" + comment + "')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }

        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("Success");

		
	}
	
}
