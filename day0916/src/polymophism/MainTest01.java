package polymophism;

public class MainTest01 {

	public static void main(String[] args) {
		Salary man = new Salary("강현수", "수원시", 10, 6000);

		man.mailCheck();
		System.out.println("월급= " + man.calcPay()+" 만원");
		
		System.out.println();
		
		Employee man2=new Employee("강휘원", "서울시", 11);
		man2.mailCheck();

	}

}
