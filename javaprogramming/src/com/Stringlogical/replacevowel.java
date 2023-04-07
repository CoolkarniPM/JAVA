package com.Stringlogical;

import java.util.Scanner;

public class replacevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i]='$';
			}
			for(int i1=0;i<ch.length;i++) {
				System.out.println(ch[i]);
			}
		}
	
	}

}
