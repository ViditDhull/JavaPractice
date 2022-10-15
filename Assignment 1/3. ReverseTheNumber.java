import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = s.nextInt();
		int reverse = 0;
		
		while(number!=0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		
		System.out.println("The reverse of the given number is : " + reverse);
		s.close();
		
	}

}
