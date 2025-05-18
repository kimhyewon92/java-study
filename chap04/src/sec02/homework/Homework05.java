package sec02.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for (; ;) {
			System.out.print("입력 : ");
			String words = sc.nextLine();
			
			if ("탈출".equals(words)) {
				break;
			}
			System.out.println(words);
		}
		System.out.println("프로그램 종료");
		
	}

}
