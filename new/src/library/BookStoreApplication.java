package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStoreApplication {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		double totalAmount = 0;
		
//		System.out.println("총 평균 가격 : " + (Math.round(avg * 100) / 100.0) + "원");
//		System.out.printf("총 평균 가격 : %.2f원", avg);
		
		while (true) {
			System.out.print("책 종류를 입력하세요 (소설/시): ");
			String bookType = sc.nextLine();
			
			if (!(bookType.equals("소설") || bookType.equals("시"))) {
				System.out.println("잘못된 종류입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("ISBN을 입력하세요 (13자리, * 포함 가능): ");
			String isbn = sc.nextLine();
			
			if (!(isValidISBN(isbn))) continue; 
			
//			try {
			System.out.print("가격을 입력하세요: ");
			int price = sc.nextInt();
			sc.nextLine();
			// 책 종류에 따른 생성자
			if (bookType.equals("소설")) {
				bookList.add(new Novel(isbn, price));
			} else if (bookType.equals("시")) {
				bookList.add(new Poem(isbn, price));
			}
			
			System.out.print("입력을 종료하시겠습니까? (y/Y 입력 시 종료): ");
			String quit = sc.nextLine();
			
			if (quit.equalsIgnoreCase("y")) {
				System.out.println("===== 도서 목록 =====");
				for (Book book : bookList) {
					book.printInfo();
				}
				System.out.println();
				
				for (Book book : bookList) {
					totalAmount += book.getPrice();
				}
				
				double avg = totalAmount/bookList.size();
				System.out.printf("총 평균 가격 : %.2f원", avg);
				return;
			} else if (quit.equalsIgnoreCase("n")) {
				continue;
			}
		
//			} catch (NumberFormatException e) {
//				System.out.println("숫자를 입력해주세요.");
//				continue;
//			}
		}
		
		
	}
	
	// isbn 유효성 검사
	public static Boolean isValidISBN(String isbn) {
		Boolean result = true;
		int count = 0;
		int index = 0;
		
		if (!(isbn.length() == 13)) {
			System.out.println("유효하지 않은 ISBN 입니다");
			result = false;
		}
		
		if (isbn.length() == 13) {
			index = isbn.indexOf("*");
			while (index != -1) {
				count++;
				index += "*".length();
				index = isbn.indexOf("*", index);
			}
			if (count >= 2) {
				System.out.println("유효하지 않은 ISBN 입니다");
				result = false;
			}
		} else {
			result = true;
		}
		return result;
	}

}
