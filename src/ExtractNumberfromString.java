
public class ExtractNumberfromString {

public static void main(String[] args) {
	
String str="ind20ia21";

StringBuffer sb= new StringBuffer() ,num = new StringBuffer();

 for(int i=0;i<str.length();i++) {
	 	 
	 if(Character.isDigit(str.charAt(i))) {
		 num.append(str.charAt(i));	
	 
 }
	 else if 
	
 (Character.isAlphabetic(str.charAt(i))){
	 sb.append(str.charAt(i));	
	}
 }
	 System.out.println(sb);
	 System.out.println(num);
	}
}
