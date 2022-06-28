package DataType;

import java.io.File;

public class Data02 {

	public static void main(String[] args) {
		System.out.println("\"안녕하세요\"");

		char han = '가';
		System.out.println(han);

		File file = new File("문자열");		
		String str1 = "문자열";
		String str2 = "문자열";
		
		if(str1==str2)
			System.out.println("같습니다.");
		else
			System.out.println("다릅니다.");
		
	}

}
