package sdCommunity.advUser.product;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import sdCommunity.conn.Conn;

/**
 * Servlet implementation class ProductRequestServley
 */
@MultipartConfig
@WebServlet("/ProductRequestServley")
public class ProductRequestServley extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductRequestServley() {
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
		HttpSession session = request.getSession();
		Conn con= new Conn();
		Connection conn =con.connection;
		
		int uid =(Integer)session.getAttribute("id");
		String pname= request.getParameter("pname");
		String pdesc = request.getParameter("pdesc");
		String company = request.getParameter("company");	
		String priceString = request.getParameter("price");
		double price = Double.parseDouble(priceString);
		String offerString = request.getParameter("poffer");
		String link = request.getParameter("plink");
		double offer = Double.parseDouble(offerString);
		Part part = request.getPart("image");
		InputStream is = part.getInputStream();
		
		System.out.println("UID: " + uid);
		System.out.println("Product Name: " + pname);
		System.out.println("Product Description: " + pdesc);
		System.out.println("Company: " + company);
		System.out.println("Price: " + price);
		System.out.println("Offer: " + offer);
		try {
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO req_products (uid, image, pName, pDescription, company, price, offer, link) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, uid);
            pstmt.setBlob(2, is);
            pstmt.setString(3, pname);
            pstmt.setString(4, pdesc);
            pstmt.setString(5, company);
            pstmt.setDouble(6, price);
            pstmt.setDouble(7, offer);
            pstmt.setString(8, link);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Insert successful.");
                response.sendRedirect("AdvHome.jsp");
            } else {
                System.out.println("Insert failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

		
		
		
		
		
	}

}
