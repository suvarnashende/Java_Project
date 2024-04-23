
public  class StudenClass {
//1.I have student class now user restricts to create the object of that class from outside, write the code for it.
    String StudentName;
    int rollNo;
    
	private StudenClass(String StudentName,int rollNo) {
        this.StudentName = StudentName;
	this.rollNo =rollNo;
	}

	public static void main(String[] args) {
		StudenClass StudenClass = new StudenClass("Ram",1);
		System.out.println(StudenClass);
		System.out.println("Ram");
		System.out.println(1);
	}
}
