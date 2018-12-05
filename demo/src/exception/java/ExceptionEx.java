package exception.java;

public class ExceptionEx {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=10;
			b=0;
			c=a/b;
			System.out.println("this line will not be excuted...");
		} 
		catch (ArithmeticException e) {
			System.out.println("Divided by 0");
		}
    System.out.println("after exception will handle...");
	}

}
