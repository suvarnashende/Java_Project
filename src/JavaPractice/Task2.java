package JavaPractice;

public class Task2 {

	public static void main(String[] args) {
		try {
			int a = 5/0;
			
		}catch(Exception e) {
			System.out.println("exception handled");
		}finally {
			System.out.println("exception");
		}
	}

}
