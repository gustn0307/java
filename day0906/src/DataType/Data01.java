package DataType;

import jdk.jfr.Unsigned;

public class Data01 {

	public static void main(String[] args) {
		//ctrl + shift + f : �ڵ� ����
		// ������
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

		// �Ǽ���
		// c���� �ڵ����� casting �������� java�� �������� ����
		float f1 = 3.14f; // 4 byte
		double f2 = 3.14; // 8 byte

		System.out.println(Float.BYTES + "byte");
		System.out.println(Double.BYTES + "byte");

		// boolean�� (true or false)
		boolean bool = true;

	}

}
