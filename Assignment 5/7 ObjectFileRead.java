import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectFileRead {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s1 = (Student)ois.readObject();
		Student s2 = (Student)ois.readObject();
		System.out.println(s1);
		System.out.println(s2);
		ois.close();
	}
}