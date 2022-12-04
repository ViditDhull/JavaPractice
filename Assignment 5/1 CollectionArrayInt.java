import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionArrayInt {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(2);
		al.add(6);
		
		al.remove(3);
		
		al.set(3, 10);
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			System.out.println(i);
		}
		
		System.out.println(al.get(2));
		
		Collections.sort(al);
		for(Integer itr : al) {
			System.out.println(itr);
		}
	}

}
