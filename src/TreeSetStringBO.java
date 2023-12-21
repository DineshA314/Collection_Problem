import java.util.Comparator;
import java.util.TreeSet;
class MyCompara implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
	    String s1 = obj1.toString();
	    String s2 = obj2.toString();
	    int I1 = s1.length();
	    int I2 = s2.length();

	    if(I1<I2)
	    	return -1;
	    else if (I1>I2)
	    {
	    	return 1;
	    }
	    else
	    	return s1.compareTo(s2);
	}
	
}
public class TreeSetStringBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyCompara());
		
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		
		
		System.out.println(t);
		
	}

}
