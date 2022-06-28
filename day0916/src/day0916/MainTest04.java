package day0916;

public class MainTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone phone=new Phone();
		// 추상 메소드가 포함되어 있지 않아도 추상 클래스는 단독으로 객체 생성 불가능
		
		//Phone.COLOR="빨강"; // final 변수 이므로 변경 불가
		System.out.println(Phone.COLOR);
		
		/*
		 * Phone p=new Phone() {
		 * 
		 * @Override void disp() { System.out.println(); }
		 * 
		 * // void aaa() {} // final 메소드이므로 재정의 불가능 };
		 */
	}
}
