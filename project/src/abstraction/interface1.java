package abstraction;
interface shivani{
	String x="shivani";
	abstract void girl();
	int a=20;
	static void shivani(){
		System.out.println("shivani is ece");
		
		
	}
}
interface renuka{
	String y="renuka";
	abstract void girl2();
	int b=40;
	static void renuka() {
		System.out.println("renuka is cse");
	}
}
class ravi implements shivani{
	public void girl() {
		System.out.println("shivani is girl");
	}
}
class ram implements renuka{
	public void girl2() {
		System.out.println("renuka is second girl");
	}
	
}
public class interface1 {
	public static void main(String[] args) {
		ram rr=new ram();
		System.out.println(rr.y);
		System.out.println(rr.b);
		
		
	}

}
