package ifs;

import java.util.Scanner;

public class IFTest03 {

	public static void main(String[] args) {
		String name;
		int age;
		String phone;
		
		Scanner in = new Scanner(System.in);
		System.out.println("이름입력 ");
		name=in.nextLine();
		System.out.println("나이 입력");
		age=in.nextInt();
		//버퍼의 엔터를 제거해야 nextLine() 사용 가능
		System.out.println("전번 입력");
		phone=in.nextLine(); //전에 입력되어 있던 버퍼의 엔터가 인식되어서 바로 끝나버림 
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("전번: "+phone);

	}

}
