package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("말해보세요: ");
		String say = sc.nextLine();
		
		// 삼항(조건) 연산자 이용
		// say == "간다" -> 객체 주소값 비교라서 적용 x
//		String result = (say.equals("간다")) ? "온다" : "간다"; 아래가 더 좋은코드
		String result = ("간다".equals(say)) ? "온다" : "간다";
		// 참조 타입 say = null 일때..?
		
		System.out.println("앵무새: "+ result);
	}
}
