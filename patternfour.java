// Numbers pyramid

import java.util.Scanner;
public class Patternfour {
		public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    int i,j;
		    int n=s.nextInt();
		    for(i=1;i<=n;i++){
		        for(j=1;j<=i;j++){
		            System.out.print(j+" ");
		        }
		        System.out.println();
		    }
			
		}
	}


