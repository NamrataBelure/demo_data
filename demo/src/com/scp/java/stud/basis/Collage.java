package com.scp.java.stud.basis;

public class Collage {
    int rollNo;
    String name;
    String cAdd;
    
	public static void main(String[] args) {
	
		System.out.println("Collage Information:");
		Collage c1 =new Collage();
		c1.instancesMethod();
		StaticMethod();
	}
	{
		System.out.println("Collage Instances Method:");
	}
	static
	{
		System.out.println("static Method");
	}
	public void instancesMethod()
	{
		System.out.println("Collage RollNo:101");
		System.out.println("student Name:Soun");
		System.out.println("Student Adderess:solapur");
	}
	public static void StaticMethod()
	{
		System.out.println("Static Method");
	}
	
	public Collage()
	{
		System.out.println("Student constructor:");
	}
}
