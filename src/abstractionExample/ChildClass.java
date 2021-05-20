package abstractionExample;

public class ChildClass extends AbstractClass{
	int A = 10;
	int B = 20;

	@Override
	public void multiplication() {
		
		int mul = 10*20;
		System.out.println("multiplication is "+mul);
		
	}

	@Override
	public void divide() {
		
		int div = 20/10;
		System.out.println("result of divison is " +div);
		
		
	}
	


}
