package polymophism;

public class Salary extends Employee{
	
	private double salary; // 연봉
	
	public Salary(String name, String address, int num,double salary) { // 생성자
		super(name, address, num);
		this.salary=salary;
	}
	
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class");
		System.out.println("Mailing a check to "+getName()+" with Salary "+salary+" 만원");
	}

	public double calcPay() {
		System.out.println("Computing salary pay for "+getName());
		return salary/12; // 월급
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
