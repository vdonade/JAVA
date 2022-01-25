package com.simplilearn.first;

public class TypeCasting {

	public static void main(String[] args) {
		//implicit conversion
		System.out.println("Implicit type Casting");
		
		char a='A';
		System.out.println(a);
		
		int b = a;
		System.out.println(b);
		
		float c = b;
		System.out.println(c);
		
		long d = b;
		System.out.println(d);
		
		double e = b;
		System.out.println(e);
		
		System.out.println("Explicit type Casting");
		
		double x=89.90;
		System.out.println(x);
		
		int y =(int)x;
		System.out.println(y);
		
		float result = 45.0f/7;
		System.out.println(result);
		
		int z= (int)result;
		System.out.println(z);
		
	}

}
