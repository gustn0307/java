package ifs;

import java.util.Random;
import java.util.Scanner;

public class IFTest06 {

	public static void main(String[] args) {
		// com vs ���� ���� ���� �� ����
		int user; // Ű���� �Է�
		int com; // �ڵ� ����

		Scanner in = new Scanner(System.in);

		System.out.println("�Է�(1. ����, 2. ����, 3. ��)");
		user = in.nextInt();

		System.out.println("user: ");
		switch (user) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("1 ~ 3 �߿��� ����!");
			System.out.println("���α׷� ����");
			//System.exit(0); //�ý��� ����
			//return; // ���� �Լ� ����
			
		}

		Random ran = new Random();

		// com=ran.nextInt(3); // 0 ~ 2
		com = ran.nextInt(3) + 1; // 1 ~ 3
		
		System.out.println("com: ");
		switch (com) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("1 ~ 3 �߿��� ����!");
			break;
		}
		
		if(com==1&&user==3)
			System.out.println("com win!");
		else if(com==3&&user==1)
			System.out.println("user win!");
		else if(com<user)
			System.out.println("user win!");
		else if(com>user)
			System.out.println("com win!");
		else
			System.out.println("Draw!");
		/*
		switch(user-com) //���� �˻� �ѹ��� �ϹǷ� �� ȿ����
		{
		case 1: case -2:
			System.out.println("user win!");break;
		case -1: case 2:
			System.out.println("com win!");break;
		case 0:
			System.out.println("draw");break;
		}
		*/
	}

}
