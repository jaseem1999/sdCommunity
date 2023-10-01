package sdCommunity.user.post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	public static List<DTOpost> getAllPostDetails(String id) {
		ArrayList<DTOpost> li = new ArrayList<DTOpost>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT p.post_id, p.uid, u.fname, u.lname, ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website, p.heading, p.link, p.post, p.codes FROM userPost p JOIN user u ON u.userId = p.uid JOIN user_info ui ON ui.uid = p.uid WHERE p.post_id ="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOpost p = new DTOpost();
				p.setPostId(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setFname(rs.getString(3));
				p.setLname(rs.getString(4));
				p.setCompany(rs.getString(5));
				p.setCollege(rs.getString(6));
				p.setPosition(rs.getString(7));
				p.setGithub(rs.getString(8));
				p.setLinkedin(rs.getString(9));
				p.setWebsite(rs.getString(10));
				p.setHeading(rs.getString(11));
				p.setLink(rs.getString(12));
				p.setPost(rs.getString(13));
				p.setCode(rs.getString(14));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	
	public static List<DTOothers> getOtherProfile(int id) {
		ArrayList<DTOothers> li = new ArrayList<DTOothers>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT p.post_id, p.uid, u.fname, u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender, p.heading, p.link, p.post, p.codes FROM userPost p JOIN user u ON u.userId = p.uid JOIN user_info ui ON ui.uid = p.uid WHERE p.uid ="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOothers p= new DTOothers(); 
				p.setPostId(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setFname(rs.getString(3));
				p.setLname(rs.getString(4));
				p.setEmail(rs.getString(5));
				p.setNum(rs.getLong(6));
				p.setAbout(rs.getString(7));
				p.setCompany(rs.getString(8));
				p.setCollege(rs.getString(9));
				p.setPosition(rs.getString(10));
				p.setGithub(rs.getString(11));
				p.setLinkedin(rs.getString(12));
				p.setWebsite(rs.getString(13));
				p.setNationality(rs.getString(14));
				p.setGender(rs.getString(15));
				p.setHeading(rs.getString(16));
				p.setLink(rs.getString(17));
				p.setPost(rs.getString(18));
				p.setCode(rs.getString(19));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	
	public static void getUser(String id) {
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select u.userId,u.fname,u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender from user u join user_info ui on u.userId = ui.uid where ui.uid="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				userDTO p= new userDTO(); 
				p.setUid(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setEmail(rs.getString(4));
				p.setNum(rs.getLong(5));
				p.setAbout(rs.getString(6));
				p.setCompany(rs.getString(7));
				p.setCollege(rs.getString(8));
				p.setPosition(rs.getString(9));
				p.setGithub(rs.getString(10));
				p.setLinkedin(rs.getString(11));
				p.setWebsite(rs.getString(12));
				p.setNationality(rs.getString(13));
				p.setGender(rs.getString(14));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static List<DTOothers> getOtherProfile(String id) {
		ArrayList<DTOothers> li = new ArrayList<DTOothers>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT p.post_id, p.uid, u.fname, u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender, p.heading, p.link, p.post, p.codes FROM userPost p JOIN user u ON u.userId = p.uid JOIN user_info ui ON ui.uid = p.uid WHERE p.uid ="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOothers p= new DTOothers(); 
				p.setPostId(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setFname(rs.getString(3));
				p.setLname(rs.getString(4));
				p.setEmail(rs.getString(5));
				p.setNum(rs.getLong(6));
				p.setAbout(rs.getString(7));
				p.setCompany(rs.getString(8));
				p.setCollege(rs.getString(9));
				p.setPosition(rs.getString(10));
				p.setGithub(rs.getString(11));
				p.setLinkedin(rs.getString(12));
				p.setWebsite(rs.getString(13));
				p.setNationality(rs.getString(14));
				p.setGender(rs.getString(15));
				p.setHeading(rs.getString(16));
				p.setLink(rs.getString(17));
				p.setPost(rs.getString(18));
				p.setCode(rs.getString(19));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	
		
}
