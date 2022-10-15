import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the principle amount : ");
		double pAmount = s.nextDouble();
		System.out.println("Enter the time in years : ");
		double time = s.nextDouble();
		System.out.println("Enter the rate of interest : ");
		double rate = s.nextDouble();
		
		double interest = (pAmount * time * rate)/100;
		System.out.println("The simple interest is : " + interest);
		s.close();
}

}
