import java.util.*;
public class priorityQueue1 {
public static void main(String[] args)
{
	PriorityQueue p = new PriorityQueue();
	
//	System.out.println(p.peek());
//	System.out.println(p.element());
	for(int i=0; i<=10; i++)
	{
		p.offer(i);
	}
	
	System.out.println(p);
	System.out.println(p.poll());
	System.out.println(p);
}
}
