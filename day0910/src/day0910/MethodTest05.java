package day0910;

import java.util.Scanner;

public class MethodTest05 {
	public static void main(String[] args) {
		MemberService service=new MemberService();
		String id=null;
		String password=null;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("아이디: ");
		id=scanner.nextLine();
		
		System.out.print("비밀번호: ");
		password=scanner.nextLine();
		
		scanner.close();
		
		boolean result=service.login(id,password);
		
		if(result)
			System.out.println("로그인 성공!");
		else
			System.out.println("로그인 실패!");
		
		String msg=service.login2(id,password);
		System.out.println(msg);
		
		
	}
}
