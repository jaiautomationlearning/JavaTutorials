package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		// Implicit Type Casting
		int i = 10;
		long l = i;
		
		System.out.println("Integer I Value is "+i);
		System.out.println("Long L value is "+l);
		
		long L1 = 1000;
		float f= L1;
		
		System.out.println("Long L1 Value is "+L1);
		System.out.println("Float F value is "+f);
		
		//Explicit Type Casting
		
		long L2 = 10000;
		int i2 = (int) L2;
		
		System.out.println("Long L2 value is "+L2);
		System.out.println("Integer I2 Value is "+i2);
		

	}

}
