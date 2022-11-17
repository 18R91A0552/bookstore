package com.book.user;

import com.book.exception.InvalidBookException;

import java.util.arrays;


public class books {
	private String bookID;
	private String title;
	private String author;
	private String category;
    private double price;
    private String[] categoryTypes = {"science","friction","technology","others"};
    
    public Book(String bookID,String title,String author,String category,double price) throws InvalidBookException {
    	boolean contains = Arrays.stream(category Types).anyMatch(category::equals);
    	if(contains) {
    		throw new InvalidBookException("category criteria failed for: "+category);
    	}
    	if(price<0) throws new InvalidException("price is less than 0 :"+price);
    	if(bookID.length() == 4 && bookID.charAt(0) == 'B') {
    		this.bookID =bookID;
    	}
    	else throw new InvalidBookException("bookId doesn't match required criteria "+bookID);
    	this.title=title;
    	this.author =author;
    	this.category;
    	this.price;
    }
    
    public String getBookID() {
    	return bookID;
    }
    public void setBookID(String bookID) {
    	this.bookID = bookID;
    
    }
    public String getTitle() {
    	return title;
    	
    }
    public void setTitle(String title) {
    	this.title=title;
    	
    }
    public String getAuthor() {
    	return author;
    	
    }
    public void setAuthor(String author) {
    	this.author=author;
    }

    public String getCategory() {
    	return category;
    	
    }
    public setCategory(String category) {
    	this.category=category;
    }
    public double getPrice(double price) {
    	return price;
    	
    	
    }
    
    publice void setprice(double price) {
    this.price = price;
    }
    
    @override
    public String toString() {
    	return"Book{" +
    "bookID="' + bookID + '\" +
    "title="' + title + '\" +
    "author="'+ author +'\" +
    "category ="'+category +'\"+"
    	"price=" +price	+
    	'}';
    	
    
     }
    
    
    

	

}
