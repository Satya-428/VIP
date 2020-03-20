// Palindrome
import java.util.*;
class Twelve
{
	public static void main(String[] args) {
		int n,t,rev=0,r;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		t=n;
		while(n!=0){
		    r=n%10;
		    rev=(rev*10)+r;
		    n=n/10;
		}
		if(rev==t)
		System.out.println("palindrome");
		else
		System.out.println("not palindrome");
	}
}
