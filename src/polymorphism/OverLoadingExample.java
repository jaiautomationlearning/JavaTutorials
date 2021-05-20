package polymorphism;

public class OverLoadingExample {
	
	public OverLoadingExample() {
		System.out.println("Inside Default Constructor");
	}

	
	public OverLoadingExample(int i) {

		System.out.println("Inside Paramterised Constructor");
		System.out.println("Variable value is " +i);
	}
	
	public static void main(String[] args) {
		
		OverLoadingExample obj1 = new OverLoadingExample();
		OverLoadingExample obj2 = new OverLoadingExample(15);

	}

}
