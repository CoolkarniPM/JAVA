package Stringlogic;

import java.util.Scanner;

public class Frequencyofchar {
	public static void countfrequency(String s) {
		s=s.toLowerCase();
		char ch[] =s.toCharArray();
		//int count;
		
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			if(ch[i]=='\0')
				
				continue;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			
			System.out.println(ch[i]+ " :"+count);
			
		}
	}
		
	public static void main(String[] args) {
		
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter a string");
	     //String str=sc.next();
		String str=new String("prasanna kulkarni");
	     countfrequency(str);
	     

	}

}
