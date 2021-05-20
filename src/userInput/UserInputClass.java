package userInput;

import java.util.Scanner;

public class UserInputClass {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Input user name");
		String s = obj.nextLine();
		
		System.out.println("User name is "+s);
		
		System.out.println("Input user age");
		
		int age = obj.nextInt();
		
		System.out.println("User age is "+age);

	}

}
