package sdCommunity.admin.adv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class AdvDAO {
	public static List<AdvDTO> getAllAgency(){
		ArrayList<AdvDTO> li = new ArrayList<AdvDTO>();
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select advid,email,name,agName,phone,password,status from adv_user;";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				AdvDTO ad = new AdvDTO();
				ad.setTid(rs.getInt(1));
				ad.setEmail(rs.getString(2));
				ad.setName(rs.getString(3));
				ad.setAgName(rs.getString(4));
				ad.setNumber(rs.getLong(5));
				ad.setPassword(rs.getString(6));
				ad.setStatus(rs.getString(7));
				li.add(ad);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return li;
	}
	public static List<AdvDTO> getAllAgency(int id){
		ArrayList<AdvDTO> li = new ArrayList<AdvDTO>();
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select advid,email,name,agName,phone,password,status from adv_user where advid="+id+";";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				AdvDTO ad = new AdvDTO();
				ad.setTid(rs.getInt(1));
				ad.setEmail(rs.getString(2));
				ad.setName(rs.getString(3));
				ad.setAgName(rs.getString(4));
				ad.setNumber(rs.getLong(5));
				ad.setPassword(rs.getString(6));
				ad.setStatus(rs.getString(7));
				li.add(ad);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return li;
	}
	public static int totalAgencys() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(advid) from adv_user;";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return noUser;
	}
	public static int totalActiveAgency() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(advid) from adv_user where status is null;";
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
	public static int totalBlockedAgency() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(advid) from adv_user where status='Blocked';";
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
	public static int blockAdvUser(int id) {
		Conn conn = new Conn();
	    Connection connection = conn.connection;
	    String sql = "update adv_user set status='Blocked' where advId="+id+";";
	    int rowsAffected = 0;

	    try {
	        Statement statement = connection.createStatement();
	        rowsAffected = statement.executeUpdate(sql);
	        statement.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return rowsAffected;
	}
	public static int unBlockAdvUser(int id) {
		Conn conn = new Conn();
	    Connection connection = conn.connection;
	    String sql = "update adv_user set status=null where advId="+id+";";
	    int rowsAffected = 0;

	    try {
	        Statement statement = connection.createStatement();
	        rowsAffected = statement.executeUpdate(sql);
	        statement.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return rowsAffected;
	}
	
	
}
