package Constructor;

public class AAA {
	int a;
	int b;
	static int c;

	static {
		c = 100;
		System.out.println("초기화 블럭 실행");
	}

	public AAA(int a, int b) {
		this(a);
		this.b = b;
	}

	public AAA(int a) {
		this();
		this.a = a;
		System.out.println("AAA(int) 생성자 호출");
	}

	public AAA() {
		a = 100;
		b = 200;
		System.out.println("AAA() 생성자 호출");
	}
}
