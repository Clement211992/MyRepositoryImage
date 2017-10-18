package SampleChecks;

public class StringandInt {

	public static void main(String[] args) {

		char s[] = {65};
		String s1 = new String(s);
		int i = 65;
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(i);
		String st= "four: " + (2 + 2);
		
		System.out.println(st);
		
		StringandInt obj = new StringandInt();
		
		
		
		System.out.println(obj);
		
	}
	public String toString() {
		return "This is the object";
	}
}
