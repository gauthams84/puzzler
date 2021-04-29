package interviewPrep;
/**
 * TestGorilla
 * @author Gautham Bhonsle
 *
 */
public class Fuel {
	public static String calculator(String[] distancesList) {
		final double perLitre = 1.30;
		final int consumption = 8;
		int totalDistance = 0;
		int[] distances = new int[distancesList.length];
		for (int i = 0; i < distancesList.length; i++) {
			String item = distancesList[i];
			String[] words = null;
			if (item.contains(":")) {
				words = item.split(":");
			} else {
				words = item.split(" ");
			}
			String distInKm = words[words.length - 1];
			try {
				distances[i] = Integer.parseInt(distInKm);
			} catch (NumberFormatException e) {
				// System.out.println("Number format exception");
			}
		}
		int maxDistance = 0;
		int max = 0;
	
		for (int i = 0; i < distances.length; i++) {
			if (distances[i] > maxDistance) {
				totalDistance += distances[i];
				max = i;
				 
			}
		}
		
		int fuelRequired = totalDistance/consumption;
		Double totalExpences = fuelRequired * perLitre;
		//Double totalExpences = (totalDistance/8 * perLitre);

		//int endOfTitle = distancesList[max].indexOf("" + maxDistance);
		int longestRoute = distances[max];
		int endOfTitle = distancesList[max].indexOf("" + longestRoute);
		String distanceTitle = new String();
		if (endOfTitle != -1) {
			distanceTitle = distancesList[max].substring(0, endOfTitle);
		}
		StringBuffer sb = new StringBuffer();
		sb.append("Total expenses:").append(totalExpences).append("$;Longest distance:").append(distanceTitle)
				.append(" ");

		return sb.toString();
	}

	//279;-> 1.30 per km and cosumes 1 litre for every 8 kms travelled
}
