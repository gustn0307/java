package arrays;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		int arr[]; // 선언
		arr = new int[10]; // 초기화
		// int arr[] = new int[10] //선언과 초기화 동시에
		// 배열이름[인덱스번호] -> 인덱스 번호 0부터 순차적으로 적용

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

		System.out.println("arr의 배열 크기: " + arr.length);
		System.out.println("arr2의 배열 크기: " + arr2.length);

	}

}
