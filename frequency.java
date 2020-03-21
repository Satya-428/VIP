// Frequency of elements in a string
import java.util.Scanner;
public class Frequency {
		private static Scanner sc;

		public static void main(String[] args) {
		    int a[]=new int[26];
		    sc = new Scanner(System.in);
		    String str=sc.nextLine();
		    for(int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i)>=65 && str.charAt(i)<=90)
		        {
		            a[str.charAt(i)-65]++;
		        }
		        else if(str.charAt(i)>=97 && str.charAt(i)<=122)
		        {
		            a[str.charAt(i)-97]++;
		        }
		    }
			for(int i=0;i<26;i++)
			{
			    if(a[i]>0)
			    System.out.print((char)(i+65)+""+a[i]+" ");
			}
		}
	}

