package LoopingStatement;

public class Assignment14 {
	// 1.Write a java program to print the all multiplication table from * 2, 3,
	// 4.... to 20.
   public void MultiplicationTable(int no) {
	for(
	int a = 1;a<=10;a++)
	{
		int temp = no;
		for (int b = 1; b <= 10; b++, temp++) {

			if ((temp * a) <= 100) {

				System.out.println(temp * a + "  ");

			}else {
				System.out.println(temp * a + "  ");
			}
			System.out.println( "  ");
		}
		
	}
	}

	public static void main(String[] args) {
		Assignment14 table = new Assignment14();
		table.MultiplicationTable(2);

	}

}
