package library;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String isbn;
	private int price;
 
	public Book() {
	 
	}

	public Book(String isbn, int price) {
		if (isbn.contains("*")) {
			recoverMissingDigit(isbn);
		} else {
			this.isbn = isbn;
		}
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("ISBN: " + isbn + ", 가격: " + price + "원");
	}
	
	public void recoverMissingDigit(String isbn) {
		int starIndex = 0;
		int sum = 0;
		int starValue = 0;
		String newIsbn = "";
		
		// 별은 index번호 저장하고 숫자는 sum에 합하기 (짝수: 1곱하고 합, 홀수: 3곱하고 합) 
		for (int i = 0; i < isbn.length(); i++) {
			int wordInt = isbn.charAt(i) - '0';

			if (!(wordInt >= 0 && wordInt <= 9)) {
				starIndex = i;
			} else {
				if (i%2 == 0) sum += wordInt;
				else sum += (wordInt * 3);
			}
		}
		
		// 별의 index번호가 홀수,짝수인지에 따라서 1,3곱하여 합한 값에 10을 나눌때 나머지가 0인 값 찾기
		if (starIndex%2 == 0) {
			for (int i = 0; i <= 9; i++) {
				if ((sum + i) % 10 == 0) starValue = i;
			}
		} else {
			for (int i = 0; i <= 9; i++) {
				if ((sum + i*3) % 10 == 0) starValue = i;
			}
		}
		
		// 빈 문자열에 기존 isbn번호를 넣고, 별이 있던 index번호 자리는 새로운 값으로 넣기
		for (int i = 0; i < isbn.length(); i++) {
			if (i == starIndex) {
				newIsbn += String.valueOf(starValue);
			} else {
				newIsbn += String.valueOf(isbn.charAt(i));
			}
		}
		
		// 필드값에 새로운 isbn 저장
		this.isbn = newIsbn;
	}
}
