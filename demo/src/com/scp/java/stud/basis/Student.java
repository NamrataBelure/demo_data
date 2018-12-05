package com.scp.java.stud.basis;
public class Student {
	int rollNo;
	String sName;
	String sAdd;
	float sMarks;
	
	public static void main(String[] args)
	{
		{ //main method
			System.out.println("Studen information:");
           Student s1 = new Student();
           s1.instanceMethod();
           staticMetod();
        		   
		}

	}
	    {
			// instances block
			System.out.println("student Instance block: ");

		}

    static
    {    // static block
	   System.out.println("Student static block");

    }
    public void instanceMethod()
    {
		System.out.println("Student rollNo:001");
		System.out.println("Student sName:Namrata");
		System.out.println("Student sAdd:solapur");
		System.out.println("Student Smarks:62");

    }
    public static void staticMetod()
    {
		System.out.println("student static method:");

    }
    public Student()
    {
		System.out.println("Student constructor:");

    }
}

