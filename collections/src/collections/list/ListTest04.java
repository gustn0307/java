package collections.list;

public class ListTest04 {
	public static void main(String[] args) {
//		int[] intarr = new int[3];
//		double[] douarr = new double[3];
//		String[] strarr = new String[3];
		Object[] objarr = new Object[10];

//		objarr[0]="�̸�";
//		objarr[0]=20; // ����
//		objarr[0]="010-4110-8952"; // ����
//		objarr[0]="�̸�2";
//		objarr[0]=22;
//		objarr[0]="010-1234-5678";
//		// ������ ������ Ŭ������ �����ϴ°� �� ��

		// Person p=new Person("�̸�",20,"010-4110-8952"); // ��� Ŭ������ �θ�� Object
		objarr[0] = new Person("�̸�1", 21, "010-1111-1111");
		Person p1=(Person)objarr[0]; //Person���� casting ���־�� �ڿ��� ���� ����
		System.out.println(p1.age); 

		Object obj = new Person("�̸�2", 22, "010-2222-2222");
		Person p2 = (Person)obj; //Person���� casting ���־�� �ڿ��� ���� ����
		System.out.println(p2.name);
	}
}
