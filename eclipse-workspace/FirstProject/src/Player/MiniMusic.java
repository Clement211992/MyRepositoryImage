package Player;

import javax.sound.midi.*;

public class MiniMusic {
	
	public static void main(String[] args) {

int[] arr = new int[2];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;
for(int j =0;j<arr.length;j++) {
	
	for(int i=0;i<arr.length;i++) 
		if(arr[j]<arr[i]) {
			int tem1 = arr[i];
			int tem2 = arr[j];
			arr[i] = tem2;
			arr[j] = tem1;
			
		}
	}

for(int k=0;k<arr.length;k++) {
	System.out.println(arr[k]);
}

}


}

