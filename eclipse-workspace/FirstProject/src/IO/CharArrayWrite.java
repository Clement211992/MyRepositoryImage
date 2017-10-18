package IO;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class CharArrayWrite {

	public static void main(String[] args) throws IOException {
		String s= "abcdefghijklmnoprstuvczxyz";
		
		char [] c= new char[s.length()];
		s.getChars(0, s.length(), c, 0);

		CharArrayWriter f = new CharArrayWriter();
		
		File file = new File("C:\\Users\\Clement\\Desktop\\writerfromchar.txt");
//		Scanner scan = new Scanner(file);
		
		FileWriter fo = new FileWriter(file);
		f.writeTo(fo);
		System.out.println("from fo:"+fo.toString());
		f.flush();
		f.write(c);
		System.out.println(f.toString());
		//System.out.write(5);
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(s);arr.add(" ");arr.add("....");
		
		System.out.println(arr.get(0));
		
		
	}

}
