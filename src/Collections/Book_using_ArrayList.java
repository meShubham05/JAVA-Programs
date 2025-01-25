package Collections;

import java.util.*;

class Book
{
	private int bookId;
	private String bookName;
	private float price;
	public Book()
	{
		
	}
	public Book(int bookId, String bookName, float price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
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
	
	
}
public class Book_using_ArrayList {
	
	public static void main(String[] args) {
		

	ArrayList<Book> list = new ArrayList<Book>();
	
	Book b1 = new Book(5,"Book1",5000);
	Book b2 = new Book(4,"Book2",6000);
	Book b3 = new Book(3,"Book3",4000);
	Book b4 = new Book(7,"Book4",2000);
	Book b5 = new Book(9,"Book5",1000);
	
	list.add(b1);
	list.add(b2);
	list.add(b3);
	
	list.add(b4);
	
	list.add(b5);
	
	Iterator<Book> i = list.iterator();
	
//	while(i.next()!=null)
//	{
//		System.out.println(i.hasNext()); // true , true , true , true , false
//	}
	
	
	for(Book b:list)
	{
		System.out.println("Book Id :"+b.getBookId()+"  Book Name : "+b.getBookName()+ "  Book Price :"+b.getPrice());
	}
	
	Iterator<Book> iterator2 =list.iterator();
	
	System.out.println("By iterating the arraylist using while loop ");
	while(iterator2.hasNext())
	{
		Book book=(Book)iterator2.next();
		
		System.out.println("book Id : "+book.getBookId()+" Book Name : "+book.getBookName()+" Book Price : "+book.getPrice());
	}	
	 	
	}
}
