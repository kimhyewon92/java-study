package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String words = scanner.nextLine();
				
		System.out.println("첫번째 문자 : " + words.charAt(0));
		System.out.println("두번째 문자 : " + words.charAt(1));
		System.out.println("세번째 문자 : " + words.charAt(2));
	}

}
