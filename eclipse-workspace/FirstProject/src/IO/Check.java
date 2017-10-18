package IO;

public class Check {

	public static void main(String[] args) {
		int[] check = {1,2,3,4,5,6,7,8,9};
		int x=0;
		while (x < check.length-1) {
			for (int i=0; i<((check.length)-1);i++ ) {
			int temp=0;
			if(check[i]>check[(i+1)]) {
				temp=check[i];
				check[i]=check[(i+1)];
				check[(i+1)]= temp;
			}
			else {
			}
			}
			for(int j:check) {
				System.out.print(j + " ");
			}
			System.out.println();
			x++;
		}
	}

}
