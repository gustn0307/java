package Test01;

public class Test01 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int tot = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			tot += arr[i];
		}

	}

}
