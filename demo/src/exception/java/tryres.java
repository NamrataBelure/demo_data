package exception.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryres {
//without resources method
	/*public static void main(String[] args) {
		try {
			String str;
			BufferedReader br= new BufferedReader(new FileReader("d:\\myfile.txt"));
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
		System.out.println("exceptions");
		}
	}*/
//with resources method
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("d:\\myfile.txt"))) {
			String str;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("exception");
		}
	}
}
//NOTE: In the above example,
//we do not need to explicitly call close() method to close BufferedReader stream.