package sec02.homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("1~9 사이의 숫자 입력(종료: 0): ");
            int num = sc.nextInt();
            
			if (num < 0) {
				System.out.println("양수만 입력해주세요");
				continue;
			} else if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			} else if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for (int i = num; i <= 9; i++) {
				System.out.println();
				System.out.println("=== " + i + "단 ===");
				for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
				}
			}
			break;
		}
		
	}

}
