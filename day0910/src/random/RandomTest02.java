package random;

import java.util.Random;

public class RandomTest02 {

	public static void main(String[] args) {
		// �������� ���� 6�� �����ϰ�, �ߺ� üũ, ����

		int nums[] = new int[6];

		Random ran = new Random();

		for (int i = 0; i < nums.length; i++) { // �������� ���� 6�� ����, �������
			nums[i] = ran.nextInt(6) + 1;
			System.out.println("nums[" + i + "]: " + nums[i]);
		}
		System.out.println();

		for (int i = 0; i < nums.length; i++) { // �ߺ� üũ
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;

				if (nums[i] == nums[j]) {
					nums[j] = ran.nextInt(6) + 1;
					i=0;
					j=0;
				}
			}
		}
		
		System.out.println("�ߺ�üũ�ؼ� �ߺ�����");
		for (int i = 0; i < nums.length; i++) { // �ߺ����� �������
			System.out.println("nums[" + i + "]: " + nums[i]);
		}
		System.out.println();
		
		int temp;
		for (int i = 0; i < nums.length; i++) { //����
			for (int j = 0; j < nums.length; j++) {
				if(i==j)
					continue;
				
				if(nums[i]<nums[j])
				{
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		System.out.println("����");
		for (int i = 0; i < nums.length; i++) { // ���� �������
			System.out.println("nums[" + i + "]: " + nums[i]);
		}

	}

}
