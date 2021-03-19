package interviewPrep;

import java.util.ArrayList;
import java.util.List;

/**
 * HackerLand University has the following grading policy:
 * 
 * Every student receives a in the inclusive range from 0 to 100. Any less than
 * 40 is a failing grade. Sam is a professor at the university and likes to
 * round each student's according to these rules:
 * 
 * If the difference between the and the next multiple of 5 is less than 3,
 * round up to the next multiple of 5. If the value of is less than 3, no
 * rounding occurs as the result will still be a failing grade. Examples
 * 
 * round to (85 - 84 is less than 3) do not round (result is less than 40) do
 * not round (60 - 57 is 3 or higher) Given the initial value of for each of
 * Sam's students, write code to automate the rounding process.
 * 
 * 
 * 
 * @author Gautham Bhonsle
 *
 */

public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		List<Integer> finalRes = new ArrayList<Integer>();
		grades.forEach(i -> {
			finalRes.add(getValue(i));
		});
		return finalRes;

	}

	private static int getValue(int num) {
		if (num < 37) {
			return num;
		}
		int count = 0;
		while (num % 5 != 0) {
			count++;
			num++;
		}
		if (count < 3) {
			return num;
		}else {
			num -=count;
		}
		return num;

	}
}
