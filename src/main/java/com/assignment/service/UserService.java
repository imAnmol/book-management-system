package com.assignment.service;

import java.util.Scanner;

import com.assignment.dao.UserDAO;
import com.assignment.to.User;

public class UserService {

	static Scanner sc = new Scanner(System.in);
	UserDAO userDAO = new UserDAO();

	public User register() {
		System.out.print("\n");
		System.out.println("-------Enter Registration Details : --------");

		System.out.println("Enter username : ");
		String username = sc.next();

		System.out.println("Enter password : ");
		String password = sc.next();

		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter role : ");
		String role = sc.next();

		User user = new User(username, password, name, role);
		userDAO.add(user);

		return user;
	}

	public User login() {
		User user = null;
		System.out.print("\n");
		System.out.println("-------Enter Login Details : --------");
		System.out.println("Enter username : ");
		String username = sc.next();

		System.out.println("Enter password : ");
		String password = sc.next();

		user = userDAO.getUser(username, password);

		return user;

	}

	public void adminFunctionality(User user) {

		BookService bookService = new BookService();
		String bookId = null;

		int adminMenu = 0;

		do {
			System.out.println("\n" + "1. ViewProfile" + "\n" + "2. UsersProfile" + "\n" + "3. AddBooks" + "\n"
					+ "4. GetAllBooks" + "\n" + "5. DeleteBook" + "\n" + "6. GetBook" + "\n" + "7. Exit");

			adminMenu = sc.nextInt();

			switch (adminMenu) {

			case 1:
				viewProfile(user);
				break;

			case 2:
				usersProfile();
				break;

			case 3:
				bookService.addBooks();
				break;

			case 4:
				bookService.getAllBooks();
				break;

			case 5:
				System.out.println("Enter BookId which you want to delete : ");
				bookId = sc.next();

				bookService.deleteBook(bookId);
				break;

			case 6:
				System.out.println("Enter BookId which you want to search : ");
				bookId = sc.next();

				bookService.getBook(bookId);
				break;

			case 7:

				System.out.println("Exit successfully");
				break;

			default:

				break;
			}
		} while (adminMenu != 7);
		
	}

	public void normalFunctionality(User user) {
		BookService bookService = new BookService();
		int normalMenu = 0;

		do {
			System.out.println(
					"\n" + "1. ViewProfile" + "\n" + "2. GetAllBooks" + "\n" + "3. GetBook" + "\n" + "4. Exit");

			normalMenu = sc.nextInt();

			switch (normalMenu) {

			case 1:
				viewProfile(user);
				break;

			case 2:
				bookService.getAllBooks();
				break;

			case 3:
				System.out.println("Enter BookId which you want to search : ");
				String bookId = sc.next();

				bookService.getBook(bookId);
				break;

			case 4:

				System.out.println("Exit successfully");
				break;

			default:
				break;
			}
		} while (normalMenu != 4);

	}

	public void viewProfile(User user) {
		UserDAO userDAO = new UserDAO();
		userDAO.viewProfile(user);
	}

	public void usersProfile() {
		UserDAO userDAO = new UserDAO();
		userDAO.usersProfile();
	}

}
