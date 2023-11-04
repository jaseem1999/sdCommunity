package sdCommunity.advUser.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;


public class ReqProduct {
	
	public static List<ProductDTO> allReqProduct() {
		Conn con = new Conn();
		Connection connection = con.connection;
		ArrayList<ProductDTO> li = new ArrayList<ProductDTO>();
		try {
			String sql = "SELECT id, uid, pName, pDescription, company, price, offer FROM req_products;";
			PreparedStatement stm = connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
			    ProductDTO pd = new ProductDTO();
			    pd.setPid(rs.getInt(1));
			    pd.setUid(rs.getInt(2));
			    pd.setName(rs.getString(3));
			    pd.setDesc(rs.getString(4));
			    pd.setCompany(rs.getString(5));
			    pd.setPrice(rs.getDouble(6));
			    pd.setOffer(rs.getDouble(7));
			    li.add(pd);	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
}
