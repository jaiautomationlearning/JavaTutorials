package collectionExample;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> obj = new HashSet<Integer>();
		
		int size1 = obj.size();
		System.out.println("Size of HashSet is "+size1);
		
		System.out.println(obj.add(10));
		System.out.println(obj.add(20));
		System.out.println(obj.add(30));
		System.out.println(obj.add(10));
		System.out.println(obj.add(20));
		System.out.println(obj.add(30));
		
		for(int number : obj) {
			System.out.println(number);
		}
		
		int size2 = obj.size();
		System.out.println("Size of HashSet is "+size2);

	}

}
