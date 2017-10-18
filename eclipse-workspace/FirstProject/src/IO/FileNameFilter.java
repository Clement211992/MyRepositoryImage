package IO;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter {

	static String fileversion = "doc";
	public static void main(String[] args) {

		String dir = "C:\\Users\\Clement\\Desktop";
		File f= new File (dir);
		FilenameFilter filt = new OnlyExt(fileversion);
		
		String[] s = f.list(filt);
		
		for (String s1:s) {
			System.out.println(s1);
		}
	}

}
