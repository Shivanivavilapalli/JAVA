package inhertenceconcept;
class animal{
	void sleep() {
		System.out.println("animal sleep");
	}
}
class dog extends animal{
	void bark() {
		System.out.println("dog bow bow");
	}
}
class cat extends animal{
	void meow() {
		System.out.println("cat meow");
	}
}
public class heirachal_inhertennce {
	public static void main(String[] args) {
		cat b=new cat();
		b.meow();
		b.sleep();
		
	}

}
