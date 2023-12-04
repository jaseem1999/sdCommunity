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
			String sql = "select id,uid,pName,pDescription,company,price,offer,link,status from req_products;";
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
				rp.setLink(rs.getString(8));
				rp.setStatus(rs.getString(9));
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
			System.out.println(id);
			String sqlUpdate ="update req_products set status='accept' where id="+id+";";
			Statement statements = connection.createStatement();
	        statements.executeUpdate(sqlUpdate);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		String sql = "select uid,image,pName,pDescription,company,price,offer,link from req_products where id="+id+";";
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
                String link = rs.getString("link");
                if(pName != null) {
                	String insertProduct ="insert into products(uid,image,pName,pDescription,company,price,offer,link)value(?, ?, ?, ?, ?, ?, ?, ?)";
                	try {
                		PreparedStatement statement =connection.prepareStatement(insertProduct);
                		statement.setInt(1, uid);
                		statement.setBlob(2, imageBlob);
                		statement.setString(3, pName);
                		statement.setString(4, pDescription);
                		statement.setString(5, company);
                		statement.setDouble(6, price);
                		statement.setDouble(7, offer);
                		statement.setString(8, link);
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
			String sql = "select id,uid,pName,pDescription,company,price,offer,link,status from products order by counts desc;";
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
				rp.setLink(rs.getString(8));
				rp.setStatus(rs.getString(9));
				li.add(rp);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return li;
	}
	public static int adsAnalysis(int id) {
		int updated = 0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		try {
			String sql = "SELECT counts FROM products WHERE id=?";
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();

			int count = 0;

			if (rs.next()) {
			    // Move the cursor to the first row
			    count = rs.getInt("counts");
			    count = count + 1;
			    
			    // Update the counts in the database
			    String sqlUpdate = "UPDATE products SET counts=? WHERE id=?";
			    PreparedStatement updateStm = connection.prepareStatement(sqlUpdate);
			    updateStm.setInt(1, count);
			    updateStm.setInt(2, id);
			    updated = updateStm.executeUpdate();
			}
	        return updated;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return updated;
	}
	public static int rejectProduct(int id) {
		Conn conn = new Conn();
		int rowInserted = 0;
		Connection connection = conn.connection;
		try {
			String sqlUpdate ="update req_products set status='reject' where id="+id+";";
			Statement statements = connection.createStatement();
	        rowInserted=statements.executeUpdate(sqlUpdate);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return rowInserted;
	}
	
	public static int getAcceptProductCount() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(status) from req_products where status='accept';";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
	public static int getRejectProductCount() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(status) from req_products where status='reject';";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
	public static int getPendingProductCount() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(status) from req_products where status is null;";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
}
