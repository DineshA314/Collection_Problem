import java.util.Comparator;
import java.util.TreeSet;
class MyComparat implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
	    String s1 = obj1.toString();
	    String s2 = obj2.toString();
	    
	    	return s1.compareTo(s2);
	}
	
}
public class TreeSetStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparat());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("R"));
		t.add(new StringBuffer("S"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("X"));
		
		
		System.out.println(t);
		
	}

}
