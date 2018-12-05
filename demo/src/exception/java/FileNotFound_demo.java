package exception.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound_demo {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("E:\\file.txt");
       FileReader fr=new FileReader(f);
	}

}
