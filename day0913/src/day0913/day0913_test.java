package day0913;

public class day0913_test {

	public static void main(String[] args) {
		int num[]=new int[10]; // ���� 10���� ������ �迭�� ���� 
		int sum=0; // �迭�� ���� ������ ������ ����
		double avg; // �迭���� ����� ������ �Ǽ��� ����
		
		for (int i = 0; i < num.length; i++) { // 1 ~ 10 ���������� ����, �迭�� ��
			num[i]=i+1;
			sum+=num[i]; //�迭�� ��
			
			if(num[i]%2==0) // ¦�� ���
				System.out.print(num[i]+" "); 
		}
		System.out.println();
		
		avg=(double)sum/num.length; //�迭�� ���
		System.out.println("�迭�� ��: "+sum); // �迭�� �� ���
		System.out.println("�迭�� ���: "+avg); // �迭�� ��� ���

	}

}
