package interviewPrep;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Write a program that reads the standard input and counts the number of times
 * the character 'a' appears in the text, that ends with '.'.
 * 
 * Notify the solution via standard output, following the given template.
 * 
 * Remember that you can read a character from the standard input with the
 * following method:
 * 
 * (char) System.in.read(); Examples:
 * 
 * "codewars." -> 1 "there is nothing like home." -> 0 "hello how are you i am
 * fine what about you." -> 4 "." -> 0 "three rings for the elven kings under
 * the sky, seven for the dwarf lords in their halls of stone, nine for the
 * mortal men doomed to die, one for the dark lord on his dark throne, in the
 * land of mordor where the shadows lie one ring to rule them all, one ring to
 * find them, one ring the bring them all, and in the darkness bind them in the
 * land of mordor where the shadows lie." -> 13
 * 
 * @author Gautham Bhonsle
 *
 */

public class UIB {
	public static void countAs() {
	    try {
	      System.out.println("This program counts the number of times the vowel 'a' appears.");
	      Scanner input = new Scanner(System.in);
	      System.out.print("Please type a sentence that ends with '.': ");
	      
	      
	      String s = input.nextLine();
	      int count = (int) s.toLowerCase().chars().mapToObj(i -> (char)i)
	    	      .filter(i -> i.charValue()=='a')
	    	      .count();
	      
	      System.out.println("There are " + count + " 'a'.");
	      
	    } catch (Exception e) {

	    }
	  }
	/**
	 * Intelliget
	 * int count = sc.nextLine().split("a").length-1; // counts number of splits on a
	 */

}
