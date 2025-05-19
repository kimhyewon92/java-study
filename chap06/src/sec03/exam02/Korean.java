package sec03.exam02;

public class Korean {
	// 필드
	String nation = "대한민국"; // 한국인 객체니까 국적은 고정값
	String name; // 이름
	String ssn; // 주민번호
	
	// 생성자
//	public Korean(String n, String s) { // 외부로부터 값을 전달받아 필드에 값을 저장해주는..
//		name = n;
//		ssn = s;
//	}
	
	public Korean(String name, String ssn) {
//		name = name; // 양쪽 다 매개변수 name으로 인식되는 문제
		this.name = name; // 왼쪽은 필드, 오른쪽은 매개변수 "ctrl+클릭"으로도 확인가능
		this.ssn = ssn;
		// 여기서 this는 객체 자기 자신을 참조
		// 객체 내부에서 자기 자신을 가리킬 때 사용
	}
	
	
	
}
