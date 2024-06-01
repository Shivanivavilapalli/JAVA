package abstraction;
 abstract class A{
	int a = 90;
	abstract void fun();
	static void ben() {
		System.out.println("ben method");
	}
	void fact() {
		System.out.println("fact method");
	}
	A(){
		System.out.println("constructor");
	}
	
}
class B extends A{
	 void fun() {
		 System.out.println("fun method");
	 }
}
public class abstractconcept {
	 public static void main(String[] args) {
		B obj=new B();
		System.out.println(obj.a);
obj.fun();
A.ben();
obj.fact();

	 }

}
