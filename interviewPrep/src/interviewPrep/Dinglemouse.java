package interviewPrep;

/**
 * Airport Arrivals/Departures - #1
 * You are at the airport staring blankly at the arrivals/departures flap display...
 * You notice that each flap character is on some kind of a rotor and the order of characters on each rotor is:

ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*\/0123456789

And after a long while you deduce that the display works like this:

Starting from the left, all rotors (from the current one to the end of the line) flap together until the left-most rotor character is correct.
Then the mechanism advances by 1 rotor to the right...
...REPEAT this rotor procedure until the whole line is updated
...REPEAT this line procedure from top to bottom until the whole display is updated
Example
Consider a flap display with 3 rotors and one 1 line which currently spells CAT

Step 1  (current rotor is 1)
Flap x 1
Now line says DBU
Step 2  (current rotor is 2)
Flap x 13
Now line says DO)
Step 3  (current rotor is 3)
Flap x 27
Now line says DOG

 * 
 */
import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {

	private static final char[] ALPHABET1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789".toCharArray();
	private static final Map<Character, Integer> ALPHA_MAP = new HashMap<>();

	static {
		for (int i = 0; i < ALPHABET1.length; i++) {
			ALPHA_MAP.put(ALPHABET1[i], i);
		}
	}

	public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
		String[] newLines = new String[lines.length];
		for (int i = 0; i < lines.length; i++) {
			char[] line = lines[i].toCharArray();
			char[] newLine = new char[line.length];
			int spin = 0;
			for (int j = 0; j < line.length; j++) {
				spin += rotors[i][j];
				int offset = ALPHA_MAP.get(line[j]) + spin;
				newLine[j] = ALPHABET1[offset % ALPHABET1.length];
			}
			newLines[i] = new String(newLine);
		}
		return newLines;
	}

}
