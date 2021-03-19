package interviewPrep;

/**
 *     // Complete this function to return either
    // "Hello, [name]!" or "Hello there!"
    // based on the input
    
 * @author KAUSHAL PC
 *
 */
public class Challenge {
	public static final String EMPTY_STRING = " ";
	public static final String EXCLAIM = "!";
	public static final String THERE = "there!";
	public static final String COMMA = ",";
	
    public static String sayHello(String name) {
    	
    	//String str = name != null  || name!=""? "Hello, ".concat(name).concat("!") : "Hello there!";
    	
        StringBuilder strng = new StringBuilder("Hello");
        
        
        if(name!=null && name !=""){
          
        	strng.append(COMMA).append(EMPTY_STRING).append(name).append(EXCLAIM);
        }else {
        	strng.append(EMPTY_STRING).append(THERE);
        }
          // You can print to STDOUT for debugging if you need to:
          System.out.print(name);
          
          // but you need to return the correct value in order to pass the challenge
          return strng.toString(); 
      }
    
    public static String getMiddle( String str ) {
    	
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);

    }

}
