package arrays;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		int arr[]; // ����
		arr = new int[10]; // �ʱ�ȭ
		// int arr[] = new int[10] //����� �ʱ�ȭ ���ÿ�
		// �迭�̸�[�ε�����ȣ] -> �ε��� ��ȣ 0���� ���������� ����

		double arr2[] = { 10, 20, 30 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = arr2.length-1; i >= 0; i--) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

		System.out.println("arr�� �迭 ũ��: " + arr.length);
		System.out.println("arr2�� �迭 ũ��: " + arr2.length);

	}

}
