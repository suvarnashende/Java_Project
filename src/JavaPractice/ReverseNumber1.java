package JavaPractice;

public class ReverseNumber1 {

	public int gerReverseNumber(int num) {
		int reverse = 0;
		while (num !=0) {
			int temp = 0;
			temp = num%10;
			reverse = (reverse*10)+ temp;
			num = num/10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		int num = 89654;
		System.out.println("reverse number of = " + num);
		ReverseNumber getreverse = new ReverseNumber();
		int result = getreverse.getReverseNumber(num);
		System.out.println("reverse number is = " + result);

	}

}
