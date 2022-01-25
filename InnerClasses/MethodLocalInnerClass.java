package com.simplilearn.inner;

public class MethodLocalInnerClass {
	
	public void display()
	{
		class Inner
		{
			void myMethod()
			{
				System.out.println("Method from inner class");
			}
		}
		Inner inner = new Inner();  //only inside this class
		inner.myMethod();
	}

	public static void main(String[] args) {
		MethodLocalInnerClass mlic = new MethodLocalInnerClass();
		mlic.display();

	}

}
