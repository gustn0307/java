package arrays;

//java.lang package �̿ܿ� �����ϴ� ���̺귯���� import�ؼ� ���
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// ������ �迭 4�� ����� �ε��� ��ȣ 0��°�� ����, 1�� ����, 2�� ����, 3�� ����
		// 3���� ������ Ű����� �Է¹ް� ���� ������� ���
		
		String subject[]= {"����","����","����"};
		int arr[] = new int[subject.length+1];

		Scanner in = new Scanner(System.in);

		in.close();
		
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(subject[i]+" ���� �Է�:");
			arr[i] = in.nextInt();
			arr[arr.length-1]+=arr[i];
		}
		
		System.out.println("����:(1.����, 2����, 3.����, 4.����)");
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
