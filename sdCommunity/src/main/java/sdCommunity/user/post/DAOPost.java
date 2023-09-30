package sdCommunity.user.post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class DAOPost {
	public static List<DTOpost> getPost() {
		ArrayList<DTOpost> li = new ArrayList<DTOpost>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select post_id, uid, heading,link, post, codes from userPost order by post_id desc;";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOpost p = new DTOpost();
				p.setPostId(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setHeading(rs.getString(3));
				p.setLink(rs.getString(4));
				p.setPost(rs.getString(5));
				p.setCode(rs.getString(6));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	public static List<DTOpost> getPost(int id) {
		ArrayList<DTOpost> li = new ArrayList<DTOpost>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select post_id, uid, heading,link, post, codes from userPost where uid="+id+" order by post_id desc;";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOpost p = new DTOpost();
				p.setPostId(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setHeading(rs.getString(3));
				p.setLink(rs.getString(4));
				p.setPost(rs.getString(5));
				p.setCode(rs.getString(6));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
}