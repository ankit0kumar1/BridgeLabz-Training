package com.consturctors.level1;

public class LibraryBookSystem {
	private String title;
	private String author;
	private double price;
	private boolean available;
	
	//Constructor
	public LibraryBookSystem(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.available = true;
	}
	
	//method to borrow a book
	public void borrow() {
		if(available) {
			available = false;
			System.out.println("You have successfully borrowed: '" + title +"'.");
			
		}else {
			System.out.println("Sorry, '" + title + "'" + " is currently not available.");;
		}
	}
	
	//method to display book info
	public void displayInfo() {
		String status = available ? "Available: ": "Not available.";
		System.out.println("'"+ title + "' by " + author + ", Price: Rs. "+ price + ", Status: "+ status);
	}
	//Getter and Setter 
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public static void main(String[] args) {
    	
    	//Create object of LibraryBook
    	LibraryBookSystem book1 = new LibraryBookSystem("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
    	LibraryBookSystem book2 = new LibraryBookSystem("1984", "George Orwell", 9.99);

        book1.displayInfo();
        book1.borrow();  // Borrow the book
        book1.displayInfo();
        book2.setAvailable(false);  
        book2.displayInfo();
        book2.borrow();  
    }
}