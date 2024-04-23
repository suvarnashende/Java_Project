package Assignment2;

//2. Write the java program to design method for subtraction of two number which return int result to that method and result should be print into main method.
public class Program1A {

	public int Substraction(int number1, int number2) {
		int number3 = number1 - number2;// storing two numbers in number 3 variable
		return number3;
	}

	public static void main(String[] args) {

		Program1A method1 = new Program1A();
		int sub = method1.Substraction(1000, 654);
		System.out.println("Substraction of two numbers is "+ " = " + sub );
	}

}
