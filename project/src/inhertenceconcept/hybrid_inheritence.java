package inhertenceconcept;
class x {double d=78.900;
	
}
class y extends x{int a=89;}
class z extends y{float b=9.8f;}
class w{String c= "hapy";}
public class hybrid_inheritence {
	public static void main(String[] args) {
		z obj1=new z();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.d);
		w obj2=new w();
		System.out.println(obj2.c);
		x src = new x();
	
	}
	
	}
		
	

	
