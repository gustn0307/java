package ifs;

import java.util.Scanner;

public class IFTest01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int kor, eng, math;

		int total; // ���� ������ ����
		double avg; // ����� ������ ����

		System.out.println("���� ����:");
		kor = scanner.nextInt();

		System.out.println("���� ����:");
		eng = scanner.nextInt();

		System.out.println("���� ����:");
		math = scanner.nextInt();

		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println("����: " + total);
		System.out.println("���: " + avg);

	}

}
