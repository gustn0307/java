package day0916;

// Ŭ���� �� Ŭ������ ���� ����� �Ұ����ϳ�
// Ŭ���� �� �������̽��� ���� ������ ����
public class MainTest05 implements Test, FFF{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test.a);
		Test test=new MainTest05();
		test.disp();
	}

	@Override
	public void disp() {
		System.out.println("�������̽��� �߻� �޼ҵ带 �����ؼ� ���");
		
	}

}
