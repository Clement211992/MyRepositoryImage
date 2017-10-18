package Files;

import java.io.File;
import java.util.ArrayList;

public class ReadFileCheck {
	static ArrayList<File> matchingFiles = new ArrayList<File>();
	static String Path= "C:\\Users\\Clement\\Desktop\\Check";
	static String required_Name = "hellooooo.txt";

	public static void main(String[] args) {
		
		ReadFiles obj1 = new ReadFiles();
		obj1.FileList1(Path, matchingFiles, required_Name);
		System.out.println(matchingFiles);
	}
	
}
