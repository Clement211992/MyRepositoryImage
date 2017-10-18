package Player;

public class ClassMini1 extends ClassMini {
	
	ClassMini1(String a){
		super();
		
	}

	public static void main(String[] args) {
		
		ClassMini obj = new ClassMini("leo");
		ClassMini1 obj1 = new ClassMini1("Leo");
		System.out.println(obj.getname());
		System.out.println(obj1.getname());
	}

}
