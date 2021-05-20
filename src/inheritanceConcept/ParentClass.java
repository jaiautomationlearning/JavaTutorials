package inheritanceConcept;

public class ParentClass {
	
	int number1 = 100;
	int number2 = 200;
	int sum = 0;
	
	public void sum() {
		sum = number1+number2;
		System.out.println("Addition of the two numbers is "+ sum);
	}

}
