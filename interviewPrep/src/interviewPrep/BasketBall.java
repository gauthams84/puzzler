package interviewPrep;

import java.util.Iterator;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * Maria plays college basketball and wants to go pro. Each season she maintains
 * a record of her play. She tabulates the number of times she breaks her season
 * record for most points and least points in a game. Points scored in the first
 * game establish her record for the season, and she begins counting from there.
 * 
 * Example
 * scores = [12,24,10,24]
 * 
 * Scores are in the same order as the games played. She tabulates her results
 * as follows:
 * 
 * Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
 * 
 * @author Gautham Bhonsle
 * 
 * int[2]: An array with the numbers of times she broke her records. 
 * Index  is for breaking most points records, 
 * and index  is for breaking least points records.
 *
 */
public class BasketBall {

	static int[] breakingRecords(int[] scores) {
		int max = scores[0], min = scores[0];
		int maxCount = 0, minCount = 0;
		int[] result = new int[2];

		for (int i : scores) {
			if (i > max) {
				max = i;
				maxCount++;
			}
			if (i < min) {
				min = i;
				minCount++;
			}

		}

		result[0] = maxCount;
		result[1] = minCount;
		return result;

	}

}
