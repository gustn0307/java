package ifs;

import java.util.Scanner;

public class IFTest05 {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("n?");
		n=in.nextInt();
		
		// 조건 검사 2번 하므로 if문이 더 느리다.
		if(n%2==0)
			System.out.println("가위.");
		else if(n%2==1)
			System.out.println("바위");
		else
			System.out.println("보");
		/*
		switch(n%2)
		{
			case 0:
				System.out.println("가위.");break;
			case 1:
				System.out.println("바위.");break;
			case 2:
				System.out.println("보.");break;
		}
		*/
	}
}
