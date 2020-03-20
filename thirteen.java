// Reverse of a string
import java.util.*;
class Thirteen
{
	public static void main(String[] args) {
		String a,b="";
		int i,l;
		char c;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		l=a.length();
		for(i=l-1;i>=0;i--){
		    b=b+a.charAt(i);
		}
		System.out.println(b);
	}
}
