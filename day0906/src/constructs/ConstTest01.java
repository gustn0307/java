package constructs;

public class ConstTest01 {
	int x;
	int y;

	//ConstTest01(){} // 기본 생성자가 생략되어 있음
	// 여러 개의 생성자 사용가능
	ConstTest01(int x, int y){
		this.x=x; //멤버변수 x에 매개변수 x 값을 대입
		this.y=y;
	}
	
	ConstTest01(){
		x=100;
		y=200;
	}
}
