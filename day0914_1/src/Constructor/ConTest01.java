package Constructor;

public class ConTest01 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		System.out.println(aaa.a);
		System.out.println(aaa.b);

		AAA aaa1 = new AAA(10);
		System.out.println(aaa1.a);
		System.out.println(aaa1.b);

		System.out.println("static ������ Ŭ������.���������� ���� c: " + AAA.c);
	}
}
