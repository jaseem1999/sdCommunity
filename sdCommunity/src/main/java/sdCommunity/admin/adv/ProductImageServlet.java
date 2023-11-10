package sdCommunity.admin.adv;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Blob;

/**
 * Servlet implementation class ProductImageServlet
 */
@WebServlet("/ProductImageServlet")
public class ProductImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
            // Assuming you have a database connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdCommunity","root", "Love1999@MySQL");
            String sql = "SELECT image FROM products WHERE id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, Integer.parseInt(request.getParameter("id"))); // Assuming you pass the image ID as a parameter
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                Blob blob = (Blob) rs.getBlob("image");
                byte[] byteArray = blob.getBytes(1, (int) blob.length());

                response.setContentType("image/jpeg");

                OutputStream os = response.getOutputStream();
                os.write(byteArray);
                os.flush();
                os.close();
            }

            rs.close();
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
