package containment2;

import java.util.Scanner;

public class Testhuman {
	static Scanner sc=new Scanner(System.in);
	public static void heartDetails(Heart h1) {
		System.out.println("enter heart weight");
		h1.setweight(sc.nextInt());
		
		System.out.println("enter heart pulse");
		h1.setweight(sc.nextInt());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heart h1=new Heart();
		heartDetails(h1);
		Heart  h2=new Heart();
		heartDetails(h2);
		
		System.out.println(h1);
		System.out.println("===============================================50"
				+ "");
		System.out.println(h2);
		
		
		

	}
		
		
	

}

