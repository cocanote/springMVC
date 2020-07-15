package com.spp.bookmanage;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
	
	BookService bookService;
	public BookController(){
		bookService = new BookService();
	}
	
	@RequestMapping("/reg")
	public String registerBook(Model model) {
	
		return "book/registerBook";
	}

	@RequestMapping("/regCon")
	public String registerConfirmBook(Model model, HttpServletRequest request) {
	
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String isbn = request.getParameter("isbn");
		String price = request.getParameter("price");
		
		bookService.registerBook(name, author, isbn, price);
		
		return "redirect:/book/readBooks";
	}
	
	@RequestMapping("/readBooks")
	public String readBooks(Model model, HttpServletRequest request) {
	
		
		ArrayList<Book> dbList = bookService.readBooks();
		model.addAttribute("list",dbList);
		
		
		return "book/readBooks";
	}
	@RequestMapping("/mod")
	public String modifyBook(Model model, HttpServletRequest request) {
		
		String isbn = request.getParameter("isbn");
		Book book = bookService.readBook(isbn);
		model.addAttribute("b",book);
		
		return "book/modifyBook";
	
	}
	
	@RequestMapping("/modCon")
	public String modifyConfirmBook(Model model, HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String isbn = request.getParameter("isbn");
		String price = request.getParameter("price");
		
		bookService.modifyBook(name, author,isbn, price);
		
		return "redirect:/book/readBooks";
	}
	
	@RequestMapping("/del")
	public String deleteBook(Model model, HttpServletRequest request) {
		
		String isbn = request.getParameter("isbn");
		
		bookService.deleteBook(isbn);
		
		return "redirect:/book/readBooks";
	
	}
}
