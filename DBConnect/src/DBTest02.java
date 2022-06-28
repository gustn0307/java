import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;
import java.util.Vector;

public class DBTest02 {

	public static void main(String[] args) throws Exception{
		String driver="oracle.jdbc.OracleDriver";
		
		Class.forName(driver).getDeclaredConstructor().newInstance();
		System.out.println("Oracle Driver!");
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="khs";
		String password="oracle";
		
		Connection conn=null;
		conn=DriverManager.getConnection(url, user, password);
		System.out.println("DB ���ӿϷ�!");
		
		String sql="select * from member order by no"; // no������ ����
		
		PreparedStatement pstmt= conn.prepareStatement(sql);
		ResultSet rs= pstmt.executeQuery();
		
		List<Member> list =new Vector<Member>();
		
		System.out.println();
		System.out.println("�޼ҵ�� ���̺� ���");
		while(rs.next()) {			
			int no=rs.getInt("no");			
			String email=rs.getString("email");			
			String pass=rs.getString("pass");			
			String name=rs.getString("name");			
			String phone=rs.getString("phone");			
			Timestamp created_date= rs.getTimestamp("created_date");
			Timestamp updated_date= rs.getTimestamp("updated_date");
			Member mem=new Member(no, email, pass, name, phone, created_date, updated_date);
			mem.disp();
			list.add(mem);

		}
		System.out.println();
		System.out.println("list�� ��� ���");
		for(Member mem:list) {
			System.out.println(mem);
		}
		
		if(conn!=null)
			conn.close();

	}

}
