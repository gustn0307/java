package collections.list;

public class ListTest04 {
	public static void main(String[] args) {
//		int[] intarr = new int[3];
//		double[] douarr = new double[3];
//		String[] strarr = new String[3];
		Object[] objarr = new Object[10];

//		objarr[0]="이름";
//		objarr[0]=20; // 나이
//		objarr[0]="010-4110-8952"; // 전번
//		objarr[0]="이름2";
//		objarr[0]=22;
//		objarr[0]="010-1234-5678";
//		// 패턴이 있으면 클래스로 관리하는게 더 편리

		// Person p=new Person("이름",20,"010-4110-8952"); // 모든 클래스의 부모는 Object
		objarr[0] = new Person("이름1", 21, "010-1111-1111");
		Person p1=(Person)objarr[0]; //Person으로 casting 해주어야 자원에 접근 가능
		System.out.println(p1.age); 

		Object obj = new Person("이름2", 22, "010-2222-2222");
		Person p2 = (Person)obj; //Person으로 casting 해주어야 자원에 접근 가능
		System.out.println(p2.name);
	}
}
