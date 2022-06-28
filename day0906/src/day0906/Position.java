package day0906;

public class Position { // 클래스의 구성요소: 멤버변수, 멤버 메소드, 생성자, 중첩 클래스
	// 멤버변수(클래스변수), 초기화하지 않아도 default(0)로 초기화, c언어의 전역변수 느낌
	int x;
	int y;
	//String str=null;
	//char ch='\0'; //null
	//boolean bool=false;
	//double d=0.0;
	
	
	//멤버 메소드
	void display() {
		int a; // 지역변수, 초기화 해주어야 함
		int b;
		System.out.println("x = "+x);
		//System.out.printf("x = %d", x); //c언어 문법도 제공
		System.out.println("y = "+y);
	}
	
	// 생성자: 클래스 이름이 생성자 이름이다, 객체를 초기화하는 역할
	// 리턴형 타입 자체 존재하지 않는다
	// 기본으로 0으로 초기화해주는 생성자 제공되어 0으로 초기화할거면 생성자 작성하지 않아도 됨
	
	Position(){
		 x=0; // 초기화, 0으로 초기화해줄거면 안넣어도 default로 해줌
		 y=0;
	}
	
	//중첩 클래스
	class Inner{
		
	}

}
