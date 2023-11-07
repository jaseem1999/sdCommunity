package sdCommunity.admin.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sdCommunity.conn.Conn;

public class SolutionDAO {
	public static List<SolutionDTO> getSelectedPostSolution(int uid){
		ArrayList<SolutionDTO> li = new ArrayList<SolutionDTO>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select s_id,uid,post_id,link,codes,status from postSolution where uid="+uid+";";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				SolutionDTO so = new SolutionDTO();
				so.setSid(rs.getInt(1));
				so.setUid(rs.getInt(2));
				so.setPid(rs.getInt(3));
				so.setLink(rs.getString(4));
				so.setCode(rs.getString(5));
				so.setStatus(rs.getString(6));
				li.add(so);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	public static int solutionBlock(int id) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update postSolution set status='Blocked' where s_id="+id+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;

	}
	public static int solutionUnBlock(int id) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update postSolution set status=null where s_id="+id+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;

	}
	public static int selectedUserSolution(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(s_id) from postSolution where uid="+id+";";
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
	public static int selectedUserActiveSolution(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(s_id) from postSolution where status is null and uid="+id+";";
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
	public static int selectedUserBlockedSolution(int id) {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(s_id) from postSolution where status='Blocked' and uid="+id+";";
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
	public static int userSolutionReport(int sid,int uid, int usid) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="insert into solutionReport(sid,uid,suid)values("+sid+","+uid+","+usid+");";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;

	}
	public static List<SolutionReportDTO> getSolutionReports(){
		ArrayList<SolutionReportDTO> li = new ArrayList<SolutionReportDTO>();
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select sr_id,sid,uid,suid,status from solutionReport;";
			PreparedStatement stm =connection.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				SolutionReportDTO sr = new SolutionReportDTO();
				sr.setSrId(rs.getInt(1));
				sr.setSid(rs.getInt(2));
				sr.setUid(rs.getInt(3));
				sr.setSuid(rs.getInt(4));
				sr.setStatus(rs.getString(5));
				if(sr.getStatus() != null) {
					
				}else {
					li.add(sr);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return li;
	}
	
	public static int acceptSolutionReport(int tid) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update solutionReport set status='accept' where sr_id="+tid+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
	}
	public static int rejectSolutionReport(int tid) {
		int rowsUpdated =0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql="update solutionReport set status='reject' where sr_id="+tid+";";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			rowsUpdated = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return rowsUpdated;
	}
	public static int selectedReportActiveSolution() {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(sr_id) from solutionReport where status is null;";
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
	public static int selectedReportAcceptSolution() {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(sr_id) from solutionReport where status='accept';";
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
	public static int selectedReportRejectSolution() {
		int i = 0;
		Conn con = new Conn();
		Connection connection = con.connection;
		try {
			String sql = "select count(sr_id) from solutionReport where status='reject';";
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
