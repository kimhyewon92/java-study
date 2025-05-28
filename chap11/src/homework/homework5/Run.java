package homework.homework5;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		
		String passName1 = name.substring(0, 1);
		String passBirth = birth.substring(2, 4) + birth.substring(6);
		String passName2 = name.substring(1);
		
		String result = passName1 + passBirth + passName2;
		
		System.out.println("암호 : " + result);
	}

}
