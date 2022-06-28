package day1001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Scanner;

public class LoginTest { // �α��� ���� ����

	public static void main(String[] args) throws Exception { // �ѹ��� ���� Exception ó��
		String id; // �α��� ���̵�
		String pw; // �α��� ���
		String driverClassname = "oracle.jdbc.OracleDriver"; // ����̹� ��ġ
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // oracle db �ּ�
		String user = "khs"; // oracle db �����̸�
		String pass = "oracle"; // oracle db ���

		Scanner in = new Scanner(System.in); // Ű����� ���� �Է¹ޱ� ���� scanner

		System.out.print("id: "); // id �Է�
		id = in.nextLine();
		System.out.print("password: "); // ��� �Է�
		pw = in.nextLine();
		in.close();

		Class.forName(driverClassname).getDeclaredConstructor().newInstance(); // ����̹� ����
		System.out.println("����̹� Ȯ��!");

		Connection conn = null;
		conn = DriverManager.getConnection(url, user, pass); // DB�� ����
		System.out.println("DB ���ӿϷ�");

		// ���� �������� ���� ��ŷ ������ �����Ƿ� id�� pwd ���� �������־�� ��
		String sql = "select * from person where id=?";
		PreparedStatement pstmt = conn.prepareStatement(sql); // sql������ �����س��� ��ɹ� ����
		pstmt.setString(1, id); // 1��° ���ڿ� Ű����� �Է¹��� id�� set
		pstmt.setString(2, pw); // 2��° ���ڿ� Ű����� �Է¹��� pw�� set
		
		// �߻� �޼ҵ� executeQuery()�� ������ �����ؼ� ResultSet�� ����
		ResultSet rs = pstmt.executeQuery();
		
		//Statement���� �̿��� ������ ���� --> ' or 1=1 �� ������ ������ ����
//		String sql = "select * from person where id='"+id+"'";
//		Statement state=conn.createStatement();
//		ResultSet rs = state.executeQuery(sql);
		
		if (rs.next()) {
			//System.out.println("�α��� �Ϸ�"); // �����ϸ� �α��� ����
			System.out.println(id + "���̵� ����");
			String pwd = rs.getString("pw");
			if(pwd.equals(pw)) // Ű����� �Է��� ����� DB���� ����� ��ġ�ϴ��� Ȯ��
				System.out.println("�α��� �Ϸ�!");
			else
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else {
			// System.out.println("�α��� ����"); // �������� ������ �α��� ����
			System.out.println("ȸ������ �� �̿����ּ���"); // ������ Ʋ�ȴ��� �˷����� �ʾƾ� ��
		}
	}

}
