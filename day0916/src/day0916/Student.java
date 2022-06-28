package day0916;

public class Student extends People {
	int stuID;
	String school;

	public Student(String name, String ssn, int stuID, String school) {
		super(name, ssn);
		this.stuID = stuID;
		this.school = school;
	}
}
