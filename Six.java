import java.util.Scanner;

class Six
{
	
public static void main(String[] args) {
	    
int h1,h2,m1,m2,s1,s2;
	    
Scanner s=new Scanner(System.in);
	    
h1=s.nextInt();
	    
h2=s.nextInt();
	    
m1=s.nextInt();
	    
m2=s.nextInt();
	    
s1=s.nextInt();
	    
s2=s.nextInt();
	    
int h=0,m=0,se;
	    
se=s1+s2;
	    
if(se>59)
	    
{
m=m+1;
	    
se=se-60;
	    
}
	    
m=m1+m2;
	    
if(m>59)
		
{
		    
h++;
		    
m=m-60;
		
}
	
h=h1+h2;
	
System.out.printf("the sum of two times is %d:%d:%d" ,h,m,se);
	
}

}