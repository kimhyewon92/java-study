package homework.set;

import java.util.Iterator;
import java.util.Scanner;

import homework.list.Book;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 로또 번호 추첨 =====\r\n"
					+ "원하시는 메뉴의 번호를 입력하세요.\r\n"
					+ "1. 추첨 대상 추가\r\n"
					+ "2. 추첨 대상 삭제\r\n"
					+ "3. 추첨 대상 목록 조회\r\n"
					+ "4. 당첨 대상 구성\r\n"
					+ "5. 정렬된 당첨 대상 확인\r\n"
					+ "6. 당첨 대상 검색\r\n"
					+ "9. 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				searchObject();
				break;
			case 4:
				winObject();
				break;
			case 5:
				sortedWinObject();
				break;
			case 6:
				searchWinner();
				break;
			case 9:
				searchWinner();
				System.exit(0);
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	public void insertObject() {
		System.out.println();
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		int count = 0;
		
		while (true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("휴대폰 번호(-빼고) : ");
			String phone = sc.nextLine();
			Lottery l = new Lottery(name, phone);
			if (lc.insertObject(l)) {
				count++;
			} else {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			}
			if (count == num) break;
		}
		System.out.println(num + "명 추가 완료했습니다.");
	}
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.nextLine();
		Lottery l = new Lottery(name, phone);
		
		if (lc.deleteObject(l)) {
			System.out.println("삭제 완료되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		System.out.println(lc.searchObject());
	}
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		if (lc.winObject() != null) {
			System.out.println(lc.winObject());
		} else {
			System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
		}
	}
	public void sortedWinObject() {
		Iterator<Lottery> iteratorWin = lc.sortedWinObject().iterator();
		while (iteratorWin.hasNext()) {
			Lottery element = iteratorWin.next();
			System.out.println(element);
		}
	}
	public void searchWinner() {
		
	}
}
