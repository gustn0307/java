package ifs;

import java.util.Scanner;

public class IFTest04 {

	public static void main(String[] args) {
		
		Person p1 = new Person();

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("�̸��Է�:");
			p1.name = in.nextLine();
		
			System.out.println("�����Է�:");
			p1.age = in.nextInt();
			in.nextLine(); // ������ ���� ����ؼ� ���� nextLine�� �����ʵ���
			
			System.out.println((i+1)+"��° �̸�: " + p1.name);
			System.out.println((i+1)+"��° ����: " + p1.age);
		}
		
	}

}
