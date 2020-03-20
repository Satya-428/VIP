// Perfect number
import java.util.*;
public class Perfectpro {
	public static void main(String args[]){
		int a,i,sum=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(i=1;i<a;i++){
			if(a%i==0){
				sum=sum+i;
			}
		}
		if(sum==a)
			System.out.println("perfect number");
		else
			System.out.println("not perfect number");
		
	}

}
