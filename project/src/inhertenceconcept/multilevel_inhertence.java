package inhertenceconcept;
class a{int f = 23;}
class b extends a{int e =20;}
class c extends b{int d=1;}
public class multilevel_inhertence {
	public static void main(String[] args) {
		c obj = new c();
		System.out.println(obj.e);
		System.out.println(obj.d);
		System.out.println(obj.f);
		a j = new a();
		System.out.println();
	}

}
