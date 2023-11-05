package sdCommunity.admin.user;

import java.io.IOException;
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
 * Servlet implementation class UserReportRejectServlet
 */
@WebServlet("/UserReportRejectServlet")
public class UserReportRejectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserReportRejectServlet() {
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
		Conn con = new Conn();
		Connection connection = con.connection;
		String stringtid = request.getParameter("tid");
		int tid = Integer.parseInt(stringtid);
		System.out.println(tid);
		try {
			 String unlike = "UPDATE userReport SET status ='reject' WHERE tid = ?;";
        	 PreparedStatement stm = connection.prepareStatement(unlike);
        	 stm.setInt(1, tid);
        	 int rowsDeleted = stm.executeUpdate();
        	 if (rowsDeleted > 0) {
				response.sendRedirect("AdminHome.jsp?message=userReportRejected");
			} else {
				response.sendRedirect("AdminHome.jsp?message=userReportRejectedFailed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
