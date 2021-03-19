package interviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;
public class Scramblies {
	
	public static boolean containsallChars(String a, String b) {
	    List<Character> aChars = stringToCharacterList(a);
	    List<Character> bChars = stringToCharacterList(b);
	    return aChars.containsAll(bChars);
	}
	
	public static List<Character> stringToCharacterList(String input) {
	    return input.chars()
	            .mapToObj(i -> (char)i)
	            .collect(Collectors.toList());
	}
	
	

	public static boolean scramble(String str1, String str2) {

		if ((str1 == null || str1 == "") || (str2 == null || str2 == "")) {
			return false;
		}
		
		String[] items = str2.split("");
		

	//	public static boolean stringContainsItemFromList(String inputStr, String[] items) {
		    return Arrays.stream(items).anyMatch(str1::contains);
		//}
		
		/*
		 * String[] strArr = str2.split("");
		 * 
		 * for (String string : strArr) { if (str1.indexOf(string) > -1) { str1 =
		 * str1.replaceFirst(string, ""); } else { return false; } } return true;
		 */
		 
		
		/*
		 * Stream<String> str = Arrays.stream(str2.split("")); String found =
		 * str.filter(i -> str1.indexOf(i)!=-1).findFirst().orElse("none");
		 * System.out.println(found); if(found.equals("none")) { return false; }
		 * 
		 * return true;
		 */
		  
		//return containsAllChars(str2, str1);
		   // containsAllChars(b, a);

	}
	
	private static boolean containsAllChars(String a, String b) {
	    boolean result = a.chars().distinct().allMatch(ch -> b.contains(String.valueOf((char) ch)));
	    System.out.println(result);
	    return result;
	}
	

}
