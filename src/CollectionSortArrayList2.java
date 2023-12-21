import java.util.*;

public class CollectionSortArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("D");
		l.add("I");
		l.add("C");
		//l.add(new Integer(10));
		//l.add(null);
		System.out.println(l);
		Collections.sort(l,new MyCollectionSortArray());
		System.out.println(l);
		
	}

}
class MyCollectionSortArray implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		return s2.compareTo(s1);
	}
}