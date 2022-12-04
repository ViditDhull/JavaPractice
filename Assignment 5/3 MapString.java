import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapString {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		System.out.println(hm);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id = s.nextInt();
		
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			//System.out.println(m.getKey() + m.getValue());
			if(m.getKey() == id) {
				System.out.println(m.getValue());
			}
		}
		hm.remove(id);
		s.close();
		hm.put(5, "U");
		System.out.println(hm);
	}
}
