import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double num1 = s.nextDouble();
		System.out.println("Enter the second number : ");
		double num2 = s.nextDouble(); 
		System.out.println("Enter the third number : ");
		double num3 = s.nextDouble();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is the greatest number.");
		}
		else if(num2>num3) {
			System.out.println(num2 + " is the greatest number.");
		}
		else {
			System.out.println(num3 + " is the greatest number.");
		}
		s.close();
	}

}
