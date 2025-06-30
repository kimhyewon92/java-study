package library;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends JDBConnection {
	public List<Book> list() {
		List<Book> resultList = new ArrayList<Book>();
		String sql = "SELECT isbn,price,type FROM book";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String type = rs.getString("type");
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultList;
		
	}
}
