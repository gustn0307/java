package Operator;

public class OperatorTest02 {
	public static void main(String[] args) {
		int a = 10, b = 20;

		// ���迬����
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		System.out.println(!(a != b));

		System.out.println((a > b) && a > 0); // false && true , ���� ������ �����̸� �ڿ� ���� Ȯ�� ����
		System.out.println(a > 0 && a > b); // true && false , ���� ������ ���̸� �ڿ� ���� Ȯ����

	}

}
