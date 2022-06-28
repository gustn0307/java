package constructs;

public class Test02 {

	public static void main(String[] args) {
		// 기본으로 생성자(default 생성자)가 있음(0으로 초기화)
		// 별도로 생성자를 정의하면 별도로 정의한 생성자가 적용됨
		// 생성자를 명시하면 생략되어 있는 default 생성자는 무시됨
		ConstTest01 obj=new ConstTest01(); 
		System.out.println("x= "+obj.x);
		System.out.println("y= "+obj.y);
		
		ConstTest01 obj2=new ConstTest01(10,20); 
		System.out.println("x= "+obj2.x);
		System.out.println("y= "+obj2.y);
		
	}

}
