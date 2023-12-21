import java.util.*;
import java.util.Collections;

public class SearchList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		int j;
		l.add("Z");
		l.add("A");
		l.add("D");
		l.add("I");
		l.add("C");
		//l.add(new Integer(10));
		//l.add(null);
		
		Collections.sort(l);
		System.out.println(l);
		j=Collections.binarySearch(l,"Z");
		System.out.println(j);
		System.out.println(Collections.binarySearch(l,"E"));
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,"Z"));

		System.out.println(l);

		
		
	}

}