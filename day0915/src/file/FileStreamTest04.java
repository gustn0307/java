package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest04 {

	public static void main(String[] args) throws IOException {
		// Ű���忡�� �Է��� ���ڸ� ���Ͽ� ����
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str=sc.nextLine();
		sc.close();
		
		File file=new File("Test.txt");
		FileWriter fw=new FileWriter(file);
		
		fw.append(str);
	
		System.out.println("�׽�Ʈ �Ϸ�!");
		
		fw.close();
	}

}
