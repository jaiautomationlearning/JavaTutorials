package wrappingAndUnwrappingExample;

public class WarpperClass {

	public static void main(String[] args) {
	
		//Wrapping
		int i =5; // Premitive data type example
		Integer k = new Integer(i); // Wrapper class object example
		
		System.out.println("I value is "+i);
		System.out.println("K value is "+k);
		
		// UnWrapping
		Integer j = new Integer(10); // Wrapper class object example
		int l = j.intValue();
		
		System.out.println("J value is "+j);
		System.out.println("L value is "+l);
		
	}

}
