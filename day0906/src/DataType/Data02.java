package DataType;

import java.io.File;

public class Data02 {

	public static void main(String[] args) {
		System.out.println("\"�ȳ��ϼ���\"");

		char han = '��';
		System.out.println(han);

		File file = new File("���ڿ�");		
		String str1 = "���ڿ�";
		String str2 = "���ڿ�";
		
		if(str1==str2)
			System.out.println("�����ϴ�.");
		else
			System.out.println("�ٸ��ϴ�.");
		
	}

}
