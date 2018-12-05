package com.scp.java.stud.basis;
import java.util.Scanner;
import java.io.*;

public class Fact {
 public static void main(String[] args) {
	System.out.println("Enter to interger to calculate factorial");
	Scanner sc =new Scanner(System.in);
	int n= sc.nextInt();
	if(n<0)
		System.out.println("number should be non-negative");
	else
		for (int i = 0; i <=n; i++) 
		{
			int fact=1;
			
		for (int c= 1; c <= i; c++) {
		
		fact = fact*c;	
		}
	System.out.println("Factorial of"+i+"is="+fact);
  }
 }
}
 