package set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest01 { // set�� �ε����� ����, �ߺ������� �Ұ�
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		// System.out.println(set.size());
		set.add(10);
		// System.out.println(set.size());
		set.add(3);
		// System.out.println(set.size());
		set.add(3); // �ߺ� ������ ���� X
		// System.out.println(set.size());
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(25);
		
		// �ε����� ��� ���ͷ����͸� ���� �����͸� ����
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) { // next�� �ִ��� ������(�������� ���� ���� Ȯ��)
			int n = it.next();
			System.out.print(n+" "); // ���
		}
		System.out.println();
		System.out.println("--------------");
		
		set.remove(4); // ����
		
		for(int n : set){ // element : collection
			System.out.println(n);
		}
		
		System.out.println("--------------");
		System.out.println(set.size());
		set.add(null); // null���� �߰� ���������� ����� �� Ÿ�Զ����� ������ ó�� �ʿ�
		System.out.println(set.size());
		
		System.out.println("--------------");
		for(Integer n : set){ // element : collection
			System.out.println(n);
		}
	}
}
