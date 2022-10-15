import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = s.nextInt();
		for(int i = 1; i <=10; i++) {
			int product = number * i;
			System.out.println(number + " X " + i + " = " + product);
		}
		s.close();
	}

}
