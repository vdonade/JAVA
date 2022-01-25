package com.simplilearn.calculator;

import java.util.Scanner;

public class Calc {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
		System.out.println("Enter first number");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number");
		double num2 = sc.nextDouble();
		
		System.out.println("Type 1 for +,\n Type 2 for -,\n Type 3 for *,\n Type 4 for /,\n Type 5 for Exit"); 
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
		else if(response==5)
		{
			break;
		}
		else
		{
			System.out.println("Enter valid option");
		}
	
		}
		
	
	}

}
