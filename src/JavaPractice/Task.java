package JavaPractice;

public class Task {

	public static void main(String[] args) {

		try {
			int a= 10/0;

		} catch(ArithmeticException e){
			System.out.println("the duplicate character of the string is "); 
		
		}finally {
			System.out.println(" " );
		}
	}
}