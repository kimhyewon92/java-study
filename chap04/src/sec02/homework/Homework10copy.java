package sec02.homework;

import java.util.Scanner;

public class Homework10copy {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0;
		char again;
		
		wordF: while (true) {
			System.out.print("문자열 : ");
			String words = sc.nextLine();
			System.out.print("문자 : ");
			char word = sc.nextLine().charAt(0);
			count = 0;
			for (int i = 0; i < words.length(); i++) {
				if (word == words.charAt(i)) {
					count++;
				}
			}
			System.out.println("포함된 개수 : " + count);
			
			while (true) {
				System.out.print("다시 입력하시겠습니까? : ");
				again = sc.nextLine().charAt(0);
				if (again == 'N' || again == 'n') {
					System.out.println("프로그램을 종료합니다.");
					break wordF;
				} else if (again == 'Y' || again == 'y') {
					continue wordF;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
			}
		}
		
		
		
	}
	
}
