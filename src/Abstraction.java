
public class Abstraction implements Math {
//class implements interface
	//to implement interface inside class we have to override all abstact methods of interface and give implementation in the class
	public int Substraction(int x , int y) {
	return x-y;
	}
	public int Division(int a, int b ) {
	return a/b;
	}
	
	public static void main(String[] args) {
		Abstraction implementation = new Abstraction();
		System.out.println(implementation.Substraction(x, y));
		System.out.println(implementation.Division(a, b));
	}

}
