package interviewPrep;

import java.util.Iterator;

/**
 * The new "Avengers" movie has just been released! There are a lot of people at
 * the cinema box office standing in a huge line. Each of them has a single 100,
 * 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
 * 
 * Vasya is currently working as a clerk. He wants to sell a ticket to every
 * single person in this line.
 * 
 * Can Vasya sell a ticket to every person and give change if he initially has
 * no money and sells the tickets strictly in the order people queue?
 * 
 * Return YES, if Vasya can sell a ticket to every person and give change with
 * the bills he has at hand at that moment. Otherwise return NO.
 * 
 * Examples: Line.Tickets(new int[] {25, 25, 50}) // => YES Line.Tickets(new
 * int[] {25, 100}) // => NO. Vasya will not have enough money to give change to
 * 100 dollars Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. Vasya
 * will no
 * 
 * @author KAUSHAL PC
 *
 */
public class Line {

	public static String Tickets(int[] peopleInLine) {
		// check if initial is 25, then add to balance
		int cashAvi = 0;
		int balance = 0;
		String result = "YES";
		if (peopleInLine[0] == 25) {
			balance = 25; // initial balance
			for (int i = 1; i < peopleInLine.length; i++) {// if true, check in loop if
				cashAvi = balance - peopleInLine[i]; // check cash available
				if (cashAvi < 0) { // if negative return NO
					return "NO";
				} /*
					 * else if (cashAvi ==0){ balance =0; // reset balance if cash available is zero
					 * }
					 */else {
					//balance = cas
					balance += peopleInLine[i]; // else keep addign to balance
				}

			}
		}

		return result;
	}

}
