// Exception using try catch
import java.util.Scanner;
import java.io.IOException;
public class Exceppro {
		public static void main(String[] args) throws IOException
		{
		   Scanner sc= new Scanner(System.in);
		   int i,j=0,k=0;
		   i=8;
		 try
		 {
		     System.out.println("Enter a number");
		     j=sc.nextInt();
		     k=i+j;
		     if(k<15)
		     {
		         throw new ArithmeticException();
		     }
		     System.out.println("Outut is "+k);
		 }
		 catch(ArithmeticException e)
		 
		 {
		     System.out.println("Minimum value for the output is 15");
		 }
		 catch(Exception e)
		 {
		     System.out.println("Unknown Exception");
		 }
		 finally
		 {
		     System.out.println("Finally Bye");
		 }
		   
		  
		}
	}

