package org.test;

public class Employee extends Student{

	public Employee() {
	super(200);
		System.out.println("Default child constructor");}
	
	public Employee(int id) {
		System.out.println("int child para constructor");
		System.out.println(id);}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee(100);
	}
}
