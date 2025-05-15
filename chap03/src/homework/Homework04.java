package homework;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어 : ");
		int kor = sc.nextInt();
		System.out.printf("수학 : ");
		int math = sc.nextInt();
		System.out.printf("영어 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		boolean result = !(kor>=60 && math>=60 && eng>=60 && avg > 90) ? 
					true : false;
		System.out.println(result ? "휴대폰바꾸기" : "휴대폰을 바꿀 수 없습니다.");
		
		
	}

}
