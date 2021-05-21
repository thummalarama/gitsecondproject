
public class FactorialWithRecursion {
 public static int factorial(int n) {
	 if(n==0) {
		 return 1;
		 
	 }
	 else {
		 return(n*factorial(n-1));
	 }
 }
		public static void main(String[] args) {
		int num=3;
		long factorial=1;
		
	factorial=factorial(num);
		System.out.println(factorial);
	}

}
