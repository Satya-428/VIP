// Swapping method 2
import java.util.*;
public class Swapnew {
	public static void main(String args[]){
	int a,b;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
	}

}
