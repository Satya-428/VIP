//Armstrong number for “n” digit number:
import java.util.*;
class Eleven
{
	public static void main(String[] args) {
	    int n,t,sum=0,r,f,c=0;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    t=n;
	    f=n;
	    while(n!=0){
	        n=n/10;
	        ++c;
	    }
	    System.out.println(c);
	    while(t>0){
	        r=t%10;
	        sum+=Math.pow(r,c);
	        t=t/10;
	    }
	    System.out.println(sum);
	    if(sum==f)
	    System.out.println("armstrong");
	    else
	    System.out.println("not armstrong");
	}
}
