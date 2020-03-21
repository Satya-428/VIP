// Exception
import java.util.Scanner;
import java.io.IOException;
public class Exceptionpro
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int i=0;
		i=sc.nextInt();
		try
		{
		    if(i<10)
		    {
		        throw new MyException("Error");
		    }
		}catch (Exception e){
		    System.out.println(e);
		}
	}
}
class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg);
    }
}
