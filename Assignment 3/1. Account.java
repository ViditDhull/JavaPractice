class BankAccount{
	int accountNumber;
	double totalBalance;
	
	BankAccount(int accn, int bal){
		this.accountNumber = accn;
		this.totalBalance = bal;
	}
	
	void deposit(int amt) {
		this.totalBalance = this.totalBalance + amt;
		System.out.println("The total balance after deposit is " + this.totalBalance);
	}
	
	void withdraw(int amt) {
		this.totalBalance = this.totalBalance - amt;
		System.out.println("The balance after withdrawing is " + this.totalBalance);
	}
	
	void getBalance() {
		System.out.println("Your total balance is " + this.totalBalance);
	}
}

class CheckingAccount extends BankAccount{
	
	int fee = 10;
	
	CheckingAccount(int accn, int bal) {
		super(accn, bal);
	}

	void deductFee() {
		this.totalBalance = this.totalBalance - fee;
		System.out.println("The account balance after deducting fee is " + this.totalBalance);
	}
}

class SavingAccount extends BankAccount{
	
	double interestRate = 0.9; 
	
	SavingAccount(int accn, int bal) {
		super(accn, bal);
	}
	
	void addInterest() {
		this.totalBalance = this.totalBalance - (this.totalBalance * interestRate);
		System.out.println("The total balance after interest deduction " + this.totalBalance);
	}
	
}

public class Account {
	public static void main(String[] args) {
		BankAccount c1 = new BankAccount(1001, 20000);
		c1.deposit(10000);
		c1.withdraw(10000);
		c1.getBalance();
		SavingAccount s1 = new SavingAccount(1002, 25000);
		s1.addInterest();
		
	}

}
