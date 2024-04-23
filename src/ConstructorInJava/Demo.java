package ConstructorInJava;

public class Demo {
          String State;
          String City;
          int pincode;
          public Demo(String State,String City,int pincode) {
          this.State = State;
          this.City = City;
          this.pincode = pincode;
}
	public static void main(String[] args) {
		Demo demo = new Demo("Maharashtra", "Pune",413610);
           System.out.println(demo);
           System.out.println("Maharashtra");
           System.out.println("Pune");
           System.out.println(413610);
           
	}

}
