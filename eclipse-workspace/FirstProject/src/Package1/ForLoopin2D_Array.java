package Package1;

public class ForLoopin2D_Array {

	public static void main(String[] args) {
		int[][] Array = new int[3][4];
		for(int i=0 ; i<3;i++) {
			for (int j=0; j<4; j++) {
				Array[i][j] = (i+1)*(j+1);
			}
		}
		
		for(int[] x: Array) {
			for (int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		boolean t = true;
		first: {
		second: {
		third: {
		System.out.println("Before the break.");
		if(t) break second; // break out of second block
		System.out.println("This won't execute");
		}
		System.out.println("This won't execute");
		}
		System.out.println("This is after second block.");
	
	}
	
}
}