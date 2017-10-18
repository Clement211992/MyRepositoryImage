package Package1;

public class MyFirstClass {
	static int i=0;
	public MyFirstClass() {

		System.out.println("Object count is :"+ i++);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Java");
		MyFirstClass object = new MyFirstClass();
		MyFirstClass object1 = new MyFirstClass();
	}
	
	
}
