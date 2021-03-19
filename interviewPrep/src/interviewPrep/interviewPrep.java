package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	}

}
