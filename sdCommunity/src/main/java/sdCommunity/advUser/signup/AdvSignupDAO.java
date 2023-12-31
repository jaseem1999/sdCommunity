package sdCommunity.advUser.signup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sdCommunity.conn.Conn;

public class AdvSignupDAO {
	static userAdvDTO user = new userAdvDTO();
	public static void signUp(String email, String name, String agName, long phone,String pass) {
		
		user.setEmail(email);
		user.setName(name);
		user.setAgName(agName);
		user.setNum(phone);
		user.setPass(pass);
	}
	public static int userDbAdd() {
		Conn con = new Conn();
		Connection connection = con.connection;
		String sql = "insert into adv_user(email,name,agName,phone,password)value( ?, ?, ?, ?, ?);";
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
        	
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getName());
            statement.setString(3, user.getAgName());
            statement.setLong(4, user.getNum());
            statement.setString(5, user.getPass());
           
            int rowsInserted = statement.executeUpdate(); //return the executeUpdate success of failed

            return rowsInserted;
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return 0;
	}
}
