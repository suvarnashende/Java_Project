package LoopingStatement;

//Program-4 Design method int factorial(int no) which returns int value to that method.print the results into main
//method(Example enter no as 5, factorial means 5*4*3*2*1then output is 120)


public class Asgnmnt5 {
public int factorial () {
	
	int a = 5*4*3;
	int b = 2*1;
	 
	 return a*b;
	
}
	public static void main(String[] args) {
		Asgnmnt5 object = new Asgnmnt5();
		object.factorial();
		System.out.println(object.factorial());
	}

}
