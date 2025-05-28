package homework.homework3;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine();
		
		String[] emailAddress = email.trim().split("@");
		if ("goodee.co.kr".equals(emailAddress[1])) {
		System.out.println("아이디 : " + emailAddress[0].toUpperCase());
		} else {
			System.out.println("유효하지 않은 이메일입니다.");
		}
		
	}

}
