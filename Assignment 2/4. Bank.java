import java.util.Scanner;

class Account{
	int accno;
	String accname;
	double amount;
	
	Scanner s = new Scanner(System.in);
	Account(int accno, String accname, double amount){
		this.accno = accno;
		this.accname = accname;
		this.amount = amount;
	}
	
	void withdraw() {
		System.out.println("Enter the amount you want to withdraw : ");
		double amt = s.nextDouble();
		amount = amount - amt;
		System.out.println("Your amount after after withdrawal is : " + amount);
	}
	
	void deposit() {
		System.out.println("Enter the amount you want to deposit : ");
		double amt =  s.nextDouble();
		amount = amount + amt;
		System.out.println("Your amount after deposition is : " + amount);
	}
	
	void interest() {
		double interest = 3.4;
		double interest_amount = (amount *interest)/100;
		amount = amount + interest_amount; 
		System.out.println("Your amount after interest is : " + amount);
	}
}

public class Bank {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the account number : ");
		int acc_no = s.nextInt();
		System.out.println("Enter the account name : ");
		String acc_name = s.next();
		System.out.println("Enter the amount balance : ");
		double amt = s.nextDouble();
		
		Account ac1 = new Account(acc_no, acc_name, amt);
		ac1.deposit();
		ac1.withdraw();
		ac1.interest();
		s.close();
	}

}
