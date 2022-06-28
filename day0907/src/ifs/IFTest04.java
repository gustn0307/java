package ifs;

import java.util.Scanner;

public class IFTest04 {

	public static void main(String[] args) {
		
		Person p1 = new Person();

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("이름입력:");
			p1.name = in.nextLine();
		
			System.out.println("나이입력:");
			p1.age = in.nextInt();
			in.nextLine(); // 버퍼의 엔터 출력해서 다음 nextLine에 들어가지않도록
			
			System.out.println((i+1)+"번째 이름: " + p1.name);
			System.out.println((i+1)+"번째 나이: " + p1.age);
		}
		
	}

}
