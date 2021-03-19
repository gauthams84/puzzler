package interviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApiDemo {

	/**
	 * Simple method to multiply the array of values using Steam
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//Can be written in Stream as below
		int result = values.stream().map(i->i*2).reduce(0, (c,e)->c+e);
		System.out.println(result);
		
		//Explanation below

		
		//  map  method of stream takes interface function with apply as the implemented method
		Function<Integer, Integer> fun = new Function<Integer, Integer>(){

			@Override
			public Integer apply(Integer t) {
				return t*2;
				
			}
			
		};
		
		//Reduce method of sstream takes BinaryOperator as predicate to aggregate the values.
		//I.e Summation of all returned values
		
		BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		
		
		// Gives a Stream
		Stream s = values.stream();
		
		// This implements logic of multiplying
		Stream s1 = s.map(fun);
		//This implements logic of accumalating
		Integer finalResult = (Integer) s1.reduce(0, bi);
		System.out.println(finalResult);
		
		
		// Write Stream API to add all numbers divisible by 2
		 int divBy2 = values.stream().filter(i -> i%2 ==0).reduce(0, (c,e)-> c+e);
		 System.out.println(divBy2);
		 
		 // Write Stream API to fetch first number div by 5.
		 // Filter and Map are lazy evaluation.-> i.e will only execute
		 // FindFirst is Terminal Method, meaning, will ask the upstream method to filter
		 // only the first value divisible by 5, not all values
		 int divBy5 = values.stream().filter(i->i%5==0).findFirst().orElse(0);
		 
		 
		
	}

}
