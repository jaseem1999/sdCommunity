package sdCommunity.admin.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class PostDAO {
	public static int blockPost(int postId) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update userPost set status='Blocked' where post_id="+postId+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
 	}
	public static int unBlockPost(int postId) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update userPost set status=null where post_id="+postId+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
 	}
	
	public static int selectedUserPost(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(post_id) from userPost where uid="+id+";";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            i = rs.getInt(1);
			return i;
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public static int selectedUserActivePost(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(post_id) from userPost where status is null and uid="+id+";";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            i = rs.getInt(1);
			return i;
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public static int selectedUserBlockPost(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(post_id) from userPost where status ='Blocked' and uid="+id+";";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            i = rs.getInt(1);
			return i;
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public static List<ReqPostBlock> allBlockPostReq(){
		ArrayList<ReqPostBlock> li = new ArrayList<ReqPostBlock>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select tid,postId,uid,postUID,status from reqBlockPost;";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				ReqPostBlock rpb = new ReqPostBlock();
				rpb.setTid(rs.getInt(1));
				rpb.setPostId(rs.getInt(2));
				rpb.setId(rs.getInt(3));
				rpb.setUid(rs.getInt(4));
				rpb.setStatus(rs.getString(5));
				if(rpb.getStatus() != null) {
					
				}else {
					li.add(rpb);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return li;
	}
}
