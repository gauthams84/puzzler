package interviewPrep;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeat {

	public static String duplicateInJava8(String name) {

		Map<Character, Long> dupMap = name.toLowerCase().chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Entry<Character, Long> value = dupMap.entrySet().stream().filter(i -> i.getValue() > 1).findFirst().get();
		return value.getKey().toString();

	}

	public static String duplicateCharacter(String name) {

		String[] str = name.toLowerCase().split("");
		Set<String> duplicateHash = new HashSet<String>();

		for (String s : str) {
			if (duplicateHash.contains(s))
				return s;
			else {
				duplicateHash.add(s);
			}
		}
		return "";

	}

}
