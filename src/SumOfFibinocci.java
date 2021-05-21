
public class SumOfFibinocci {

	public static void main(String[] args) {
		
		int num=3, t1=0,t2=1;
	
		int total = 1;
		int sum ;
		
		 System.out.print("Fibinocci numbers:" +t1+", "+t2);
		
		for(int i=1;i<=num;i++) {
			sum=t1+t2;
			t1=t2;
			t2=sum;
			total=sum+total;
			System.out.print("," + sum);
		}

		System.out.println("\n"+ total);
		

	}

}
