package Constructor;

public class ConTest01 {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		System.out.println(aaa.a);
		System.out.println(aaa.b);

		AAA aaa1 = new AAA(10);
		System.out.println(aaa1.a);
		System.out.println(aaa1.b);

		System.out.println("static 변수는 클래스명.변수명으로 접근 c: " + AAA.c);
	}
}
