package day14.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * [[ JDBC (Java Database Connectivity) ]]
 * 	자바 어플리케이션에서 데이터베이스와 통신할 수 있는 API
 * 
 * JDBC 설정
 * 	해당 DBMS 관련 jdbc.jar 추가해야한다. ex) ojdbc8.jar
 *  [Build path] -> [Configure Build path ...] -> [Libraries] 탭 
 *  -> [Add External JARs..] 로 jdbc.jar 파일 추가하기
 *  
 */
public class MainClass01 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. 쿼리 수행을 위한 Statement 객체 생성
			stmt = conn.createStatement();
			
			// 4. SQL 쿼리작성 
			String param = "30";
			String sql = "SELECT * "
					+ "FROM employees "
					+ "WHERE department_id=" + param;
			
			// 5. 쿼리 수행
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String employeedId = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				
				System.out.println(employeedId+"/"+firstName+"/"+lastName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null)rs.close();
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
		}
	}
}



