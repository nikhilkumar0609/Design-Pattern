package IteratorDesignPattern;

public class Book {
	
	public int bookId;
	public String bookName;
	
	public Book(int id, String name) {
		this.bookId = id;
		this.bookName = name;
	}

	public String getBookName() {
		return bookName;
	}
}
