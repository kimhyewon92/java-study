package homework.homework4;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		while(true) {
			System.out.print("문자열 : ");
			String word = sc.nextLine();
			
			if (word.equalsIgnoreCase("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			result += word;
		
		}
		System.out.println("최종 문자열 : " + result);
		
	}
	
}
