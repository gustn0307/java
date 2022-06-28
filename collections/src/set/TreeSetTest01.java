package set;

import java.util.TreeSet;

public class TreeSetTest01 {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		set.add(3);
		set.add(11);
		set.add(100);
		set.add(15);
		set.add(200);
		set.add(1);
		
		System.out.println(set); // 오름차순으로 정렬
		
		for(Integer n:set)
		{
			System.out.println(n);
		}

	}

}
