package sdCommunity.admin.adv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Blob;

import sdCommunity.conn.Conn;

public class ProductDAO {
	public static List<ReqProductDTO> getAllreqProduct(){ 
		ArrayList<ReqProductDTO> li = new ArrayList<ReqProductDTO>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select id,uid,pName,pDescription,company,price,offer,status from req_products;";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				ReqProductDTO rp = new ReqProductDTO();
				rp.setTid(rs.getInt(1));
				rp.setUid(rs.getInt(2));
				rp.setpName(rs.getString(3));
				rp.setDesc(rs.getString(4));
				rp.setCompany(rs.getString(5));
				rp.setPrice(rs.getDouble(6));
				rp.setOffer(rs.getDouble(7));
				rp.setStatus(rs.getString(8));
				li.add(rp);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return li;
	}
	public static String agencyName(int id) {
		String name =null;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select agName from adv_user where advid="+id+";";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				name = rs.getString(1);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return name;
	}
	public static int acceptProduct(int id) {
		Conn conn = new Conn();
		int rowInserted = 0;
		Connection connection = conn.connection;
		try {
			String sqlUpdate ="update req_products set status='accept' where id="+id+";";
			Statement statements = connection.createStatement();
	        statements.executeUpdate(sqlUpdate);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		String sql = "select uid,image,pName,pDescription,company,price,offer from req_products where id="+id+";";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			if(rs.next()) {
				int uid = rs.getInt("uid");
                Blob imageBlob = (Blob) rs.getBlob("image");
                String pName = rs.getString("pName");
                String pDescription = rs.getString("pDescription");
                String company = rs.getString("company");
                double price = rs.getDouble("price");
                double offer = rs.getDouble("offer");
                if(pName != null) {
                	String insertProduct ="insert into products(uid,image,pName,pDescription,company,price,offer)value(?, ?, ?, ?, ?, ?, ?)";
                	try {
                		PreparedStatement statement =connection.prepareStatement(insertProduct);
                		statement.setInt(1, uid);
                		statement.setBlob(2, imageBlob);
                		statement.setString(3, pName);
                		statement.setString(4, pDescription);
                		statement.setString(5, company);
                		statement.setDouble(6, price);
                		statement.setDouble(7, offer);
                		rowInserted = statement.executeUpdate();
                		
                		
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
                }else {
                	return rowInserted;
                }
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return rowInserted;
	}
	public static List<ReqProductDTO> getAllAcceptProduct(){ 
		ArrayList<ReqProductDTO> li = new ArrayList<ReqProductDTO>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select id,uid,pName,pDescription,company,price,offer,status from products;";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				ReqProductDTO rp = new ReqProductDTO();
				rp.setTid(rs.getInt(1));
				rp.setUid(rs.getInt(2));
				rp.setpName(rs.getString(3));
				rp.setDesc(rs.getString(4));
				rp.setCompany(rs.getString(5));
				rp.setPrice(rs.getDouble(6));
				rp.setOffer(rs.getDouble(7));
				rp.setStatus(rs.getString(8));
				li.add(rp);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return li;
	}
}
