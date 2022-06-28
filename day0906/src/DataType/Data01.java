package DataType;

import jdk.jfr.Unsigned;

public class Data01 {

	public static void main(String[] args) {
		//ctrl + shift + f : 코드 정렬
		// 정수형
		byte a; // 1 byte
		short b; // 2 byte
		int c; // 4 byte
		long d; // 8 byte
		char ch; // 2 byte
		
		System.out.println(Byte.BYTES + "byte");
		System.out.println(Short.BYTES + "byte");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.BYTES + "byte");
		System.out.println(Long.BYTES + "byte");

		System.out.println(Character.BYTES + "byte");
		System.out.println((int) (Character.MIN_VALUE));
		System.out.println((int) (Character.MAX_VALUE));

		// 실수형
		// c언어는 자동으로 casting 해주지만 java는 변수형에 엄격
		float f1 = 3.14f; // 4 byte
		double f2 = 3.14; // 8 byte

		System.out.println(Float.BYTES + "byte");
		System.out.println(Double.BYTES + "byte");

		// boolean형 (true or false)
		boolean bool = true;

	}

}
