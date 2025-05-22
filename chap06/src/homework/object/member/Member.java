package homework.object.member;

public class Member {

	// 필드
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	// 메소드
	public Member() { // 기본 생성자
		
	}
	
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println("memberName : " + this.memberName);
	}
	
	
}
