package Queue_Interface;

import java.util.*;

class Book implements Comparable<Object>
{
	private int bookId;
	private String bookName;
	private String bookAuthor;
	
	
	public Book (int bookId, String bookName, String bookAuthor)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		
	}
	@Override
	public int compareTo(Object o) {
		Book b1 = (Book)o;
		if(this.bookId>b1.bookId)
		{
			return -1;
		}
		else if(this.bookId<b1.bookId)	
		{
			return 1;
		}
		else
		{
			return 0;
		}

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
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	
}
public class Book_Priority_Queue {

	public static void main(String[] args) {

		Queue<Book> queue = new PriorityQueue<Book>();
		
		Book b1 = new Book(4,"Book1","Author1");
		Book b2 = new Book(5,"Book2","Author2");
		Book b3 = new Book(1,"Book3","Author3");
		Book b4 = new Book(3,"Book4","Author4");
		Book b5 = new Book(8,"Book5","Author5");
		
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		queue.add(b4);
		queue.add(b5);
		
		
		Iterator<Book> it =queue.iterator();
		
		System.out.println("Fetching the Book Data using the Queue Iterator Interface ");
		while(it.hasNext())
		{
			Book book =(Book) it.next();
			System.out.println("Book Id :"+ book.getBookId()+" Book Name :"+book.getBookName()+" Book Author : "+book.getBookAuthor() );
		}		

		System.out.println("After Removing the Queue Element :");
		
		queue.remove(); // first queue element 
		
		Iterator<Book>  it2 = queue.iterator();
		
		while(it2.hasNext())
		{
			Book book =(Book) it2.next();
			System.out.println("Book Id :"+ book.getBookId()+" Book Name :"+book.getBookName()+" Book Author : "+book.getBookAuthor() );
		}
		
		// Fetching Queue data using the for Each loop
		
		for(Book b : queue)
		{
			System.out.println("Book Id :"+ b.getBookId()+" Book Name :"+b.getBookName()+" Book Author : "+b.getBookAuthor() );
		}
	}

}
