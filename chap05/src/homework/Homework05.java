package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while (true) {
			System.out.print("가위바위보 : ");
			String user = sc.nextLine();
			
			if ("stop".equals(user)) {
				break;
			}
			if ("안해".equals(user)) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			String[] choices = {"가위", "바위", "보"};
			
			int computer = (int) (Math.random() * 3); // 0, 1, 2
	
			System.out.println("컴퓨터 : " + choices[computer]);
			System.out.println("사용자 : " + user);
			
			
			if (user.equals(choices[computer])) {
				System.out.println("비겼습니다");
				draw++;
			} else if ( ("가위".equals(user) && "보".equals(choices[computer])) ||
						("바위".equals(user) && "가위".equals(choices[computer])) ||
						("보".equals(user) && "바위".equals(choices[computer]))
						) {
				System.out.println("이겼습니다 !");
				win++;
			} else {
				System.out.println("졌습니다 ㅠㅠ");
				lose++;
			}
			count++;
			
		 }
		
		System.out.println(count + "번의 승부에서 " + "사용자 "+ win + "승 " + draw + "무 " + lose + "패");
		
	}

}

//		선생님꺼
//		Scanner sc = new Scanner(System.in);
//		String[] choices = {"가위", "바위", "보"};
//		
//		// 카운터 변수
//		int win = 0;
//		int draw = 0;
//		int lose = 0;
//		int total = 0;
//		
//		while (true) {
//			System.out.print("가위바위보 입력: ");
//			String user = sc.nextLine();
//			
//			if ("stop".equals(user)) {
//				break;
//			}
//			
//			// 유효성 검사
//			if (!"가위".equals(user) && !"바위".equals(user) && !"보".equals(user)) {
//				System.out.println("잘못 입력하셨습니다.\n");
//				continue;
//			}
//			
//			int com = (int) (Math.random() * 3);
//			String computer = choices[com];
//			System.out.println("컴퓨터: " + computer);
//			System.out.println("사용자: " + user);
//			
//			if (computer.equals(user)) {
//				System.out.println("비겼습니다.");
//				draw++;
//			} else if (
//				("가위".equals(user) && "보".equals(computer)) ||
//				("바위".equals(user) && "가위".equals(computer)) ||
//				("보".equals(user) && "바위".equals(computer))
//			) {
//				System.out.println("이겼습니다!");
//				win++;
//			} else {
//				System.out.println("졌습니다ㅠㅠ");
//				lose++;
//			}
//			
//			total++;
//			System.out.println();
//		}
//		
//		System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");
