package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You have been hired by a major MP3 player manufacturer to implement a new
 * music compression standard. In this kata you will implement the DECODER, and
 * its companion kata deals with the ENCODER.
 * 
 * Specification The input signal is represented as a comma-separated string of
 * integers and tokens (sequence descriptors). Tokens must be expanded as
 * follows.
 * 
 * number*count is expanded as number repeated count times first-last is
 * expanded as a sequence of consecutive numbers starting with first and ending
 * with last. This is true for both ascending and descending order
 * first-last/interval is similarly expanded, as sequence starting with first,
 * ending with last, where the numbers are separated by interval. Note that
 * interval does NOT have a sign Examples "1,3-5,7-11,14,15,17-20" is expanded
 * to [1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20] "0-4/2, 5, 7-9" is
 * expanded to [0, 2, 4, 5, 7, 8, 9] "0-4/2, 5, 7-5" is expanded to [0, 2, 4, 5,
 * 7, 6, 5] "0-4/2, 5, 7-5, 5*4" is expanded to [0, 2, 4, 5, 7, 6, 5, 5, 5, 5,
 * 5] Input A string of comma-separated integers and tokens (sequence
 * descriptors)
 * 
 * @author Gautham Bhonsle
 *
 */
public class MusicDecoder {
	public int[] uncompress(final String music) {
		String[] stringArr = music.split(",");
		List<Integer> result = new ArrayList<Integer>();
		for (String s : stringArr) {
			if (s.contains("/")) {
				result.addAll(decodeDivide(s));
			} else if (s.contains("-")) {
				result.addAll(decodeRange(s));
			} else if (s.contains("*")) {
				result.addAll(decodeMultiples(s));
			} else {
				List<Integer> subStr = new ArrayList<Integer>();
				subStr.add(Integer.valueOf(s));
				result.addAll(subStr);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	private List<Integer> decodeMultiples(String s) {
		String[] subStr = s.split("*");
		int multiplyer = Integer.parseInt(subStr[1]);
		int multiplyee = Integer.parseInt(subStr[0]);
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < multiplyer; i++) {
			res.add(multiplyee);
		}

		return res;

	}

	private List<Integer> decodeRange(String s) {
		String[] sunStr = s.split("-");
		int startRange = Integer.parseInt(sunStr[0]);
		int endRange = Integer.parseInt(sunStr[1]);
		List<Integer> res = new ArrayList<>();
		if (startRange < endRange) {
			for (int i = startRange; i <= endRange; i++) {
				res.add(i);
			}
		} else {
			for (int i = startRange; i >= endRange; i--) {
				res.add(i);
			}
		}

		return res;

	}

	private List<Integer> decodeDivide(String s) {
		String[] subStr = s.split("/");
		List<Integer> a = decodeRange(subStr[0]);
		int divider = Integer.parseInt(subStr[1]);

		return a.stream().filter(i -> i % divider == 0).collect(Collectors.toList());
	}
}
