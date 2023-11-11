package sdCommunity.user.feedback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;import javax.imageio.plugins.tiff.GeoTIFFTagSet;

import sdCommunity.conn.Conn;

public class UserFeedbackDAO {
	public static int feedBackUpload(int uid, String feedback) {
		int rowinserted = 0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		try {
			String insertFeedback ="insert into userFeedback(uid,feedback)value(?, ?)";
			PreparedStatement statement =connection.prepareStatement(insertFeedback);
    		statement.setInt(1, uid);
    		statement.setString(2, feedback);
    		rowinserted = statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return rowinserted;
	}
	public static List<UserfeedbackDTO> getUserFeddback(){
		ArrayList<UserfeedbackDTO> li = new ArrayList<UserfeedbackDTO>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select id,uid,feedback from userFeedback;";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				UserfeedbackDTO uf = new UserfeedbackDTO();
				uf.setTid(rs.getInt(1));
				uf.setUid(rs.getInt(2));
				uf.setFeedback(rs.getString(3));
				li.add(uf);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return li;
	}
}
