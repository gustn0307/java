
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest {

	public static void main(String[] args) {
		String driverClassName = "oracle.jdbc.OracleDriver";
		try {
			Class<?> clazz = Class.forName(driverClassName);
			clazz.getDeclaredConstructor().newInstance();
			System.out.println("driver Ȯ��!");
		} catch (Exception e1) {
			System.out.println("����̹��� �������� �ʽ��ϴ�.");
		}

		Connection conn = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "khs";
		String password = "oracle";
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB���ӿϷ�");
//			String sql="insert into member"
//					+ " values(seq_member.nextval,"
//					+ " 'test03@test.com', '1234', "
//					+ "'�׽�Ʈ3', '010-3333-3333', "
//					+ "sysdate, sysdate)";
			String sql="insert into member"
					+ " values(seq_member.nextval,"
					+ " ?, ?, ?, ?, "
					+ "sysdate, sysdate)";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			Scanner in =new Scanner(System.in);
			System.out.print("email: ");
			String email=in.nextLine();
			
			System.out.print("password: ");
			String pass=in.nextLine();
			
			System.out.print("name: ");
			String name=in.nextLine();
			
			System.out.print("Phone: ");
			String phone=in.nextLine();
			in.close();
			
			pstmt.setString(1, email);
			pstmt.setString(2, pass);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			
			int n=pstmt.executeUpdate();
			System.out.println(n+"���� �����Ͱ� ���ԵǾ����ϴ�.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //try(�������), catch(����ó��) �� �� ������ ����ǵ� finally�� �������� ������ ����
			//try {if(pstmt!=null)pstmt.close();} catch (SQLException e) {}
			try {if (conn != null)conn.close();} catch (SQLException e) {}	
		}
	}
}
