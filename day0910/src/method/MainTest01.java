package method;

public class MainTest01 {

	public static void main(String[] args) {
		Member m1=new Member();
		disp(m1);
		
		Member m2=new Member("test@naver.com");
		disp(m2);
		
		Member m3=new Member("test@naver.com","1234");
		disp(m3);
		
		Member m4=new Member("test@naver.com","1234","°­Çö¼ö");
		disp(m4);
		
		System.out.println(m4);
		System.out.println(m4.toString());
		

	}
	private static void disp(Member member)
	{
		System.out.println("--------------------------");
		System.out.println("email: "+member.getEmail());
		System.out.println("password: "+member.getPass());
		System.out.println("name: "+member.getName());
		System.out.println();
	}
}
