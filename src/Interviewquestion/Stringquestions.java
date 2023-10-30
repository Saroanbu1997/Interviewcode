package Interviewquestion;

import java.util.Scanner;

public class Stringquestions {

	public static void main(String[] args) {

		/*3.) Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
Eg:
WordTwo("Hi", "Bye") → "HiByeByeHi"
WordTwo("Yo", "Alice") → "YoAliceAliceYo"
WordTwo("What", "Up") → "WhatUpUpWhat" */
		
		
		String a= "Hi";
		String b="Bye";
		System.out.println(a+b+b+a);
		
		String s="Tom";
		System.out.println("Hello "+s+ "!");
		
		Scanner number = new Scanner(System.in);
		System.out.println("enter the values");
		int n=number.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
	}

}
