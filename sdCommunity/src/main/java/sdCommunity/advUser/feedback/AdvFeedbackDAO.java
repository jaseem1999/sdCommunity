package sdCommunity.advUser.feedback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.advUser.product.AdsProductDTO;
import sdCommunity.conn.Conn;

public class AdvFeedbackDAO {
	public static int advFeedback(int uid,String name, String agname, String email, long num, String feedback) {
		Conn con= new Conn();
		Connection conn =con.connection;
		int inserted = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO advFeedback (uid, username, email, agname, phone, feedback) VALUES (?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, uid);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setString(4, agname);
            pstmt.setLong(5, num);
            pstmt.setString(6, feedback);
            inserted = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return inserted;
	}
	public static List<AdvFeedbackDTO> getAdvAllfeedback(){
		ArrayList<AdvFeedbackDTO> li = new ArrayList<AdvFeedbackDTO>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "SELECT id, uid,username, email, agname, phone, feedback FROM advFeedback;";
			PreparedStatement stm = connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				AdvFeedbackDTO ap = new AdvFeedbackDTO();
			    ap.setTid(rs.getInt(1));
			    ap.setUid(rs.getInt(2));
			    ap.setUser(rs.getString(3));
			    ap.setEmail(rs.getString(4));
			    ap.setAgname(rs.getString(5));
			    ap.setNum(rs.getLong(6));
			    ap.setFeedback(rs.getString(7));
			    li.add(ap);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return li;
	}
}
