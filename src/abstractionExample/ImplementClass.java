package abstractionExample;

public class ImplementClass implements InterfaceExample{

	@Override
	public void sum() {
		
		int sum = 10+20;
		System.out.println("sum is "+sum);
		
	}

	@Override
	public void difference() {
		
		int difference = 20-10;
		System.out.println("Difference is "+difference);
	}

	@Override
	public void multiplication() {

		int mul = 10*20;
		System.out.println("Multiplication is "+mul);
	}

}
