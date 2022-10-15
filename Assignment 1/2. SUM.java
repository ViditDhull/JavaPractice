import java.util.Scanner;

public class SUM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double num1 = s.nextDouble();
		System.out.println("Enter the second number : ");
		double num2 = s.nextDouble();
		double sum = num1 + num2;
		System.out.println("The sum of two numbers is : " + sum);
		s.close();
	}

}
