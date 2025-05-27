package homework.homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			int randomNum = (int) (Math.random() * 50) + 1;
			System.out.print("1~50사이의 숫자 : ");
			int user = sc.nextInt();
			count++;
			
			
			if (user == randomNum) {
				System.out.println("축하합니다~ 정답이에요");
			} else if (user > randomNum) {
			}
			
			
//			try {
//			} catch (Exception e) {
//				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
//			}
//			continue;
		
		
		
		}
	}

}
