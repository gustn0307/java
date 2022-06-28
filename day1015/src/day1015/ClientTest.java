package day1015;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientTest {

	public static void main(String[] args) {
		Socket sk = null;

		try {
			sk = new Socket();
			sk.connect(new InetSocketAddress("localhost", 9000));
			System.out.println("������ ����Ϸ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sk.isConnected()) {
				try {
					sk.close();
				} catch (IOException e) {
				}
				System.out.println("��������");
			}
		}
	}
}
