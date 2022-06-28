package arrays2;

public class Arr2Test01 {
	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int ar[][]=new int[][] {{10,20,30},{40,50}};
		
		for(int i=0;i<2;i++) { // a 출력
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<2;i++) { // ar 출력
			for(int j=0;j<3;j++)
			{
				if(i==1&&j==2)
					break;
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		///*
		for(int i=0;i<2;i++) { // ar 출력, 행
			for(int j=0;j<ar[i].length;j++) // 열
			{
				//if(i==1&&j==2)
					//break;
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		//*/
	}
}
