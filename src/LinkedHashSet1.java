import java.util.*;
public class LinkedHashSet1 {
public static void main(String [] args) {
	LinkedHashSet h = new LinkedHashSet();
	
	h.add("A");
	h.add("B");
	h.add("C");
	h.add("D");
	h.add(null);
	//h.add(null);
	h.add(123123);
	System.out.println(h.add("A"));
	System.out.println(h);




	
}
}
