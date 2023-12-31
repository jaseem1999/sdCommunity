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
 * Servlet implementation class NumberChangeServlet
 */
@WebServlet("/NumberChangeServlet")
public class NumberChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NumberChangeServlet() {
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
		String inputNumberString = request.getParameter("inputNumber");

		Long longNumber = null;

		try {
		    if (inputNumberString != null) {
		        longNumber = Long.parseLong(inputNumberString);
		    }
		} catch (NumberFormatException e) {
		    // Handle the case where the parameter couldn't be parsed as a Long
		}
		
		System.out.println("Emails :: "+email);
		System.out.println("Number :: "+longNumber);
		
		Conn conn = new Conn();
		Connection connection = conn.connection;
		if(longNumber != null) {
			try {
				PreparedStatement stmt = null;
				String insertQuery = "update user set number="+longNumber+" where email='"+email+"';";
	            stmt = connection.prepareStatement(insertQuery);
	            int rowsInserted =stmt.executeUpdate();
	            if (rowsInserted > 0) {
					System.out.println("updated successfully");	
					response.sendRedirect("Login.jsp?message=numberSuccess");
				} else {
					System.out.println("updated failed");
					response.sendRedirect("Login.jsp?message=numberFailed");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}else {
			response.sendRedirect("Login.jsp?message=numberFailed");
		}
		
	}

}
