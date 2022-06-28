package day0923;

import java.util.Scanner;

public class Exam {
	// 변수 선언
	String name;
	int kor,eng,mat,tot;
	double avg;
	
	public void input() { // 키보드로 필드 입력받기
		Scanner in =new Scanner(System.in); //Scanner 객체 생성
		System.out.print("이름: ");
		name=in.nextLine(); // 공백 포함 이름 입력받기
		
		do //0 이상 100 이하 점수 입력 받기(예외처리 포함)
		{	
			if((kor<0)||(kor>100)) //0 이상 100 이하
			{
				System.out.print("국어 점수(0 ~ 100) 범위내로 재입력:"); // 재입력 요구
				kor=in.nextInt(); // kor 변수에 키보드로부터 받은 값 저장
			}
			else //0 이상 100 이하가 아닐 때
			{
				System.out.print("국어 점수(0 ~ 100):"); // 입력 요구
				kor=in.nextInt(); // kor 변수에 키보드로부터 받은 값 저장
			}
			
		}while((kor<0)||(kor>100));
		
		do //0 이상 100 이하 점수 입력 받기(예외처리 포함)
		{		
			if((eng<0)||(eng>100)) //0 이상 100 이하
			{
				System.out.print("영어 점수(0 ~ 100) 범위내로 재입력:"); // 재입력 요구
				eng=in.nextInt(); // eng 변수에 키보드로부터 받은 값 저장
			}
			else //0 이상 100 이하가 아닐 때
			{
				System.out.print("영어 점수(0 ~ 100):"); // 입력요구
				eng=in.nextInt(); // eng 변수에 키보드로부터 받은 값 저장
			}
			
		}while((eng<0)||(eng>100));
			
		
		do //0 이상 100 이하 점수 입력 받기(예외처리 포함)
		{	
			if((mat<0)||(mat>100)) //0 이상 100 이하일 때
			{
				System.out.print("수학 점수(0 ~ 100) 범위내로 재입력:"); // 재입력요구
				mat=in.nextInt();  // mat 변수에 키보드로부터 받은 값 저장
			}
			else //0 이상 100 이하가 아닐 때
			{
				System.out.print("수학 점수(0 ~ 100):"); // 입력요구
				mat=in.nextInt(); // mat 변수에 키보드로부터 받은 값 저장
			}
			
		}while((mat<0)||(mat>100));
		
		in.close(); // 입력 스트림 닫기
	}
	
	public void calcAvg() { // 평균 계산
		avg=tot/3.0; // 3.0으로 나눠서 auto casting(double)
	}
	
	public void calcTot() { // 총점 계산
		tot=kor+eng+mat; // 국어점수 + 영어점수 + 수학점수 = 총점
	}
	
	public void display() { // 출력
		System.out.println("이름: "+name); // 이름 출력
		System.out.println("국어 점수: "+kor); // 국어 점수 출력
		System.out.println("영어 점수: "+eng); // 영어 점수 출력
		System.out.println("수학 점수: "+mat); // 수학 점수 출력
		System.out.println("총점: "+tot); // 총점 출력
		System.out.printf("평균: %.2f",avg); // 평균 출력
	}	
}
