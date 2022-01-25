package com.simplilearn.inner;

public class LocalInnerClass {
	
	void validate(int age)
	{
		if(age>18)
		{
			class Inner
			{
				void test()
				{
					System.out.println("Authenticate user using aadhar card");
				}
			}
			
			Inner inner = new Inner();
			inner.test();
		}
		else
		{
			System.out.println("Do NOt Authenticate user using aadhar card");
		}
	}

	public static void main(String[] args) {
		LocalInnerClass local = new LocalInnerClass();
		local.validate(5);

	}

}
