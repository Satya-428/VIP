// Factorial of a number
import java.util.*;
class Nine
{
	public static void main(String[] args) {
		int n,result=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n==0)
		System.out.println("1");
		else
		{
		    for(int i=1;i<=n;i++){
		        result=result*i;
		    }
		    System.out.println(result);
	}
}
