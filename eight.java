// Prime numbers in the range n to m
import java.util.Scanner;
class Eight
{
	public static void main(String[] args) {
		int i,j,n,m;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		for(j=n;j<=m;j++){
		    int c=0;
		   for(i=1;i<=j/2;i++){
		    if(j%i==0)
		    c++;
		}
		if(c==1)
		    System.out.println(j);
		}
	}
}
