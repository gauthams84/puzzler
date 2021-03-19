package interviewPrep;

import java.util.stream.IntStream;



import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class Solution {
	
	 public int solution(int number) {
		 
		 Integer sum = IntStream.range(1, number) // create range
                 .filter(i -> i % 3 == 0 || i % 5 == 0) // filter out
                 .sum(); 
		 
		 return sum;
		 
			/*
			 * List<Integer> x = new ArrayList<Integer>();
			 *  List<Integer> y = new ArrayList<Integer>();
			 *   int totalforthree = 0; 
			 *   int totalforfive = 0;
			 * 
			 * 
			 * 
			 * int total =0; //TODO: Code stuff here
			 * 
			 * for(int temp =0; temp < number ; temp++)
			 * { 
			 * if(temp % 3 == 0)
			 * { 
			 * x.add(temp);
			 * totalforthree += temp;
			 *  }else if
			 *  (temp % 5 == 0)
			 *  { y.add(temp); totalforfive += temp; }
			 *   } 
			 *   
			 *   total = totalforthree + totalforfive; return total;
			 */
		  }
	 


}
