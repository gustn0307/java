package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest01 {
	public static void main(String[] args) throws IOException {
		File file=new File("test01.txt");
		
		System.out.println(file.exists());
		
		// ��� ��Ʈ���� ��� ������ �������� ������ ���� ���� �� ��Ʈ�� ��ü ����
		FileOutputStream fos = null;
		fos=new FileOutputStream(file); 
		
		// ���Ͽ� ������ ����
		fos.write('a');		
		fos.close(); // output stream �ݱ�
		
		FileWriter fw=new FileWriter(file);
		//fw.write('b'); //default�� �����
		//fw.append('c');
		fw.write("�ȳ��ϼ���");
		fw.close();

	}

}
