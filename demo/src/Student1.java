
  public class Student1
   {
	  int id;
	  String name;
	  String city;
	public Student1 (int id,String name) 
	  {
		this.id=id;
		this.name=name;
		//current class instance variable
	  }
	
	   Student1(int id,String name,String city) 
		  {
			this(id,name);   //call current class constructor;
			this.city=city;
		  }
	   void display()
	   {
		   System.out.println(id+" "+name+" "+city);
	   }
		
	public static void main(String [] args)
	{
		Student1 s1=new Student1(07,"anu" );
		Student1 s2=new Student1(05,"sonu","solapur");
		s1.display();
		s2.display();
	}

}