package Player;

import java.io.*;
import java.util.Scanner;

public class Console_IO {

	public static void main(String[] args) throws IOException {
		String s;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scn = new Scanner(System.in);
		do {
			 s= br.readLine();
			 System.out.println(s);
		}
		while(s!="File");
		System.out.println("End of File reached");
	}

}
