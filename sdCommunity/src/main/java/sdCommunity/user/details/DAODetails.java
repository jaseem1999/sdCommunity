package sdCommunity.user.details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sdCommunity.conn.Conn;


public class DAODetails {
	public static String name(int id) {
		String fname = null;
		String lname = null;
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select fname, lname from user where userId="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				fname = rs.getString(1);
				lname = rs.getString(2);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		String name = fname + " "+ lname;
		return name;
	}
	
	public static String emai(int id) {
		String email = null;
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select email from user where userId="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				email= rs.getString(1);	
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return email;
	}
	
	public static String getPostHeading(int id) {
		String Heading = null;
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select heading from userPost where post_id="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				Heading = rs.getString(1);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return Heading;
		
	}
}

