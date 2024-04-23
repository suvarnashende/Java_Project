package LoopingStatement;

public class Asngmnt4 {

	public static void main(String[] args) {
		// write a program to print all even number from 50 to 75.

		for (int i = 50; i <= 75; i++) {
			if (i % 2 == 0) {

				System.out.println(i);

			}
		}
		System.out.println("  ");

		{

			for (int k = 10; k <= 100; k++) {

				if (k % 2 == 0) {

					System.out.println(k);

				}
			}
		}
	}
}