package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Physics"));
		books.add(new Book(2, "Chemistry"));
		books.add(new Book(3, "Biology"));
		books.add(new Book(4, "Mathematics"));
		
		Library library = new Library(books);
		
		Iterator iterable = library.createIterator();
		while(iterable.hasNext()) {
			Book book = (Book) iterable.next();
			System.out.println(book.getBookName());
		}
	}
}
