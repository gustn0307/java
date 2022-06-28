package day0916;

// 클래스 대 클래스는 다중 상속이 불가능하나
// 클래스 대 인터페이스는 다중 구현이 가능
public class MainTest05 implements Test, FFF{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test.a);
		Test test=new MainTest05();
		test.disp();
	}

	@Override
	public void disp() {
		System.out.println("인터페이스의 추상 메소드를 구현해서 사용");
		
	}

}
