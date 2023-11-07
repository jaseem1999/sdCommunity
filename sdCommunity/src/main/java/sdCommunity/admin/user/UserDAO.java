package sdCommunity.admin.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class UserDAO {
	public static OneUserDTO ud = new OneUserDTO();
	public static List<UserDTO> getUsers(){
		ArrayList<UserDTO> li = new ArrayList<UserDTO>();
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select u.userId, u.fname,u.lname,u.email,u.password,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender,u.status from user u join user_info ui on u.userId = ui.uid;";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				UserDTO ud = new UserDTO();
				ud.setUid(rs.getInt(1));
				ud.setFname(rs.getString(2));
				ud.setLname(rs.getString(3));
				ud.setEmail(rs.getString(4));
				ud.setPass(rs.getString(5));
				ud.setNumber(rs.getLong(6));
				ud.setAbout(rs.getString(7));
				ud.setCompany(rs.getString(8));
				ud.setCollege(rs.getString(9));
				ud.setPosition(rs.getString(10));
				ud.setGithub(rs.getString(11));
				ud.setLinkedin(rs.getString(12));
				ud.setWebsite(rs.getString(13));
				ud.setNationality(rs.getString(14));
				ud.setGender(rs.getString(15));
				ud.setStatus(rs.getString(16));
				li.add(ud);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return li;
	}
	public static int totalUser() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(u.userId) from user u join user_info ui on u.userId = ui.uid;";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
	public static int totalBlockedUser() {
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(u.userId) from user u join user_info ui on u.userId = ui.uid where status='Blocked';";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
	public static int userBlock(String id) {
		 Conn conn = new Conn();
		    Connection connection = conn.connection;
		    String sql = "update user set status='Blocked' where userId="+id+";";
		    int rowsAffected = 0;

		    try {
		        Statement statement = connection.createStatement();
		        rowsAffected = statement.executeUpdate(sql);
		        statement.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return rowsAffected;	
	}
	public static int userUnblock(String id) {
		 Conn conn = new Conn();
		    Connection connection = conn.connection;
		    String sql = "update user set status=null where userId="+id+";";
		    int rowsAffected = 0;

		    try {
		        Statement statement = connection.createStatement();
		        rowsAffected = statement.executeUpdate(sql);
		        statement.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return rowsAffected;	
	}
	public static int getUsers(String email){
		
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select u.userId, u.fname,u.lname,u.email,u.password,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender,u.status from user u join user_info ui on u.userId = ui.uid where u.email='"+email+"';";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				ud.setUid(rs.getInt(1));
				ud.setFname(rs.getString(2));
				ud.setLname(rs.getString(3));
				ud.setEmail(rs.getString(4));
				ud.setPass(rs.getString(5));
				ud.setNumber(rs.getLong(6));
				ud.setAbout(rs.getString(7));
				ud.setCompany(rs.getString(8));
				ud.setCollege(rs.getString(9));
				ud.setPosition(rs.getString(10));
				ud.setGithub(rs.getString(11));
				ud.setLinkedin(rs.getString(12));
				ud.setWebsite(rs.getString(13));
				ud.setNationality(rs.getString(14));
				ud.setGender(rs.getString(15));
				ud.setStatus(rs.getString(16));
				System.out.println(ud.getStatus());
				return 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 0;
	}
	
	public static List<ReportDTO> userReportOtherUser(){
		ArrayList<ReportDTO> rl = new ArrayList<ReportDTO>();
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select id,rid,email,name,report,tid from userReport where status is null;";
		
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			while(rs.next()) {
				ReportDTO rd = new ReportDTO();
				rd.setId(rs.getInt(1));
				rd.setRid(rs.getInt(2));
				rd.setEmail(rs.getString(3));
				rd.setName(rs.getString(4));
				rd.setReport(rs.getString(5));
				rd.setTid(rs.getInt(6));
				rl.add(rd);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rl;
	}
	public static int totalReportOtherUser(){
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(id) from userReport where status is null;";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
	public static int totalReportRejectOtherUser(){
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(id) from userReport where status='reject';";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
	public static int totalReportAcceptOtherUser(){
		int noUser =0;
		Conn conn = new Conn();
		Connection connection = conn.connection;
		String sql = "select count(id) from userReport where status='accept';";
		try {
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
            rs.next();
            noUser = rs.getInt(1);
			return noUser;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return noUser;
	}
	
		public static OneUserDTO ude = new OneUserDTO();
		public static List<OneUserDTO> getUsers(int id){
			ArrayList<OneUserDTO> li = new ArrayList<OneUserDTO>();
			Conn conn = new Conn();
			Connection connection = conn.connection;
			String sql = "select u.userId, u.fname,u.lname,u.email,u.password,u.number, ui.about,ui.company, ui.college,ui.position,ui.github,ui.linkedin,ui.website,ui.nationality,ui.gender,u.status from user u join user_info ui on u.userId = ui.uid where u.userId ="+id+";";
			try {
				PreparedStatement stm =connection.prepareStatement(sql);
				ResultSet rs=stm.executeQuery();
				while(rs.next()) {
					
					ude.setUid(rs.getInt(1));
					ude.setFname(rs.getString(2));
					ude.setLname(rs.getString(3));
					ude.setEmail(rs.getString(4));
					ude.setPass(rs.getString(5));
					ude.setNumber(rs.getLong(6));
					ude.setAbout(rs.getString(7));
					ude.setCompany(rs.getString(8));
					ude.setCollege(rs.getString(9));
					ude.setPosition(rs.getString(10));
					ude.setGithub(rs.getString(11));
					ude.setLinkedin(rs.getString(12));
					ude.setWebsite(rs.getString(13));
					ude.setNationality(rs.getString(14));
					ude.setGender(rs.getString(15));
					ude.setStatus(rs.getString(16));
					li.add(ude);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return li;
		}
		public static int totalReportOtherPost(){
			int noUser =0;
			Conn conn = new Conn();
			Connection connection = conn.connection;
			String sql = "select count(tid) from reqBlockPost where status is null;";
			try {
				PreparedStatement stm =connection.prepareStatement(sql);
				ResultSet rs = stm.executeQuery();
	            rs.next();
	            noUser = rs.getInt(1);
				return noUser;
			} catch (Exception e) {
				// TODO: handle exception
			}
			return noUser;
		}
		public static int totalReportRejectOtherPost(){
			int noUser =0;
			Conn conn = new Conn();
			Connection connection = conn.connection;
			String sql = "select count(tid) from reqBlockPost where status='reject';";
			try {
				PreparedStatement stm =connection.prepareStatement(sql);
				ResultSet rs = stm.executeQuery();
	            rs.next();
	            noUser = rs.getInt(1);
				return noUser;
			} catch (Exception e) {
				// TODO: handle exception
			}
			return noUser;
		}
		public static int totalReportAcceptOtherPost(){
			int noUser =0;
			Conn conn = new Conn();
			Connection connection = conn.connection;
			String sql = "select count(tid) from reqBlockPost where status='accept';";
			try {
				PreparedStatement stm =connection.prepareStatement(sql);
				ResultSet rs = stm.executeQuery();
	            rs.next();
	            noUser = rs.getInt(1);
				return noUser;
			} catch (Exception e) {
				// TODO: handle exception
			}
			return noUser;
		}
}
