package sec03.exam02.quiz;

public class Quiz1 {
	
//  Quiz
//	실행 클래스가 실행 되도록 Computer 클래스의 생성자를 구현하시오.
//
//  [필드]
//	model: 문자열
//
//	[출력]
//	객체생성완료(모델: null)
//	객체생성완료(모델: gram)

	public static void main(String[] args) {
		Computer com1 = new Computer(); // 기본 생성자 호출
		Computer com2 = new Computer("gram"); // 사용자가 명시적으로 매개변수로 생성자 만들면 기본생성자가 안만들어져서 따로 또 만들어야함
		
		System.out.println("객체생성완료(모델: " + com1.model + ")");
		System.out.println("객체생성완료(모델: " + com2.model + ")");
		
		
		
		
	}

}
