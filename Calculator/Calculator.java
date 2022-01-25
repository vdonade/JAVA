package com.simplilearn.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
				
		int a;
		Scanner sc = new Scanner(System.in);
		do
		{
		
		
		System.out.println("Enter first number");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number");
		double num2 = sc.nextDouble();
		
		System.out.println("Select symbol(+,-,*,/)");
		String symbol = sc.next();
		
		double result;
		
		
		switch(symbol)
		{
		    case "+": result = num1+num2;
		    System.out.println("Addition is "+result);
		    break;
		    case "-": result = num1-num2;
		    System.out.println("Subtraction is "+result);
		    break;
		    case "*": result = num1*num2;
		    System.out.println("Multiplication is "+result);
		    break;
		    case "/": result = num1/num2;
		    System.out.println("Division is "+result);
		    break;
		    default: System.out.println("Invalid Option");
		    
		    
		}
		
		  System.out.println("Do you want to continue? Press 1 for Yes and 2 for Exit");
		  a = sc.nextInt();
		}
		while(a==1);
			

	}

}
