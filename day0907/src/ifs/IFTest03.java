package ifs;

import java.util.Scanner;

public class IFTest03 {

	public static void main(String[] args) {
		String name;
		int age;
		String phone;
		
		Scanner in = new Scanner(System.in);
		System.out.println("�̸��Է� ");
		name=in.nextLine();
		System.out.println("���� �Է�");
		age=in.nextInt();
		//������ ���͸� �����ؾ� nextLine() ��� ����
		System.out.println("���� �Է�");
		phone=in.nextLine(); //���� �ԷµǾ� �ִ� ������ ���Ͱ� �νĵǾ �ٷ� �������� 
		
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("����: "+phone);

	}

}
