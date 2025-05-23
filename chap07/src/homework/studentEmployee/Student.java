package homework.studentEmployee;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + "학년 : " + grade + "\n" + "전공 : " + major;
	}
	
	
}
