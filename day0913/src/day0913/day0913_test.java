package day0913;

public class day0913_test {

	public static void main(String[] args) {
		int num[]=new int[10]; // 정수 10개를 저장할 배열을 선언 
		int sum=0; // 배열의 합을 저장할 정수형 변수
		double avg; // 배열값의 평균을 저장할 실수형 변수
		
		for (int i = 0; i < num.length; i++) { // 1 ~ 10 순차적으로 대입, 배열의 합
			num[i]=i+1;
			sum+=num[i]; //배열의 합
			
			if(num[i]%2==0) // 짝수 출력
				System.out.print(num[i]+" "); 
		}
		System.out.println();
		
		avg=(double)sum/num.length; //배열의 평균
		System.out.println("배열의 합: "+sum); // 배열의 합 출력
		System.out.println("배열의 평균: "+avg); // 배열의 평균 출력

	}

}
