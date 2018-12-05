package exception.java;

public class throwEx {
  static void avg(){
	try {
		throw new ArithmeticException("demo");
	} catch (ArithmeticException e) {
	System.out.println("exception caught...");
	}
}
	public static void main(String[] args) {
		avg();
	}

}
