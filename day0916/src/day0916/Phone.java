package day0916;

public abstract class Phone {
	final static String COLOR = "검정"; // static 영역에 할당되어 추상 클래스의 멤버변수여도 접근가능

	abstract void disp();

	final void aaa() { // final이 붙으면 무조건 초기화를 해줘야 함

	}
	public Phone() {

	}
}
