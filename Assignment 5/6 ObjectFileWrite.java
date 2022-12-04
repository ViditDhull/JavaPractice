import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String name;
	int number;
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + "]";
	}
	
}

public class ObjectFileWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("Object.txt");
		file.createNewFile();
		
		Student s1 = new Student("Vidit", 100);
		Student s2 = new Student("Yash", 90);
		FileOutputStream fos = new FileOutputStream("Object.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.close();
	}

}