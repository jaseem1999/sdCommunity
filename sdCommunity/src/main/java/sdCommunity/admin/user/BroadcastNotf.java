package sdCommunity.admin.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class BroadcastNotf {
	public static int notifAdded(String notif) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="insert into brodcastNotif(notification)values('"+notif+"');";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
	}
	public static List<BrodcastNotifDTO> getNotif(){
		ArrayList<BrodcastNotifDTO> li = new ArrayList<BrodcastNotifDTO>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT id,notification,status from brodcastNotif;";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				BrodcastNotifDTO bn = new BrodcastNotifDTO();
				bn.setId(rs.getInt(1));
				bn.setNotif(rs.getString(2));
				bn.setStatus(rs.getString(3));
				li.add(bn);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return li;
	}
}
