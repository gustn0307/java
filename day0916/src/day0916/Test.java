package day0916;

interface ZZZ{}
interface XXX{}

// 인터페이스 대 인터페이스는 다중 상속 가능
interface FFF extends ZZZ, XXX{}

// 자바에서 인터페이스는 객체의 사용 방법을 정의한 타입으로 볼 수 있다.
// 인터페이스를 통해 객체를 동일한 사용방법으로 이용가능
// interface내의 메소드들은 기본적으로 추상 메소드, 생성자들을 가지지 않음
// 클래스 대 인터페이스는 상속 불가(extends 사용 불가)
// 클래스 대 인터페이스 구현하려면 implements 사용
// 클래스에 메소드 구현해서 객체 생성 가능
public interface Test { // 최상위 클래스가 object가 아님
	 
	//final 키워드가 생략되어 있음(초기화 해주어야함)
	// static 키워드가 생략되어 있음
	// a, b, c, d 변수 모두 final static 변수
	// 인스턴스 변수는 허용하지 않음
	int a=100;
	
	final int b=10;
	
	static int c=20;
	
	final static int d=30;
	
	void disp();
	/*// 1.8 버전부터 바디( {} ) 있는 메소드 사용 가능하지만 default 또는 static 키워드 사용해야 함
	default void aaa() { //
		
	}
	
	static void bbb() {
		
	}
	 */
	
	
}
