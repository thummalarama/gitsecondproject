

public class Calculator {

	public static void main(String[]args) {
			
    add();
   
    sub();
  
    multiply();
   divide();
   	
	}

	private static void divide() {
	
		 int a=50;
			int b= 10;
			int result = (a/b);
			System.out.println(result);
		}
	

	private static void multiply() {
		
		 int a=50;
			int b= 10;
			int result = (a*b);
			System.out.println(result);
		}
	

	private static void sub() {
		
		 int a=50;
			int b= 10;
			int result = (a-b);
			System.out.println(result);
		}
	

	private static void add() {
	
		 int a=50;
			int b= 10;
			int result = (a+b);
			System.out.println(result);

	}
	
	

}
