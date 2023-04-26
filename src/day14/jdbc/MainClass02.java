package day14.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass02 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;

		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");

			// 3. 쿼리 수행을 위한 Statement 객체 생성
			stmt = conn.createStatement();

			// 4. SQL 쿼리 작성 DML
			String sql = "INSERT INTO sales_reps " + "VALUES (2, '라이츄', 200, 0.2)";

			// 5. 쿼리 수행
			int result = stmt.executeUpdate(sql);

			// 6. 실행결과 출력하기
			if (result > 0) {
				System.out.println("데이터 추가 성공!");
			} else {

			} System.out.println("result : " + result);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close(); // close를 반드시 해줘야한다
			
		}

	}

}
