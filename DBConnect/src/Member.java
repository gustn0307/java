import java.sql.Timestamp;

public class Member {
	private int no;
	private String email;
	private String pass;
	private String name;
	private String phone;
	private Timestamp created_date;
	private Timestamp updated_date;
	
	// 기본 생성자
	public Member() {}
	
	// 생성자 오버로딩
	public Member(int no, String email,String pass,String name ,String phone ,Timestamp created_date,Timestamp updated_date) {
		this.no=no;
		this.email=email;
		this.pass=pass;
		this.name=name;
		this.phone=phone;
		this.created_date=created_date;
		this.updated_date=updated_date;
	}
	
	public void disp() {
		System.out.println("--------------");
		System.out.println("no: "+getNo());
		System.out.println("email: "+getEmail());
		System.out.println("pass: "+getPass());
		System.out.println("name: "+getName());
		System.out.println("phone: "+getPhone());
		System.out.println("created_date: "+getCreated_date());
		System.out.println("updated_date: "+getUpdated_date());
	}
	
	
	
	@Override
	public String toString() {
		return "Member [no=" + no + ", email=" + email + ", pass=" + pass + ", name=" + name + ", phone=" + phone
				+ ", created_date=" + created_date + ", updated_date=" + updated_date + "]";
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEmail() {
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}
	public Timestamp getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Timestamp updated_date) {
		this.updated_date = updated_date;
	}
	
	
	
	
	
}
