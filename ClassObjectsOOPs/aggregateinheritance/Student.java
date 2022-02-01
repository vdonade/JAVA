package com.aggregateinheritance;

public class Student {
    int id;
    String name;
    String email;
    Address address; //Aggregation Object of address class
    
    public Student(int id, String name, String email, Address address) {
        
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    
    
}

