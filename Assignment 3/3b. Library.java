class Author{
	String name;
	String email;
	char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}
	
	public String toString() {
		String s = this.name + ' ' + this.gender + ' ' + this.email;
		return s;
	}
}




class Book{
	String name;
	double price;
	int qty;
	Author a;
	
	public Book(String name, double price, int qty, Author a) {
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.a = a;
	}

	public String getName() {
		return name;
	}
	
	public Author getA() {
		return a;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	public String toString() {
		String s = this.name + " by " + this.a.name + " ( " + this.a.gender + " ) " + "at " + this.a.email;
		return s;
	}
	
}





public class Library {
	public static void main(String[] args) {
		Author a1 = new Author("Author1", "author1@gmail.com", 'M');
		Book b1 = new Book("Book1", 100, 20, a1);
		System.out.println(a1.toString());
		System.out.println(b1.toString());
	}

}
