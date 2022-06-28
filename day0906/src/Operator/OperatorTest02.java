package Operator;

public class OperatorTest02 {
	public static void main(String[] args) {
		int a = 10, b = 20;

		// 관계연산자
		System.out.println(a == b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		System.out.println(!(a != b));

		System.out.println((a > b) && a > 0); // false && true , 앞의 조건이 거짓이면 뒤에 조건 확인 안함
		System.out.println(a > 0 && a > b); // true && false , 앞의 조건이 참이면 뒤에 조건 확인함

	}

}
