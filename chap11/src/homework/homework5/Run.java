package homework.homework5;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		String passName = name.substring(0);
		String passBirth = birth.substring(4);
		
		
		System.out.println(passBirth);
		
		System.out.println("암호 : " + result);
	}

}
