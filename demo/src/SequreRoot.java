import java.util.Scanner;

public class SequreRoot {
      public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		a=sc.nextInt();
		System.out.println("SequreRoot is="+Math.sqrt(a));
		System.out.println("sequre of "+a+"is :"+Math.pow(a, 2));
		System.out.println("Cube of "+a+"is :"+Math.pow(a, 3));
      }
}
