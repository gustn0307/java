package day0910;

import java.util.Scanner;

public class MethodTest05 {
	public static void main(String[] args) {
		MemberService service=new MemberService();
		String id=null;
		String password=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("���̵�: ");
		id=scanner.nextLine();
		
		System.out.print("��й�ȣ: ");
		password=scanner.nextLine();
		
		scanner.close();
		
		boolean result=service.login(id,password);
		
		if(result)
			System.out.println("�α��� ����!");
		else
			System.out.println("�α��� ����!");
		
		String msg=service.login2(id,password);
		System.out.println(msg);
		
		
	}
}
