package encapsulationExample;

public class OutSideClass {

	public static void main(String[] args) {
		
		EncapsulationExample obj = new EncapsulationExample();
		
		obj.setName("Jai");
		String name = obj.getName();
		
		obj.setAge(30);
		int age = obj.getAge();
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);

	}

}
