package com.book.user;

import java.util.arraylist;
import java.utli.iterator;


public class Bookstore {
	private ArrayList<Book> bookArrayList;
	public void addBook(Book book) {
		bookArrayList.add(book);
		
		}
	public void serachBytitle(String title) {
		Book book = bookArrayList.stream()
				.filter(Book -> title.equals(Book.getTitle())).findAny.orElse(other:null);
		System.out.println("book with title: "+title+"\n"+book);
		
	}
	
	public void searchbyAuthor(String author) {
		Book book = bookArrayList.Stream()
				.filter(Book -> authore.equals(Book.getauthor())).findAny.orElse(other:null);
		System.out.println("book by author: "+author+"\n"+book);
		

		
	}
	
	public void displayAll() {
		System.out.println("displaying all the books");
		iterator<Book> bookArrayListIterator = bookArrayList.iterator();
		while(bookArrayListIterator.hasNext()) {
			Book book = bookArrayListIterator.Next();
			System.out,println(book);
			

		

	}

}