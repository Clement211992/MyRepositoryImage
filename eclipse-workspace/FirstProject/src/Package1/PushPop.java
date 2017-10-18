package Package1;

public class PushPop {

	int[] Array = new int[10];
	int count;
	
	PushPop() {
		count = -1;
	}
	
	void push(int num) {
		if (count==9) {
			System.out.println("Array is full(count 9)");
		}
		else {
			Array[++count]=num;
		}
	}
	
	int pop() {
		if (count <0) {
			System.out.println("Array is empty");
			return 0;
		}
		else{
			return Array[count--];
		}
	}
}
