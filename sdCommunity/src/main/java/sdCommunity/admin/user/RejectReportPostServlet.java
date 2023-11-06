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
 * Servlet implementation class RejectReportPostServlet
 */
@WebServlet("/RejectReportPostServlet")
public class RejectReportPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RejectReportPostServlet() {
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
		String stringtid = request.getParameter("tid");
		int tid = Integer.parseInt(stringtid);
		System.out.println(tid);
		try {
			 String unlike = "UPDATE reqBlockPost SET status ='reject' WHERE tid = ?;";
        	 PreparedStatement stm = connection.prepareStatement(unlike);
        	 stm.setInt(1, tid);
        	 int rowsDeleted = stm.executeUpdate();
        	 if (rowsDeleted > 0) {
				response.sendRedirect("AdminHome.jsp?message=userPostReportReject");
			} else {
				response.sendRedirect("AdminHome.jsp?message=userPostReportRejectFailed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
