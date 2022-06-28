package day0913;

public class ArrayTest03 {

	public static void main(String[] args) {
		String name[] = { "피오", "김동현", "김종민", "신동", "강호동" };

		int kor[] = { 88, 90, 75, 65, 90 };
		int eng[] = { 70, 88, 90, 88, 95 };
		int math[] = { 70, 90, 88, 60, 77 };

		int n = name.length;
		int total[] = new int[n]; // 총점
		double avg[] = new double[n]; // 평균
		int rank[] = new int[n]; // 순위(총점 기준)

		System.out.println("점수    국어 영어 수학 ");
		for (int i = 0; i < n; i++) { // 이름
			System.out.printf("%-4s : ", name[i]);
			System.out.printf("%2d %2d %2d",kor[i],eng[i],math[i] );
			System.out.println();
		}
		System.out.println();
		
		System.out.println("총점");
		for (int i = 0; i < n; i++) { // 이름
			System.out.printf("%-4s ", name[i]);
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) { // 총점
			total[i] = kor[i] + eng[i] + math[i];
			System.out.print(total[i] + "   ");
		}
		System.out.println();
		System.out.println();

		System.out.println("평균");
		for (int i = 0; i < n; i++) { // 이름
			System.out.printf("%-4s ", name[i]);
		}
		System.out.println();
		for (int i = 0; i < n; i++) { // 평균
			avg[i] = total[i] / 3.0;
			System.out.printf("%.2f  ", avg[i]);
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < n; i++)
			rank[i] = 1;

		for (int i = 0; i < n; i++) { // 순위
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}

		System.out.println("순위");
		for (int i = 0; i < n; i++) { // 이름
			System.out.printf("%-4s ", name[i]);
		}
		System.out.println();
		for (int i = 0; i < n; i++) { // 순위
			System.out.printf(rank[i] + "     ");
		}
	}
}
