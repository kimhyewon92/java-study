package sec02.homework;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		while (true) {
			if (num > 0) {
				for (int i = 0; i < num; i++) {
					if (i%2 == 0) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				break;
			} else {
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			}
		}
		
		
		
		
	}

}
