import java.util.*;
class MyCom implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
	    Integer I1 = (Integer)obj1;
	    Integer I2 = (Integer)obj2;
	    if(I1<I2)
	    	return 1;
	    else if (I1>I2)
	    {
	    	return -1;
	    }
	    else
	    	return 0;
	}
	
}
public class TreeSetComparator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyCom());
		
		t.add(10);
		t.add(0);
		t.add(5);
		t.add(15);
		t.add(20);
		
		t.add(20);
		System.out.println(t);
		
	}

}