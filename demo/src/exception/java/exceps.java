package exception.java;

public class exceps {

	public static void main(String[] args) {
try {
	   int arr[]={5,0,1,2};
	    try {
		    int x=arr[3]/arr[1];
			} 
	    catch (ArithmeticException e) {
		   System.out.println("divided by 0");
	    }
 arr[4]=3;
  }
catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("array out of bound Exception");
}

	}

}
