package polymophism;

public class MainTest01 {

	public static void main(String[] args) {
		Salary man = new Salary("������", "������", 10, 6000);

		man.mailCheck();
		System.out.println("����= " + man.calcPay()+" ����");
		
		System.out.println();
		
		Employee man2=new Employee("���ֿ�", "�����", 11);
		man2.mailCheck();

	}

}
