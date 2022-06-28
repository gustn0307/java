package day1015;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SercerTest {
	// TCP : 연결지향적 프로토콜, 연결상태를 계속 유지 <-> UDP
	// 포트 : 0 ~ 65535
	// 0 ~ 1023 : 예약포트
	// 회사에서 등록해서 사용할 수 있는 포트 : 1024 ~ 49151
	// 운영체제가 부여하는 포트, 개인 목적으로 사용가능한 포트 : 49152 ~ 65535

	public static void main(String[] args) { // tcp : 연결지향적 프로토콜, 연결상태를 계속 유지
		ServerSocket ss = null;
		try {
			// ss=new ServerSocket(9000);
			ss = new ServerSocket();
			// ss.bind(new InetSocketAddress(9000));
			ss.bind(new InetSocketAddress("localhost", 9000));

			while (true) {
				System.out.println("접속 대기중");
				Socket sk = ss.accept(); // 접속 대기
				// 부모클래스 변수= new 자식클래스() --> 다형성
				// 자식클래스 변수= (자식클래스)부모클래스 변수
				InetSocketAddress isa = (InetSocketAddress) sk.getRemoteSocketAddress();

				System.out.println("연결완료: " + isa.getHostName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (!ss.isClosed())
				try {ss.close();} catch (IOException e) {}
		}

	}

}
