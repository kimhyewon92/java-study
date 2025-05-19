package sec02.homework;

import java.util.Scanner;

public class Homework10 {
	
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
				if (again == 'N' || again == 'n') { // equalsIgnoreCase("n") 대소문자 구분x
					System.out.println("프로그램을 종료합니다.");
//					return; // main() 메소드 종료
//					System.exit(0); // 자바 프로그램(JVM)을 강제 종료
					break wordF;
				} else if (again == 'Y' || again == 'y') {
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				}
				sc.close();
			}
		}
		
		
		
	}
	
}
