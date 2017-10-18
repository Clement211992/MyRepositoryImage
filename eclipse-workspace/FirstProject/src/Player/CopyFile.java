package Player;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException {

 
		FileInputStream fin = new FileInputStream("C:\\Users\\Clement\\Documents\\java_interview_questions.pdf");
		int s=fin.read();
		while (s!=-1) {
			System.out.print((char)s);
			s= fin.read();
		}
		System.out.println(s);
		fin.close();
		/*
		 * 	FileOutputStream fout = new FileOutputStream("C:\\Users\\Clement\\Desktop\\Resorts_Copy.doc");
		int c;
		do {
			c = fin.read();
			if(c != -1) {
			fout.write(c);
			}
		}
		while (c != -1);
		
		fin.close();
		fout.close();
		*/
		/*
		File file = new File("C:\\Users\\Clement\\Documents\\");
		String[] s = file.list();
		for(String s1:s) {
			System.out.println(s1);
		}
		*/
		//FileOutputStream fout = new FileOutputStream("C:\\Users\\Clement\\Desktop\\Resorts_Copy.txt");
		File fil = new File("C:\\Users\\Clement\\Desktop\\Resorts.txt");
		
		FileWriter wr = new FileWriter("C:\\Users\\Clement\\Desktop\\Resorts_Copy.txt");
		FileReader re =  new FileReader("C:\\Users\\Clement\\Desktop\\Resorts.txt");
		wr.write("hello there! \r\nhow are you ");
		wr.write("\r\n");
		wr.write("Bye");/*
		int i = re.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=re.read();
		
	}*/
	System.out.println(fil.length());
	
	char[] ch = new char[(int) fil.length()];
	System.out.println(re.read(ch));
	
	for (char ch1:ch) {
		System.out.print(ch1);
	}
	
		re.close();
		wr.flush();
		wr.close();
		
	}

}
