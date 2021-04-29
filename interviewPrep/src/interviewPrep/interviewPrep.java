package interviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import algorithms.SortingAlgo.BubbleSort;
import algorithms.SortingAlgo.InsertionSort;
import algorithms.SortingAlgo.MergeSort;
import algorithms.SortingAlgo.QuickSort;
import algorithms.SortingAlgo.SelectionSort;
import dynamicProgramming.BestSum;
import dynamicProgramming.CanSum;
import dynamicProgramming.FibonacciMem;
import dynamicProgramming.HowSum;
import dynamicProgramming.PermutationString;

public class interviewPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String finalStr = DuplicateEncoder.encode("How (dyh");
		System.out.println(finalStr);

		String song = "WUBWUBIWUBAMWUBWUBX";
		Dubstep.SongDecoder(song);

		Long ip = 2575873310L;
		long ip2 = 816502016L;
		IPtoBinary.longToIP(ip2);

		@SuppressWarnings("unchecked")
		PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		System.out.println("should == 2 " + helper.pageCount()); // should == 2
		System.out.println("should == 6 " + helper.itemCount()); // should == 6
		System.out.println("should == 4 " + helper.pageItemCount(0)); // should == 4
		System.out.println("last page - should == 2 " + helper.pageItemCount(1)); // last page - should == 2
		System.out.println("should == -1 " + helper.pageItemCount(2)); // should == -1 since the page is invalid

		// pageIndex takes an item index and returns the page that it belongs on
		System.out.println("should == 1 " + helper.pageIndex(5)); // should == 1 (zero based index)
		System.out.println("should == 0 " + helper.pageIndex(2)); // should == 0
		System.out.println("should == -1 " + helper.pageIndex(20)); // should == -1
		System.out.println("should == -1 " + helper.pageIndex(-10)); // should == -1

		System.out.println(CountRepeat.duplicateCharacter("Gautham"));
		System.out.println(CountRepeat.duplicateInJava8("Gautham"));

		// UIB.countAs();

		String s1 = "1,2*2,3";
		String s2 = "1,3-5,7";
		String s3 = "1,10-6/2,7";
		MusicDecoder music = new MusicDecoder();
		System.out.println(music.uncompress(s3));

		WorstLosingStreak wr = new WorstLosingStreak();
		List<Integer> nums = Arrays.asList(4, 8, 4, 2, 10, 3, 2);
		// System.out.println(wr.worstLosingStreak(nums));
		System.out.println(wr.worstLosingStint(nums));

		List<Integer> numberPair = Arrays.asList(50, 40, 60, 50, 150);

		System.out.println(PaymentPairs.imperatvePairs(numberPair));
		;

		// Grading students
		List<Integer> grades = Arrays.asList(73, 67, 38, 33);
		System.out.println("grading" + GradingStudents.gradingStudents(grades));

		// Apples and oranges
		int[] appleRange = { -2, 2, 1 };
		int[] orangeRange = { 5, -6 };
		// 7 and 11 are the range of sam's house, 5 is location of apple tree and 15 is
		// location on orange tree on the 'x' axis
		ApplesAndOranges.countApplesAndOranges(7, 11, 5, 15, appleRange, orangeRange);

		System.out.println(Kangaroo.kangarooJump(0, 2, 5, 3));

		int[] records = { 10, 5, 20, 20, 4, 5, 2, 25, 1 };
		System.out.println(Arrays.toString(BasketBall.breakingRecords(records)));

		List<Integer> birthday = Arrays.asList(1, 2, 1, 3, 2);
		List<Integer> birthday1 = Arrays.asList(4);
		System.out.println(BirthDay.birthday(birthday, 3, 2));
		System.out.println(BirthDay.birthday(birthday1, 4, 1));

		// Bob and alice
		System.out
				.println((CompareTriplet.compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10))).toString());

		int[] rec = { 10, 5, 7, 0, -3, -8, -6 };
		// Minus & plus
		Fraction.plusMinus(records);

		List<Integer> candles = Arrays.asList(4, 3, 4, 2, 1);
		System.out.println(BirthDayCandles.birthdayCakeCandles(candles));

		// DingleMouse
		String str = "CAT";
		int[][] rotos = { { 1, 13, 27 } };
		String[] line = new String[] { "CAT" };
		System.out.println(Arrays.toString(Dinglemouse.flapDisplay(line, rotos)));

		String[] input = { "break3ing news5:", " 1A 1circle is round!", };
		String[] input1 = { "", "Fresh fried fish - fish fresh fried" };
		String[] input2 = { "123", "eat;sleep;repeat", "321", };
		System.out.println(Headlines.output(input2));

		// Migratory birds
		List<Integer> birds = Arrays.asList(1, 1, 2, 2, 3);
		System.out.println(MigratoryBirds.migratoryBirds(birds));

		String[] str1 = { "London-Rotterdam:432", "Rotterdam-Calais:311", "Calais-Venice:1229" };
		System.out.println(Fuel.calculator(str1));

		// Snakes and Ladders
		SnakesLadders game = new SnakesLadders();
		/**
		 * Game #1 move #1 {3, 2}: Player 1 is on square 5 Game #1 move #2 {6, 5}:
		 * Player 2 is on square 11 Game #1 move #3 {4, 5}: Player 1 is on square 14
		 * Game #1 move #4 {3, 6}: Player 2 is on square 20 Game #1 move #5 {2, 5}:
		 * Player 1 is on square 42 Game #1 move #6 {4, 4}: Player 2 is on square 84
		 * Game #1 move #7 {1, 6}: Player 2 is on square 91 Game #1 move #8 {2, 5}:
		 * Player 1 is on square 11 Game #1 move #9 {5, 5}: Player 1 is on square 11
		 */
		System.out.println(game.play(3, 2));
		System.out.println(game.play(6, 5));
		System.out.println(game.play(4, 5));
		System.out.println(game.play(3, 6));
		System.out.println(game.play(2, 5));
		System.out.println(game.play(4, 4));
		System.out.println(game.play(1, 6));
		System.out.println(game.play(2, 5));
		System.out.println(game.play(5, 5));

		// FibProduct
		System.out.println(Arrays.toString(ProdFib.productFib(800)));

		// JosephusSurvior
		System.out.println(JosephusSurvivor.josephusSurvivor(100, 1));

		/**
		 * Dynamic programming module
		 */
		// FibMem - Memoize solution
		Map<Long, Long> memo = new HashMap<Long, Long>();
		System.out.println(FibonacciMem.fibMem(50L, memo));

		// Grid Traveller - Memoize solution
		Map<String, Long> memoGrid = new HashMap<>();
		System.out.println(GridTraveller.gridTraveller(18, 18, memoGrid));

		// CanSum
		Integer[] num = { 2, 1, 4 };
		Map<Long, Boolean> memoCanSum = new HashMap<Long, Boolean>();
		// the above args doesnt work with gautham's solution - Guess why?:)
		System.out.println("sum" + CanSum.canSumMem(7, num, memoCanSum));

		List<Integer> myhowList = Arrays.asList(5, 3, 4, 7);
		List<Integer> largeExecList = Arrays.asList(7, 14);

		Map<Integer, List<Integer>> memoHowSum = new HashMap<Integer, List<Integer>>();
		//Set<Entry<Integer, List<Integer>>> set = memoHowSum.entrySet();
		/*
		 * for (Entry<Integer, List<Integer>> entry : set) { entry. }
		 */
		System.out.println("Howsum" + HowSum.howSum(7, myhowList));
		System.out.println("HowsumMem" + HowSum.howSumMem(7, myhowList, memoHowSum));
		System.out.println("Howsum" + HowSum.howSumMem(300, largeExecList, memoHowSum));

		System.out.println("BestSum" + BestSum.bestSum(7, myhowList));
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Sorting Algorithms
		 */
		int[] sortArr = {4,7,1,8,5,2};
		// bubble sort
		System.out.println(Arrays.toString(BubbleSort.sort(sortArr)));
		
		//insertion sort
		System.out.println(Arrays.toString(InsertionSort.insertSort(sortArr))); 
		
		System.out.println(Arrays.toString(SelectionSort.selectionSort(sortArr)));
		
		MergeSort mSort = new MergeSort();
		mSort.mergeSort(sortArr);
		
		var quick = new QuickSort();
		quick.sort(sortArr);
		

		/**
		 * PermuteString
		 */
		System.out.println(PermutationString.computePer("abcd"));
		System.out.println(PermutationString.getMiddleOfPermutation("abcd"));
	}

	// FibProduct

}
