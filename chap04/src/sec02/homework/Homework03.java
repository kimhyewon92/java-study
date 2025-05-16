package sec02.homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수(1~50) : ");
			int num = sc.nextInt();
			
			int sum = 0;
			if (!(num >= 1 && num <= 50)) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				continue;
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						sum += i;
					}
				}
			}
			System.out.println("합계 : " + sum);
			break;
		}
	}

}
