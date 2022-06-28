package day1014;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class ReadList {

	public static void main(String[] args) throws Exception{
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="khs";
		String pass="oracle";
		
		Connection conn=DriverManager.getConnection(url, user, pass);
		
		String query="select * frim list where no>0";
		
		PreparedStatement psmt=conn.prepareStatement(query);
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next())
		{
			int no=rs.getInt("no");
			String goods=rs.getString("goods");
			int sales=rs.getInt("sales");
			Timestamp salesDate=rs.getTimestamp("sales_date");
			
			System.out.println(no+ ", "+goods+", "+sales+", "+salesDate);
		
		}

	}

}
