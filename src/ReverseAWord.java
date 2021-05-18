
public class ReverseAWord {
	
	public static void main (String[]args) {
		String str = " Java is programming language";
		
	String[]words = str.split(" ");
	for(int i=0;i<words.length;i++) {
		String str1= words[i];
		for(int j=str1.length()-1;j>=0;j--) {
			if(i>=0) {
				System.out.print(str1.charAt(j));
			}
		}
		System.out.print(" ");
	}
		
		
		
	}
	
	
	
	
	

}
