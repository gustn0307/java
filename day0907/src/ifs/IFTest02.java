package ifs;

import java.util.Scanner;

public class IFTest02 {

	public static void main(String[] args) {
		String str,str2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("ù��° ���ڿ� �Է�");
		// next()�� ���鹮�� �������� token, nextLine�� ���� �������� �� ��
		str=scanner.nextLine();
		
		System.out.println("�ι�° ���ڿ� �Է�");
		str2=scanner.nextLine();
		
		System.out.println("ù��° ���ڿ�? "+ str);
		System.out.println("�ι�° ���ڿ�? "+ str2);
	}

}
