package polymophism;

public class Employee {
	// encapsulation(private�� �����ؼ� ���ʿ��� ������ ����)
	private String name;
	private String address;
	private int num;

	public Employee(String name, String address,int num) { // ������
		this.name=name;
		this.address=address;
		this.num=num;
	}
	
	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}

	@Override
	public String toString() {
		return "Employee= " + name + "Address= " + address + " number= " + num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
