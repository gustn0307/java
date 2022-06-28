package polymophism;

public class Salary extends Employee{
	
	private double salary; // ����
	
	public Salary(String name, String address, int num,double salary) { // ������
		super(name, address, num);
		this.salary=salary;
	}
	
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class");
		System.out.println("Mailing a check to "+getName()+" with Salary "+salary+" ����");
	}

	public double calcPay() {
		System.out.println("Computing salary pay for "+getName());
		return salary/12; // ����
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
