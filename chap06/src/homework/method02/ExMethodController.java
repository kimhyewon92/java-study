package homework.method02;

public class ExMethodController {
	
//- 전달된 메세지를 출력하는 메소드 구현
	void msgPrint(String a) {
		System.out.println(a);
	}
	
//- 1~100까지 합을 반환하는 메소드구현
	int sum(int a, int b) {
		int sum = a;
		for (int i = a; i < b; i++) {
			sum += i;
		}
		return sum;
	}
	
//- 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
	String evenOdd(int a) {
		if (a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
//- 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
//	Boolean hasEng(String a) {
//		
//	}
	
//- 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드구현
//	void hasChar(String a, String b) {
//		int count = 0;
//		for (int i = 0; i < a.length(); i++) {
//			if (b.equals(a[i])) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
	
//- 전달된 정수의 구구단을 출력하는 메소드 구현
	void gugu(int a) {
		for (int i = a; i <= a; i++) {
			System.out.println("----" + a + "단" + "----");
			for (int j = 1; j < 9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
	}

	
}
	
	
