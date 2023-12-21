import java.util.*;
public class Arraylist1 {
public static void main(String [] args)
{
//	ArrayList<String> l = new ArrayList<String>();
//	ArrayList<Integer> li = new ArrayList<Integer>();
	ArrayList l = new ArrayList();

	
	l.add("dine");
	l.add(177);
	l.add("abi");
	l.add(null);
	System.out.println(l);

	l.remove(2);
	System.out.println(l);
	l.set(1, 178);
	System.out.println(l);
	l.add(2,"bhuv");
    l.add("pri7ya");
	System.out.println(l);
	
	System.out.println(l.lastIndexOf(178));
	

}
}
