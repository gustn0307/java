package day0906;

public class Position { // Ŭ������ �������: �������, ��� �޼ҵ�, ������, ��ø Ŭ����
	// �������(Ŭ��������), �ʱ�ȭ���� �ʾƵ� default(0)�� �ʱ�ȭ, c����� �������� ����
	int x;
	int y;
	//String str=null;
	//char ch='\0'; //null
	//boolean bool=false;
	//double d=0.0;
	
	
	//��� �޼ҵ�
	void display() {
		int a; // ��������, �ʱ�ȭ ���־�� ��
		int b;
		System.out.println("x = "+x);
		//System.out.printf("x = %d", x); //c��� ������ ����
		System.out.println("y = "+y);
	}
	
	// ������: Ŭ���� �̸��� ������ �̸��̴�, ��ü�� �ʱ�ȭ�ϴ� ����
	// ������ Ÿ�� ��ü �������� �ʴ´�
	// �⺻���� 0���� �ʱ�ȭ���ִ� ������ �����Ǿ� 0���� �ʱ�ȭ�ҰŸ� ������ �ۼ����� �ʾƵ� ��
	
	Position(){
		 x=0; // �ʱ�ȭ, 0���� �ʱ�ȭ���ٰŸ� �ȳ־ default�� ����
		 y=0;
	}
	
	//��ø Ŭ����
	class Inner{
		
	}

}
