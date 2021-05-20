package methodPackage;

public class MethodClass {

	public static void main(String[] args) {
		
		MethodClass mc = new MethodClass();
				mc.add();
	}
	
	public void add() {
		int i = 10;
		int j = 20;
		int sum = i+j;
		
		System.out.println("Addition of the two numbers is "+sum);
	}

}
