package set;

import java.util.HashSet;

public class SetTest02 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("안녕하세요.");
		set.add("안녕하세요.");
		System.out.println(set.size());
		set.add(new String("안녕하세요.")); 
		System.out.println(set.size());
		// 동일 객체 여부 확인
		// 1. hashCode() 리턴값이 같으면 equals()로 한번 더 체크하고 같으면 동일객체여서 저장안함
		// 2. hashCode() 리턴값이 같으면 equals()로 한번 더 체크하고 다르면 동일객체가 아니여서 저장
		// 3.  hashCode() 리턴값이 다르면 동일객체가 아니여서 저장
		System.out.println("----------");
		String str="안녕하세요";
		System.out.println(str.hashCode()); // 해쉬 코드값 확인
		String str2="안녕하세요";
		System.out.println(str2.hashCode());
		String str3=new String("안녕하세요"); // heap 메모리 영역에 새로 만듬
		System.out.println(str3.hashCode());
		
		System.out.println("----------");
		Person p1=new Person("이름", 21, "111"); // 해쉬 코드는 메모리 값이라고 보면 편함
		Person p2=new Person("이름", 21, "111"); // 다른 메모리 영역에 존재하므로 해쉬코드 값이 다름
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println("----------");
		HashSet<Person> pset=new HashSet<Person>();
		pset.add(p1);
		pset.add(p2);
		System.out.println(pset.size());
		
		
		
	}

}
