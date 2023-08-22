package com.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.assignment.dao.BookDAO;
import com.assignment.to.Book;

public class BookService {
	static Scanner sc = new Scanner(System.in);

	public void getAllBooks() {
		BookDAO bookDAO = new BookDAO();
		List<Book> list = new ArrayList<>();
		list = bookDAO.getAllBooks();

		for (Book book : list) {
			System.out.print(book.getBookId() + " ");
			System.out.print(book.getBookName() + " ");
			System.out.print(book.getAuthorName() + " ");
			System.out.print(book.getDescription() + " ");

		}

	}

	public void addBooks() {
		System.out.println("Enter BookId : ");
		String bookId = sc.next();

		System.out.println("Enter BookName : ");
		String bookName = sc.next();

		System.out.println("Enter AuthorName : ");
		String authorName = sc.next();

		System.out.println("Enter Description : ");
		String description = sc.next();

		Book book = new Book(bookId, bookName, authorName, description);
		BookDAO bookDAO = new BookDAO();
		bookDAO.addBooks(book);
	}

	public void getBook(String bookId) {
		List<Book> list = new ArrayList<>();
		BookDAO bookDAO = new BookDAO();

		list = bookDAO.getBook(bookId);

		for (Book book : list) {
			System.out.print(book.getBookId() + " ");
			System.out.print(book.getBookName() + " ");
			System.out.print(book.getAuthorName() + " ");
			System.out.print(book.getDescription() + " ");

		}
	}

	public void deleteBook(String bookId) {
		BookDAO bookDAO = new BookDAO();
		int resultSet = bookDAO.deleteBook(bookId);

		if (resultSet > 0) {
			System.out.println("Book deleted successfully ");
		}

		else {
			System.out.println("No such Book Found ");
		}
	}
}
