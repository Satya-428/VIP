// Method overloading
	class Load {
		 public void displayPattern(){
		   for(int i = 0; i < 10; i++) {
		     System.out.print("@");
		   }
		 }

		 public void displayPattern(char symbol) {
		   for(int i = 0; i < 10; i++) {
		     System.out.print(symbol);
		   }
		 }
		}

		class Overloadpro {
		 public static void main(String[] args) {
		   Load l = new Load();
		   l.displayPattern();
		   System.out.println("\n");
		   l.displayPattern('$');
		 }
		}

