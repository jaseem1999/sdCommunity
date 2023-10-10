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
 * Servlet implementation class PasswordChangeServlet
 */
@WebServlet("/PasswordChangeServlet")
public class PasswordChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordChangeServlet() {
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
		String email = request.getParameter("staticEmail");
		String pass = request.getParameter("inputPassword");
		String repass = request.getParameter("inputRepassword");
		System.out.println("email is ::"+email);
		System.out.println("new pass ::"+pass);
		System.out.println("re pass ::"+repass);
		Conn conn = new Conn();
		Connection connection = conn.connection;
		if(pass.equals(repass)) {
			try {
				PreparedStatement stmt = null;
				String insertQuery = "update user set password='"+pass+"' where email='"+email+"';";
	            stmt = connection.prepareStatement(insertQuery);
	            int rowsInserted =stmt.executeUpdate();
	            if (rowsInserted > 0) {
					System.out.println("updated successfully");	
					response.sendRedirect("Login.jsp?message=passwordSuccess");
				} else {
					System.out.println("updated failed");
					response.sendRedirect("Login.jsp?message=passwordFailed");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}else {
			response.sendRedirect("Login.jsp?message=passwordFailed");
		}
	}

}
