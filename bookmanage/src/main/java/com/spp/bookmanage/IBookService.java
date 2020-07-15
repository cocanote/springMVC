package com.spp.bookmanage;

import java.util.ArrayList;

public interface IBookService {

	void registerBook(String name, String author, String isbn, String price) ;
	ArrayList<Book> readBooks();
	void modifyBook(String name, String author, String isbn, String price) ;
	Book readBook(String isbn);
	void deleteBook(String isbn);
}
