package day1019_DBTEST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTest {

	public static void main(String[] args) throws Exception{
		
		String driver = "oracle.jdbc.OracleDriver";
		Class<?> clazz = Class.forName(driver);
		clazz.getDeclaredConstructor().newInstance();
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		conn = DriverManager.getConnection(url, "hr", "hr");
		
		String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, EMAIL, SALARY FROM EMPLOYEES WHERE DEPARTMENT_ID = 100";
		PreparedStatement psmt = conn.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		
		System.out.println("DEPARTMENT_ID 가 100 인 사원의 EMPLOYEE_ID, FIRST_NAME, EMAIL, SALARY 컬럼 정보를 출력");
		while(rs.next()) {
			int empId = rs.getInt(1);
			String firstName = rs.getString(2);
			String email = rs.getString(3);
			int salary = rs.getInt(4);
			System.out.println(empId + " " + firstName + " " + email + " " + salary);
		}

	}
}


