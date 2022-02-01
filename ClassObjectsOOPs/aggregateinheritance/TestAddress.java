package com.aggregateinheritance;

public class TestAddress {

	public static void main(String[] args) {
		Address address1 = new Address("Nagpur","Maharashtra",400918);
		Student st1 = new Student(1,"vee","email", address1);///address =dependent object
	}

}
