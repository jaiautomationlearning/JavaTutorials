package dataTypesAndVariables;

public class DataTypeAndVariables {
	
int instanceVariable = 40;
static int staticVariable = 50;
	
	public static void main(String[] args) {
		
		DataTypeAndVariables obj = new DataTypeAndVariables();
		obj.method1();
		DataTypeAndVariables.method2();
	}
	
	public void method1() {
		
		int localVariable1 = 20;
		
		System.out.println("Local Variable 1 value is "+localVariable1);
		System.out.println("Instance Variable value is "+instanceVariable);	
		System.out.println("Static Variable value is "+staticVariable);
	
	}
	
	public static void method2() {
		
		int localVariable2 = 30;
		
		System.out.println("Local Variable 2 value is "+localVariable2);
		System.out.println("Static Variable value is "+staticVariable);
	}

}
