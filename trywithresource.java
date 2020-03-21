// Try with Resource
import java.util.Scanner;
public class Trywithresource {
		public static void main(String[] args) {
		  try(Scanner sc=new Scanner(System.in))
		  {
		      String str= "";
		      System.out.println("Enter the string");
		      str=sc.nextLine();
		      System.out.println(str);
		  }
		 
		  }
	}

