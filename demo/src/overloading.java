import java.math.BigDecimal;

//String concatenation and addition example,
public class overloading {
public static void main(String[] args) {

	System.out.println(1+2+"3");
    System.out.println("1"+2+3);
  
    double a;
    double b=25.4;;
    double c=2.78;
    double d=3.99;
    a=b-c*d;
 /*   //without operator overloading
  BigDecimal b=new BigDecimal(3.99);
  BigDecimal c=new  BigDecimal (25.4);
  BigDecimal d=new  BigDecimal (2.78);
    
   BigDecimal a=b.subtract(c.multiply(d)); 
   */
    System.out.println(a);
}
}
