package org.test;

public class A extends B{

	
	
	public A() {
		super(12);
		System.out.println("Default Constructor");
		
	}
	public void mass() {
		System.out.println("Default Constructor");
		
	}
	
	
	
	public static void main(String[] args) {
	
		A a = new A();
	a.mass();
		
	}
	
}
