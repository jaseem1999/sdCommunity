package sdCommunity.advUser.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sdCommunity.conn.Conn;


public class AdvUserLoginDAO {
	static AdvUserLoginDTO user = new AdvUserLoginDTO();
	public static int id;
	public static String name;
	public static String agName;
	public static String dtoemail;
	public static String password;
	public static long number;
	public static String status;
	public static void login(String email, String pass) {
		user.setEmail(email);
		user.setPass(pass);
	}
	public static int validate() {
		Conn con = new Conn();
		Connection connection = con.connection;
		ResultSet rs = null;
		String sql ="Select * from adv_user where email=? and password=?;";
			try (PreparedStatement statement = connection.prepareStatement(sql)) {
	            statement.setString(1, user.getEmail());
	            statement.setString(2, user.getPass());
	            rs = statement.executeQuery();
	            if (rs.next()) {
	                // User found, you can now retrieve other information if needed
	            	AdvUserLoginDTO users = new AdvUserLoginDTO();
	                users.setId(rs.getInt(1));
	                users.setEmail(rs.getString(2));
	                users.setName(rs.getString(3));
	                users.setAgName(rs.getString(4));
	                users.setNum(rs.getLong(5));
	                users.setPass(rs.getString(6));
	                users.setStatus(rs.getString(7));
	                
	                id=users.getId();
	                dtoemail = users.getEmail();
	                name = users.getName();
	                agName = users.getAgName();
	                number = users.getNum();
	                password = users.getPass();
	                status = users.getStatus();
	                return 1; // Successful login
	            } else {
	                return -1; // User not found
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		return 0;
	}
}
