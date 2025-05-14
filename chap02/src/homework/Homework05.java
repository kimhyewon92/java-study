package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int koreanScore = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int englishScore = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int mathScore = scanner.nextInt();
		System.out.println();
		
		int sum = koreanScore + englishScore + mathScore;
		
		System.out.println("국어 : " + koreanScore);
		System.out.println("영어 : " + englishScore);
		System.out.println("수학 : " + mathScore);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/3);
	}

}
