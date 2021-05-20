package abstractionExample;

public abstract class AbstractClass {
	
	public void sum() {
		
		int sum = 10+20;
		System.out.println("sum is " +sum);
	}
	
	public void subtraction() {
		
		int sub = 10-5;
		System.out.println("subtraction is " +sub);
	}
	
	public abstract void multiplication();
	
	public abstract void divide();
	
	

}
