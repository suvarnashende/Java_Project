
public interface Math {
//  interface is a way to achieve abstraction where we can achieve it 100% by using public abstract method
	public static final int x = 200;
	public static final int y = 100;
	
	 int Substraction(int x, int y );//this method have no method body{} it is interface so this is public abstract method 
	                                                // we cant create object in interface
	// public abstract int Substraction (int x ,int y);OR
	 //public int Substraction (int x ,int y); we can write method like this as well
	
	public static final int a = 2024;
	public static final int b = 4;
	
	int Division(int a, int b);
}
