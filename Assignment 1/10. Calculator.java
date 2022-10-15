import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double num1 = s.nextDouble();
		System.out.println("Enter the second number : ");
		double num2 = s.nextDouble();
		System.out.println("Please type 'add' for addition, 'sub' for subtraction, 'mul' for multiplication or 'div' for division.");
		String user_input = s.next();
		
		switch(user_input) {
		case("add"):
			System.out.println(num1 + num2);
			break;
		case("sub"):
			System.out.println(num1 - num2);
			break;
		case("mul"):
			System.out.println(num1 * num2);
			break;
		case("div"):
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Invalid Input");
		}
		s.close();
	}

}
