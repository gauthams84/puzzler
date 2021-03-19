package interviewPrep;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runners.JUnit4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tests {
	@Test
	public void FixedTests() {
		assertEquals("Ths wbst s fr lsrs LL!", Solutions.disemvowel("This website is for losers LOL!"));
		assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
				Solutions.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
		assertEquals("Wht r y,  cmmnst?", Solutions.disemvowel("What are you, a communist?"));
	}

	@Test
	public void deleteNth() throws Exception {
		
		  assertArrayEquals( new int[] { 20, 37, 21 }, EnoughIsEnough.deleteNth( new
		  int[] { 20, 37, 20, 21 }, 1 ) );
		 
		assertArrayEquals(new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
				EnoughIsEnough.deleteNth(new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3)

		);
		assertArrayEquals(new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
				EnoughIsEnough.deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3));
		assertArrayEquals(new int[] { 1, 1, 1, 1, 1 }, EnoughIsEnough.deleteNth(new int[] { 1, 1, 1, 1, 1 }, 5));
		assertArrayEquals(new int[] {}, EnoughIsEnough.deleteNth(new int[] {}, 5));

	}

	@Test
	public void test() {
		/**
		 * SquareTest
		 */
		assertEquals(811181, new SquareDigit().squareDigits(9119));
	}

	// HighestString
	@Test
	public void sampleTests() {
		assertEquals("taxi", HighestScoring.high("man i need a taxi up to ubud"));
		assertEquals("rhiwlzlzas", HighestScoring.high("rhiwlzlzas"));
		assertEquals("volcano", HighestScoring.high("what time are we climbing up to the volcano"));
		assertEquals("semynak", HighestScoring.high("take me to semynak"));
	}

	// Outlier
	@Test
	public void testExample() {
		int[] exampleTest1 = { 2, 6, 8, -10, 3 };
		int[] exampleTest2 = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 };
		int[] exampleTest3 = { Integer.MAX_VALUE, 0, 1 };
		// assertEquals(3, FindOutlier.find(exampleTest1));
		// assertEquals(206847684, FindOutlier.find(exampleTest2));
		assertEquals(0, FindOutlier.find(exampleTest3));
	}

	@Test
	public void shouldSayHello() {
		assertEquals("Hello, Qualified!", Challenge.sayHello("Qualified"));
	}

	@Test
	public void testBasics() {
		assertEquals(23, new Solution().solution(10));
	}

	@Test
	public void shouldFindTheMiddleCharacters() {
		assertEquals("A", Challenge.getMiddle("A"));
		assertEquals("es", Challenge.getMiddle("test"));
		assertEquals("t", Challenge.getMiddle("testing"));
		assertEquals("dd", Challenge.getMiddle("middle"));
	}

	@Test
	public void test1() {
		assertEquals("42 -9", HighLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	}

	private static void testing(boolean actual, boolean expected) {
		assertEquals(expected, actual);
	}

	@Test
	public void tesScrambliest() {

		/*
		 * System.out.println("Fixed Tests scramble");
		 * testing(Scramblies.scramble("rkqodlw", "world"), true);
		 * testing(Scramblies.scramble("cedewaraaossoqqyt", "codewars"), true);
		 * testing(Scramblies.scramble("katas", "steak"), false);
		 * testing(Scramblies.scramble("scriptjavx", "javascript"), false);
		 */

		/*
		 * testing(Scramblies.containsallChars("scriptingjava", "javascript"), true);
		 * testing(Scramblies.containsallChars("scriptsjava", "javascripts"), true);
		 * testing(Scramblies.containsallChars("javscripts", "javascript"), false);
		 * testing(Scramblies.containsallChars("aabbcamaomsccdd", "commas"), true);
		 * testing(Scramblies.containsallChars("commas", "commas"), true);
		 * testing(Scramblies.containsallChars("sammoc", "commas"), true);
		 */
	}

	@Test
	public void exampleTests() {
		assertEquals('e', FindMissingLetter.findMissingLetter(new char[] { 'c', 'd', 'f' }));
		assertEquals('P', FindMissingLetter.findMissingLetter(new char[] { 'O', 'Q', 'R', 'S' }));
	}

	@Test
	public void testGame() {
		assertEquals(5, BitCounting.countBits(1234));
		assertEquals(1, BitCounting.countBits(4));
		assertEquals(3, BitCounting.countBits(7));
		assertEquals(2, BitCounting.countBits(9));
		assertEquals(2, BitCounting.countBits(10));
	}

	@Test
	public void testPanagram1() {
		String pangram1 = "The quick brown fox jumps over the lazy dog.";
		PangramChecker pc = new PangramChecker();
		assertEquals(true, pc.check(pangram1));
	}

	@Test
	public void testPanagram2() {
		String pangram2 = "You shall not pass!";
		PangramChecker pc = new PangramChecker();
		assertEquals(false, pc.check(pangram2));
	}

	@Test
	public void testSameArrays() {
		int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b = new int[] { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
		assertEquals(true, AreSame.comp(a, b));
	}

	@Test
	public void basicTestMexicanWave1() {
		String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
		assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("hello"));
	}

	@Test
	public void basicTestMexicanWave2() {
		String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs",
				"codewaRs", "codewarS" };
		assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("codewars"));
	}

	@Test
	public void basicTestMexicanWave3() {
		String[] result = new String[] {};
		assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(""));
	}

	@Test
	public void basicTestMexicanWave4() {
		String[] result = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds",
				"two worDs", "two wordS" };
		assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave("two words"));
	}

	@Test
	public void basicTestMexicanWave5() {
		String[] result = new String[] { " Gap ", " gAp ", " gaP " };
		assertArrayEquals("it should return '" + Arrays.toString(result) + "'", result, MexicanWave.wave(" gap "));
	}

	private static void dotest(int[] ls, int[] expect) {
		int[] actual = SumParts.sumParts(ls);
		assertArrayEquals(expect, actual);
	}

	@Test
	public void testSumOfArrayParts() {
		dotest(new int[] {}, new int[] { 0 });
		dotest(new int[] { 0, 1, 3, 6, 10 }, new int[] { 20, 20, 19, 16, 10, 0 });
		dotest(new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 21, 20, 18, 15, 11, 6, 0 });

		dotest(new int[] { 744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358 }, new int[] { 10037855,
				9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0 });

	}
	/**
	 * Ip to binary
	 */
	@Test
	public void sampleTest() {
		assertEquals("128.114.17.104", IPtoBinary.longToIP(2154959208L));
		assertEquals("0.0.0.0", IPtoBinary.longToIP(0));
		assertEquals("128.32.10.1", IPtoBinary.longToIP(2149583361L));
	}
	
	
	/*
	 * private Xbonacci variabonacci;
	 * 
	 * @Before public void setUp() throws Exception { variabonacci = new Xbonacci();
	 * }
	 * 
	 * @After public void tearDown() throws Exception { variabonacci = null; }
	 */
	  
	  private double precision = 1e-10;
	  
	  @Test
	  public void sampleTestsTribinacci() {
	   assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, Xbonacci.tribonacci(new double []{1,1,1},10), precision);
	   assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, Xbonacci.tribonacci(new double []{0,0,1},10), precision);
	  assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, Xbonacci.tribonacci(new double []{0,1,1},10), precision);
	   // assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, Xbonacci.tribonacci(new double []{16, 7, 3},3), precision);
	    
	  }
	  
	    @Test
	    public void testVasyaClerk1() {
	      assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
	    }
	   @Test
	   public void testVasyaClerk2() {
	      assertEquals("NO", Line.Tickets(new int []{25, 100}));
	    }
	   
	   
	    @Test
	    public void testNextPerfectSquare1() {
	        assertEquals(144, NumberFun.findNextSquare(121));
	    }
	    
	    @Test
	    public void testNextPerfectSquare2() {
	        assertEquals(676, NumberFun.findNextSquare(625));
	    }
	    
	    @Test
	    public void testNextPerfectSquare3() {
	        assertEquals(-1, NumberFun.findNextSquare(114));
	    }
	    
	    @Test
	    public void digitalRoot1() {
	      assertEquals( "Nope!" , 7, DRoot.digital_root(16));
	    }      
	    @Test
	    public void digitalRoot2() {
	      assertEquals( "Nope!" , 6, DRoot.digital_root(456));
	    }
	    
	    
	    @Test
	    public void findTest() {
	     	assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); 
	      assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); 
	    	assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
	     	assertEquals(10, FindOdd.findIt(new int[]{10}));
	     	assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
	      assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
	   	}
	    
	    private double precision1 = 0.0000000000001;
	    
	    @Test
	    public void sampleTestCasesForUnique() {
	        assertEquals(1.0, findUnique.findUniq(new double[]{0, 1, 0}), precision1);
	        assertEquals(2.0, findUnique.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision1);
	    }
	    
	    private static void testing(int actual, int expected) {
	        assertEquals(expected, actual);
	    }
	 
	    @Test
	    public void testDoubleLiner() {
	        System.out.println("Fixed Tests dblLinear");
	        testing(DoubleLinear.dblLinear(10), 22);
	        testing(DoubleLinear.dblLinear(20), 57);
	        testing(DoubleLinear.dblLinear(30), 91);
	        testing(DoubleLinear.dblLinear(50), 175);
	             
	    }
	    

	    @Test
	    public void sampleTestTopWords() {
	    //  assertEquals(Arrays.asList("e", "d", "a"),    TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
	    //  assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
	      assertEquals(Arrays.asList("won't", "wont"),  TopWords.top3("  //wont won't won't "));
	      assertEquals(Arrays.asList("e"),              TopWords.top3("  , e   .. "));
	      assertEquals(Arrays.asList(),                 TopWords.top3("  ...  "));
	      assertEquals(Arrays.asList(),                 TopWords.top3("  '  "));
	      assertEquals(Arrays.asList(),                 TopWords.top3("  '''  "));
	      assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
	                      .of("In a village of La Mancha, the name of which I have no desire to call to",
	                          "mind, there lived not long since one of those gentlemen that keep a lance",
	                          "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
	                          "coursing. An olla of rather more beef than mutton, a salad on most",
	                          "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
	                          "on Sundays, made away with three-quarters of his income.")
	                       .collect(Collectors.joining("\n")) )); 
	    }
	    
	    @Test
	    public void exampleTimeFormatterTest() {
	        assertEquals("1 second", TimeFormatter.formatDuration(1));
	        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
	        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
	        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
	        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
	    }
	    
		@Test
		public void testSumSquared1() {
			assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250));
		}
		@Test
		public void testSumSquared12() {
			assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250));
		}
		@Test
		public void testSumSquared13() {
			assertEquals("[[287, 84100]]", SumSquaredDivisors.listSquared(250, 500));
		}
		
		/**
		 * Pagination tests
		 */
		
		 @Test
		    public void testSomething() {
		        // assertEquals("expected", "actual");
		    }
		 
		 /**
		  * Big factorial
		  */
		  @Test
		  public void BasicFactorialTests()
		  {
		    assertEquals("1", Factorial.factorial(1));
		    assertEquals("120", Factorial.factorial(5));
		    assertEquals("362880", Factorial.factorial(9));
		    assertEquals("1307674368000", Factorial.factorial(15));
		    assertEquals("2432902008176640000", Factorial.factorial(20));
		    assertEquals("15511210043330985984000000", Factorial.factorial(25));
		  }
	    
}



