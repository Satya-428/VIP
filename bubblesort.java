// Bubble sort
import java.util.Scanner;
public class Bubblesort {
		public static void main(String[] args) {
		    int n,i,j,temp;
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++){
			    a[i]=s.nextInt();
			    System.out.println("the elements are"+a[i]);
			}
			for(i=0;i<n-1;i++){
			    for(j=1;j<n-1;j++){
			        if(a[j]>a[j+1]){
			            temp=a[j];
			            a[j]=a[j+1];
			            a[j+1]=temp;
			        }
			        }
			}
			        for(i=0;i<n;i++)
			        System.out.println(a[i]);
		}
	}

