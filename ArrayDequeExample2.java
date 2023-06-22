package queue;
import java.util.*;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}
public class ArrayDequeExample2 {

	public static void main(String[] args) {
		Deque<Book> set = new ArrayDeque<Book>();
		//creating books
		Book b1 = new Book(101,"Let Us C","Yashwant Kanetkar","BPB",8);
		Book b2 = new Book(102,"Data Communication & Networking","Forouzan","MC Graw Hill",4);
		Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);
		
		//adding books to deque
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		//traversing ArrayDeque
		for(Book b:set) {
			System.out.println(b.id +" - "+b.name+" - "+b.author+" - "+b.publisher+" - "+b.quantity);
		}

	}

}
