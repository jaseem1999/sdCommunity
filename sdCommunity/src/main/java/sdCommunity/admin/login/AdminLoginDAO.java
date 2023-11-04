package sdCommunity.admin.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import sdCommunity.conn.Conn;

public class AdminLoginDAO {
	public static int login(String email, String pass) {
		Conn con = new Conn();
		AdminLogin al = new AdminLogin();
		Connection connection = con.connection;
		String sql = "select id,email,password from adminLogin where email='"+email+"' and password='"+pass+"';";
		try(PreparedStatement statement = connection.prepareStatement(sql)) {
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
			    	al.setId(rs.getInt(1));
			    	al.setEmail(rs.getString(2));
			    	al.setPassword(rs.getString(3));
			    	return 1;
			}else {
				return 0;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
}
