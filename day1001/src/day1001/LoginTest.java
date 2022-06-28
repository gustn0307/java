package day1001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Scanner;

public class LoginTest { // 로그인 연습 예제

	public static void main(String[] args) throws Exception { // 한번에 여러 Exception 처리
		String id; // 로그인 아이디
		String pw; // 로그인 비번
		String driverClassname = "oracle.jdbc.OracleDriver"; // 드라이버 위치
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // oracle db 주소
		String user = "khs"; // oracle db 유저이름
		String pass = "oracle"; // oracle db 비번

		Scanner in = new Scanner(System.in); // 키보드로 부터 입력받기 위한 scanner

		System.out.print("id: "); // id 입력
		id = in.nextLine();
		System.out.print("password: "); // 비번 입력
		pw = in.nextLine();
		in.close();

		Class.forName(driverClassname).getDeclaredConstructor().newInstance(); // 드라이버 적용
		System.out.println("드라이버 확인!");

		Connection conn = null;
		conn = DriverManager.getConnection(url, user, pass); // DB와 연결
		System.out.println("DB 접속완료");

		// 쿼리 인젝션을 통해 해킹 위험이 있으므로 id와 pwd 따로 설정해주어야 함
		String sql = "select * from person where id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql); // sql변수에 저장해놓은 명령문 연결
		pstmt.setString(1, id); // 1번째 인자에 키보드로 입력받은 id를 set
		pstmt.setString(2, pw); // 2번째 인자에 키보드로 입력받은 pw를 set
		
		// 추상 메소드 executeQuery()로 쿼리를 실행해서 ResultSet에 저장
		ResultSet rs = pstmt.executeQuery();
		
		//Statement문을 이용해 쿼리문 전달 --> ' or 1=1 의 인젝션 공격이 통함
//		String sql = "select * from person where id='"+id+"'";
//		Statement state=conn.createStatement();
//		ResultSet rs = state.executeQuery(sql);
		
		if (rs.next()) {
			//System.out.println("로그인 완료"); // 존재하면 로그인 성공
			System.out.println(id + "아이디가 존재");
			String pwd = rs.getString("pw");
			if(pwd.equals(pw)) // 키보드로 입력한 비번과 DB안의 비번이 일치하는지 확인
				System.out.println("로그인 완료!");
			else
				System.out.println("비밀번호가 틀렸습니다.");
		} else {
			// System.out.println("로그인 실패"); // 존재하지 않으면 로그인 실패
			System.out.println("회원가입 후 이용해주세요"); // 무엇이 틀렸는지 알려주지 않아야 함
		}
	}

}
