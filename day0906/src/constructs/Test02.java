package constructs;

public class Test02 {

	public static void main(String[] args) {
		// �⺻���� ������(default ������)�� ����(0���� �ʱ�ȭ)
		// ������ �����ڸ� �����ϸ� ������ ������ �����ڰ� �����
		// �����ڸ� ����ϸ� �����Ǿ� �ִ� default �����ڴ� ���õ�
		ConstTest01 obj=new ConstTest01(); 
		System.out.println("x= "+obj.x);
		System.out.println("y= "+obj.y);
		
		ConstTest01 obj2=new ConstTest01(10,20); 
		System.out.println("x= "+obj2.x);
		System.out.println("y= "+obj2.y);
		
	}

}
