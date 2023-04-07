package com.arrayoperation;

import java.util.Scanner;

public class printprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the element");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			boolean isprime=true;
			for(int j=2;j<arr[i];j++) {
				if(arr[i]%j==0) {
					isprime=false;
					break;
				}
			}
			System.out.println(arr[i] +" are the prime no in array");
		}
		
	}

}
