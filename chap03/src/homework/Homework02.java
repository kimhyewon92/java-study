package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("구슬의 개수: ");
		int qty = sc.nextInt();
		
		String result = (qty%2 == 0) ? "구슬의 개수는 짝수입니다." : "구슬의 개수는 홀수입니다.";
		System.out.println(result);
	}

}
