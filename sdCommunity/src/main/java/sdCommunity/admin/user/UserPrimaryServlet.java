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
 * Servlet implementation class UserPrimaryServlet
 */
@WebServlet("/UserPrimaryServlet")
public class UserPrimaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserPrimaryServlet() {
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
		Conn con= new Conn();
		String idString = request.getParameter("uid");
		String numString = request.getParameter("number");
		int id = Integer.parseInt(idString);
        long num = Long.parseLong(numString);
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		System.out.println(id);
		System.out.println(email);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(pass);
		System.out.println(num);
		Connection connection = con.connection;
		try {
			String updateQuery = "UPDATE user SET fname=?, lname=?, email=?, password=?, number=? WHERE userId=?";

		    PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
		    preparedStatement.setString(1, fname);
		    preparedStatement.setString(2, lname);
		    preparedStatement.setString(3, email);
		    preparedStatement.setString(4, pass);
		    preparedStatement.setLong(5, num);
		    preparedStatement.setInt(6, id);

		    int rowsUpdated = preparedStatement.executeUpdate();

		    if (rowsUpdated > 0) {
		        response.sendRedirect("AdminEditUserProfile.jsp?id="+id+"&message=success");
		    } else {
		    	response.sendRedirect("AdminEditUserProfile.jsp?id="+id+"&message=failed");
		    }
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
