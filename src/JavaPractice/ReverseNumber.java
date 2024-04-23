package JavaPractice;

public class ReverseNumber {

		public int getReverseNumber(int num){

		  int reverse = 0;
		while(num !=0){
		int temp = 0;
		temp = num %10;
		reverse = (reverse*10)+ temp;
		num = num/10;
		}
		return reverse;
		}
		public static void main (String [] args){
		int num =4562;
		System.out.println( "reverse number of = " +num);
		ReverseNumber getreverse = new ReverseNumber();
		int result =getreverse.getReverseNumber(num);
		System.out.println("reverse number is = " + result);


	
	}
}
