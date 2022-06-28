package arrays;

//java.lang package 이외에 존재하는 라이브러리는 import해서 사용
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 정수형 배열 4개 만들고 인덱스 번호 0번째는 국어, 1은 영어, 2는 수학, 3은 총점
		// 3개의 점수는 키보드로 입력받고 이후 총점계산 출력
		
		String subject[]= {"국어","영어","수학"};
		int arr[] = new int[subject.length+1];

		Scanner in = new Scanner(System.in);

		in.close();
		
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(subject[i]+" 점수 입력:");
			arr[i] = in.nextInt();
			arr[arr.length-1]+=arr[i];
		}
		
		System.out.println("점수:(1.국어, 2영어, 3.수학, 4.총점)");
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
