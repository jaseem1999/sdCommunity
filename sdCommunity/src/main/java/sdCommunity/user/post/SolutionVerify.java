package sdCommunity.user.post;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * Servlet implementation class SolutionVerify
 */
@WebServlet("/SolutionVerify")
public class SolutionVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SolutionVerify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Conn con = new Conn();
        Connection conn = con.connection;
		
		int suid = Integer.parseInt(request.getParameter("suid"));
		int sspid = Integer.parseInt(request.getParameter("sspid"));
		int ssid = Integer.parseInt(request.getParameter("ssid"));
		System.out.println(suid);
		System.out.println(sspid);
		System.out.println(ssid);

		try { 
        // Check if the user has already liked the post
			PreparedStatement stmt2 = null;
        String checkQuery = "SELECT COUNT(*) FROM verifySolution WHERE s_id = ? AND uid = ?";
        stmt2 = conn.prepareStatement(checkQuery);
        stmt2.setInt(1, ssid);
        stmt2.setInt(2, suid);
        ResultSet rs = stmt2.executeQuery();
        rs.next();
        int likeCount = rs.getInt(1);
		if(likeCount == 0) {
			try {
				PreparedStatement stmt = null;
				String insertQuery = "INSERT INTO verifySolution (uid, post_id, s_id, counts) VALUES (?, ?, ?, ?)";
	            stmt = conn.prepareStatement(insertQuery);
	            stmt.setInt(1, suid);
	            stmt.setInt(2, sspid);
	            stmt.setInt(3, ssid);
	            stmt.setInt(4, 1);
	            int rowsInserted =stmt.executeUpdate();
	            if (rowsInserted > 0) {
				    System.out.println("A new row was inserted successfully!");
				    
				    response.sendRedirect("userViewPost.jsp?id="+sspid);
				}else {
					System.out.println("A new row was inserted Failed!");
					response.sendRedirect("userViewPost.jsp?id=" + sspid + "&message=Failed");
				}
	
				
			} catch (Exception e) {
				// TODO: handle exception
		}
		}else {
			response.sendRedirect("userViewPost.jsp?id=" + sspid + "&message=Failed");
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
