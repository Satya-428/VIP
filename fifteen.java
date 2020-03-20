// Fibonacci series of a number:
import java.util.*;
class Fifteen
{
    static int fib(int n)
    {	
        if(n<=1)
	return n;
        else
	return fib(n-1)+fib(n-2);
    }
   	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println(fib(n));
		
	}
}
