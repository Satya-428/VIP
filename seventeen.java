//  Bitwise operators
class Seventeen {
  public static void main(String args[]) {
     int n = 11;  /* 11 = 00001011 */
     int m = 22;  /* 22 = 00010110 */
     int r = 0;

     r = n & m;   
     System.out.println("n & m: "+r);

     r = n | m;   
     System.out.println("n | m: "+r);
    
     r = n ^ m;   
     System.out.println("n ^ m: "+r);
    
     r = ~n;   
     System.out.println("~n: "+r);
    
     r = n<< 2;   
     System.out.println("n << 2: "+r); 
     r = n >> 2;   
     System.out.println("n >> 2: "+r);
  }
}