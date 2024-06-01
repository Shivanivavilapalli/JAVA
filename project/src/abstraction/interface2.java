package abstraction;
interface x{
	abstract void red();
	static void shivani() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	default void name() {
		int a1=100;
		int b1=200;
		int c1=a1+b1;
		System.out.println(c1);
		
	}
	
	
}
interface y{
	final int k=90;
	abstract void blue();
	static void shiva() {
		int a2=103;
		int b2=203;
		int c2=a2+b2;
		System.out.println(c2);
	}
	default int name1() {
		int a3=100;
		int b3=200;
		int c3=a3+b3;
		System.out.println(c3);
		return  c3;
		
	}
}
class z implements x,y{
	public void blue() {
		int a4=1039;
		int b4=2003;
		int c4=a4+b4;
		System.out.println(c4);
		
	}
	public void red() {
		int a5=1037;
		int b5=2037;
		int c5=a5+b5;
		System.out.println(c5);
		
	}
	
}
public class interface2 {
	public static void main(String[] args) {
		z obj=new z();
		obj.red();
		obj.blue();
		obj.name1();
		obj.name();

	}
	
}
