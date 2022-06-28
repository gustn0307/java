package day1014;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTEST {

	public static void main(String[] args) throws Exception{
		//driver
		String driver="oracle.jdbc.OracleDriver";
		Class<?> clazz=Class.forName(driver);
		
		clazz.getDeclaredConstructor().newInstance();
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="khs";
		String pass="oracle";
		
		Connection conn=null;
		conn=DriverManager.getConnection(url, user, pass);
		System.out.println("DB접속완료!");
		
		
	}

}
