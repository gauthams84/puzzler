package interviewPrep;

interface A{
	void show(int i);
}

// Class created to implement only one method.
/*
 * class dem implements A{
 * 
 * @Override public void show(int i) { System.out.println("Hello "+i);
 * 
 * }
 * 
 * }
 */

public class LambdaDemo {

	public static void main(String[] args) {
		// Anonymous inner class
		A obj;
		/*
		 * obj = new A() { 
		 * public void show(int i) 
		 * { 
		 * System.out.println("Hello "+i);
		 *  }
		 * };
		 */
		// The inner class has lots of boiler plate code. Instead could use lambda expressions
		// as below
		
		obj = (i)-> System.out.println("Hello "+i);
		
		
		obj.show(6);

	}

}
