package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteOut {

	public static void main(String[] args) throws IOException {
		String s = "This is an array of String";
		byte[] b = s.getBytes();
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		f.write(b);
		System.out.println(f.toString());
		FileOutputStream o = new  FileOutputStream("C:\\Users\\Clement\\Desktop\\Resorts123.txt");
		f.writeTo(o);
		
		System.out.println("after write to o");
		System.out.println(f.toString());
		
		f.reset();
	}

}
