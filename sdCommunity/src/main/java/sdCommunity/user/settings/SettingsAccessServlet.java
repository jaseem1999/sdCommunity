package sdCommunity.user.settings;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class SettingsAccessServlet
 */
@WebServlet("/SettingsAccessServlet")
public class SettingsAccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SettingsAccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("settings servelet is working");
		HttpSession session = request.getSession();
		String email=(String)session.getAttribute("email");
		String pass= request.getParameter("exampleInputPassword1");
		
		Conn con = new Conn();
		Connection connection  =con.connection;
		PreparedStatement pstmt = null;
        ResultSet rs = null;
		
		try {
			String cmemail = null;
			String cmpass= null;
			int rowsInserted = 0;
			String sql = "SELECT email,password FROM user WHERE email=? AND password=?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, pass);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                // User found, you can now retrieve other information if needed
                cmemail = rs.getString("email");
                cmpass = rs.getString("password");
            }
            
            if(email.equals(cmemail) && pass.equals(cmpass) ) {
            	rowsInserted = 1;
            }
			
            if( rowsInserted > 0 ) {
            	response.sendRedirect("UserSettings.jsp");
            }else {
            	response.sendRedirect("UserHome.jsp?message=Failed");
            }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
