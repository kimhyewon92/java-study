package sec01.exam28.quiz;

import java.util.Scanner;

public class Run {
	// Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반 전체 학생 수 : ");
		int person = sc.nextInt();
		sc.nextLine(); // 개행 문자 제거(버퍼 지우기)
		
		String[] personList = new String[person];
		
		
		for (int i = 0; i < personList.length; i++) {
			System.out.print("학생 이름 : ");
			personList[i] = sc.nextLine();
		}
		
		// 선생님꺼
//		int count = 5;
//		while (true) {
//			System.out.println(count--);
//			Thread.sleep(1000); // 현재 스레드를 일정 시간 정지
//			// 주의: 현재 스레드를 멈추기 때문에 사용 주의!
//			// 단순한 테스트나 콘솔 앱에서는 OK
//			if (count == 0) break;
//		}
		
		int coffee = (int) (Math.random() * personList.length);
		System.out.println("커피 쏠 사람 : " + personList[coffee]);
		
	}

}
