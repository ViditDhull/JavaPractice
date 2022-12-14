class Employee{
	int SSN;
	String FirstName;
	String LastName;
	
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		this.SSN = sSN;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	
}

class HourlyEmployee extends Employee{
	
	int Salary;

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}

}

class SalariedEmployee extends Employee{
	
	int Salary;
	
	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}
}

public class Company {
	public static void main(String[] args) {
		HourlyEmployee h1 = new HourlyEmployee();
		h1.setSSN(1001);
		h1.setFirstName("Hourly");
		h1.setLastName("Employee");
		h1.setSalary(20000);
		
		SalariedEmployee s1 = new SalariedEmployee();
		s1.setSSN(1002);
		s1.setFirstName("Salary");
		s1.setLastName("Employee");
		s1.setSalary(25000);
		
		System.out.println(h1.getSSN());
		System.out.println(h1.getFirstName());
		System.out.println(h1.getLastName());
		System.out.println(h1.getSalary());
		System.out.println();
		System.out.println(s1.getSSN());
		System.out.println(s1.getFirstName());
		System.out.println(s1.getLastName());
		System.out.println(s1.getSalary());
	}

}
