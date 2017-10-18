package Player;

import java.io.PrintWriter;

public class Writer {

	public static void main(String[] args) {

		System.out.write(56464);
		System.out.write('\n');
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("hello");
	}

}
