package ifs;

import java.util.Scanner;

public class IFTest05 {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("n?");
		n=in.nextInt();
		
		// ���� �˻� 2�� �ϹǷ� if���� �� ������.
		if(n%2==0)
			System.out.println("����.");
		else if(n%2==1)
			System.out.println("����");
		else
			System.out.println("��");
		/*
		switch(n%2)
		{
			case 0:
				System.out.println("����.");break;
			case 1:
				System.out.println("����.");break;
			case 2:
				System.out.println("��.");break;
		}
		*/
	}
}
