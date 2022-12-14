package service;

import vo.BookVO;

public class BookService {
	private Dao dao;
	public BookService() {
		dao= new BookDAO();
	}
	
	public void insert(BookVO b) {
		dao.bookinsert(b);
	}
	
	public BookVO findbook(String id) {
		return dao.bookselect(id);
	}
	public void updatebook(BookVO b) {
		dao.bookupdate(b);
	}
	public void bookdelete(String id) {
		dao.bookdelete(id);
	}
	public void printAll() {
		System.out.println(dao.bookselectAll());
	}
	}
