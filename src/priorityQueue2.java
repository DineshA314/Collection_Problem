import java.util.*;

public class priorityQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue p = new PriorityQueue(15,new MyPri());
		
		p.offer("A");
		p.offer("C");
		p.offer("D");
	    p.offer("B");
		System.out.println(p);
		

	}

}
class MyPri implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s1.compareTo(s2);

	}
	
}
