package Assignment2;

//3. Write the java program to design method for multiplication of two number which return int result to that method and result should be print into main method.
public class Program3 {
	public int Multiplication(int s, int v) {
		int b = s * v;
		return b;
	}

	public static void main(String[] args) {
		Program3 method2 = new Program3();
		int mult = method2.Multiplication(27, 27);
		System.out.println("Multiplication of two numbers is" + " = " + mult );

	}

}
