import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the number of units consumed : ");
		int units = s.nextInt();
		double charge;
		if(units<=100) {
			charge = units * 1.20;
			System.out.println("Your charges are : " + charge);
		}
		else if(units>100 && units<=300) {
			charge = (100 * 1.20) + ((units-100) * 2.00);
			System.out.println("Your charges are : " + charge);
		}
		else if(units>300 && units<=600) {
			charge = (100 * 1.2) + (200 * 2.00) + ((units - 300) * 3.00);
			System.out.println("Your charges are : " + charge);
		}
		else {
			charge = (100*1.2) + (200*2.00) + (300 *3.00) + ((units-600) * 5.00);
			System.out.println("Your charges are : " + charge);
		}
		s.close();
	}

}
