package homework.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public BookMenu() {
		
	}
	
	public void mainMenu() {
		while (true) {
			System.out.println();
			System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
		
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void insertBook() {
		System.out.println();
		System.out.println("=== 도서 등록 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르 ( 1:인문 / 2:자연과학 / 3:어린이 / 그 외:기타 ) : ");
		int categoryNum = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		// 카테고리 숫자 -> 문자열
		String category;
		switch (categoryNum) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "자연과학";
			break;
		case 3:
			category = "어린이";
			break;
		default:
			category = "기타";
			break;
		}
		
//		 매개변수로 Book 객체 생성
		Book book = new Book(title, author, category, price);
		bc.bookList.add(book);
	}
	
	public void selectList() {
		List<Book> bookList = bc.selectList();
		System.out.println();
		System.out.println("=== 전체 조회 ===");
		
		if (!bookList.isEmpty()) {
			for (Book book : bookList) {
				System.out.println(book);
			}
		} else {
			System.out.println("존재하는 도서가 없습니다.");
		}
	}
	
	public void searchBook() {
		System.out.print("검색어 : ");
		String keyword = sc.nextLine();
		
		if (bc.searchBook(keyword).isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book book : bc.searchBook(keyword)) {
				System.out.println(book);
			}
		}
	}
	
	public void deleteBook() {
		System.out.println();
		System.out.println("=== 도서 삭제 ===");
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
//		System.out.println(bc.deleteBook(title, author));
		if (remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	
	public void ascBook() {
		if (bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
			for (Book book : bc.bookList) {
				System.out.println(book);
			}
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		
	}

	
}
