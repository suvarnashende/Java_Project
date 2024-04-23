package Assignment2;

//5. Write the Java Program to calculate total of five subject marks and average of it.
public class Program5 {
	public static void main (String []args) {
  int marathi = 75;
  int hindi  = 69;
  int english = 65;
  int sci = 80;
  int maths = 78;
  int total = marathi+hindi+english+sci+maths;
  float avg = total/5;
     
    	  
      System.out.println("total of all five subjects marks is:" + total );
      System.out.println("average of five subjects is" + " = " + avg);
      
      }
      }