package homework;

import java.util.Scanner;

public class Homework06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrLen = sc.nextInt();
		
		String[] strArr = new String[arrLen];
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i + "번째 문자열 : ");
			String inputStr = sc.nextLine();
			strArr[i] = inputStr;
		}
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N) :");
		String more = sc.nextLine();
		
		if (more.equalsIgnoreCase("y")) {
			System.out.print("더 입력하고 싶은 개수 : ");
			String moreQty = sc.nextLine();
		} else if (more.equalsIgnoreCase("n")) {
			for (String i : strArr) {
				System.out.println(i);
			}
		}
	}
	
}
