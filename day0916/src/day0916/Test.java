package day0916;

interface ZZZ{}
interface XXX{}

// �������̽� �� �������̽��� ���� ��� ����
interface FFF extends ZZZ, XXX{}

// �ڹٿ��� �������̽��� ��ü�� ��� ����� ������ Ÿ������ �� �� �ִ�.
// �������̽��� ���� ��ü�� ������ ��������� �̿밡��
// interface���� �޼ҵ���� �⺻������ �߻� �޼ҵ�, �����ڵ��� ������ ����
// Ŭ���� �� �������̽��� ��� �Ұ�(extends ��� �Ұ�)
// Ŭ���� �� �������̽� �����Ϸ��� implements ���
// Ŭ������ �޼ҵ� �����ؼ� ��ü ���� ����
public interface Test { // �ֻ��� Ŭ������ object�� �ƴ�
	 
	//final Ű���尡 �����Ǿ� ����(�ʱ�ȭ ���־����)
	// static Ű���尡 �����Ǿ� ����
	// a, b, c, d ���� ��� final static ����
	// �ν��Ͻ� ������ ������� ����
	int a=100;
	
	final int b=10;
	
	static int c=20;
	
	final static int d=30;
	
	void disp();
	/*// 1.8 �������� �ٵ�( {} ) �ִ� �޼ҵ� ��� ���������� default �Ǵ� static Ű���� ����ؾ� ��
	default void aaa() { //
		
	}
	
	static void bbb() {
		
	}
	 */
	
	
}
