package homework.method;

public class Homework01Run {

	public static void main(String[] args) {
		Homework01 hw1 = new Homework01();
		
		System.out.println(hw1.plus("안녕", "하세요"));
		
		System.out.println(hw1.multiple(3, 5));
		
		System.out.println(hw1.isEqual("안녕", "안녕"));
		System.out.println(hw1.isEqual("안녕", "하세요"));
	}

}

//1. 기능 제공용 패키지에 있는 클래스에 아래와 같은 기능을 가지고 있는 메소드를 만듭니다.
//- 메소드(1)
//    - 문자열 두 개를 전달 받음
//    - 두 문자열을 합치고 리턴
//- 메소드(2)
//    - 정수 두 개를 전달 받음
//    - 두개의 정수의 곱을 리턴
//    - 단, 첫번째 수가 두번째 수보다 작은 경우
//        - “계산할 수 없습니다.” 출력
//        - 0을 반환
//- 메소드(3)
//    - 문자열 두개를 전달 받음
//    - 두개의 값이 같은지 확인
//    - 같으면 true, 다르면 false 리턴
//2. 실행용 패키지 아래에 있는 클래스에서 메소드 3개를 호출합니다.