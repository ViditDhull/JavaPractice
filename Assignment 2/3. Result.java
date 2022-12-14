import java.util.Scanner;

class Student{
	int id;
	String name;
	int marks;
	String result;
	
	Student(int sid, String sname, int smarks) {
		this.id = sid;
		this.name = sname;
		this.marks = smarks;
	}
	
	void result(){
		if(marks >= 40) {
			result = "Pass";
		}
		else {
			result = "Fail";
		}
	}
	
	void display() {
		System.out.println("The student id is : " + id);
		System.out.println("The student name is : " + name);
		System.out.println("The marks of the student are : " + marks);
		System.out.println("Result : " + result);
	}
	
}


public class Result {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int nums = s.nextInt();
		
		Student[] students = new Student[nums];
		
		for (int i = 0; i<nums; i++) {
			System.out.println("Enter the id of the student numer " + (i+1));
			int sid = s.nextInt();
			System.out.println("Enter the name of the student number " + (i+1));
			String sname = s.next();
			System.out.println("Enter the marks obtained by the student number " + (i+1));
			int smarks = s.nextInt();
			
			students[i] = new Student(sid, sname, smarks);
			students[i].result();
		}
		for (int i = 0; i<nums ; i++) {
			students[i].display();
		}
		s.close();
	
	}

}
