package day1015;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SercerTest {
	// TCP : ���������� ��������, ������¸� ��� ���� <-> UDP
	// ��Ʈ : 0 ~ 65535
	// 0 ~ 1023 : ������Ʈ
	// ȸ�翡�� ����ؼ� ����� �� �ִ� ��Ʈ : 1024 ~ 49151
	// �ü���� �ο��ϴ� ��Ʈ, ���� �������� ��밡���� ��Ʈ : 49152 ~ 65535

	public static void main(String[] args) { // tcp : ���������� ��������, ������¸� ��� ����
		ServerSocket ss = null;
		try {
			// ss=new ServerSocket(9000);
			ss = new ServerSocket();
			// ss.bind(new InetSocketAddress(9000));
			ss.bind(new InetSocketAddress("localhost", 9000));

			while (true) {
				System.out.println("���� �����");
				Socket sk = ss.accept(); // ���� ���
				// �θ�Ŭ���� ����= new �ڽ�Ŭ����() --> ������
				// �ڽ�Ŭ���� ����= (�ڽ�Ŭ����)�θ�Ŭ���� ����
				InetSocketAddress isa = (InetSocketAddress) sk.getRemoteSocketAddress();

				System.out.println("����Ϸ�: " + isa.getHostName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (!ss.isClosed())
				try {ss.close();} catch (IOException e) {}
		}

	}

}
