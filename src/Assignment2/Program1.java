package Assignment2;

//1. Write the java program to design method for addition of two number which return int result to that method and result should be print into main method.
public class Program1 {
	public  int getAddition(int a , int b) {//int a = 99,int b = 999;
	
    int c = a + b;//storing addition into into c variable
	return c;
	}

	public static void main(String[] args) {

		Program1 addition = new Program1();
		//creating object of class
		int add = addition.getAddition(99, 999);
		//calling method
	System.out.println("Addition of two numbers " + " = "  + add );
		
		
	}

}
