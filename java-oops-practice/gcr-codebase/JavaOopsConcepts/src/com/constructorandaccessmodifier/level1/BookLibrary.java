package com.constructorandaccessmodifier.level1;

// Book class
// this class shows use of access modifiers
public class BookLibrary {

	    // public variable - accessible everywhere
	    public String ISBN;

	    // protected variable - accessible in same package and subclasses
	    protected String title;

	    // private variable - accessible only inside this class
	    private String author;

	    // constructor to initialize book details
	    BookLibrary(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // public method to get author name
	    // used to access private variable
	    public String getAuthor() {
	        return author;
	    }

	    // public method to set author name
	    // used to modify private variable
	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    // method to display basic book details
	    void displayBook() {
	        System.out.println("ISBN   : " + ISBN);
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	    }
	}
