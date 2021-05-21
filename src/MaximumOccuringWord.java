import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumOccuringWord {

	public static void main(String[] args) {
	
		String str= "java and java";
		String[]words= str.split(" ");
	  
	    Arrays.sort(words);
	    //System.out.println(Arrays.toString(words));
	    int max = 0;
	    int count= 1;
	    String word = words[0];
	    String maxRepeat = words[0];
	    for(int i = 1; i<words.length; i++){
	        if(words[i].equals(maxRepeat)){
	            count++;
	        }
	        else{
	            count =1;
	            maxRepeat = words[i];
	        }
	        if(max<count){
	            max = count;
	            word = words[i];
	        }
	    }
	    System.out.println( word);
	}  
			}
		
		


