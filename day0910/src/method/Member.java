package method;

public class Member {
	private String email;
	private String pass;
	private String name;

	public String getEmail() { // alt + shift + s , getter, setter 생성
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//생성자 오버로딩
	public Member() {

	}

	public Member(String email) {
		this.email = email;
	}

	public Member(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}

	public Member(String email, String pass, String name) {
		this(email,pass);
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
