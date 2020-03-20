// Pre/Post increment and decrement
import java.util.*;

public class Program
{
	
public static void main(String[] args) {
	    
int a,b;
	    
Scanner s=new Scanner(System.in);
	    
a=s.nextInt();
	    
b=s.nextInt();
	    
System.out.println(++a); /* pre-increment-> first displays the output then displays the initial value of the variable*/
	    System.out.println(a++); /* post-increment -> first displays the current value of the variable and then dispalys the output value */
	    System.out.println(b--); // similar to post-increment
	    
System.out.println(--b); // similar  to pre-increment
	
}

}