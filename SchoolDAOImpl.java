package com.school.dto1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.school.dto.SchoolVO;

public class SchoolDAOImpl {
	
	String driver = "oracle.jdbc.OracleDriver";// oracle.jdbc is package name, oracleDriver is jdbc DriverClass name
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";// oracle connection address, xe: db name, 1521: port no.
	String user = "week";// Oracle connection id
	String password = "week"; // Oracle connection password

	Connection con = null; // Oracle Connection Reference Variable
	PreparedStatement pt = null;// Query statement execution reference variable
	ResultSet rs = null;// Reference variable to store search result records
	String sql = null;// Query statement storage variable

	public SchoolDAOImpl() {
		try {
			Class.forName(driver);// jdbc driverclass load
			con = DriverManager.getConnection(url, user, password);// Create Oracle Connection Con
		} catch (Exception e) {
			e.printStackTrace();
		} // constructor
	}
	
	public int insertStudent(SchoolVO s1) {
		int re = -1;// 저장 실패시 반환값
		try {
			sql = "insert into student (s_id, s_firstname, s_lastname, s_level, s_course1,"
					+ "s_course2, s_course3, s_course4, s_course5, s_payment, s_balance)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?)";
			pt = con.prepareStatement(sql);// 쿼리문을 미리 컴파일해 수행객체 pt생성
			pt.setInt(1, s1.getS_id());// 쿼리문 첫번쨰 물음표에 문자열로 작성자 저장
			pt.setString(2, s1.getS_firstname());
			pt.setString(3, s1.getS_lastname());
			pt.setInt(4, s1.getS_level());
			pt.setString(5, s1.getS_course1());
			pt.setString(6, s1.getS_course1());
			pt.setString(7, s1.getS_course1());
			pt.setString(8, s1.getS_course1());
			pt.setString(9, s1.getS_course1());
			pt.setInt(10, s1.getS_payment());
			pt.setInt(11, s1.getS_balance());
			re = pt.executeUpdate();// 저장쿼리문 수행 후 성공한 레드행의 개수를 반환
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pt != null)
					pt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return re;
	}
	
	
	public List<SchoolVO> getSchoolList() {
		List<SchoolVO> stulist = new ArrayList<SchoolVO>();
		try {
			sql = "select * from student order by g_no desc";
			// i
			// s sorted first.
			pt = con.prepareStatement(sql);
			rs = pt.executeQuery();
			while (rs.next()) {// If the search results are multiple, bring them to while repeat
				// Next() Methods are true when the next record line exists
				SchoolVO s = new SchoolVO();
				s.setS_id(rs.getInt("s_id"));
				s.setS_firstname(rs.getString("s_firstname"));
				s.setS_lastname(rs.getString("s_lastname"));
				s.setS_level(rs.getInt("s_level"));
				s.setS_course1(rs.getString("s_course1"));
				s.setS_course2(rs.getString("s_course2"));
				s.setS_course3(rs.getString("s_course3"));
				s.setS_course4(rs.getString("s_course4"));
				s.setS_course5(rs.getString("s_course5"));
				s.setS_payment(rs.getInt("s_payment"));
				s.setS_balance(rs.getInt("s_balance"));
				s.setCount(rs.getInt("s_count"));
				stulist.add(s);// add data to collection
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pt != null)
					pt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return stulist;
	}// getGuList()

	
	
}