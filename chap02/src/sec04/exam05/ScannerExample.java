package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// Scanner 직접입력말고 자동완성 아니면 import 해야함
		Scanner scanner = new Scanner(System.in);
//		String inputData;
		
//		while (true) {
//			inputData = scanner.nextLine(); // 스캐너에서 읽은 한 라인 전체(엔터키 이전까지)
//			System.out.println("입력된 문자열: \"" + inputData + "\"");
//			
//			if (inputData.equals("q")) {
//				break;
//			}
//			System.out.println("종료");
//			
//		}
		int inputInt1 = scanner.nextInt();
		int inputInt2 = scanner.nextInt();
		System.out.println(inputInt1 + "," + inputInt2);
		
		// Quiz
//		2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오.
		
		scanner.close();
	}
}
