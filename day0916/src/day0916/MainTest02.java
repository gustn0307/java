package day0916;

public class MainTest02 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.display();

		Super super1 = new Super();
		super1.display();

		// �������� Sub�� �ν��Ͻ�ȭ �ϰ� ������ Super �������� ����
		// override �޼ҵ�� Sub���� �����Ǹ� �� ������ ����ȴ�.
		Super super2 = new Sub();
		super2.display();
	}

}
