package homework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
	
	List<Book> bookList = new ArrayList<Book>();
	
    public BookController(){
		bookList.add(new Book("느리게 나이드는 습관","정희원","인문",16200));
		bookList.add(new Book("코스모스","칼 세이건","자연과학",17910));
		bookList.add(new Book("나에게 들려주는 예쁜 말","김종원","어린이",15610));
    	bookList.add(new Book("혼자 공부하는 자바", "신용권", "기타", 25240));
    }

    public void insertBook(Book bk){
    	bookList.add(bk);
    }

    public List<Book> selectList(){
        // bookList 반환
    	return bookList;
    	
    }

    public List<Book> searchBook(String keyword){
    	List<Book> searchList = new ArrayList<Book>();
    	
    	for (Book book : bookList) {
			if (book.getTitle().contains(keyword)) {
				searchList.add(book);
			}
		}
    	return searchList;
    	
        // 1. 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
        // 2. 반복문을 통해 list의 책 이름 중에 전달받은 keyword 포함된 경우
        // -> String에 특정 문자열이 포함되었는지 확인할 때
        // String데이터.contains("특정 문자열")
        // 3. searchList에 해당 책 추가
        // 4. searchList 반환
    }
//
    public Book deleteBook(String title, String author){
    	Book removeBook = null;
    	
    	for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title) &&
				bookList.get(i).getAuthor().equals(author)) {
				removeBook = bookList.get(i);
				bookList.remove(i);
			}
		}
    	return removeBook;
        // 1. 삭제된 도서를 담을 객체(Book removeBook) 선언 및 null 할당
        // 2. 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고
        // 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
        // 3. 삭제할 도서가 있는 경우 해당 도서를 removeBook에 대입
        // 4. removeBook 객체 반환
    }

    public int ascBook(){
    	Collections.sort(bookList);
		    // Collections.sort와 Comparable활용
    	return 1;
    }

	
}
