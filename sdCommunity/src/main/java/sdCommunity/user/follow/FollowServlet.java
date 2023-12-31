package sdCommunity.user.follow;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sdCommunity.conn.Conn;
import sdCommunity.user.details.DAODetails;

/**
 * Servlet implementation class FollowServlet
 */
@WebServlet("/FollowServlet")
public class FollowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FollowServlet() {
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
		
		int uid = Integer.parseInt(request.getParameter("uid"));
        int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("user id ::"+id);
		System.out.println("Friend id ::"+uid);
		Conn con = new Conn();
		Connection connection = con.connection;
		if(id != uid) {
			try {
				PreparedStatement stmt2 = null;
		        String checkQuery = "SELECT COUNT(*) FROM follow WHERE userId = ? AND followId = ?";
		        stmt2 = connection.prepareStatement(checkQuery);
		        stmt2.setInt(1, id);
		        stmt2.setInt(2, uid);
		        ResultSet rs = stmt2.executeQuery();
		        rs.next();
		        int verify = rs.getInt(1);
		        if(verify == 0) {
		        	PreparedStatement stmt = null;
		        	String insertQuery = "INSERT INTO follow (userId, followId) VALUES (?, ?)";
		            stmt = connection.prepareStatement(insertQuery);
		            stmt.setInt(1, id);
		            stmt.setInt(2, uid);
		            int rowsInserted =stmt.executeUpdate();
		            if (rowsInserted > 0) {
					    System.out.println("A new row was inserted successfully!");
					    response.setContentType("text/plain");
				        response.setCharacterEncoding("UTF-8");
				        response.getWriter().write("  :: User "+DAODetails.name(uid)+" followed successfully");
					   
					}else {
						System.out.println("A new row was inserted Failed!");
						response.setContentType("text/plain");
				        response.setCharacterEncoding("UTF-8");
				        response.getWriter().write("  :: User "+DAODetails.name(uid)+" alredy followed");

					}
		        }else {
		        	System.out.println("already followed...!");
		        }
		        
		        
		        
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else {
			System.out.println("both are same...!");
		}
		
		
	}

}
