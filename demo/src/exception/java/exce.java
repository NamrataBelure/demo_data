package exception.java;

public class exce {

	public static void main(String[] args) {
	try {
		int arr[]={1,2};
		arr[2]=3/0;
	} catch (ArithmeticException e) {
		System.out.println("Divided by 0");
	}
     catch(ArrayIndexOutOfBoundsException ea){
    	System.out.println("Array index is out of bound..."); 
     }
	catch(Exception e){
	System.out.println("generic exception");	
	}
	}

}
