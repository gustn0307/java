package day1015;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest { // IPȮ��

	public static void main(String[] args)  {
		
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("�� IP �ּҴ�? " + local);
			
			InetAddress[] nav = InetAddress.getAllByName("www.daum.net");
			System.out.println("daum IP �ּҴ�? " + nav);
			
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
