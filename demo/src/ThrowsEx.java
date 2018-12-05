import java.io.IOException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ThrowsEx {
void m() throws IOException{
	throw new IOException("devices Error");
}
void n() throws IOException{
	m();
	
}
void p(){
	try {
		n();
	} catch (IOException e) {
	System.out.println("");
		e.printStackTrace();
	}
	
}
public static void main(){
	ThrowsEx te=new ThrowsEx();
	te.p();
	System.out.println("Normal Flow...");
	
}
}
