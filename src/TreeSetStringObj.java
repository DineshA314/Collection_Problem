import java.util.Comparator;
import java.util.TreeSet;
class MyComparato implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
	    String s1 = (String)obj1;
	   String s2 = (String)obj2;
	    
	    	return s2.compareTo(s1);
	}
	
}
public class TreeSetStringObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparato());
		t.add("Abi");
		t.add("Raja");
		t.add("ShobhoRani");
		t.add("RajaKuamart");
		t.add("GangoB");
		t.add("Ramar");
		
		
		System.out.println(t);
		
	}

}
