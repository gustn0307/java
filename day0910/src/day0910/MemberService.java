package day0910;

public class MemberService {
	// id: admin, password: 1234 일때 로그인성공 아니면 실패

	String id = "admin";
	String password = "1234";

	public boolean login(String id, String password) {
		if ((id.equals(this.id)) && (password.equals(this.password))) // 문자열 비교는 문자열1.equals(문자열2)
			return true;
		else
			return false;
	}

	public String login2(String id, String password) {
		if (id.equals(this.id)) // 문자열 비교는 문자열1.equals(문자열2)
		{
			if(password.equals(this.password))
				return "admin 로그인 성공!";
			
			return "비밀번호 불일치!";
		}
		return "존재하지 않는 id!";
	}
}
