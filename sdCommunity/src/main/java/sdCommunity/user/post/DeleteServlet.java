package sdCommunity.user.post;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
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
		Conn con = new Conn();
		Connection connection = con.connection;
		
		System.out.println("Post Delete..!");
		String postId = request.getParameter("postId");
        
        try {
        	PreparedStatement stmt = null;
			String insertQuery = "update userPost set status='Blocked' where post_id="+postId+";";
            stmt = connection.prepareStatement(insertQuery);
            int rowsInserted =stmt.executeUpdate();
            if (rowsInserted > 0) {
				System.out.println("updated successfully");
				response.getWriter().write("Deleted successfully postId:: " + postId);
			} else {
				System.out.println("updated failed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
        
		
	}

}
