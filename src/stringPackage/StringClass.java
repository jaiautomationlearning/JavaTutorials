package stringPackage;

public class StringClass {

	public static void main(String[] args) {
		
		String name1 = "Jai";
		String name2 = "jai";
		String name3 = "Praveen";

		
		String name4 = name3.toLowerCase();
		
		String name5 = name3.toUpperCase();
		
		String name6 = name3.substring(2);
		
		String name7 = name3.substring(2, 5);
		
		
		String name8 = "          Praveen            ";
		System.out.println(name8.trim());

	}

}
