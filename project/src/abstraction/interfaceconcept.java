package abstraction;
interface shape{
	public final int x=23;
	final float d=98.78f;
	static double t=34.56f; 
	abstract void circle();
	static void rectangle() {
		System.out.println("area of rectangle");
//		interface definitely have abstract static default
	}
	default void triangle() {
		System.out.println("area of triangle");
	}
}
class shape1 implements shape{
	 public void circle() {
		System.out.println("area of circle");
		
		
	}
	
}

public class interfaceconcept {
	public static void main(String[] args) {
		
	
	shape1 ss=new shape1();
	ss.circle();
	ss.triangle();
	shape.rectangle();
	System.out.println(shape.x);
	System.out.println(shape.d);
	System.out.println(shape.t);
	}

}
