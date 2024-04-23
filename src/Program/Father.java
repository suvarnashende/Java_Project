package Program;

public class Father extends GrandFather {
	public String DNA = "abcd";

	public void FatherDNA() {
		System.out.println("Father DNA = " + DNA);
	}
		public static void main(String[]args) {
			Father inherit = new Father();
			inherit.FatherDNA();
			inherit.GrandFatherDNA();
			System.out.println(inherit.DNA);
			
		}
	}

