package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
			
			int count = 0;
			int win = 0;
			int draw = 0;
			int lose = 0;
			
			if (user.equals(choices[computer])) {
				System.out.println("비겼습니다");
				draw++;
			} else if (("가위".equals(user) && "보".equals(choices[computer])) &&
						("가위".equals(user) && "보".equals(choices[computer]))
						) {
				win++;
			} else {
				lose++;
			}
			count++;
			
		 }
		
//		System.out.println(count + "번의 승부에서 " + "사용자"+ win + "승 " + draw + "무" + lose + "패");
		
		
	
	
	
		
	}

}
