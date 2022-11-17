package com.bootutil;

import com.book.exception.InvalidBookException;
import com.book.user.Book;
import com.book.user.Bookstore;


public interface Bookutil {
	
	public static void main(String[] args )
	throws InvalidBookException {
		Bookstore bookStore = new BookStore();
		
		Book book1= new Book (bookID:"B123",title:"bookTitle1",author:"bookauthor1",category:"science",price:10);
		Book book1= new Book (bookID:"B456",title:"bookTitle2",author:"bookauthor2",category:"fiction",price:20);
		Book book1= new Book (bookID:"B789",title:"bookTitle3",author:"bookauthor3",category:"technology",price:30);
		
		bookstore.addBook(book1);
		bookstore.addBook(book2);
		bookstore.addBook(book3);
		
		bookstore.displayAll();
		
		bookStore.searchbyAuthor("bookAuthor2");
		bookStore.searchbyAuthor("booktitle3");
	}
}




	}

}
