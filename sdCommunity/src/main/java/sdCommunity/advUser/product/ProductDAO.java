package sdCommunity.advUser.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class ProductDAO {
	public static List<AdsProductDTO> allProduct() {
		Conn con = new Conn();
		Connection connection = con.connection;
		ArrayList<AdsProductDTO> li = new ArrayList<AdsProductDTO>();
		try {
			String sql = "SELECT id, uid, pName, pDescription, company, price, offer,link ,counts FROM products ;";
			PreparedStatement stm = connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
			    AdsProductDTO ap = new AdsProductDTO();
			    ap.setTid(rs.getInt(1));
			    ap.setUid(rs.getInt(2));
			    ap.setPname(rs.getString(3));
			    ap.setPdescription(rs.getString(4));
			    ap.setPcompany(rs.getString(5));
			    ap.setPprice(rs.getDouble(6));
			    ap.setOffer(rs.getDouble(7));
			    ap.setLink(rs.getString(8));
			    ap.setCount(rs.getInt(9));
			    li.add(ap);	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
}
