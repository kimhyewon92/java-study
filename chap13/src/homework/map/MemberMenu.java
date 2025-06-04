package homework.map;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====\r\n"
					+ "원하시는 메뉴의 번호를 입력하세요.\r\n"
					+ "1. 회원가입\r\n"
					+ "2. 로그인\r\n"
					+ "3. 같은 이름 회원 찾기\r\n"
					+ "9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1:
				joinMember();
				break;
			case 2:
				logIn();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void memberMenu() {
		// 1. 로그아웃전까지 메뉴 화면 반복 실행
		
		// 2. 각 메뉴 번호 입력하면 해당 메소드로 이동
		System.out.println("***** 회원 메뉴 *****\r\n"
				+ "회원 메뉴는 회원만 접근할 수 있습니다.\r\n"
				+ "먼저 회원가입, 로그인을 해주세요.\r\n"
				+ "1. 비밀번호 바꾸기\r\n"
				+ "2. 이름 바꾸기\r\n"
				+ "3. 로그아웃\r\n");
		System.out.print("메뉴 번호 입력 : ");
		int mMenuNum = sc.nextInt();
		sc.nextLine();
		
		switch (mMenuNum) {
		case 1:
			changePassword();
			break;
		case 2:
			changeName();
			break;
		case 3:
			System.out.println("로그아웃 되었습니다.");
			return;
		default:
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			break;
		}
		// 3. 잘못 입력하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요." 출력
		// ***** 회원 메뉴 *****
		// 회원 메뉴는 회원만 접근할 수 있습니다.
		// 먼저 회원가입, 로그인을 해주세요.
		// 1. 비밀번호 바꾸기 -> changePassword()실행
		// 2. 이름 바꾸기 -> changeName() 실행
		// 3. 로그아웃 -> "로그아웃 되었습니다." 출력 후 mainMenu로 돌아가기
		// (이전에 수행된 메소드로 돌아가려면 break; 대신 return; 코드를 사용)	
	}
	
	public void joinMember() {
		while (true) {
			// 1. 회원가입에 필요한 아이디, 비밀번호, 이름 입력 받음
			System.out.println("=== 1. 회원가입 ===");
			System.out.print("아이디 : ");
//			sc.nextLine();
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			// 2. 비밀번호와 이름은 Member 객체에 담음
			Member m = new Member(password, name);
			
			// 3. id와 Member 객체를 MemberController(mc)의 joinMember()로 보내기
			// (mc의 joinMember()를 호출하라는 이야기)
			boolean result = mc.joinMember(id, m);
			
			// 4. mc의 joinMember()로부터 받은 결과에 따라 다른 문장 출력
			// -> true : "성공적으로 회원가입 완료하였습니다."
			// -> false : "중복된 아이디입니다. 다시 입력해주세요." 
			// (false일 경우 회원가입이 완료될때까지 반복)
			if (result) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void logIn() {
		while (true) {
			System.out.println("=== 2. 로그인 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
//			sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			String result = mc.logIn(id, password);
			if(result != null) {
				System.out.println(result + "님, 환영합니다!");
				break;
			} else {
				System.out.println( "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
				continue;
			}
			
			// 3. 반환 값이 있으면 "OOO님, 환영합니다!" 출력
			// -> 그 다음 로그인 화면(memberMenu() 메소드 호출)으로 이동
			// -> memberMenu 호출은 mainMenu() 메소드에서 수행
			// 4. 반환 값이 없으면 
			// -> "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요."출력
			// -> 올바른 아이디와 비밀번호를 입력할때까지 반복
		}
	}
	
	public void changePassword() {
		while (true) {
			System.out.println("=== 1. 비밀번호 바꾸기 ===");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPW = sc.nextLine();
			
			boolean result = mc.changePassword(id, oldPw, newPW);
			if (result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void changeName() {
		System.out.println("=== 2. 이름 바꾸기 ===");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		while (true) {
			String result = mc.logIn(id, password);
			if (result != null) {
			System.out.println("현재 설정된 이름 : " + result);
			System.out.print("변경할 이름 : ");
			String newName = sc.nextLine();
			mc.changeName(id, newName);
			System.out.println("이름 변경에 성공하였습니다.");
			break;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
				continue;
			}
		}
	}
	
	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		mc.sameName(name);
	}
	
	
	
}
