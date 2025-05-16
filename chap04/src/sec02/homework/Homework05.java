package sec02.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String words = sc.nextLine();
		
//		while (true) {
//			
//			if (!("탈출".equals(words))) {
//				System.out.println(words);
//			} else {
//				System.out.println("프로그램 종료");
//			}
//			break;
//		}
		
		for (; ;) {
			if (!("탈출".equals(words))) {
				System.out.println(words);
				System.out.print("입력 : ");
				words = sc.nextLine();
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		
	}

}
