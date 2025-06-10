package homework.homework03;

import java.util.Scanner;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note ***** \r\n"
					+ "1. 노트 새로 만들기 \r\n"
					+ "2. 노트 열기 \r\n"
					+ "3. 노트 열어서 수정하기 \r\n"
					+ "9. 끝내기 ");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch (menuNum) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요. \r\n"
					+ "ex끝it  이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String text = sc.nextLine();
			
			if ("ex끝it".equals(text)) {
				System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
				String fileName = sc.nextLine();
				
//				if (fc.checkName(fileName))
//				return;
			}
			
			sb.append(text);
		}
	}
	
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
		
	}
	
}
