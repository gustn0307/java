package day0923;

import java.util.Scanner;

public class Exam01 {
	String name;
	int age;
	String phone;
	public void input() {
		Scanner in =new Scanner(System.in);
		System.out.print("�̸�:");
		this.name=in.nextLine();
		System.out.print("����:");
		this.age=in.nextInt();
		in.nextLine(); // ���� �� ����
		System.out.print("��ȭ��ȣ:");
		this.phone=in.nextLine();
		
		in.close();
	}
	public void display() {
		System.out.println("�̸�: "+this.name
				+", ����: "+ this.age+", ��ȭ��ȣ: "+this.phone);
		
	}
}
