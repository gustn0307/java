package day0916;

public class MainTest02 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.display();

		Super super1 = new Super();
		super1.display();

		// 다형성을 Sub로 인스턴스화 하고 접근은 Super 기준으로 접근
		// override 메소드는 Sub에서 재정의를 한 문장이 실행된다.
		Super super2 = new Sub();
		super2.display();
	}

}
