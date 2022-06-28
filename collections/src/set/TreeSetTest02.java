package set;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {

	public static void main(String[] args) {
		// 로또 생성기
		// 1~5 선택적으로 구매하도록
		Set<Integer> set; // 중복 불가
		Random ran = new Random(); // 랜덤 숫자 발생
		
		Scanner in = new Scanner(System.in); 
		System.out.print("구매 갯수(1 ~ 5): "); // 로또 구매 갯수 묻기
		int num=in.nextInt();
		in.close();
		
		for(int i=0; i<num;i++)
		{
			set=new TreeSet<Integer>(); // 지역변수로 선언해야 초기화 됨
			System.out.println(i+1+"번째 LOTTO");
			while(set.size()<6) { // 랜덤 숫자 생성, 사이즈가 6보다 작으면 번호생성
				//for 문으로 6번 돌리면 중복 숫자 발생 시 사이즈 작아짐
				int n = ran.nextInt(45) + 1; // 1 ~ 45 랜덤 숫자
				set.add(n);	// set에 삽입 (중복 x, 오름차순 정렬)
			}
			System.out.println(set+" "); // set 출력
			System.out.println();
		}
	}

}
