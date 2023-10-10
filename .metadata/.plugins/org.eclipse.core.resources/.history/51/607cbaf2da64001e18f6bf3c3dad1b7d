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
}
