import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting3meth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20,15,3,8,10};
		System.out.println("Primitive array before sorting");
		for(int a1 : a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int a1 : a)
		{
			System.out.println(a1);
		}
		String[] n = {"A","Z","B"};
		System.out.println("object array before sorting");
		
		for(String a1 : n)
		{
			System.out.println(a1);
		}
		Arrays.sort(n);
		
		System.out.println("After sorting");
		for(String a2 : n)
		{
			System.out.println(a2);
		}
		Arrays.sort(n,new MyArray1());
		System.out.println("object array before sorting");
		for(String a3 : n)
		{
			System.out.println(a3);
		}
		

	}

}
class  MyArray1 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
	String s1 = obj1.toString();
	String s2 = obj2.toString();
	return s2.compareTo(s1);
	}
}