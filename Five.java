import java.util.Scanner;

class Five 
{
    
public static void main(String[ ] args) {
        
int a,b,c;
        
double d;
        
double p,q;
        
Scanner x=new Scanner(System.in);
        a=x.nextInt();
        
b=x.nextInt();
        
c=x.nextInt();
        
d=b*b-4*a*c;
        
if(d>=0)
        
{
            
p=(-b+Math.sqrt(d))/(2*a);
            
q=(-b-Math.sqrt(d))/(2*a);
            
System.out.println("root1="+p+" "+"root2="+q);

        
}
        
else
        
System.out.println("roots are imaginary");
    }
}