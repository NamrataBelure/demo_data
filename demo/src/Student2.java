import com.scp.java.stud.basis.Student;

public class Student2 {
	int rollNo;
	String sName;
	String sAdd;
	float sMarks;
	static String sCollName;
	 
	public Student2( int rollNo,String sName,String sAdd)
	{
		System.out.println("inside pconstrucor:");

		this.rollNo= rollNo;
		this.sName=sName;
		this.sAdd=sAdd;
		this.sMarks=sMarks;
		
	}
	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", sName=" + sName + ", sAdd=" + sAdd + ", sMarks=" + sMarks + "]";
	}
   
    
	public static void main(String[] args)
	{
		{ //main method
			System.out.println("Studen information:");
           Student2 s1 = new Student2(01,"Namrata","Solapur");
           System.out.println(s1);
           
           Student2 s2 = new Student2(02,"Akash","pune");
           System.out.println(s2);
        		   
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

	

}

/**
* only if none of constructor is defined inside your class then only java compiler will add default constructor.abstract
* 
* if any of the constructor...No agrs\
* 
* 
* 
* 
**/