package com.simplilearn.calculator;

import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
		int a;
		do
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number");
		double num2 = sc.nextDouble();
		
		System.out.println("Type 1 for +, Type 2 for -, Type 3 for *, Type 4 for /"); 
		int response = sc.nextInt();
		
		if(response==1)
		{
			System.out.println(num1+num2);
		}
		else if(response==2)
		{
			System.out.println(num1-num2);
		}
		else if(response==3)
		{
			System.out.println(num1*num2);
		}
		else if(response==4)
		{
			System.out.println(num1/num2);
		}
		else
		{
			System.out.println("Enter valid option");
		}
		 System.out.println("Do you want to continue? Press 1 for Yes and 2 for Exit");
		  a = sc.nextInt();
		}
		while(a==1);
	
		

	}

}
