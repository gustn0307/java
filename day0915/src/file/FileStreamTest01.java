package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest01 {
	public static void main(String[] args) throws IOException {
		File file=new File("test01.txt");
		
		System.out.println(file.exists());
		
		// 출력 스트림인 경우 파일이 존재하지 않으면 파일 생성 후 스트림 객체 생성
		FileOutputStream fos = null;
		fos=new FileOutputStream(file); 
		
		// 파일에 데이터 저장
		fos.write('a');		
		fos.close(); // output stream 닫기
		
		FileWriter fw=new FileWriter(file);
		//fw.write('b'); //default는 덮어쓰기
		//fw.append('c');
		fw.write("안녕하세요");
		fw.close();

	}

}
