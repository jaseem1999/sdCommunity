package sdCommunity.user.post;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class Solution
 */
@WebServlet("/Solution")
public class Solution extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Solution() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		int id=(Integer) session.getAttribute("uid");
		Integer spid=(Integer) session.getAttribute("spid");
		String link= request.getParameter("link");
		String code= request.getParameter("code");
		System.out.println(spid);
		System.out.println(id);
		System.out.println(link);
		System.out.println(code);
		Conn conn = new Conn();
		Connection connection = conn.connection;
		try {
			String sql = "INSERT INTO postSolution (uid, post_id, link, codes) VALUES (? ,? ,? ,? )";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setInt(2,spid);
			statement.setString(3, link);
			statement.setString(4, code);
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new row was inserted successfully!");
			    
			    response.sendRedirect("userViewPost.jsp?id="+spid);
			}else {
				System.out.println("A new row was inserted Failed!");
				response.sendRedirect("userViewPost.jsp?id="+spid);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
