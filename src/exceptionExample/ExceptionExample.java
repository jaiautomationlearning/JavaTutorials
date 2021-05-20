package exceptionExample;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		int ind;
		
		try {
			
			ind = a[5];
			
			System.out.println("Index Value is "+ind);
			
		} catch (ArithmeticException e)  {

			System.out.println("Arithmetic Exception Occured");
		}catch (ArrayIndexOutOfBoundsException e)  {

			System.out.println("ArrayIndexOutOfBound Exception Occured");
		}
		
		

	}

}
