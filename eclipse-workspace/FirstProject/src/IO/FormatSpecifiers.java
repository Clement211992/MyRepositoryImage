package IO;

public class FormatSpecifiers {

	public static void main(String[] args) {
		
		String src ="vmldsvl";
		
		
		System.out.printf("%d", 3);
		System.out.println();
		System.out.printf("%05d", 3);
		System.out.println();
		System.out.printf("%(d", -3);
		System.out.println();
		System.out.printf("%+d", 3);
		System.out.println();
		System.out.printf("%5.7f", 5455555153.0);      //%5.7f??
		System.out.println();
		System.out.printf("%,f", 645151513.5166);
		System.out.println();
		System.out.printf("%,(f", -15151.616);
		System.out.println();
		System.out.printf("%+f", 6656.6262);
		
	}

}
