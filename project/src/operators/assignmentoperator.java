package operators;

import java.util.Scanner;

public class assignmentoperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println(a=b);
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		
	}

}
