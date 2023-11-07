package sdCommunity.user.comment;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.xdevapi.JsonArray;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class CommentDataServlet
 */
@WebServlet("/CommentDataServlet")
public class CommentDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Integer id =(Integer)session.getAttribute("postId");
		
		Connection conn = null;
        try {
            Conn con = new Conn();
            conn = con.connection;

            String sql = "SELECT comt_uid, comments, status FROM user_cmt where post_id="+id;
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            List<String> commentsList = new ArrayList<>();
            while (resultSet.next()) {
            	String status = resultSet.getString("status");
                String commentText = resultSet.getString("comments");
                String commentUiD = resultSet.getString("comt_uid");
                String commentEntry = commentText + " (UID: " + commentUiD + ")";
                if(status != null) {
                	
                }else {
                	commentsList.add(commentEntry);
                }
            }

            // Construct a JSON response manually
            StringBuilder jsonResponse = new StringBuilder("{\"comments\": [");
            for (int i = 0; i < commentsList.size(); i++) {
                jsonResponse.append("\"").append(commentsList.get(i)).append("\"");
                if (i < commentsList.size() - 1) {
                    jsonResponse.append(", ");
                }
            }
            jsonResponse.append("]}");

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(jsonResponse.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
		
		
	}

}
