package Package1;

public class BoxWeight extends Box{
	int weight;
	
BoxWeight(BoxWeight ob){
	super(ob);
	weight=ob.weight;
}

BoxWeight(int L, int w, int H, int Weight){
	super(L,w,H);
	weight = Weight;
}

BoxWeight(int a, int Weight){
	super(a);
	weight = Weight;
}

BoxWeight(){
	super();
	weight=-1;
}
void Subclass_check(){
	System.out.println("This is in Subclass_Check");
	}
void Subclass_check(String s){
	System.out.println("This is in Subclass_Check and Strign is:"+s);
	}
}
