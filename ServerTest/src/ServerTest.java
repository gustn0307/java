import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = null;

		ss = new ServerSocket();
		ss.bind(new InetSocketAddress("localhost", 9999));

		while (true) {
			System.out.println("대기");
			Socket sk = ss.accept();
			InetSocketAddress isa = (InetSocketAddress) sk.getRemoteSocketAddress();
			System.out.println("연결완료 : " + isa.getHostName() + " : " + isa.getAddress());
			
			// 메세지 수신
			InputStream is=sk.getInputStream();
			byte[] buffer=new byte[1024];
			int readCount=is.read(buffer);
			String str=new String(buffer,0,readCount,"utf-8");
			System.out.println("클라이언트로부터 수신한 메시지: "+str);
			
			// 메시지 전송
			OutputStream os=sk.getOutputStream();
			String msg=sk.getRemoteSocketAddress() +", 어서와 ";
			os.write(msg.getBytes("utf-8"));
			os.flush();
			System.out.println(sk.getRemoteSocketAddress()+"에게 메세지 전송완료");
			is.close();
			os.close();
			sk.close();
		}
		
	}
}
