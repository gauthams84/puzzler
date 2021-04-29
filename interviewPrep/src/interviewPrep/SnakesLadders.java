package interviewPrep;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/587136ba2eefcb92a9000027
 * 
 * @author Gautham Bhonsle
 *
 */
public class SnakesLadders {
	final int HOME = 100;
	final int START = 0;
	int firstPlayerPosition = 0;
	int secondPlayerPosition = 0;
	String player = "player1";
	String returnString = "";
	boolean gameOver = false;
	String winner = "";
	int beforePositionP1 = 0;
	int beforePositionP2 = 0;
	static Map<Integer, Integer> snakes = getMap("Snakes");
	static Map<Integer, Integer> ladder = getMap("Ladder");

	private static Map<Integer, Integer> getMap(String type) {
		Map<Integer, Integer> ladder = new HashMap<>();
		Map<Integer, Integer> snakes = new HashMap<>();

		ladder.put(2, 38);
		ladder.put(7, 14);
		ladder.put(8, 31);
		ladder.put(15, 26);
		ladder.put(21, 42);
		ladder.put(28, 84);
		ladder.put(36, 44);
		ladder.put(51, 67);
		ladder.put(71, 91);
		ladder.put(78, 98);
		ladder.put(87, 94);

		snakes.put(16, 6);
		snakes.put(46, 25);
		snakes.put(49, 11);
		snakes.put(62, 19);
		snakes.put(64, 60);
		snakes.put(74, 53);
		snakes.put(89, 68);
		snakes.put(92, 88);
		snakes.put(95, 75);
		snakes.put(99, 80);

		if (type.equalsIgnoreCase("Ladder")) {
			return ladder;
		} else {
			return snakes;
		}

	}

	public SnakesLadders() {
	}

	public String play(int die1, int die2) {

		if (gameOver) {
			return "Game over";
		}

		if (player.equalsIgnoreCase("player1")) {
			if (firstPlayerPosition == 0) {
				firstPlayerPosition = getPosition(START, die1, die2);
			} else {
				firstPlayerPosition = getPosition(firstPlayerPosition, die1, die2);

			}

		}

		if (player.equalsIgnoreCase("player2")) {
			if (secondPlayerPosition == 0) {
				secondPlayerPosition = getPosition(START, die1, die2);
			} else {
				secondPlayerPosition = getPosition(secondPlayerPosition, die1, die2);

			}

		}

		if (player.equalsIgnoreCase("player1") && !(firstPlayerPosition > HOME)) {
			beforePositionP1 = firstPlayerPosition;
			returnString = "Player 1 is on square " + firstPlayerPosition;
		} else if (player.equalsIgnoreCase("player1") && firstPlayerPosition > HOME) { // if greater than 100 condition
			int temp = beforePositionP1 + die1 + die2 - 100;
			firstPlayerPosition = 100 - temp;
			firstPlayerPosition = getSnakesOrLadders(firstPlayerPosition);
			returnString = "Player 1 is on square " + firstPlayerPosition;
		}

		if (player.equalsIgnoreCase("player2") && !(secondPlayerPosition > HOME)) {
			beforePositionP2 = secondPlayerPosition;
			returnString = "Player 2 is on square " + secondPlayerPosition;
		} else if (player.equalsIgnoreCase("player2") && secondPlayerPosition > HOME) {
			int temp = beforePositionP2 + die1 + die2 - 100;
			secondPlayerPosition = 100 - temp;
			secondPlayerPosition = getSnakesOrLadders(secondPlayerPosition);
			returnString = "Player 2 is on square " + secondPlayerPosition;
			
		}

		if (player.equalsIgnoreCase("player1") && firstPlayerPosition == HOME) {
			boolean gameOver = true;
			winner = player;
			returnString = "Player "+ player+" Wins!";
		}
		if (player.equalsIgnoreCase("player2") && secondPlayerPosition == HOME) {
			boolean gameOver = true;
			winner = player;
			returnString = "Player " +player+" Wins!";
		}

		if (die1 != die2) {
			changeplayer();
		}

		return returnString;
	}

	private String changeplayer() {
		if (player.equalsIgnoreCase("player1")) {
			player = "player2";
		} else {
			player = "player1";
		}
		return player;

	}
	
	private int getSnakesOrLadders(int position) {
		if (ladder.containsKey(position)) {
			position = ladder.get(position);
		}
		if (snakes.containsKey(position)) {
			position = snakes.get(position);
		}
		
		return position;
	}

	private int getPosition(int position, int die1, int die2) {

		position += die1 + die2;
		return getSnakesOrLadders(position);

	}

}
