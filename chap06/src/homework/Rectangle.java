package homework;

public class Rectangle {
	// 필드
	private int width = 1;
	private int height = 1;
	

	// 생성자
	Rectangle() {
		
	}
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 메소드
	public int calculateRound() {
		int result = (width * 2) + (height *2);
		return result;
	}
	
	public int calculateArea() {
		int result = width * height;
		return result;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사격형의 둘레");
		System.out.println(calculateRound() + "cm");
		System.out.println("2. 사격형의 둘레");
		System.out.println(calculateArea() + "cm");
	}
	
}
