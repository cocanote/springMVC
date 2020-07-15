package com.spp.bookmanage;

import java.util.ArrayList;

public interface IBookDao {

	void insertBook(String name, String author, String isbn, String price) ;
	ArrayList<Book> readBooks();
	void updateBook(String name, String author, String isbn, String price) ;
	Book readBook(String gisbn);
	void deleteBook(String isbn);
}
