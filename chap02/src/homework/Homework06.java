package homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		char num = scanner.nextLine().charAt(0);
		
		// char 타입의 숫자값을 정수로 변환하여 계산 ('0' = 48),byte char short 연산전 int로 변환됨
		// 51 - 48 = 3
		int number = num - '0';
		
		int numnum = number * number;
		
		System.out.print("입력한 숫자의 제곱은 " + numnum + "입니다.");
	}

}
