package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInput {
	static int c;
	public static void main(String[] args) throws IOException {
		String s= "if a==b then make c=d";
		byte[] b = s.getBytes();
		ByteArrayInputStream in= new ByteArrayInputStream(b);
		PushbackInputStream pi = new PushbackInputStream(in);
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
		for(byte b1:b) {
			System.out.print((char)b1);
		}
		
		
	}

}
