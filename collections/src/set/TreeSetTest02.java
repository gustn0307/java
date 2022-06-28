package set;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {

	public static void main(String[] args) {
		// �ζ� ������
		// 1~5 ���������� �����ϵ���
		Set<Integer> set; // �ߺ� �Ұ�
		Random ran = new Random(); // ���� ���� �߻�
		
		Scanner in = new Scanner(System.in); 
		System.out.print("���� ����(1 ~ 5): "); // �ζ� ���� ���� ����
		int num=in.nextInt();
		in.close();
		
		for(int i=0; i<num;i++)
		{
			set=new TreeSet<Integer>(); // ���������� �����ؾ� �ʱ�ȭ ��
			System.out.println(i+1+"��° LOTTO");
			while(set.size()<6) { // ���� ���� ����, ����� 6���� ������ ��ȣ����
				//for ������ 6�� ������ �ߺ� ���� �߻� �� ������ �۾���
				int n = ran.nextInt(45) + 1; // 1 ~ 45 ���� ����
				set.add(n);	// set�� ���� (�ߺ� x, �������� ����)
			}
			System.out.println(set+" "); // set ���
			System.out.println();
		}
	}

}
