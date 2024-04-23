package Assignment2;

//4. Write the java program to design method for division of two number which return int result to that method and result should be print into main method.
public class Program4 {

	public int Division(int p,int v ) {
        int c = p / v;
		return c;

	}

	public static void main(String[] args) {

		Program4 method3 = new Program4();
		int div = method3.Division(2020, 8);
		System.out.println("Division of two numbers is" + " = " + div);
	}

}
