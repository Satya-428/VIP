//Fibonacci series
import java.util.*;
class Ten
{
	public static void main(String[] args) {
		int a=0,b=1,n,t=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++){
		    System.out.println(a);
		    t=a+b;
		    a=b;
		    b=t;
		}
	}
}