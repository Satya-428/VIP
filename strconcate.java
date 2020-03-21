// String concatination
import java.util.Scanner;

public class Strconcate {
		private static Scanner s;

		public static void main(String[] args) {
		    s = new Scanner(System.in);
		    String s1,s2,s3;
		    System.out.println("Enter 2 strings");
		    s1=s.nextLine();
		    s2=s.nextLine();
		    s3=s1.concat(s2);
		    System.out.println("Concatination of two strings is "+s3);
		    
		}
	}
