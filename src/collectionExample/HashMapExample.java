package collectionExample;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, String> obj = new HashMap<String, String>();
		
		obj.put("Name", "Jai");
		obj.put("Department", "IT");
		
		System.out.println(obj.get("Name"));
		System.out.println(obj.get("Department"));

	}

}
