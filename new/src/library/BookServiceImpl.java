package library;

import java.util.List;

public class BookServiceImpl implements BookService {
	private BookDAO bookDAO = new BookDAO();
	
	@Override
	public int insert(Book book) {
		int result = bookDAO.insert(book);
		return result;
	}

	@Override
	public List<Book> list() {
		List<Book> resultList = bookDAO.list();
		return resultList;
	}

}
