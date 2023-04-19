package com.logicalprogramming;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a no:");
		int no=sc.nextInt();
		//int no=133232;
		int count =0,sum=0;
		while(no>0) {
			sum=sum+no%10;
			
			no/=10;
			count++;
			
		}
		System.out.println(sum);

	}

}
