import java.util.*;
public class Iterator1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector ();
		
			v.addElement(-10);
			v.addElement(1);
			v.addElement(3);
			v.addElement(6);
		
		System.out.println(v);
		int tot =1;
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			
			if(i>=tot)
			{
				tot =i;
				
				System.out.println(i);
			}
		}
		
		System.out.println(v);

	}

}
