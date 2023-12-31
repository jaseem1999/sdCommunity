package sdCommunity.user.details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;


public class DAOuser {
	public static List<DTOusers> users(int id) {
		ArrayList<DTOusers> li = new ArrayList<DTOusers>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT userId, fname, lname, email, number FROM user WHERE userId <> "+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOusers p= new DTOusers(); 
				p.setUid(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setEmail(rs.getString(4));
				p.setNumber(rs.getLong(5));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
		
	}
	public static ArrayList<DTOFollower> folower(int id) {
		ArrayList<DTOFollower> li = new ArrayList<DTOFollower>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT userId,followId FROM follow where userId ="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOFollower p= new DTOFollower(); 
				p.setUid(rs.getInt(1));
				p.setFollowId(rs.getInt(2));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
		
	}
	public static ArrayList<DTOFollower> folowed(int id) {
		ArrayList<DTOFollower> li = new ArrayList<DTOFollower>();
		Conn con= new Conn();
		Connection conn =con.connection;
		try {
			String sql = "SELECT userId,followId FROM follow where followId ="+id+";";
			PreparedStatement stm =conn.prepareStatement(sql);
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()) {
				DTOFollower p= new DTOFollower(); 
				p.setUid(rs.getInt(1));
				p.setFollowId(rs.getInt(2));
				li.add(p);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
		
	}
}
