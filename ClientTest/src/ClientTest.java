import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
//import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) throws IOException {
		Socket sk=new Socket();
		System.out.println("�����û");
		sk.connect(new InetSocketAddress("localhost", 9999)); //192.168.23.136
		System.out.println("������ ���ӿϷ�!");
		
		//�޼��� ����
		String msg="������";
		OutputStream os=sk.getOutputStream();
		
		os.write(msg.getBytes("utf-8"));
		os.flush(); //���� ����
		System.out.println("������ ���ۿϷ�");
		
		// �޼��� ����
		InputStream is=sk.getInputStream();
		byte[] buff=new byte[1024];
		int readCount=is.read(buff);
		
		String str=new String(buff,0,readCount,"utf-8");
		System.out.println("�������� ������ �޽���: "+ str);
		
		is.close();
		os.close();
		sk.close();
		
		
//		System.out.print("�޼��� �Է�: ");
//		Scanner in=new Scanner(System.in);
		
//		if(sk.isConnected())
//			sk.close();

	}

}
