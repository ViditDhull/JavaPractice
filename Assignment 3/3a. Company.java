class Person{
	String Name;
	int Age;
	
	public Person(String name, int age) {
		super();
		Name = name;
		Age = age;
	}	
}


class Teacher extends Person{

	public Teacher(String name, int age) {
		super(name, age);
	}
	
	void myPreofession() {
		System.out.println("My profession is teacher.");
	}
}


class Employee extends Person{

	public Employee(String name, int age) {
		super(name, age);
	}
	
	void myProfession() {
		System.out.println("My profession is employee.");
	}
}


class PermanentEmployee extends Employee{

	public PermanentEmployee(String name, int age) {
		super(name, age);
	}
	
	void myProfession() {
		System.out.println("I am Permanent Employee.");
	}
}


class ContractEmployee extends Employee{

	public ContractEmployee(String name, int age) {
		super(name, age);
	}
	
	void myProfession() {
		System.out.println("I am Contract Employee.");
	}
}

public class Company {
	public static void main(String[] args) {
		
	}
}
