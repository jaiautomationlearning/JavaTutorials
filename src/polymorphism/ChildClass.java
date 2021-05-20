package polymorphism;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		obj.run();
	}
	
	public void run() {
		
		this.sum();
	}
	
	public void sum() {
		
		int i = 100;
		int j = 200;
		int sum = i+j;
		
		System.out.println("Addition of the two numbers available in method of child class is " +sum);
	}

}
