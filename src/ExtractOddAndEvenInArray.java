import java.util.ArrayList;

public class ExtractOddAndEvenInArray {

	public static void main(String[] args) {
		int[]array= {1,2,3,4,5,6};
		
		ArrayList<Integer>evenNumber= new ArrayList<>();
		ArrayList<Integer>oddNumber= new ArrayList<>();
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i] %2==0) {
				evenNumber.add(array[i]);
				
			}
			else {
				if(array[i]%2==1) {
					oddNumber.add(array[i]);
				}
			}
			}
		
		System.out.println(oddNumber);
		System.out.println(evenNumber);
		
	}
}

