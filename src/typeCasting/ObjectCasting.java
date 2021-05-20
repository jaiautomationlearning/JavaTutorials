package typeCasting;

public class ObjectCasting {

	public static void main(String[] args) {
		
		//Upcasting
		//Reference Variable of Parent Class
		//Object of child class
		
		Animal obj = new Dog();
		
		obj.run();
		obj.sleep();
		
		
		System.out.println("---------------------");
		//DownCastin
		//Dog obj1 = obj;
		Dog obj1 = (Dog) obj;
		
		obj1.bark();
		obj1.run();
		obj1.sleep();

	}

}
