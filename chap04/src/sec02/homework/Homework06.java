package sec02.homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ans;
		boolean i;
		do {
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			ans = sc.nextLine();
			if (("yes".equals(ans))) {
				i = true;
			} else {
				i = false;
				System.out.println("게임을 종료합니다.");
			}
		} while (i);
		
		
		
		
	}

}
