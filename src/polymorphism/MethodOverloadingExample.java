package polymorphism;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		MethodOverloadingExample obj = new MethodOverloadingExample();
		
		obj.sum();
		obj.sum(100, 200);
		
	}

	
	public void sum() {
		
		int i = 10;
		int j = 20;
		int sum = i+j;
		
		System.out.println("Addition of the two numbers in method 1 is "+sum);
	}
	
	public void sum(int i, int j) {
		int sum = i+j;
		System.out.println("Addition of the two numbers in method 2 is "+sum);
	}
	
}
