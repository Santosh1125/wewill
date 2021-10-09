package org.test;

public class Employeee {
	
//	//default constructor / non parameterized constructor
//	
//	public Employeee() {
//		System.out.println("Default Constructor");
//	}
//	
//	//parameterized constructor / argument based constructor
//	public Employeee(int id) {
//		this("arun");
//		System.out.println("int para constructor");
//		System.out.println(id);}
//	
//	public Employeee(String name) {
//		System.out.println("String para constructor");
//		System.out.println(name);
//	}
//	
//	public static void main(String[] args) {
//		Employeee e  = new Employeee();
//		Employeee e1 = new Employeee(100);
//		Employeee e2 = new Employeee("arun");
//	}
//
//}

	//default constructor / non parameterized constructor
	public Employeee() {
		this(100);
		System.out.println("Default Constructor");
	}
	
	//parameterized constructor / argument based constructor
	public Employeee(int id) {
		this("arun");
		System.out.println("int para constructor");
		System.out.println(id);}
	
	public Employeee(String name) {
		System.out.println("String para constructor");
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Employeee e  = new Employeee();
	
	}

}
