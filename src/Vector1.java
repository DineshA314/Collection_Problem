import java.util.Vector;
public class Vector1 {
public static void main(String [] args ) {
	Vector v = new Vector(18);
	System.out.println(v.capacity());
	for(int i=1; i<=20; i++)
	{
		v.addElement(i);
	}
	System.out.println(v.capacity());
	//v.removeElement(2);
	System.out.println(v);
	v.addElement("dfskf");
	System.out.println(v);
	v.removeAllElements();
	System.out.println(v.capacity());
	//System.out.println(v.capacity());



	
	
	
	
}
}
