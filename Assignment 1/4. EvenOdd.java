import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = s.nextInt();
		if (number % 2 == 0) {
			System.out.println("This is an even number.");
			}
		else {
			System.out.println("This is an odd number.");
		}
		s.close();
	}

}
