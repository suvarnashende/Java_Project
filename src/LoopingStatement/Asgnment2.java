package LoopingStatement;

public class Asgnment2 {

	public void multiplication(int no) {
		// 2. Design method void multiplication (int no) and print the multiplication
		// table. ( Example enter the no=5 then output like
		// 5*1=5.......5*10=50)

		for(int i = 1; i <=10; i++) {
			
			System.out.println(no + "*" + i + "=" + (no * i));
			
			
		}

		}

	public static void main(String[] args) {

		Asgnment2 multi = new Asgnment2();
		multi.multiplication(5);

	}

}
