package collectionExample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();
		
		int size1 = obj.size();
		System.out.println("Size of ArrayList is "+size1);
		
		obj.add(10);
		obj.add(20);
		obj.add("Jai");
		
		int size2 = obj.size();
		System.out.println("Size of ArrayList is "+size2);

	}

}
