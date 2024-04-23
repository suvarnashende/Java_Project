package LoopingStatement;

public class Tables {

public void multiplication(int no) {
		
		for (int a = 1; a <= 10; a++) {
			int temp = no;
			for (int b = 2; b <= 20; b++,temp++) {
				if((temp*a)<100)
					System.out.print(temp*a + "  ");
				else
					System.out.print(temp*a + "  ");
			}
			
			System.out.println("   ");
			
			
		}

	}

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		table.multiplication(2);
	}
}
	
	