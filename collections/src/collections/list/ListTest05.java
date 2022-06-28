package collections.list;

import java.util.ArrayList;
//import java.util.Vector;

public class ListTest05 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>(); //gerneric�� ����ϸ� casting �����ص� ��
		// Person[] arr=new Person[10]; // ����� ������� �ϴ°� ����� ����
		// ArrayList<Person> list=new ArrayList<>(); // �ڿ� ������ type parameter ���� ���� ����
		// ���� Ÿ���� �����ϱ� ������ ��κ� Ŭ������ ����

		//Vector<Integer> list2 = new Vector<>();

		// gerneric: �Ϲ�ȭ, ��ü�� �����ϴ� ������ Ÿ���� ����(���ϴ� ���� ������ Ÿ���� ��밡��)

		list.add(new Person("�̸�1", 21, "010-1111-1111"));
		list.add(new Person("�̸�2", 22, "010-2222-2222"));
		
		Person p1=list.get(0);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phone);
		
		for(Person p:list) // for(Ÿ��:�ݷ���), �ε��� ��ȣ���� �ݷ��� �߿��� �ش� Ÿ�� ���
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
