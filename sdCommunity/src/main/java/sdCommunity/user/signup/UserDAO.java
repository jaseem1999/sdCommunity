package sdCommunity.user.signup;
import sdCommunity.conn.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    Conn co= new Conn();
    Connection connection=  co.connection;
    // Method to insert a new user into the database
    public int addUser(UserDTO user) {
        if (connection == null) {
            return 0; // Connection failed, return false
        }

        String sql = "INSERT INTO user(fname,lname,email,password,number) VALUES (?, ?, ?, ?, ?)";
        if (user.getFname() == "" || user.getLname() == "" || user.getEmail() == "" || user.getPassword() == "" || user.getNumber() == 0) {
    		return 0;
		}
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
        	
            statement.setString(1, user.getFname());
            statement.setString(2, user.getLname());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setLong(5, user.getNumber());
           
            int rowsInserted = statement.executeUpdate(); //return the executeUpdate success of failed

            return rowsInserted;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;//failed, return false
    }
}
