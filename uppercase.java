// Uppercase()
import java.util.Scanner;

public class Striuppercase {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    String s1,s2;
		    System.out.println("Enter 2 strings");
		    s1=sc.nextLine();
		    s2=sc.nextLine();
		    s1=s1.toUpperCase();
		    s2=s2.toUpperCase();
		    System.out.println("The first string "+s1);
		    System.out.println("The second string "+s2);
		}
	}