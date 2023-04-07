package javaprogramming;

import java.util.Scanner;

public class Sumodddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int n = 2345;
	  int sum=0,rem;
	  while(n>0) {
		  rem=n%10;
		  if(rem%2==1) {
			  sum=sum+rem;
			  
		  }
		  n=n/10;
	  }
	  System.out.print("sumof odd digit" +n + "is " +sum );
		

	}

}
