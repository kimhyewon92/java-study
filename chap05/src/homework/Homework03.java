package homework;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if (num < 3 || num%2 == 0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			int[] intArray = new int[num];
			int sum = 0;
			
			for (int i = 0; i < intArray.length; i++) {
				if (i <= (intArray.length/2)) {
					sum += 1;
					intArray[i] = sum;
				} else {
					sum -= 1;
					intArray[i] = sum;
				}
			}
			
			for (int i : intArray) {
				System.out.print(i + ", ");
			}
			break;
		
		}
		sc.close();
		
		
		
	}

}
