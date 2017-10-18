package Package1;

import java.util.Random;

public class BoxWeightDemo {

	public static void main(String[] args) {
		//BoxWeight Object1 = new BoxWeight();
		//BoxWeight Object2 = new BoxWeight(5,6,7,8);
		//BoxWeight Object3 = new BoxWeight(5,6);
		//BoxWeight Object4 = new BoxWeight(Object2);
		
		//BoxWeight checkObj = new BoxWeight();
		Box x = new BoxWeight();
		//,y;
		//x=checkObj;
		//y=new Box();
		
		x.Subclass_check();
	//	x.Subclass_check("hi");
		//y.Subclass_check();
		
		//System.out.println("Object1-->Volueme:"+ Object1.volume() + " Weight:"+ Object1.weight);
		//System.out.println("Object2-->Volueme:"+ Object2.volume() + " Weight:"+ Object2.weight);
		//System.out.println("Object3-->Volueme:"+ Object3.volume() + " Weight:"+ Object3.weight);
		//System.out.println("Object4-->Volueme:"+ Object4.volume() + " Weight:"+ Object4.weight);
		
	
		Random r = new Random();
		System.out.println(r.nextDouble());
		
	}

}
