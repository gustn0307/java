package set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest01 { // set은 인덱스가 없음, 중복데이터 불가
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		// System.out.println(set.size());
		set.add(10);
		// System.out.println(set.size());
		set.add(3);
		// System.out.println(set.size());
		set.add(3); // 중복 데이터 저장 X
		// System.out.println(set.size());
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(25);
		
		// 인덱스가 없어서 이터레이터를 통해 데이터를 추출
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) { // next가 있느냐 없느냐(데이터의 존재 유무 확인)
			int n = it.next();
			System.out.print(n+" "); // 출력
		}
		System.out.println();
		System.out.println("--------------");
		
		set.remove(4); // 삭제
		
		for(int n : set){ // element : collection
			System.out.println(n);
		}
		
		System.out.println("--------------");
		System.out.println(set.size());
		set.add(null); // null값을 추가 가능하지만 출력할 때 타입때문에 별도의 처리 필요
		System.out.println(set.size());
		
		System.out.println("--------------");
		for(Integer n : set){ // element : collection
			System.out.println(n);
		}
	}
}
