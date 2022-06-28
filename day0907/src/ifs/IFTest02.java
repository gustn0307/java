package ifs;

import java.util.Scanner;

public class IFTest02 {

	public static void main(String[] args) {
		String str,str2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("첫번째 문자열 입력");
		// next()는 공백문자 기준으로 token, nextLine은 엔터 기준으로 한 줄
		str=scanner.nextLine();
		
		System.out.println("두번째 문자열 입력");
		str2=scanner.nextLine();
		
		System.out.println("첫번째 문자열? "+ str);
		System.out.println("두번째 문자열? "+ str2);
	}

}
