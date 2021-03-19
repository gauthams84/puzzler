package interviewPrep;

import java.util.concurrent.TimeUnit;

public class TimeFormatter {
	public static String formatDuration(int seconds) {
		int day = (int)TimeUnit.SECONDS.toDays(seconds);        
		 long hours = TimeUnit.SECONDS.toHours(seconds) - (day *24);
		 long minutes = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
		 long sec = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

		StringBuilder str = new StringBuilder();
		if(seconds<=0) {
			return "now";
		}
		if(day!=0) {
			str.append(day).append(" Days, ");
		}
		if (hours != 0) {
			str.append(hours).append(" hour");
		}
		if (hours != 0 && minutes != 0) {
			str.append(", ").append(minutes).append(" minutes");
		} else if (minutes == 0) {

		} else if (minutes > 1) {
			str.append(minutes).append(" minutes");
		} else {
			str.append(minutes).append(" minute");
		}

		if (minutes != 0 && sec != 0) {
			str.append(" and ").append(sec).append(" seconds");
		} else if (sec == 0) {

		} else if (sec > 1) {
			str.append(sec).append(" seconds");
		} else {
			str.append(sec).append(" second");
		}

		// String timeString = String.format("%d:%d:%d", hours, minutes, sec);

		return str.toString();
		// your code goes here
	}
}
