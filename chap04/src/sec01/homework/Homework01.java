package sec01.homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = scanner.nextInt();
		String result = "";
		
		if (age < 3 || age >= 65) {
			result = "무료";
		} else if (age >= 3 && age <= 12) {
			result = "10000원";
		} else if (age >= 13 && age <= 18) {
			result = "20000원";
		} else if (age >= 19 && age <= 64) {
			result = "30000원";
		}
		
		System.out.println("당신의 놀이동산 요금은 " + result + "입니다.");
		
		// 선생님꺼
		
//		 if (age < 3) { // 3세 미만
//	            fee = 0;
//	        } else if (age <= 12) { // 3세 ~ 12세
//	            fee = 10000;
//	        } else if (age <= 18) { // 13세 ~ 18세
//	            fee = 20000;
//	        } else if (age <= 64) { // 19세 ~ 64세
//	            fee = 30000;
//	        } else { // 65세 이상
//	            fee = 0;
//	        }
	}

}
