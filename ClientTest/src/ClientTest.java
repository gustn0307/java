import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
//import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) throws IOException {
		Socket sk=new Socket();
		System.out.println("연결요청");
		sk.connect(new InetSocketAddress("localhost", 9999)); //192.168.23.136
		System.out.println("서버와 접속완료!");
		
		//메세지 전송
		String msg="강현수";
		OutputStream os=sk.getOutputStream();
		
		os.write(msg.getBytes("utf-8"));
		os.flush(); //버퍼 비우기
		System.out.println("데이터 전송완료");
		
		// 메세지 수신
		InputStream is=sk.getInputStream();
		byte[] buff=new byte[1024];
		int readCount=is.read(buff);
		
		String str=new String(buff,0,readCount,"utf-8");
		System.out.println("서버에서 수신한 메시지: "+ str);
		
		is.close();
		os.close();
		sk.close();
		
		
//		System.out.print("메세지 입력: ");
//		Scanner in=new Scanner(System.in);
		
//		if(sk.isConnected())
//			sk.close();

	}

}
