package constructs;

public class ConstTest01 {
	int x;
	int y;

	//ConstTest01(){} // �⺻ �����ڰ� �����Ǿ� ����
	// ���� ���� ������ ��밡��
	ConstTest01(int x, int y){
		this.x=x; //������� x�� �Ű����� x ���� ����
		this.y=y;
	}
	
	ConstTest01(){
		x=100;
		y=200;
	}
}
