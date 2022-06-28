package Operator;

public class OperatorTest01 {

	public static void main(String[] args) {
		System.out.println(100+10);
		System.out.println(100-10);
		System.out.println(100*10);
		System.out.println(2/3); // 정수 나누기 정수는 정수
		System.out.println(2.0/3); // 실수를 하나 넣어줘야 auto casting되어서 결과도 실수로 나옴
		System.out.println(2/(double)3); // 실수를 하나 넣어줘야 auto casting되어서 결과도 실수로 나옴
		System.out.println(2%3);
		
		int a=10;
		System.out.println(a++); // 10
		System.out.println(a); // 11
	
	}
}
