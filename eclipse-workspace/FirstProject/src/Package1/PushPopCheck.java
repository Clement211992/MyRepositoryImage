package Package1;

public class PushPopCheck {

	public static void main(String[] args) {

		PushPop Object = new PushPop();
		PushPop Object1 = new PushPop();
		//push values onto stack
		for (int i=0; i<10; i++) {
			Object.push(i);
		}

		for (int i=10; i<20; i++) {
			Object1.push(i);
		}
		
		//pop values from stack
		for (int i=0; i<10; i++) {
			System.out.println(Object.pop());
		}
		for (int i=0; i<10; i++) {
			System.out.println(Object1.pop());
		}
	}

}
