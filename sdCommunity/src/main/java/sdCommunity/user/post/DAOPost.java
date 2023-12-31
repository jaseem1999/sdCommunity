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
			String sql = "select post_id, uid, heading,link, post, codes, status from userPost order by post_id desc;";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			String status=null;
			while(rs.next()) {
				DTOpost p = new DTOpost();
				p.setPostId(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setHeading(rs.getString(3));
				p.setLink(rs.getString(4));
				p.setPost(rs.getString(5));
				p.setCode(rs.getString(6));
				status = rs.getString(7);
				if(status != null) {
					
				}else {
					li.add(p);
				}
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
			String sql = "select post_id, uid, heading,link, post, codes, status from userPost where uid="+id+" order by post_id desc;";
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
				String status = rs.getString(7);
				if(status != null) {
					
				}else {
					li.add(p);
				}
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
			String sql = "SELECT p.post_id, p.uid, u.fname, u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender, p.heading, p.link, p.post, p.codes, p.status FROM userPost p JOIN user u ON u.userId = p.uid JOIN user_info ui ON ui.uid = p.uid WHERE p.uid ="+id+";";
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
				String status = rs.getString(20);
				if (status != null) {
					
				} else {
					li.add(p);
				}
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
			String sql = "SELECT p.post_id, p.uid, u.fname, u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender, p.heading, p.link, p.post, p.codes,p.status FROM userPost p JOIN user u ON u.userId = p.uid JOIN user_info ui ON ui.uid = p.uid WHERE p.uid ="+id+";";
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
				String status = rs.getString(20);
				if (status != null) {
					
				} else {
					li.add(p);
				}
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	
	public static List<DTOSolution> getSolution(String id) {
		ArrayList<DTOSolution> li = new ArrayList<DTOSolution>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "select s_id,uid, post_id ,link, codes, status from postSolution where post_id="+id+" order by s_id desc;";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOSolution p = new DTOSolution();
				p.setSid(rs.getInt(1));
				p.setUid(rs.getInt(2));
				p.setPostId(rs.getInt(3));
				p.setLink(rs.getString(4));
				p.setCode(rs.getString(5));
				String status = rs.getString(6);
				if(status != null) {
					
				}else {
					li.add(p);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	
	public static int getVerify(int id) {
		int count=0;
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT COUNT(s_id) FROM verifySolution WHERE s_id ="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				 count = rs.getInt(1);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return count;
	}
	public static List<DTOothers> getOtherProfilePost(int id) {
		ArrayList<DTOothers> li = new ArrayList<DTOothers>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT p.post_id, p.uid, u.fname, u.lname,u.email,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender, p.heading, p.link, p.post, p.codes, p.status FROM userPost p JOIN user u ON u.userId = p.uid JOIN user_info ui ON ui.uid = p.uid WHERE p.uid ="+id+";";
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
				p.setStatus(rs.getString(20));
				li.add(p);
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	public static int blockPost(int postId, int id,int pid) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="insert into reqBlockPost(postId,uid,postUID)value("+postId+","+id+","+pid+");";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
 	}
}
