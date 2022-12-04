import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book{
	String name;
	double price;
	String author_name;
	int isbn_no;
	String publication;
	
	public Book(String name, double price, String author_name, int isbn_no, String publication) {
		this.name = name;
		this.price = price;
		this.author_name = author_name;
		this.isbn_no = isbn_no;
		this.publication = publication;
	}
	
}

public class MapObject {
	public static void main(String[] args) {
		Book b1 = new Book("Book1", 30, "Author1", 1001, "Publisher1");
		Book b2 = new Book("Book2", 70, "Author2", 1002, "Publisher2");
		Book b3 = new Book("Book3", 90, "Author3", 1003, "Publisher3");
		Book b4 = new Book("Book4", 10, "Author4", 1004, "Publisher4");
		Book b5 = new Book("Book5", 20, "Author5", 1005, "Publisher5");
		
		HashMap<Integer, Book> hm = new HashMap<Integer, Book>();
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		hm.put(4, b4);
		hm.put(5, b5);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the book id: ");
		int id = s.nextInt();
		for(Map.Entry<Integer, Book> m: hm.entrySet()) {
			if(m.getKey() == id) {
				m.getValue().price = m.getValue().price * 0.9;
				System.out.println("Reduced books are: " + m.getValue().name + " " + m.getValue().price);
			}
		}
		for(Map.Entry<Integer, Book> k: hm.entrySet()) {
			System.out.println(k.getKey() + "  " + k.getValue().price);
		}
		s.close();
	}

}
