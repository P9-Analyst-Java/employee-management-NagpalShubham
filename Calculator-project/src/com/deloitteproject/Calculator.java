

package com.deloitteproject;

import java.util.HashSet;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<>();
		h.add("+");
		h.add("-");
		h.add("*");
		h.add("/");
		h.add("|");
		h.add("&");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		 double FirstNum=sc.nextInt();
		System.out.println("Enter the second number");
		double SecondNum=sc.nextInt();
		System.out.println("Enter the operator");
		String s=sc.next();
		if(h.contains(s)==false)
			System.out.println("Wrong operator entered");
		sc.close();
		switch(s)
		{
		case "+":System.out.println(FirstNum+SecondNum);
		         break;
		case "-":System.out.println(FirstNum-SecondNum);
		         break;
		case "*": System.out.println(FirstNum*SecondNum);
		           break;
		case "/": {
			if(SecondNum==0) throw new ArithmeticException("Cannot divide by zero");
			else System.out.println(FirstNum/SecondNum);
		}
		          break;
		case "|": System.out.println((int)FirstNum|(int)SecondNum);
		case "&":System.out.println((int)FirstNum&(int)SecondNum);
		
		default:System.out.println("Try again");
			      
		}

	}

}
