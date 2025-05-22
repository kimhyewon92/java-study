package homework_mine.method1;

public class Homework01 {
	
	// 메소드 (1)
	String plus(String a, String b) {
		String result = a + b;
		return result;
	}
	
	// 메소드 (2)
	int multiple(int a, int b) {
		if(a < b) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
		int result = a * b;
		return result;
		}
	}
	
	// 메소드 (3)
	boolean isEqual(String a, String b) {
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}
	
}

//1. 기능 제공용 패키지에 있는 클래스에 아래와 같은 기능을 가지고 있는 메소드를 만듭니다.
//- 메소드(1)
//  - 문자열 두 개를 전달 받음
//  - 두 문자열을 합치고 리턴
//- 메소드(2)
//  - 정수 두 개를 전달 받음
//  - 두개의 정수의 곱을 리턴
//  - 단, 첫번째 수가 두번째 수보다 작은 경우
//      - “계산할 수 없습니다.” 출력
//      - 0을 반환
//- 메소드(3)
//  - 문자열 두개를 전달 받음
//  - 두개의 값이 같은지 확인
//  - 같으면 true, 다르면 false 리턴
//2. 실행용 패키지 아래에 있는 클래스에서 메소드 3개를 호출합니다.