package sdCommunity.admin.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class CommentDAO {
	public static List<CommentDTO> getCommentBasedId(int id){
		ArrayList<CommentDTO> li = new ArrayList<CommentDTO>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select cmt_id,post_id,comt_uid,comments,status from user_cmt where comt_uid="+id+";";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				CommentDTO so = new CommentDTO();
				so.setCmtId(rs.getInt(1));
				so.setPostId(rs.getInt(2));
				so.setCmtUid(rs.getInt(3));
				so.setComment(rs.getString(4));
				so.setStatus(rs.getString(5));
				li.add(so);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return li;
	}
	public static int blockComment(int cmtId) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update user_cmt set status='Blocked' where cmt_id="+cmtId+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
 	}
	public static int unblockComment(int cmtId) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update user_cmt set status=null where cmt_id="+cmtId+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
 	}
	public static int selectedTotalComment(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(comt_uid) from user_cmt where comt_uid="+id+";";
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
	public static int selectedActiveComment(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(comt_uid) from user_cmt where status is null and comt_uid="+id+";";
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
	public static int selectedBlockedComment(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(comt_uid) from user_cmt where status='blocked' and comt_uid="+id+";";
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
}
