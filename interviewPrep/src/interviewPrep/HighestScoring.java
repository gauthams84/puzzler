package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class HighestScoring {
	
	  public static String high(String s) {
		    String [] strArr = s.split(" ");
		    Map<String, Integer> mp = new HashMap<String, Integer>();
		    
		    for(String st : strArr) {
		    	int sum = 0;
		    	for(char c : st.toLowerCase().toCharArray()) {
		    		if(c>='a' && c<='z') {
		    			sum += 1 + c - 'a'; // a-a =0; b-a = 1. c-a =2 henceforth
		    		}
		    	}
		    	mp.put(st,sum);
		    }
		    
		    int max =0;
		    String finalStr = "";
		    for(Map.Entry<String, Integer> entry : mp.entrySet()) {
		    	if(entry.getValue()>max) {
		    		max = entry.getValue();
		    		finalStr = entry.getKey();
		    		
		    	}
		    }
		    System.out.println(finalStr);
		    return finalStr;
		    
			/*
			 * Set<Integer> keys = mp.keySet(); int maxVal = keys.stream().mapToInt(i ->
			 * i).max().orElse(0); String val = mp.get(maxVal); //val = String.valueOf(val);
			 * System.out.println(val); return val;
			 */
		  }
	  
	  /**
	   * Best Solution
	   */
	  /***
	   *   public static String high(String s) {
    			return Arrays.stream(s.split(" "))
                			.max(Comparator.comparingInt(a -> a.chars()
                			.map(i -> i - 96)
                			.sum()
                )).get(); 
  }
	   */

}
