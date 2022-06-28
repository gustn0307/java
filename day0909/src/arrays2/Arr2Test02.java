package arrays2;

public class Arr2Test02 {

	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 2; i >= 0; i--) {
			for (int j = 2; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) // 행 012
		{
			for (int j = 0; j < arr.length; j++) // 열 012
			{
				if (i == 1)
					System.out.print(arr[i][2 - j] + " ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 147
		// 258
		// 369
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 369
		// 258
		// 147
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][2 - i] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 1 3 6  00 02 12
		// 2 5 8  01 12 32
		// 4 7 9  11 31 33
		int c=1;
		for (int i = 0; i < 5; i++) { //값 바꾸기
			int x;
			if (i < 3) {
				x = i;
				for (int j = 0; j < i + 1; j++) {
					arr[x--][j]=c++;
				}
			} else {
				x = arr.length - 1;
				for (int j = i - x; j < arr[0].length; j++) {
					arr[x--][j]=c++;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) { //출력문
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
