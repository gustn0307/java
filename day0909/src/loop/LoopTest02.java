package loop;

public class LoopTest02 {

	public static void main(String[] args) {
		int n = 4;

		for (int i = 0; i < 2*n+1; i++) {
			if(i<n)
			{
				for (int k = n - i - 1; k > 0; k--) {
					System.out.print(" ");
				}

				for (int j = 0; j < i + 1; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				for (int k = 0; k < i-n+1; k++) {
					System.out.print(" ");
				}

				for (int j = 0; j < 2*n-1-i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}

	}

}
