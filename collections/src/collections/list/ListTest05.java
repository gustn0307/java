package collections.list;

import java.util.ArrayList;
//import java.util.Vector;

public class ListTest05 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>(); //gerneric을 사용하면 casting 사용안해도 됨
		// Person[] arr=new Person[10]; // 사이즈를 정해줘야 하는것 말고는 동일
		// ArrayList<Person> list=new ArrayList<>(); // 뒤에 나오는 type parameter 안은 생략 가능
		// 여러 타입을 관리하기 빡세서 대부분 클래스를 관리

		//Vector<Integer> list2 = new Vector<>();

		// gerneric: 일반화, 객체를 생성하는 시점에 타입을 결정(원하는 여러 데이터 타입을 사용가능)

		list.add(new Person("이름1", 21, "010-1111-1111"));
		list.add(new Person("이름2", 22, "010-2222-2222"));
		
		Person p1=list.get(0);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		
		for(Person p:list) // for(타입:콜렉션), 인덱스 번호없이 콜렉션 중에서 해당 타입 출력
		{
			System.out.print(p.name+" ");
			System.out.print(p.age+" ");
			System.out.print(p.phone+" ");
			System.out.println();
		}
		System.out.println("--------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).name+" ");
			System.out.print(list.get(i).age+" ");
			System.out.print(list.get(i).phone+" ");
			System.out.println();
		} 
	}
}
