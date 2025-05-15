package homework;

import java.io.IOException;
import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("문자를 입력하세요 : ");
		String charA = scanner.nextLine();
		char keyCode = charA.charAt(0);
//		scanner.nextLine().charAt(0); // 이어서쓰기
		
		System.out.println( charA + "의 유니코드 : " + (int)keyCode);
	}
}
