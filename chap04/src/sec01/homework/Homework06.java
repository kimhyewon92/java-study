package sec01.homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("소프트웨어설계 점수 : ");
		int sub1 = scanner.nextInt();
		System.out.printf("소프트웨어개발 점수 : ");
		int sub2 = scanner.nextInt();
		System.out.printf("데이터베이스구축 점수 : ");
		int sub3 = scanner.nextInt();
		System.out.printf("프로그래밍언어활용 점수 : ");
		int sub4 = scanner.nextInt();
		System.out.printf("정보시스템구축관리 점수 : ");
		int sub5 = scanner.nextInt();
		
		double avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5.0;
		
		if (avg < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else if (sub1 < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if (sub2 < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (sub3 < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (sub4 < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (sub5 < 40) {
			System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		} else {
			System.out.println("합격을 축하합니다!");
		}
		
		// 선생님꺼
		
//		if (design < 40) {
//        	System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
//        } else if (dev < 40) {
//            System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
//        } else if (db < 40) {
//            System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
//        } else if (lang < 40) {
//            System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
//        } else if (system < 40) {
//            System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
//        } else if (avg < 60) {
//            System.out.println("평균 점수 60점 미만으로 불합격입니다.");
//        } else {
//        	System.out.println("합격을 축하합니다!");
//        }
		
		
		
		
	}

}
