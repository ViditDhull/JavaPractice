import java.util.Scanner;


class ElectricityBill{
	int customer_number;
	String customer_name;
	double units;
	double bill;
	Scanner s = new Scanner(System.in);
	
	void readData() {
		System.out.println("Enter the customer number : ");
		customer_number = s.nextInt();
		System.out.println("Enter the customer name : ");
		customer_name = s.next();
		System.out.println("Enter the number of units consumed : ");
		units = s.nextDouble();
	}
	
	void showData() {
		System.out.println("The customer number is : " + customer_number);
		System.out.println("The customer name is : " + customer_name);
		System.out.println("The number of units consumed by customer is : " + units);
		System.out.println("Total bill of the customer is : " + bill);
	}
	
	double computeBill() {
		
		if(units<=100) {
			bill = units*1.20;
		}
		else if(units>100 && units<=300) {
			bill = (100*1.20) + ((units-100) * 2.00);
		}
		else if(units>300 && units<=600) {
			bill = (100*1.2) + (200 * 2.00) + ((units - 300) * 3.00);
		}
		else {
			bill = (100*1.2) + (200 * 2.00) + (300 * 3.0) + ((units - 600)* 5);
		}
		
		return bill;
		
	}
}



public class Bill {
	public static void main(String[] args) {
		ElectricityBill c1 = new ElectricityBill();
		c1.readData();
		c1.computeBill();
		c1.showData();
	}

}
