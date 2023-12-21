import java.util.*;


public class SearchList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("10");
		l.add("5");
		l.add("16");
		l.add("20");
		l.add("11");
		//l.add(new Integer(10));
		//l.add(null);
		
		Collections.sort(l, new MyCollectionSortArra());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,"10",new MyCollectionSortArra()));
		System.out.println(Collections.binarySearch(l,"15",new MyCollectionSortArra()));
	//	System.out.println(Collections.binarySearch(l,"18");
		System.out.println(Collections.binarySearch(l,"18",new MyCollectionSortArra()));




		System.out.println(l);

		
		
	}

}
class MyCollectionSortArra implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer s1 = (Integer)obj1;
		Integer s2 = (Integer)obj2;
		return s2.compareTo(s1);
	}
}