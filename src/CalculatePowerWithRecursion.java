
public class CalculatePowerWithRecursion {
	 
	 
	public static int functionRecursion(int n) {
		int result = 1;
		 while(n!=0) {
			 result= 2*functionRecursion(n-1); 
			 break;
		 }
			
			return result;
	}
	public static void main(String[] args) {
		int power =2;
    	int num = functionRecursion(power);
			
		for(int i=0;i<num;i++) {
			System.out.print("*");
		}
		
		
		
		

	}

}
