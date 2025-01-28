import java.util.*;
;public class LinkedList1 {
public static void main(String[] args) {
	LinkedList l = new LinkedList();
	
	l.add("dinesh");
	l.add(1000);
	l.add("abi");
	System.out.println(l);
	l.addFirst("gokul");
	l.removeLast();
	System.out.println(l);
	l.set(0, "raja");
	l.add(1);
	l.add(2);
	l.isEmpty();
	l.add(3);
	
	System.out.println(l);

}
}
