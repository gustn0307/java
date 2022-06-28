package loop;

public class LoopTest01 { // º°Âï±â

	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int k = n - i - 1; k > 0; k--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n) {
				for (int j = 0; j < i + 1; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 0; j < 2 * n - 1 - i; j++) {
					System.out.print("* ");
				}
			}

			System.out.println();
		}
		System.out.println();
	}
}
