package com.assignment.to;

public class Book {
	private String bookId;
	private String bookName;
	private String authorName;
	private String description;

	public Book() {

	}

	public Book(String bookId, String bookName, String authorName, String description) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
