// Linear search
import java.util.Scanner;
public class Linearsearch {
		public static void main(String[] args) {
		    int n,item,loc=-1,i;
		    Scanner s=new Scanner(System.in);
		    n=s.nextInt();
		    int A[]=new int[n];
		    for(i=0;i<n;i++)
		    A[i]=s.nextInt();
		    item=s.nextInt();
		    for(i=0;i<n;i++)
		    {
		        if(A[i]==item)
		        {
		            loc=i;
		            break;
		        }
		    }
		    if(i==n)
		    System.out.println("not found");
		    else
		    System.out.println("loc is "+loc);
		}
	}

