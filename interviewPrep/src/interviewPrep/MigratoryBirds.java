package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array of bird sightings where every element represents a bird type
 * id, determine the id of the most frequently sighted type. If more than 1 type
 * has been spotted that maximum amount, return the smallest of their ids.
 * 
 * Example arr = {1,1,2,2,3}
 * 
 * There are two each of types 1 and 2, and one sighting of type 3. Pick the
 * lower of the two types seen twice: type 1.
 * 
 * Function Description
 * 
 * Complete the migratoryBirds function in the editor below.
 * 
 * migratoryBirds has the following parameter(s):
 * 
 * int arr[n]: the types of birds sighted Returns
 * 
 * int: the lowest type id of the most frequently sighted birds Input Format
 * 
 * The first line contains an integer, , the size of . The second line describes
 * as space-separated integers, each a type number of the bird sighted.
 * 
 * @author Gautham Bhonsle
 *
 */

public class MigratoryBirds {

	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Long> mp = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Long maxCount = (long) 0;
		for (Entry<Integer, Long> entry : mp.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
			}

		}

		List<Integer> longList = new ArrayList<Integer>();

		for (Entry<Integer, Long> entry : mp.entrySet()) {
			long val = entry.getValue();
			if (val == maxCount) {
				longList.add(entry.getKey().intValue());
			}
		}

		return longList.stream().mapToInt(i -> i.intValue()).min().getAsInt();

	}

}
