package com.simplilearn.lvc;



public class AccessSpecifier {
	
	
	public void hello()
	{
		System.out.println("Public Method");
	}
	protected void display()
	{
		System.out.println("You are accessing protected method of this class");
	}
	
	void world()
	{
		System.out.println("Default Method");
	}
	private void test()
	{
		System.out.println("My Private Method");
	}
	//Access All Methods in same class
	public static void main(String[] args) {
		
		AccessSpecifier obj=new AccessSpecifier();
		obj.display();//able to call protected method
		obj.test();//able to call private method
		obj.hello();//able to call public method
		obj.world();//able to call default method
	}

}
