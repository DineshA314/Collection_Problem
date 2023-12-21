import java.util.*;
public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack s = new Stack();
       s.push("a");
       s.push("b");
       s.push("c");
       
       System.out.println(s);
      // System.out.println(s.pop());
     
       System.out.println(s.peek());
       System.out.println(s.peek());
       System.out.println(s.peek());
       System.out.println(s.peek());
       System.out.println(s.peek());
       System.out.println(s.pop());
       System.out.println(s.peek());
       System.out.println(s.peek());
       System.out.println(s.peek());
       System.out.println(s);
      
       System.out.println( s.search("c"));
       s.search("z");
  s.pop();
  s.pop();
  //s.pop();
       System.out.println( s.search("z"));

       System.out.println(s.empty());

	}

}
