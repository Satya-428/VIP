// Switch case
import java.util.*;
public class Switchpro {
	public static void main(String args[]){
		int a,b,c,z;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		switch(c){
		case 1:
			z=a+b;
			System.out.println(z);
			break;
		case 2:
			z=a-b;
			System.out.println(z);
			break;
		case 3:
			z=c/b;
			System.out.println(z);
			break;
		case 4:
			z=a*b;
			System.out.println(z);
			break;
		case 5:
			z=a%b;
			System.out.println(z);
			break;
		default:
			System.out.println("wrong case");
			break;
		}
		
		
	}

}
