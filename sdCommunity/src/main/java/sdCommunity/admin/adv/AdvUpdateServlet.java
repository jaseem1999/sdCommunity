package sdCommunity.admin.adv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class AdvUpdateServlet
 */
@WebServlet("/AdvUpdateServlet")
public class AdvUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdvUpdateServlet() {
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
		int id = Integer.parseInt(request.getParameter("uid"));
		String email = request.getParameter("email");
		String user = request.getParameter("name");
		String agName = request.getParameter("ajname");
		long number = Long.parseLong(request.getParameter("number"));
		String pass = request.getParameter("pass");
		Conn conn = new Conn();
	    Connection connection = conn.connection;
	    int rowsAffected = 0;
	    try {
	    	String updateQuery = "UPDATE adv_user SET email=?, name=?, agName=?, phone=?, password=? WHERE advId=?";

		    PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
		    preparedStatement.setString(1, email);
		    preparedStatement.setString(2, user);
		    preparedStatement.setString(3, agName);
		    preparedStatement.setLong(4, number);
		    preparedStatement.setString(5, pass);
		    preparedStatement.setInt(6, id);
	        rowsAffected = preparedStatement.executeUpdate();
	        preparedStatement.close();
	        if(rowsAffected > 0) {
	        	response.sendRedirect("AdminAjview.jsp?id="+id+"&message=success");
	        }else {
	        	response.sendRedirect("AdminAjview.jsp?id="+id+"&message=failed");
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
