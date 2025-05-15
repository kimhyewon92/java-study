package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int int1 = scanner.nextInt();
		System.out.print("두 번째 정수: ");
		int int2 = scanner.nextInt();
		System.out.print("세 번째 정수: ");
		int int3 = scanner.nextInt();
		
		int min = (int1 < int2) ? 
				  ((int1 < int3) ? int1 : int3) : ((int2 < int3) ? int2 : int3);
		
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
		
	}

}
