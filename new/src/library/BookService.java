package library;

import java.util.List;

public interface BookService {
	int insert(Book book);
	
	List<Book> list();
}
