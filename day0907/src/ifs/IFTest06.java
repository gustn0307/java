package ifs;

import java.util.Random;
import java.util.Scanner;

public class IFTest06 {

	public static void main(String[] args) {
		// com vs 유저 가위 바위 보 게임
		int user; // 키보드 입력
		int com; // 자동 생성

		Scanner in = new Scanner(System.in);

		System.out.println("입력(1. 가위, 2. 바위, 3. 보)");
		user = in.nextInt();

		System.out.println("user: ");
		switch (user) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("1 ~ 3 중에서 선택!");
			System.out.println("프로그램 종료");
			//System.exit(0); //시스템 종료
			//return; // 메인 함수 종료
			
		}

		Random ran = new Random();

		// com=ran.nextInt(3); // 0 ~ 2
		com = ran.nextInt(3) + 1; // 1 ~ 3
		
		System.out.println("com: ");
		switch (com) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		default:
			System.out.println("1 ~ 3 중에서 선택!");
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
		switch(user-com) //조건 검사 한번만 하므로 더 효율적
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
