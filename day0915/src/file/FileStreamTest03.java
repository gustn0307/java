package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest03 {

	public static void main(String[] args) throws IOException {
		
		File src = new File("suzy.jpg");
		File dst = new File("copy.jpg");
		// System.out.println(src.exists()); //파일 존재하는지 확인

		FileInputStream fis = new FileInputStream(src); // input stream

		FileOutputStream fos = new FileOutputStream(dst); // output stream

		int data; // EOF(-1) 값을 반환 받기 위해
		while ((data = fis.read()) != -1) // EOF(-1)이 되면 탈출
		{
			fos.write(data);
		}
		System.out.println("파일 복사 완료");

		fis.close();
		fos.close();
	}

}
