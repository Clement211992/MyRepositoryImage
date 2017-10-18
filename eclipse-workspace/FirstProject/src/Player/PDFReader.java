package Player;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFReader {

	public static void main(String[] args) throws FileNotFoundException {

		File fil= new File("C:\\Users\\Clement\\Documents\\java_interview_questions.pdf");
		FileInputStream fis = new FileInputStream(fil);
		BufferedInputStream buf = new BufferedInputStream(fis);
		
		
		try{
			PDDocument document = null; 
			document = PDDocument.load(fil);
			document.getClass();
			if( !document.isEncrypted() ){
			    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
			    stripper.setSortByPosition( true );
			    PDFTextStripper Tstripper = new PDFTextStripper();
			    String st = Tstripper.getText(document);
			    //System.out.println("Text:"+st);
			    String arg = "This is Web Archive File and used to store XML, java classes, and JavaServer pages. which is used";
			    String arg1 = "This is Web Archive File and used to store XML, java classes, and JavaServer pages. which is used";
			    String check = Tstripper.getLineSeparator();
			    System.out.println(check);
			    
			    if(st.contains(arg1)) {
			    	System.out.println("its available");
			    }
			    else {
			    	System.out.println("Not available");
			    }
			}
			}catch(Exception e){
			    e.printStackTrace();
			}
	}

}
