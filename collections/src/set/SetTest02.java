package set;

import java.util.HashSet;

public class SetTest02 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("�ȳ��ϼ���.");
		set.add("�ȳ��ϼ���.");
		System.out.println(set.size());
		set.add(new String("�ȳ��ϼ���.")); 
		System.out.println(set.size());
		// ���� ��ü ���� Ȯ��
		// 1. hashCode() ���ϰ��� ������ equals()�� �ѹ� �� üũ�ϰ� ������ ���ϰ�ü���� �������
		// 2. hashCode() ���ϰ��� ������ equals()�� �ѹ� �� üũ�ϰ� �ٸ��� ���ϰ�ü�� �ƴϿ��� ����
		// 3.  hashCode() ���ϰ��� �ٸ��� ���ϰ�ü�� �ƴϿ��� ����
		System.out.println("----------");
		String str="�ȳ��ϼ���";
		System.out.println(str.hashCode()); // �ؽ� �ڵ尪 Ȯ��
		String str2="�ȳ��ϼ���";
		System.out.println(str2.hashCode());
		String str3=new String("�ȳ��ϼ���"); // heap �޸� ������ ���� ����
		System.out.println(str3.hashCode());
		
		System.out.println("----------");
		Person p1=new Person("�̸�", 21, "111"); // �ؽ� �ڵ�� �޸� ���̶�� ���� ����
		Person p2=new Person("�̸�", 21, "111"); // �ٸ� �޸� ������ �����ϹǷ� �ؽ��ڵ� ���� �ٸ�
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println("----------");
		HashSet<Person> pset=new HashSet<Person>();
		pset.add(p1);
		pset.add(p2);
		System.out.println(pset.size());
		
		
		
	}

}
