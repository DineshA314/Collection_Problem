import java.util.*;
public class Reverse {
public static void main(String [] args)
{
	ArrayList a = new ArrayList();
	
	a.add(1);
	a.add(5);
	a.add(10);
	a.add(3);
	Collections.sort(a);
	Collections.reverse(a);
//	Comparator c1 = Collections.reverseOrder(new  MyComparator());
	
	System.out.println(a);
//	System.out.println(a);
//	System.out.println(a);
//	System.out.println(a);
	
	
}
}
