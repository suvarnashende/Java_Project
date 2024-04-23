package ConditionalStatement;

public class Prgrm3 {
//3.write a program to find out maximum number among three number(if else if ladder statement
	public static void main(String[] args) {

		int a = 999;
		int b = 99;
		int c = 9;
		{
			if (a > b) {
				System.out.println(a + " a is greater than b and c");

			} else if (a > c) {
				System.out.println(a + " a is greater than c");

			} else {

				System.out.println("a is not greater than b nd c");
			}

		}
	}
}
