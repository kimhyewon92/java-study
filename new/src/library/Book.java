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
		List<String> list = new ArrayList<String>();
		int sum = 0;
		int starNum = 0;
		
		list.add(isbn);
		
		for (String word : list) {
			if (word == "*") continue;
			
			int wordInt = Integer.parseInt(word);
			if (wordInt%2 == 0) {
				sum += wordInt;
			} else {
				sum += wordInt*3;
			}
			for (int i = 1; i < 10; i++) {
				if ((sum += i) % 10 == 0) {
					starNum = i;
				}
			}
			list.set(Integer.parseInt(word), String.valueOf(wordInt));
		}
		System.out.println(sum);
	}
	
	
}
