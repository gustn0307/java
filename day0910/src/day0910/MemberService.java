package day0910;

public class MemberService {
	// id: admin, password: 1234 �϶� �α��μ��� �ƴϸ� ����

	String id = "admin";
	String password = "1234";

	public boolean login(String id, String password) {
		if ((id.equals(this.id)) && (password.equals(this.password))) // ���ڿ� �񱳴� ���ڿ�1.equals(���ڿ�2)
			return true;
		else
			return false;
	}

	public String login2(String id, String password) {
		if (id.equals(this.id)) // ���ڿ� �񱳴� ���ڿ�1.equals(���ڿ�2)
		{
			if(password.equals(this.password))
				return "admin �α��� ����!";
			
			return "��й�ȣ ����ġ!";
		}
		return "�������� �ʴ� id!";
	}
}
