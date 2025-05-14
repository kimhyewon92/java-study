package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("방의 가로 값을 입력하세요.");
		float width = scanner.nextFloat();
		System.out.println("방의 세로 값을 입력하세요.");
		float height = scanner.nextFloat();
		
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("면적 : " + width*height);
		System.out.println("둘레 : " + (width+height)*2);
	}
}
