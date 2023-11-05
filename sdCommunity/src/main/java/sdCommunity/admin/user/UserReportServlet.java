package sdCommunity.admin.user;

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
 * Servlet implementation class UserReportServlet
 */
@WebServlet("/UserReportServlet")
public class UserReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserReportServlet() {
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
		String id = request.getParameter("uid");
		String rid = request.getParameter("reUid");
		
		
		int userId = Integer.parseInt(id);
		int recipientId = Integer.parseInt(rid);
		String email = request.getParameter("reEmail");
		String name = request.getParameter("reName");
		String report = request.getParameter("report");
		
		try {
			 String sql = "INSERT INTO userReport (id, rid, email, name, report) VALUES (?, ?, ?, ?, ?)";

	            PreparedStatement statement = connection.prepareStatement(sql);
	            statement.setInt(1, userId); // Set the value of 'id'
	            statement.setInt(2, recipientId); // Set the value of 'rid'
	            statement.setString(3, email); // Set the value of 'email'
	            statement.setString(4, name); // Set the value of 'name'
	            statement.setString(5, report); // Set the value of 'report'

	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	               response.sendRedirect("viewOtherProfile.jsp?id="+recipientId+"&message=reportSuccess");
	            }else {
	            	response.sendRedirect("viewOtherProfile.jsp?id="+recipientId+"&message=reportFailed");
	            }
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
