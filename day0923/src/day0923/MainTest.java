package day0923;

public class MainTest {

	public static void main(String[] args) {
		Exam ex=new Exam(); //객체 생성
		ex.input(); // 키보드 입력받기
		ex.calcTot(); // 총점 계산
		ex.calcAvg(); // 평균 계산
		ex.display(); // 출력
	}

}
