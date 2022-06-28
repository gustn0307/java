package random;

import java.util.Random;

public class RandomTest02 {

	public static void main(String[] args) {
		// 랜덤으로 숫자 6개 저장하고, 중복 체크, 정렬

		int nums[] = new int[6];

		Random ran = new Random();

		for (int i = 0; i < nums.length; i++) { // 랜덤으로 숫자 6개 저장, 내용출력
			nums[i] = ran.nextInt(6) + 1;
			System.out.println("nums[" + i + "]: " + nums[i]);
		}
		System.out.println();

		for (int i = 0; i < nums.length; i++) { // 중복 체크
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;

				if (nums[i] == nums[j]) {
					nums[j] = ran.nextInt(6) + 1;
					i=0;
					j=0;
				}
			}
		}
		
		System.out.println("중복체크해서 중복없이");
		for (int i = 0; i < nums.length; i++) { // 중복없이 내용출력
			System.out.println("nums[" + i + "]: " + nums[i]);
		}
		System.out.println();
		
		int temp;
		for (int i = 0; i < nums.length; i++) { //정렬
			for (int j = 0; j < nums.length; j++) {
				if(i==j)
					continue;
				
				if(nums[i]<nums[j])
				{
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		System.out.println("정렬");
		for (int i = 0; i < nums.length; i++) { // 정렬 내용출력
			System.out.println("nums[" + i + "]: " + nums[i]);
		}

	}

}
