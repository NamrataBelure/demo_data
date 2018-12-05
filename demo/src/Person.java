public class Person {
	long aadharId;
	String fName;
	String add;
	static String state;
    {
		// instances block
		System.out.println("person Instance block: ");
	}
	public Person(long adh, String fName, String add) {
		this.aadharId = adh;
		this.fName = fName;
		this.add = add;
	}
   public void displayPersonInfo() {
		System.out.println("adharId:" + aadharId);
		System.out.println("frist-Name:" + fName);
		System.out.println("adderess:" + add);
		System.out.println("state:" + state);
	}
   static public void showPersonInfo(Person p) {
		System.out.println("adharId:" + p.aadharId);
		System.out.println("frist-Name:" + p.fName);
		System.out.println("adderess:" + p.add);
		System.out.println("state:" + state);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(121, "amit", "pune");
		Person p2 = new Person(222, "jhon", "mumbai");
		p1.displayPersonInfo();//p1--load--execution--outside the method. 
		p2.displayPersonInfo();
		
		showPersonInfo(p1);
	}
   static { // static block
		state = "MH";
		System.out.println("person static block");

	}
}