package Collections;

import java.util.*;

class Book2

{
	private int bookId ;
	private String bookName;
	private float price;
	
	
	public Book2()
	{
		
	}
	
	
	public Book2(int bookId , String bookName , float price)
	{
		this.bookId=bookId;
		this.bookName= bookName;
		this.price=price;
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}
	
	
//	public String toString()
//	{
//		return "Book Id :"+bookId+"Book Name : "+bookName+"Book Price :"+price;
//	}
	
	
	public String toString() {
	    return "Book Id: " + bookId + ", Book Name: " + bookName + ", Book Price: " + price;
	}

	@Override
    public boolean equals(Object o) 
	{
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book2 book = (Book2) o;
        return bookId == book.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}

public class Book_Using_HashSet {

	public static void main(String[] args) {
		
		Set<Book2> set = new HashSet<Book2>();
		
		
		Book2 b1 = new Book2(5,"Book1",800);
		Book2 b2 = new Book2(9,"Book2",900);
		Book2 b3 =new Book2(2,"Book3",400);
		Book2 b4 = new Book2(4,"Book4",100);
		Book2 b5 = new Book2(12,"Book5",500);
		
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		
//		Iterator<Book> il = set.iterator();
		
		for(Book2 book:set)
		{
			System.out.println("Book Id :"+book.getBookId()+ "Book Name : "+book.getBookName()+" Book Price : "+book.getPrice());
		}
		
		// Fetch class data using while loop
		
		System.out.println("size :"+set.size());
		
		 System.out.println("\nFetching data using while loop:");
		 
		 Iterator<Book2> iterator = set.iterator();
	     
		 while (iterator.hasNext()) 
		 {
	            Book2 book = iterator.next();
	            System.out.println(book.toString());
	     }
		 
		 // Fetching the Book Data using the Java 8 Stream() Method 
		 
		 System.out.println("Fetching the Data using the Java 8 stream() method :");
		 set.stream().forEach(book->System.out.println("Book id :"+book.getBookId()+" Book Name : "+book.getBookName()+" Book Price : "+book.getPrice()));
	
	
	
	}
}
