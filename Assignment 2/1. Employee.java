import java.util.Scanner;

class emp{
	int empno;
	String empname;
	String designation;
	String dept;
	int salary;
	
	Scanner s = new Scanner(System.in);
	void readEmpData() {
		System.out.println("Enter the number of the employee : ");
		empno = s.nextInt();
		System.out.println("Enter the name of the employee : ");
		empname = s.next();
		System.out.println("Enter the designation of the employee : ");
		designation = s.next();
		System.out.println("Enter the department of the employee : ");
		dept = s.next();
		System.out.println("Enter the salary of the employee : ");
		salary = s.nextInt();
		
		}
	
	void displayEmpData() {
		System.out.println("The number of the employee is : " + empno);
		System.out.println("The name of the employee is : " + empname);
		System.out.println("The designation of the employee is : " + designation);
		System.out.println("The department of the employee is : " + dept);
		System.out.println("The salary of the employee is : " + salary);
	}
}


public class Employee {
	public static void main(String[] args) {
		emp emp1 = new emp();
		emp1.readEmpData();
		emp1.displayEmpData();
	}

}
