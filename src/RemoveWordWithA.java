import java.util.ArrayList;

public class RemoveWordWithA {
		public static void main(String[] args) {
	
		String str= "java is the best language";
		String[]words= str.split(" ");
		int count= words.length;
		
		ArrayList<String>list= new ArrayList<>(); 
		
		for(int i=0;i<words.length;i++) {
			boolean flag=true;
			String str1=words[i];
		for(int j=0;j<str1.length();j++)	{
		
			if(str1.charAt(j)=='a' ) {
				flag=false;
				
		}
		}
		if(flag)
			list.add(str1);	
			}
 	for (String string : list) {
		System.out.print(string + " ");
		
	}
		}
}

