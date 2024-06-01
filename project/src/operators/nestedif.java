package operators;

import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter your height:");
		float height = src.nextFloat();
		System.out.println("enter your weight:");
		float weight = src.nextFloat();
		System.out.println("enter your age:");
		int age=src.nextInt();
		if(height>=5.5 && height<=6.3) {
			if(weight>=55 && weight<=65) {
				if(age>17 && age<=30) {
					System.out.println("your eligble");}}}
					else {
						if(height>=5.5) {
							System.out.println("you should increse ur height");
						}
						if(height<=6.3) {
							System.out.println("you should decrese ur height");
						}
						if(weight<55) {
							System.out.println("increse weight");
						}
						if(weight>65) {
							System.out.println("decrese weight");
							
						}
						if(age<17) {
							System.out.println("wait still you had time to participate");
						}
						if(age>30) {
							System.out.println("your not eligble to participate");
						}
						
						
					}
				}
			}
		
	



