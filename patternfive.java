// Number pattern
import java.util.Scanner;
public class Patternfive {
		public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    int i,j;
		    int n=s.nextInt();
		    for(i=n;i>=1;i--){
		        for(j=1;j<=i;j++){
		            System.out.print(i+" ");
		        }
		        System.out.println();
		    }
			
		}
	}


