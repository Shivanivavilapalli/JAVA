package polymorphism;
class xyz{
	void max() {
		System.out.println("max method with no parameters");
		
	}
int max(int a) {
	System.out.println("max method with one parameters");
	return a;
		
	}
int max(int a,int b) {
	System.out.println("max method with two parameters");
	int c=a+b;
	return c;
	
}
}
public class methodoverloading {
	public static void main(String[] args) {
		xyz obj=new xyz();
		obj.max();
		System.out.println(obj.max(78));		
		System.out.println(obj.max(10, 20));
	}

}
