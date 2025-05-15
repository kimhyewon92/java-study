package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("주민번호(-) : ");
		char num = sc.nextLine().charAt(7);
		
		String result = (num == '1' || num == '3') ? "입력하신 주민번호는 남성입니다." : ((num == '2' || num == '4') ? "입력하신 주민번호는 여성입니다." : "입력하신 주민번호는 잘못된 값입니다.");
		System.out.println(result);
		
	}

}
