package com.assignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import com.assignment.to.Book;
import com.assignment.utils.DBUtils;

public class BookDAO {

	public List<Book> getAllBooks() {
		Book book = null;
		List<Book> list = new ArrayList<>();

		try {

			Connection conn = DBUtils.getConnection();

			PreparedStatement statement = conn.prepareStatement("select * from book");

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				String bookId = resultSet.getString(1);
				String bookName = resultSet.getString(2);
				String authorName = resultSet.getString(3);
				String description = resultSet.getString(4);

				book = new Book(bookId, bookName, authorName, description);

				list.add(book);

			}

		} catch (Exception e) {
			System.out.println("inside catch of showBookName() of BookDAO...");
			e.printStackTrace();
		}
		return list;

	}

	public void addBooks(Book book) {

		try {

			Connection conn = DBUtils.getConnection();

			PreparedStatement statement = conn.prepareStatement("insert into book values(?, ?, ?, ?)");

			statement.setString(1, book.getBookId());
			statement.setString(2, book.getBookName());
			statement.setString(3, book.getAuthorName());
			statement.setString(4, book.getDescription());

			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println("inside catch of add() of BookDAO...");
			e.printStackTrace();
		}
	}

	public List<Book> getBook(String bookid) {
		Book book = null;
		List<Book> list = new ArrayList<>();
		try {

			Connection conn = DBUtils.getConnection();

			PreparedStatement statement = conn.prepareStatement("select * from book where bookId= ?");
			statement.setString(1, bookid);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {

				String bookId = resultSet.getString(1);
				String bookName = resultSet.getString(2);
				String authorName = resultSet.getString(3);
				String description = resultSet.getString(4);

				book = new Book(bookId, bookName, authorName, description);

				list.add(book);

			} else {
				System.out.println("No such Book Found ");
			}

		} catch (Exception e) {
			System.out.println("inside catch of seeBook() of BookDAO...");
			e.printStackTrace();
		}

		return list;
	}

	public int deleteBook(String bookId) {
		int resultSet = 0;
		try {

			Connection conn = DBUtils.getConnection();

			PreparedStatement statement = conn.prepareStatement("delete from book where bookId = ?");

			statement.setString(1, bookId);

			resultSet = statement.executeUpdate();

		} catch (Exception e) {
			System.out.println("inside catch of deleteBooks() of BookDAO...");
			e.printStackTrace();
		}
		return resultSet;
	}

}
