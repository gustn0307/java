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
			System.out.println("���");
			Socket sk = ss.accept();
			InetSocketAddress isa = (InetSocketAddress) sk.getRemoteSocketAddress();
			System.out.println("����Ϸ� : " + isa.getHostName() + " : " + isa.getAddress());
			
			// �޼��� ����
			InputStream is=sk.getInputStream();
			byte[] buffer=new byte[1024];
			int readCount=is.read(buffer);
			String str=new String(buffer,0,readCount,"utf-8");
			System.out.println("Ŭ���̾�Ʈ�κ��� ������ �޽���: "+str);
			
			// �޽��� ����
			OutputStream os=sk.getOutputStream();
			String msg=sk.getRemoteSocketAddress() +", ��� ";
			os.write(msg.getBytes("utf-8"));
			os.flush();
			System.out.println(sk.getRemoteSocketAddress()+"���� �޼��� ���ۿϷ�");
			is.close();
			os.close();
			sk.close();
		}
		
	}
}
