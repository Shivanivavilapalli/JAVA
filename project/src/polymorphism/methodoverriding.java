package polymorphism;
class shapes{  
	void draw() {
		System.out.println("shapes class draw method");
	}
	
}
class pentogen extends shapes{
	void draw() {
		System.out.println("pentagon class draw method");
	}
	
}
class hexagon extends shapes{
	void draw() {
		System.out.println("hexagon class draw method");
	}
	
}
class octagon extends shapes{
	void draw() {
		System.out.println("octagon class draw method");
	}
	
}

public class methodoverriding {
	public static void main(String[] args) {
//		shapes obj =new pentogen();
//		obj.draw();
//		shapes obj2=new hexagon();
//		obj2.draw();
//		shapes obj3=new octagon();
//		obj3.draw();
//		obj.draw();
		shapes obj;
		obj=new pentogen();
		obj.draw();
		obj=new hexagon();
		obj.draw();
		obj=new octagon();
		obj.draw();
		
		
	}

}
