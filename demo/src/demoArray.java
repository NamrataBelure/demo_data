
public class demoArray {
public static void main(String[] args) {
	/*long l=10;
	int []a=new int[l];
	System.out.println(a.length);
	*/
	//any data types are valid but stored value size should be int..

	double []d=new double[10];
	System.out.println(d.length);
	
	
	//not valid size is always allowd in int..
	/*double []g=new double[10.5];
	System.out.println(d.length);*/
	
	double []e=new double[268435456];
	System.out.println("hello listen dont sleep");
	//268435456*8byte is called out of bound error

    double []f=new double[2645879];
	System.out.println("Hello listen be carefully");
	
	//run properly..
	int[] x=new int[10];
	System.out.println(x.length);
	
	//o is valid
	int[] y=new int[0];
	System.out.println(y.length);
	
	//error java.lang.NegativeArraySizeException
	/*int[] z=new int[-5];
	System.out.println(z.length);*/
}
}
