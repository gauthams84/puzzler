package interviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Demo on Consumer Interface
 * @author KAUSHAL PC
 *
 */

/*
 * class consImpl implements Consumer<Integer>{
 * 
 * @Override 
 * public void accept(Integer i) { 
 * System.out.println(i); 
 * }
 * 
 * }
 */
//Lets write ananoymous inner class

public class DemoForEach {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> cons = new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		};
		//above implementation can be used as below
		values.forEach(cons);
		
		/**
		 * Lets remove boilerplate code for the above anonymous inner class by wrting lambda
		 */
		// Lambda
		Consumer<Integer> coms = (i) ->{
			System.out.println(i);
		};
		values.forEach(coms);
		//the above is same as coms = i->sysout(i) or below
		values.forEach(i-> System.out.println(i));
	}

}
