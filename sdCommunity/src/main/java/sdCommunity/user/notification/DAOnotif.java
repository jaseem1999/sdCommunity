package sdCommunity.user.notification;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sdCommunity.conn.Conn;

public class DAOnotif {
	public static List<DTOnotification> getPostNotif(int id){
		ArrayList<DTOnotification> li = new ArrayList<DTOnotification>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select * from userNotification WHERE userId <> "+id+" order by notif desc;";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				DTOnotification n = new DTOnotification();
				n.setNotiId(rs.getInt(1));
				n.setUserId(rs.getInt(2));
				n.setPostId(rs.getInt(3));
				n.setNotification(rs.getString(4));
				li.add(n);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	public static List<DTOlikePost> getPostLikeNoti(int id){
		ArrayList<DTOlikePost> li = new ArrayList<DTOlikePost>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select notif,userId,likeUid,postId,notification from userPostLikeNotification where likeUid="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				DTOlikePost n = new DTOlikePost();
				n.setNotiId(rs.getInt(1));
				n.setUserId(rs.getInt(2));
				n.setLikeUid(rs.getInt(3));
				n.setPostId(rs.getInt(4));
				n.setNotification(rs.getString(5));
				li.add(n);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}

}


