package Program;

public class Demo {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		System.out.println("a = " + a + "  and b = "  + b);
		//swaping techniques
		 a = (a+b);  //25
		 b = a - b;  //10
		 a = a-b;    //15
		 
		 System.out.println("after first swap a = "+ a + " and b= " + b);
		 
		 int c = 100;
	     int d =200;
	     System.out.println("c = " + c + " and d = " + d);
		 //swaping second.
		  int temp = c;
		  c=d;
		  d=temp;
		  
		  System.out.println("after second swap c = "+ c + " and d= " + d);
		  
		int e = 3, f = 9;
		System.out.println("e = " + e + " and f = " + f);
		  //swaping third.
		e = (e*f); //27
		f = e/f; //9
		e = e/f;
		  System.out.println("after third swap e =" + e + " and f = " +f);
	}
}
