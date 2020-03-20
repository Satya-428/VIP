// Labelled break
public class Twenty {
	public static void main(String args[]){
	int i=1,j=0;
	loop1:for(i=1;i<=5;i++){
		for(j=0;j<=8;j++){
			if(j==3)
				break loop1;
				System.out.println(i+" "+j);

			}
		}
		System.out.println("out of loop");
	}

}
