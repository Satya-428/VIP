// Sum of the digits of a number till single digit
import java.util.Scanner;
public class Sumofdigits {
	public static void main(String args[]){
		int n,r,sum=0,c=0,t,z,y;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		z=n;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		if(sum==0)
			System.out.println(z);
		else
		{
			while(sum!=0){
			y=sum%10;
			c=c+y;
			sum=sum/10;
			}
			
		}
		System.out.println(c);
		
	}

}
