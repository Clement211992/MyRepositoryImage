package Package1;

//Super Class of BoxWeight
public class Box {

	private int Length;
	private int width;
	private int Height;
	int vol;
	
	Box(){
		Length = -1;
		width =-1;
		Height = -1;
	}
	
	Box(Box obj){
		Length = obj.Length;
		width =obj.width;
		Height = obj.Height;
	}
	
	Box(int L, int w, int H){
		Length = L;
		width =w;
		Height = H;
	}
	
	Box (int a){
		Length=width=Height=a;
	}
	
	int volume() {
		vol= Length*width*Height;
		return vol;
	}
	
	void Subclass_check(){
		System.out.println("This is in Superclass_Check");
		}
	
}
