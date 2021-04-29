package interviewPrep;

/**
 * Allow only alphabets and special charactrs and replace the first character as
 * capital
 * 
 * @author Gautham Bhonsle
 *
 */
public class Headlines {

	public static String output(String[] input) {
		String regex = "[0-9]";
		StringBuilder str = new StringBuilder();
		for (String string : input) {
			string = string.replaceAll(regex, "");
			String[] s = string.split(" ");
			StringBuilder capitalWord = new StringBuilder();
			for (String strnd : s) {
				if (!strnd.isBlank()) {
					String first = strnd.substring(0, 1);
					String afterFirst = strnd.substring(1);
					capitalWord.append(first.toUpperCase()).append(afterFirst).append(" ");
				}
			}
			capitalWord.toString().trim();
			str.append(capitalWord);
		}

		return str.toString().trim();
		// Insert your code here
	}

}
