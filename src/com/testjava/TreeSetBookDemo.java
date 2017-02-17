import java.util.*;
import java.lang.*;

public class TreeSetBookDemo {
	public static void main(String[] args) {
		Book b1 = new Book(4444, "Melting Of the Golden God 1", "JangBahadur Patel", "Benten Publications", 1000);
		Book b2 = new Book(2222, "Melting Of the Golden God 2", "JangBahadur Patel", "BPB Publications", 5000);
		Book b3 = new Book(3333, "Melting Of the Golden God 3", "JangBahadur Patel", "Pothi Publications", 4000);
		Book b4 = new Book(1111, "Melting Of the Golden God 4", "JangBahadur Patel", "Arihant Publications", 3000);
		
		Set<Book> book = new TreeSet<Book>();
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		
		// traversing treeset
		for (Book b : book) {
			System.out.println(b.ISBN + " " + b.bookName + " " + b.authorName + " " + b.publisherName + " " + b.noOfCopies);
		}
	}
}
