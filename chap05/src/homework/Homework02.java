package homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int arrayLength = sc.nextInt();
		
		int[] intArray = new int[arrayLength];
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		sc.close();
	}

}

// 		선생님꺼
//		System.out.print("배열의 길이 입력: ");
//		int length = sc.nextInt();
//		
//		int[] arr = new int[length];
//		
//		for (int i = 0; i < length; i++) {
//			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
//			arr[i] = sc.nextInt();
//		}
//		
//		int sum = 0;
//		for (int num : arr) {
//			System.out.print(num + " ");
//			sum += num;
//		}
//		
//		System.out.println("\n총합: " + sum);