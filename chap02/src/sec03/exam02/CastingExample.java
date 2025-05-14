package sec03.exam02;

import java.util.Scanner;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
//		int intValue = 65601;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
//		long longValue = 1234567890123456789L;
		intValue = (int) longValue; // 강제 형변환 시 4byte로 쪼개서 마지막 4byte만 넣음
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 정수 부분만 저장됨
		System.out.println(intValue);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("long 타입 입력: ");
		long number = scanner.nextLong(); 
		System.out.println("Casiting: " + (int) number);
	}
}
