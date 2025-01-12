package IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator{
	
	public List<Book> bookList;
	public int index = 0;
	
	public BookIterator(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public boolean hasNext() {
		return index < bookList.size();
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
			return bookList.get(index++);
		}
		return null;
	}

}
