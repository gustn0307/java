package random;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random ran = new Random();
		int n = ran.nextInt(45) + 1;

		System.out.println(n);

		// Math ma=new Math();
		// Math.random(); //greater than or equal to 0.0 and less than 1.0
		// 0.0 �̻� 1.0 �̸�
		// System.out.println((Math.random()*10));
		
		int a = (int) (Math.random() * 10); // 0 ~ 9
		// int ������ ����ȯ

		a = (int) (Math.random() * 5) + 1; // 0 ~ 5

		for (int i = 0; i < 100; i++) {
			a = (int) (Math.random() * 45) + 1; // 1 ~ 45
			System.out.println(a);
		}

	}

}
