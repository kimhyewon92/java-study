package sec01.homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		
		int num = scanner.nextInt();
		String result;
		
		if (num > 5) {
			result = "목록에 있는 숫자만 입력해주세요.";
		} else {
			if (num <= 0) {
				result = "양수만 입력해주세요.";
			} else {
				if (num == 1) {
					result = "스쿼트 운동 시간입니다.";
				} else if (num == 2) {
					result = "데드리프트 운동 시간입니다.";
				} else if (num == 3) {
					result = "벤치 프레스 운동 시간입니다.";
				} else if (num == 4) {
					result = "풀업 운동 시간입니다.";
				} else {
					result = "오늘도 수고하셨습니다.";
				}
				System.out.println(result);
			}
		}
		
		
	}

}
