
public class SumofDigits {

	public static void main(String[] args) {
		
		int sum = 0;
		int num=121;
		while(num!=0) {
			sum=sum+num%10;
			num = num/10;
			
		}
		System.out.println(sum);
	}

}
