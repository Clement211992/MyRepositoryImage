package Files;
import java.io.File;
import java.util.ArrayList;
public class ReadFiles {
/*	
	public static void mainkn() {
		File file = new File("C:\\Users\\Clement\\Desktop\\Check");
		String[] s = file.list();
		
		System.out.println("Total files:"+s.length);
		
		for(String s1:s) {
		System.out.println(s1);
		}

	}
*/
	
	
	public void FileList1(String Directory, ArrayList<File> FileList, String required_Name) {
		
		File Directry = new File(Directory);
		File[] Files = Directry.listFiles();
		
		for(File f1: Files) {
			if(f1.isFile()) {
				if((f1.getName()).equals(required_Name)) {
					FileList.add(f1);
				}
			}
			
			else if(f1.isDirectory()) {
				FileList1(f1.getAbsolutePath(), FileList, required_Name);
			}
		}
		
		
	}

}
