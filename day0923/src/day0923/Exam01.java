package day0923;

import java.util.Scanner;

public class Exam01 {
	String name;
	int age;
	String phone;
	public void input() {
		Scanner in =new Scanner(System.in);
		System.out.print("이름:");
		this.name=in.nextLine();
		System.out.print("나이:");
		this.age=in.nextInt();
		in.nextLine(); // 엔터 값 제거
		System.out.print("전화번호:");
		this.phone=in.nextLine();
		
		in.close();
	}
	public void display() {
		System.out.println("이름: "+this.name
				+", 나이: "+ this.age+", 전화번호: "+this.phone);
		
	}
}
