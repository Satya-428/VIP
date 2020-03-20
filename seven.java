// Prime number
import java.util.Scanner;
class Seven
{
public static void main(String[] args) {
	int n,i,c=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(i=1;i<=n/2;i++){
		if(n%i==0)
		c++;
	}
	if(c==1)
	System.out.println("prime");
	else
	System.out.println("not prime");
	}
}	
