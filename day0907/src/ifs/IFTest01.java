package ifs;

import java.util.Scanner;

public class IFTest01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int kor, eng, math;

		int total; // 총점 저장할 변수
		double avg; // 평균을 저장할 변수

		System.out.println("국어 점수:");
		kor = scanner.nextInt();

		System.out.println("영어 점수:");
		eng = scanner.nextInt();

		System.out.println("수학 점수:");
		math = scanner.nextInt();

		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);

	}

}
