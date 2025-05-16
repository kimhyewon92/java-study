package sec02.exam07;

import java.util.Scanner;

public class WhileSum1to100Example {

	public static void main(String[] args) {

		// 1부터 100까지 합
		int sum = 0;
		int i = 1; // 초기화식
		
		while ( i <= 100) { // 조건식
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		// (참고) 무한 루프
		while (true) {
			System.out.println("무한 반복");
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) { // 실제는 true 대신 조건을 넣음
				break;
			}
			// 아래 실행코드도 실행x
		}
		
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) {
				flag = false;
			}
			// 아래 실행코드 실행됨 (break 와 차이)
		}
		
		// 1부터 100까지 합
		// do-while문으로 작성
		sum = 0;
		i = 1;
		
		do { // 처음 한번은 무조건 실행
			sum += 1;
			i++;
		} while (i <= 100); // do-while문에서 while 뒤에 세미콜론(;) 넣어주기!
		
		System.out.println(sum);
		
		// Quiz: 1부터 100까지 홀수의 합
		
		while (i <= 100) {
			if (i % 2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println("Quiz1: " + sum);
		
		// 선생님꺼
//		sum = 0;
//		int j = 1;
//		
//		while (j <= 100) {
//			if (j % 2 != 0) {
//				sum += j;
//			}
//			j++;
//		}
//		System.out.println("1~100 까지 홀수의 합: " + sum);
		
		
		// Quiz2
		// 화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
		//
		// [입력]    [출력]
		// 123   =>  6
		// 12345 =>  15
		
		// 힌트:
		// 1) 마지막 자리 수 더하기
		// 2) 마지막 자리 제거
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요: ");
		
		int num = sc.nextInt();
		
		sum = 0;
		while (num > 0) {
			sum += num % 10; // 마지막 자리 수 더하기
			num /= 10; // 마지막 자리 제거
		}

		System.out.println("각 자리수의 합: " + sum);
		
		
		
		
		
		
		
		
		
	}

}
