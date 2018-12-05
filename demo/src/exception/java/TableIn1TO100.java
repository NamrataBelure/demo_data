package exception.java;

import java.util.Scanner;

public class TableIn1TO100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=0;
		System.out.println("Enter the values:=");
		no=sc.nextInt();
		  
		for (int i = 0; i <10; i++) {
			System.out.println(no+"-"+(i+1)+"= "+(no*(i+1)));


			
			
		}

	}

}
