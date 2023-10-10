package sdCommunity.user.settings;

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
 * Servlet implementation class EmailChangeServlet
 */
@WebServlet("/EmailChangeServlet")
public class EmailChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailChangeServlet() {
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
		String oldEmail = request.getParameter("staticEmail");
		String newEmail = request.getParameter("inputEmail");
		System.out.println("old emai is ::"+oldEmail);
		System.out.println("new email is :: "+newEmail);
		Conn conn = new Conn();
		Connection connection = conn.connection;
		try {
			PreparedStatement stmt = null;
			String insertQuery = "update user set email='"+newEmail+"' where email='"+oldEmail+"';";
            stmt = connection.prepareStatement(insertQuery);
            int rowsInserted =stmt.executeUpdate();
            if (rowsInserted > 0) {
				System.out.println("updated successfully");	
				response.sendRedirect("Login.jsp?message=emailSuccess");
			} else {
				System.out.println("updated failed");
				response.sendRedirect("Login.jsp?message=emailFailed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
