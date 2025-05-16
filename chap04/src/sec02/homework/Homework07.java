package sec02.homework;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자(0을 입력하면 종료) : ");
		int num = sc.nextInt();
		int sum = 0;
		
		while (true) {
			if (num != 0) {
				sum += num;
				System.out.print("숫자(0을 입력하면 종료) : ");
				num = sc.nextInt();
			} else {
				System.out.println("양수의 합계 : " + sum);
				break;
			}
		}
		
		
		
	}

}
