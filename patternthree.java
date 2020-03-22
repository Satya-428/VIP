// Reverse pyramid
import java.util.Scanner;
public class Patternthree {
	    public static void main(String[] args) {
	        int i,j;
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        for(i=n;i>=1;i--){
	            for(j=1;j<=i;j++){
	                System.out.print("*"+" "); 
	            }
	            System .out.println();
	        }
	    }
	}


