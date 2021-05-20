package collectionExample;

import java.util.ArrayList;

public class ArrayListWithGenericxExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		int size1 = obj.size();
		System.out.println("Size of ArrayList is "+size1);
		
		System.out.println(obj.add(10));
		System.out.println(obj.add(20));
		System.out.println(obj.add(30));
		System.out.println(obj.add(10));
		System.out.println(obj.add(20));
		System.out.println(obj.add(30));
		
		for(int i =0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		
		int size2 = obj.size();
		System.out.println("Size of ArrayList is "+size2);

	}

}
