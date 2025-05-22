package sec01.exam03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // 자바에서 제공하는 정확한 PI값 사용하도록 변경
	}
	
	// 메소드 선언부가 틀렸을 때 예시
//	@Override // 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사, 빠지면 변경된 내용으로 새로운 메소드 생성됨
//	double areaCircle(double r) { // 접근제한자 변경 및 메소드명이 다르거나 매개변수 타입이 다르면..
//		System.out.println("Computer 객체의 areaCircle() 실행");
//		return Math.PI * r * r; // 자바에서 제공하는 정확한 PI값 사용하도록 변경
//	}
	
	
	
	
	
}
