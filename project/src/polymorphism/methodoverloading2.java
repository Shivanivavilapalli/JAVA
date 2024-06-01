package polymorphism;
class den{
	void fact(int a) {
		System.out.println("int type parameters");
		
	}
void fact(float b) {
	System.out.println("float type parameters");
	}
void fact(double c) {
	System.out.println("double type parameters");
}
}

public class methodoverloading2 {
	public static void main(String[] args) {
		den dd=new den();
		dd.fact(10.6);
		dd.fact(3.4);
		dd.fact(56);
		
	}

}
