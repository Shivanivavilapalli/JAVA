package inhertenceconcept;
class ani{
	int a=30;
	void rani() {
		System.out.println("parent class");
			
		}
	}
	class k extends ani{
		int b=45;
		void kite() {
			System.out.println("child class");
			
		}
	}


public class single_inhertence {
	public static void main(String[] args) {
		k obj = new k();
		System.out.println(obj.a);
		
		obj.rani();
	}

}
