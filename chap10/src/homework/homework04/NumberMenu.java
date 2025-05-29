package homework.homework04;

import java.util.Scanner;

public class NumberMenu {
	
	NumberController nc = new NumberController();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean intBoolean = true;
		
		
		try {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			System.out.print(num1 + "은(는)" + num2 + "의 배수인가? ");
			intBoolean = nc.checkDouble(num1, num2);
		} catch (NumberRangeException e) {
//			System.out.println("1부터 100사이의 값이 아닙니다.");
			e.printStackTrace();
		}
			
		System.out.println(intBoolean);
		
		// 사용자에게 받은 두 정수값이 배수인지 출력
		// 사용자에게 두 정수 입력 받음
		// NumberController의 checkDouble에 매개변수 넘겨줌
		// 반환값 출력
		// checkDouble() 메소드 호출부분을
		// try~catch를 이용하여 예외처리

	}
}
