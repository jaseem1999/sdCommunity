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
 * Servlet implementation class NameChangeServlet
 */
@WebServlet("/NameChangeServlet")
public class NameChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameChangeServlet() {
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
		String fname = null;
		String lname = null;
		String email = request.getParameter("staticEmail");
		fname = request.getParameter("inputFname");
		lname = request.getParameter("inputLname");
		Conn conn = new Conn();
		Connection connection = conn.connection;
		if(fname.isEmpty()) {
			fname= null;
		}
		if(lname.isEmpty()) {
			lname= null;
		}
		System.out.println("Email is :: "+email);
		System.out.println("First name :: "+fname);
		System.out.println("Last name :: "+ lname);
		if(fname == null || lname == null) {
			response.sendRedirect("UserSettings.jsp?message=Failed");
		}else if (!fname.matches("[a-zA-Z]+") || !lname.matches("[a-zA-Z]+")) {
		    response.sendRedirect("UserSettings.jsp?message=Failed");
		}else {
			try {
				PreparedStatement stmt = null;
				PreparedStatement stmt2 = null;
				String insertQuery = "update user set fname='"+fname+"' where email='"+email+"';";
				String insertQuery2 = "update user set lname='"+lname+"' where email='"+email+"';";
	            stmt = connection.prepareStatement(insertQuery);
	            stmt2 = connection.prepareStatement(insertQuery2);
	            int rowsInserted =stmt.executeUpdate();
	            int rowsInserted2 =stmt2.executeUpdate();
	            if (rowsInserted > 0 && rowsInserted2 > 0) {
					System.out.println("updated successfully");	
					response.sendRedirect("Login.jsp?message=nameSuccess");
				} else {
					System.out.println("updated failed");
					response.sendRedirect("Login.jsp?message=nameFailed");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
	}

}
