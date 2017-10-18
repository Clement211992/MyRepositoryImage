package Package1;

public class VaTest {

	static void Va_test(int...x) {
		System.out.println("Length of the array is :"+ x.length);
		
		for(int y:x) {
			System.out.println("Value :" + y);
		}
	}
}
