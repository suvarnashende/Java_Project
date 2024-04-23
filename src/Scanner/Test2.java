package Scanner;

import java.util.Scanner;

public class Test2 {
public static void Substraction(int a, int b) {
	
	int c = a-b;
	System.out.println(c);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no. :");
		int x = sc.nextInt();
		System.out.print("Enter second no. :");
		int y = sc.nextInt();
		System.out.print("Substraction of two no. is:");
     Test2.Substraction(x, y);
	}

}
