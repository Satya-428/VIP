// Armstrong number for a range a to b:
import java.util.*;
public class Program
{
	public static void main(String[] args) {
		int r,t,i,c=0,e,f;
		double sum=0;
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		for(i=a;i<=b;i++){
		    t=i;
		    f=i;
		    e=i;
		    while(t!=0){
		        t=t/10;
		        c++;
		    }
		    while(f!=0){
		        r=f%10;
		        sum=sum+Math.pow(r,c);
		        f=f/10;
		    }
		    if(sum==e)
		    System.out.println(i+ " is armstrong");
		    c=0;
		    sum=0;

		}
	}
}
