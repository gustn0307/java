package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileStreamTest02 { // file read, read�� ���� ������ �������� ������ ����
	public static void main(String[] args) throws IOException {
		File file = new File("test01.txt");

		///*
		 FileReader fr = new FileReader(file);
		
		int data;

		while ((data = fr.read()) != -1) {
			System.out.print((char) data);
		}

		fr.close();
		 //*/
		
		
		///*
		 // �� ���� ������� ����
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		 //*/
	}
}
