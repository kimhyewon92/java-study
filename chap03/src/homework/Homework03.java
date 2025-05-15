package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("친구 수 : ");
		int friend = sc.nextInt();
		System.out.printf("사탕의 수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy/friend);
		System.out.println("남는 사탕 개수 : " + candy%friend);
	}
}
