package IO;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.util.Scanner;

public class PushBackInput2 {
	static int c;
	public static void main(String[] args) throws IOException {
		String s= "if a==b then make c=d";
		char[] b = new char[s.length()];
		s.getChars(0, s.length(), b, 0);
		
		CharArrayReader in= new CharArrayReader(b);
		PushbackReader pi = new PushbackReader(in);
		while ((c=pi.read())!= -1) {
			switch (c){
			case '=':
				if((c=pi.read())=='=') {
					System.out.print(".eq");
				}
				else{
					System.out.print("<-");	
					pi.unread(c);
				}
				break;
			default:
				System.out.print((char)c);
			}
			}
		System.out.println();
		for(char b1:b) {
			System.out.print(b1);
		}
		

	}

}
