package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest04 {

	public static void main(String[] args) throws IOException {
		// 키보드에서 입력한 글자를 파일에 저장
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str=sc.nextLine();
		sc.close();
		
		File file=new File("Test.txt");
		FileWriter fw=new FileWriter(file);
		
		fw.append(str);
	
		System.out.println("테스트 완료!");
		
		fw.close();
	}

}
