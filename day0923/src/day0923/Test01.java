package day0923;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int kor,eng,mat,tot;
		double avg;
		
		Scanner in =new Scanner(System.in);
		System.out.print("���� ����:");
		kor=in.nextInt();
		System.out.print("���� ����:");
		eng=in.nextInt();
		System.out.print("���� ����:");
		mat=in.nextInt();
		in.close();
		
		tot=Compute.colc(kor,eng,mat);
		
		avg=Compute.colcAvg(tot);
		
		System.out.printf("����: %d, ���: %.2f", tot,avg);
		
	}
}
