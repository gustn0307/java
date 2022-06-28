package day0913;

public class ArrayTest03 {

	public static void main(String[] args) {
		String name[] = { "�ǿ�", "�赿��", "������", "�ŵ�", "��ȣ��" };

		int kor[] = { 88, 90, 75, 65, 90 };
		int eng[] = { 70, 88, 90, 88, 95 };
		int math[] = { 70, 90, 88, 60, 77 };

		int n = name.length;
		int total[] = new int[n]; // ����
		double avg[] = new double[n]; // ���
		int rank[] = new int[n]; // ����(���� ����)

		System.out.println("����    ���� ���� ���� ");
		for (int i = 0; i < n; i++) { // �̸�
			System.out.printf("%-4s : ", name[i]);
			System.out.printf("%2d %2d %2d",kor[i],eng[i],math[i] );
			System.out.println();
		}
		System.out.println();
		
		System.out.println("����");
		for (int i = 0; i < n; i++) { // �̸�
			System.out.printf("%-4s ", name[i]);
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) { // ����
			total[i] = kor[i] + eng[i] + math[i];
			System.out.print(total[i] + "   ");
		}
		System.out.println();
		System.out.println();

		System.out.println("���");
		for (int i = 0; i < n; i++) { // �̸�
			System.out.printf("%-4s ", name[i]);
		}
		System.out.println();
		for (int i = 0; i < n; i++) { // ���
			avg[i] = total[i] / 3.0;
			System.out.printf("%.2f  ", avg[i]);
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < n; i++)
			rank[i] = 1;

		for (int i = 0; i < n; i++) { // ����
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}

		System.out.println("����");
		for (int i = 0; i < n; i++) { // �̸�
			System.out.printf("%-4s ", name[i]);
		}
		System.out.println();
		for (int i = 0; i < n; i++) { // ����
			System.out.printf(rank[i] + "     ");
		}
	}
}
