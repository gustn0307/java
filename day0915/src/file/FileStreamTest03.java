package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest03 {

	public static void main(String[] args) throws IOException {
		
		File src = new File("suzy.jpg");
		File dst = new File("copy.jpg");
		// System.out.println(src.exists()); //���� �����ϴ��� Ȯ��

		FileInputStream fis = new FileInputStream(src); // input stream

		FileOutputStream fos = new FileOutputStream(dst); // output stream

		int data; // EOF(-1) ���� ��ȯ �ޱ� ����
		while ((data = fis.read()) != -1) // EOF(-1)�� �Ǹ� Ż��
		{
			fos.write(data);
		}
		System.out.println("���� ���� �Ϸ�");

		fis.close();
		fos.close();
	}

}
