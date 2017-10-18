package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStraem {

	public static void main(String[] args) throws IOException {
		String source = "Experienced Quality Analyst with a demonstrated history of working in the financial services industry";
		byte[] b = source.getBytes();
		File fil = new File("C:\\Users\\Clement\\Desktop\\Resorts123.txt");
		FileOutputStream fo = new FileOutputStream(fil);
		System.out.println("Total in b: "+ b.length);
		fo.write(b, b.length - b.length/3, b.length/3);
		
		FileInputStream fin = new FileInputStream(fil);
		
		System.out.println("Bytes in file: "+fin.available());
		fo.close();fin.close();
	}
}
