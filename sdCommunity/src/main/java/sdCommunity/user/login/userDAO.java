package sdCommunity.user.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sdCommunity.conn.Conn;

public class userDAO {
	Conn conn = new Conn();
	Connection con=conn.connection;
	public int login(String email, String pass) {
		if (con == null) {
            return 0; // Connection failed, return false
        }
		
		PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM user WHERE email=? AND password=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, pass);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                // User found, you can now retrieve other information if needed
            	int id = rs.getInt("userId");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                long number = rs.getLong("number");
                
                // Create a UserDTO object to hold the user information
                userDTO user = new userDTO();
                user.setId(id);
                user.setEmail(email);
                user.setPassword(pass);
                user.setFname(fname);
                user.setLname(lname);
                user.setNumber(number);
                
                // Return user object or a flag indicating successful login
                return 1; // Successful login
            } else {
                return -1; // User not found
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0; // Error occurred during database operation
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
	}

}
