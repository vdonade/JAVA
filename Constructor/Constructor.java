package com.module2;

public class Constructor {
	    //class level variables
	    int id;
	    String name;
	    String department;
	    
	    //default constructor
	    public Constructor()
	    {
	        id=23;
	        name="Sonam";
	        department = "Developer";
	    }
	    public Constructor(int id,String name)//constructor overloading
	    {
	        this.id=id;
	        this.name=name;
	    }
	    public Constructor(int id,String name,String department)//regular variables=parameters
	    {
	        this.id=id;
	        this.name=name;
	        this.department=department;
	    }
	    
	    public static void main(String[] args) {
	        
	        //when you create object automatically it calls default constructor
	        //if no default constructor then compiler will create that
	    	Constructor obj=new Constructor();
	        System.out.println("User 1");
	        System.out.println("Id: "+obj.id);
	        System.out.println("Name: "+obj.name);
	        
	        Constructor obj2= new Constructor(45,"Vineet");
	        System.out.println("User 2");
	        System.out.println("Id: "+obj2.id);
	        System.out.println("Name: "+obj2.name);//when we don't have backend/database to store data 
	        
	        Constructor obj3= new Constructor(47,"Vina","Developer");
	        System.out.println("User 3");
	        System.out.println("Id: "+obj3.id);
	        System.out.println("Name: "+obj3.name);//when we don't have backend/database to store data 
	        System.out.println("Department: "+obj3.department);
	        
	        
	    }
	}
