package Operator;

public class OperatorTest01 {

	public static void main(String[] args) {
		System.out.println(100+10);
		System.out.println(100-10);
		System.out.println(100*10);
		System.out.println(2/3); // ���� ������ ������ ����
		System.out.println(2.0/3); // �Ǽ��� �ϳ� �־���� auto casting�Ǿ ����� �Ǽ��� ����
		System.out.println(2/(double)3); // �Ǽ��� �ϳ� �־���� auto casting�Ǿ ����� �Ǽ��� ����
		System.out.println(2%3);
		
		int a=10;
		System.out.println(a++); // 10
		System.out.println(a); // 11
	
	}
}
