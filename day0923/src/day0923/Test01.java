package day0923;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int kor,eng,mat,tot;
		double avg;
		
		Scanner in =new Scanner(System.in);
		System.out.print("국어 점수:");
		kor=in.nextInt();
		System.out.print("영어 점수:");
		eng=in.nextInt();
		System.out.print("수학 점수:");
		mat=in.nextInt();
		in.close();
		
		tot=Compute.colc(kor,eng,mat);
		
		avg=Compute.colcAvg(tot);
		
		System.out.printf("총점: %d, 평균: %.2f", tot,avg);
		
	}
}
