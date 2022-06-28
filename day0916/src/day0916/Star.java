package day0916;

public class Star {

	public static void main(String[] args) {
		int n = 4;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n)
				for (int j = 0; j <= i; j++)
					System.out.print("*");
			else
				for (int j = 2 * n - 1; j > i; j--)
					System.out.print("*");
			System.out.println();
		}
		System.out.println();

	}

}
