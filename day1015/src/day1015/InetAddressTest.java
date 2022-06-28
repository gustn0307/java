package day1015;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest { // IP확인

	public static void main(String[] args)  {
		
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 IP 주소는? " + local);
			
			InetAddress[] nav = InetAddress.getAllByName("www.daum.net");
			System.out.println("daum IP 주소는? " + nav);
			
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
