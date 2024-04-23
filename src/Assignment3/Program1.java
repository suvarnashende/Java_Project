package Assignment3;
// 1. Write the Java Program in which declares the different primitives data types.
public class Program1 {
    public void DifferentPrimitive() {
	
	int a = 10;
	int b = 20;
	int total = a+b;
	float avg = total/4*10;
	
	String name = "ram" ;
	
	System.out.println("int datatype shows avrg with float datatype" + " = " + avg);
	System.out.println("string datatype shows name" + " = " + name );
    }
	public static void main (String[]args) {
		
		Program1 datatypes = new Program1();
		
		datatypes.DifferentPrimitive();
	
	
	
	
}
}
